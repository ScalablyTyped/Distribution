package typings.jsrsasign.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * class for RSA/ECC/DSA key utility
  * @description
  *
  * `KEYUTIL` class is an update of former `PKCS5PKEY` class.
  * `KEYUTIL` class has following features:
  *
  * __key loading - `KEYUTIL.getKey`__
  *
  *
  * - supports RSAKey and KJUR.crypto.{ECDSA,DSA} key object
  * - supports private key and public key
  * - supports encrypted and plain private key
  * - supports PKCS#1, PKCS#5 and PKCS#8 key
  * - supports public key in X.509 certificate
  * - key represented by JSON object
  *
  * NOTE1: Encrypted PKCS#8 only supports PBKDF2/HmacSHA1/3DES
  * NOTE2: Encrypted PKCS#5 supports DES-CBC, DES-EDE3-CBC, AES-{128,192.256}-CBC
  *
  * __exporting key - `KEYUTIL.getPEM`__
  *
  * `KEYUTIL.getPEM` method supports following formats:
  *
  * - supports RSA/EC/DSA keys
  * - PKCS#1 plain RSA/EC/DSA private key
  * - PKCS#5 encrypted RSA/EC/DSA private key with DES-CBC, DES-EDE3-CBC, AES-{128,192.256}-CBC
  * - PKCS#8 plain RSA/EC/DSA private key
  * - PKCS#8 encrypted RSA/EC/DSA private key with PBKDF2_HmacSHA1_3DES
  *
  *
  * __keypair generation - `KEYUTIL.generateKeypair`__
  *
  * - generate key pair of `RSAKey` or `KJUR.crypto.ECDSA`.
  * - generate private key and convert it to PKCS#5 encrypted private key.
  *
  * NOTE: `KJUR.crypto.DSA` is not yet supported.
  *
  *
  * @example
  * // 1. loading PEM private key
  * var key = KEYUTIL.getKey(pemPKCS1PrivateKey);
  * var key = KEYUTIL.getKey(pemPKCS5EncryptedPrivateKey, "passcode");
  * var key = KEYUTIL.getKey(pemPKC85PlainPrivateKey);
  * var key = KEYUTIL.getKey(pemPKC85EncryptedPrivateKey, "passcode");
  * // 2. loading PEM public key
  * var key = KEYUTIL.getKey(pemPKCS8PublicKey);
  * var key = KEYUTIL.getKey(pemX509Certificate);
  * // 3. exporting private key
  * var pem = KEYUTIL.getPEM(privateKeyObj, "PKCS1PRV");
  * var pem = KEYUTIL.getPEM(privateKeyObj, "PKCS5PRV", "passcode"); // DES-EDE3-CBC by default
  * var pem = KEYUTIL.getPEM(privateKeyObj, "PKCS5PRV", "passcode", "DES-CBC");
  * var pem = KEYUTIL.getPEM(privateKeyObj, "PKCS8PRV");
  * var pem = KEYUTIL.getPEM(privateKeyObj, "PKCS8PRV", "passcode");
  * // 4. exporting public key
  * var pem = KEYUTIL.getPEM(publicKeyObj);
  */
@js.native
trait KEYUTIL extends StObject {
  
  /**
    * get RSAKey/DSA/ECDSA public key object from hexadecimal string of PKCS#8 public key
    * @param pkcsPub8Hex hexadecimal string of PKCS#8 public key
    * @return RSAKey or KJUR.crypto.{ECDSA,DSA} private key object
    */
  def _getKeyFromPublicPKCS8Hex(h: String): RSAKey | ECDSA = js.native
  
  /**
    * read PEM formatted encrypted PKCS#8 private key and returns hexadecimal string of plain PKCS#8 private key
    * @param pkcs8PEM PEM formatted encrypted PKCS#8 private key
    * @param passcode passcode to decrypto private key
    * @return hexadecimal string of plain PKCS#8 private key
    * @description
    * Currently, this method only supports PKCS#5v2.0 with PBES2/PBDKF2 of HmacSHA1 and TripleDES.
    *
    * - keyDerivationFunc = pkcs5PBKDF2 with HmacSHA1
    * - encryptionScheme = des-EDE3-CBC(i.e. TripleDES
    *
    * @example
    * // to convert plain PKCS#5 private key to encrypted PKCS#8 private
    * // key with PBKDF2 with TripleDES
    * % openssl pkcs8 -in plain_p5.pem -topk8 -v2 -des3 -out encrypted_p8.pem
    */
  def _getPlainPKCS8HexFromEncryptedPKCS8PEM(pkcs8PEM: String, passcode: String): String = js.native
  
  def decryptKeyB64(privateKeyB64: String, sharedKeyAlgName: String, sharedKeyHex: String, ivsaltHex: String): String = js.native
  
  /**
    * decrypt PEM formatted protected PKCS#5 private key with passcode
    * @param sEncryptedPEM PEM formatted protected passcode protected PKCS#5 private key
    * @param passcode passcode to decrypt private key (ex. 'password')
    * @return hexadecimal string of decrypted RSA priavte key
    */
  def getDecryptedKeyHex(sEncryptedPEM: String, passcode: String): String = js.native
  
  /**
    * get PEM formatted encrypted PKCS#5 private key from hexadecimal string of plain private key
    * @param pemHeadAlg algorithm name in the pem header (i.e. RSA,EC or DSA)
    * @param hPrvKey hexadecimal string of plain private key
    * @param passcode pass code to protect private key (ex. password)
    * @param sharedKeyAlgName algorithm name to protect private key (ex. AES-256-CBC)
    * @param ivsaltHex hexadecimal string of IV and salt
    * @return string of PEM formatted encrypted PKCS#5 private key
    * @description
    *
    * generate PEM formatted encrypted PKCS#5 private key by hexadecimal string encoded
    * ASN.1 object of plain RSA private key.
    * Following arguments can be omitted.
    *
    * - alg - AES-256-CBC will be used if omitted.
    * - ivsaltHex - automatically generate IV and salt which length depends on algorithm
    *
    * NOTE1: DES-CBC, DES-EDE3-CBC, AES-{128,192.256}-CBC algorithm are supported.
    * @example
    * var pem =
    *   KEYUTIL.getEncryptedPKCS5PEMFromPrvKeyHex(plainKeyHex, "password");
    * var pem2 =
    *   KEYUTIL.getEncryptedPKCS5PEMFromPrvKeyHex(plainKeyHex, "password", "AES-128-CBC");
    * var pem3 =
    *   KEYUTIL.getEncryptedPKCS5PEMFromPrvKeyHex(plainKeyHex, "password", "AES-128-CBC", "1f3d02...");
    */
  def getEncryptedPKCS5PEMFromPrvKeyHex(pemHeadAlg: String, hPrvKey: String, passcode: String, sharedKeyAlgName: String, ivsaltHex: String): String = js.native
  
  /**
    * the same function as OpenSSL EVP_BytsToKey to generate shared key and IV
    * @param algName name of symmetric key algorithm (ex. 'DES-EBE3-CBC')
    * @param passcode passcode to decrypt private key (ex. 'password')
    * @param hexadecimal string of IV. heading 8 bytes will be used for passcode salt
    * @return hash of key and unused IV (ex. {keyhex:2fe3..., ivhex:3fad..})
    */
  def getKeyAndUnusedIvByPasscodeAndIvsalt(algName: String, passcode: String, ivsaltHex: String): String = js.native
  
  /**
    * get RSAKey/ECDSA private key object from encrypted PEM PKCS#8 private key
    * @param pkcs8PEM string of PEM formatted PKCS#8 private key
    * @param passcode passcode string to decrypt key
    * @return RSAKey or KJUR.crypto.ECDSA private key object
    */
  def getKeyFromEncryptedPKCS8PEM(pkcs8PEM: String, passcode: String): RSAKey | ECDSA = js.native
  
  /**
    * get RSAKey/DSA/ECDSA private key object from HEX plain PEM PKCS#8 private key
    * @param prvKeyHex hexadecimal string of plain PKCS#8 private key
    * @return RSAKey or KJUR.crypto.{DSA,ECDSA} private key object
    */
  def getKeyFromPlainPrivatePKCS8Hex(prvKeyHex: String): RSAKey | DSA | ECDSA = js.native
  
  /**
    * get RSAKey/ECDSA private key object from PEM plain PEM PKCS#8 private key
    * @param pkcs8PEM string of plain PEM formatted PKCS#8 private key
    * @return RSAKey or KJUR.crypto.ECDSA private key object
    */
  def getKeyFromPlainPrivatePKCS8PEM(prvKeyPEM: String): RSAKey | ECDSA = js.native
  
  /**
    * generate PBKDF2 key hexstring with specified passcode and information
    * @param info result of `parseHexOfEncryptedPKCS8` which has preference of PKCS#8 file
    * @param passcode passcode to decrypto private key
    * @return hexadecimal string of PBKDF2 key
    * @description
    * As for info, this uses following properties:
    *
    * - info.pbkdf2Salt - hexadecimal string of PBKDF2 salt
    * - info.pkbdf2Iter - iteration count
    *
    * Currently, this method only supports PKCS#5v2.0 with PBES2/PBDKF2 of HmacSHA1 and TripleDES.
    *
    * - keyDerivationFunc = pkcs5PBKDF2 with HmacSHA1
    * - encryptionScheme = des-EDE3-CBC(i.e. TripleDES
    *
    * @example
    * // to convert plain PKCS#5 private key to encrypted PKCS#8 private
    * // key with PBKDF2 with TripleDES
    * % openssl pkcs8 -in plain_p5.pem -topk8 -v2 -des3 -out encrypted_p8.pem
    */
  def getPBKDF2KeyHexFromParam(info: PKCS8Info, passcode: String): String = js.native
  
  /**
    * generate PBKDF2 key hexstring with specified passcode and information
    * @param passcode passcode to decrypt private key
    * @return info associative array of PKCS#8 parameters
    * @description
    * The associative array which is returned by this method has following properties:
    *
    * - info.pbkdf2Salt - hexadecimal string of PBKDF2 salt
    * - info.pkbdf2Iter - iteration count
    * - info.ciphertext - hexadecimal string of encrypted private key
    * - info.encryptionSchemeAlg - encryption algorithm name (currently TripleDES only)
    * - info.encryptionSchemeIV - initial vector for encryption algorithm
    *
    * Currently, this method only supports PKCS#5v2.0 with PBES2/PBDKF2 of HmacSHA1 and TripleDES.
    *
    * - keyDerivationFunc = pkcs5PBKDF2 with HmacSHA1
    * - encryptionScheme = des-EDE3-CBC(i.e. TripleDES
    *
    * @example
    * // to convert plain PKCS#5 private key to encrypted PKCS#8 private
    * // key with PBKDF2 with TripleDES
    * % openssl pkcs8 -in plain_p5.pem -topk8 -v2 -des3 -out encrypted_p8.pem
    */
  def parseHexOfEncryptedPKCS8(passcode: String): PKCS8Info = js.native
  
  /**
    * parse PEM formatted passcode protected PKCS#5 private key
    * @param sPKCS5PEM PEM formatted protected passcode protected PKCS#5 private key
    * @return hash of key information
    * @description
    * Resulted hash has following attributes.
    *
    * - cipher - symmetric key algorithm name (ex. 'DES-EBE3-CBC', 'AES-256-CBC')
    * - ivsalt - IV used for decrypt. Its heading 8 bytes will be used for passcode salt.
    * - type - asymmetric key algorithm name of private key described in PEM header.
    * - data - base64 encoded encrypted private key.
    */
  def parsePKCS5PEM(sPKCS5PEM: String): String = js.native
  
  /**
    * parse hexadecimal string of plain PKCS#8 private key
    * @param pkcs8PrvHex hexadecimal string of PKCS#8 plain private key
    * @return associative array of parsed key
    * @description
    * Resulted associative array has following properties:
    *
    * - algoid - hexadecimal string of OID of asymmetric key algorithm
    * - algparam - hexadecimal string of OID of ECC curve name or null
    * - keyidx - string starting index of key in pkcs8PrvHex
    *
    */
  def parsePlainPrivatePKCS8Hex(pkcs8PrvHex: String): PrivatePKCS8HexResult = js.native
  
  /**
    * parse hexadecimal string of PKCS#8 RSA/EC/DSA public key
    * @param pkcs8PubHex hexadecimal string of PKCS#8 public key
    * @return hash of key information
    * @description
    * Resulted hash has following attributes.
    *
    * - algoid - hexadecimal string of OID of asymmetric key algorithm
    * - algparam - hexadecimal string of OID of ECC curve name, parameter SEQUENCE of DSA or null
    * - key - hexadecimal string of public key
    *
    */
  def parsePublicPKCS8Hex(pkcs8PubHex: String): PublicPKCS8HexResult = js.native
  
  /**
    * parse hexadecimal string of plain PKCS#8 private key
    * @param pubRawRSAHex hexadecimal string of ASN.1 encoded PKCS#8 public key
    * @return associative array of parsed key
    * @description
    * Resulted associative array has following properties:
    *
    * - n - hexadecimal string of public key
    * - e - hexadecimal string of public exponent
    *
    */
  def parsePublicRawRSAKeyHex(pubRawRSAHex: String): PublicRawRSAKeyHexResult = js.native
}
object KEYUTIL {
  
  @scala.inline
  def apply(
    _getKeyFromPublicPKCS8Hex: String => RSAKey | ECDSA,
    _getPlainPKCS8HexFromEncryptedPKCS8PEM: (String, String) => String,
    decryptKeyB64: (String, String, String, String) => String,
    getDecryptedKeyHex: (String, String) => String,
    getEncryptedPKCS5PEMFromPrvKeyHex: (String, String, String, String, String) => String,
    getKeyAndUnusedIvByPasscodeAndIvsalt: (String, String, String) => String,
    getKeyFromEncryptedPKCS8PEM: (String, String) => RSAKey | ECDSA,
    getKeyFromPlainPrivatePKCS8Hex: String => RSAKey | DSA | ECDSA,
    getKeyFromPlainPrivatePKCS8PEM: String => RSAKey | ECDSA,
    getPBKDF2KeyHexFromParam: (PKCS8Info, String) => String,
    parseHexOfEncryptedPKCS8: String => PKCS8Info,
    parsePKCS5PEM: String => String,
    parsePlainPrivatePKCS8Hex: String => PrivatePKCS8HexResult,
    parsePublicPKCS8Hex: String => PublicPKCS8HexResult,
    parsePublicRawRSAKeyHex: String => PublicRawRSAKeyHexResult
  ): KEYUTIL = {
    val __obj = js.Dynamic.literal(_getKeyFromPublicPKCS8Hex = js.Any.fromFunction1(_getKeyFromPublicPKCS8Hex), _getPlainPKCS8HexFromEncryptedPKCS8PEM = js.Any.fromFunction2(_getPlainPKCS8HexFromEncryptedPKCS8PEM), decryptKeyB64 = js.Any.fromFunction4(decryptKeyB64), getDecryptedKeyHex = js.Any.fromFunction2(getDecryptedKeyHex), getEncryptedPKCS5PEMFromPrvKeyHex = js.Any.fromFunction5(getEncryptedPKCS5PEMFromPrvKeyHex), getKeyAndUnusedIvByPasscodeAndIvsalt = js.Any.fromFunction3(getKeyAndUnusedIvByPasscodeAndIvsalt), getKeyFromEncryptedPKCS8PEM = js.Any.fromFunction2(getKeyFromEncryptedPKCS8PEM), getKeyFromPlainPrivatePKCS8Hex = js.Any.fromFunction1(getKeyFromPlainPrivatePKCS8Hex), getKeyFromPlainPrivatePKCS8PEM = js.Any.fromFunction1(getKeyFromPlainPrivatePKCS8PEM), getPBKDF2KeyHexFromParam = js.Any.fromFunction2(getPBKDF2KeyHexFromParam), parseHexOfEncryptedPKCS8 = js.Any.fromFunction1(parseHexOfEncryptedPKCS8), parsePKCS5PEM = js.Any.fromFunction1(parsePKCS5PEM), parsePlainPrivatePKCS8Hex = js.Any.fromFunction1(parsePlainPrivatePKCS8Hex), parsePublicPKCS8Hex = js.Any.fromFunction1(parsePublicPKCS8Hex), parsePublicRawRSAKeyHex = js.Any.fromFunction1(parsePublicRawRSAKeyHex))
    __obj.asInstanceOf[KEYUTIL]
  }
  
  @scala.inline
  implicit class KEYUTILMutableBuilder[Self <: KEYUTIL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecryptKeyB64(value: (String, String, String, String) => String): Self = StObject.set(x, "decryptKeyB64", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetDecryptedKeyHex(value: (String, String) => String): Self = StObject.set(x, "getDecryptedKeyHex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetEncryptedPKCS5PEMFromPrvKeyHex(value: (String, String, String, String, String) => String): Self = StObject.set(x, "getEncryptedPKCS5PEMFromPrvKeyHex", js.Any.fromFunction5(value))
    
    @scala.inline
    def setGetKeyAndUnusedIvByPasscodeAndIvsalt(value: (String, String, String) => String): Self = StObject.set(x, "getKeyAndUnusedIvByPasscodeAndIvsalt", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetKeyFromEncryptedPKCS8PEM(value: (String, String) => RSAKey | ECDSA): Self = StObject.set(x, "getKeyFromEncryptedPKCS8PEM", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetKeyFromPlainPrivatePKCS8Hex(value: String => RSAKey | DSA | ECDSA): Self = StObject.set(x, "getKeyFromPlainPrivatePKCS8Hex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetKeyFromPlainPrivatePKCS8PEM(value: String => RSAKey | ECDSA): Self = StObject.set(x, "getKeyFromPlainPrivatePKCS8PEM", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPBKDF2KeyHexFromParam(value: (PKCS8Info, String) => String): Self = StObject.set(x, "getPBKDF2KeyHexFromParam", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParseHexOfEncryptedPKCS8(value: String => PKCS8Info): Self = StObject.set(x, "parseHexOfEncryptedPKCS8", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParsePKCS5PEM(value: String => String): Self = StObject.set(x, "parsePKCS5PEM", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParsePlainPrivatePKCS8Hex(value: String => PrivatePKCS8HexResult): Self = StObject.set(x, "parsePlainPrivatePKCS8Hex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParsePublicPKCS8Hex(value: String => PublicPKCS8HexResult): Self = StObject.set(x, "parsePublicPKCS8Hex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParsePublicRawRSAKeyHex(value: String => PublicRawRSAKeyHexResult): Self = StObject.set(x, "parsePublicRawRSAKeyHex", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_getKeyFromPublicPKCS8Hex(value: String => RSAKey | ECDSA): Self = StObject.set(x, "_getKeyFromPublicPKCS8Hex", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_getPlainPKCS8HexFromEncryptedPKCS8PEM(value: (String, String) => String): Self = StObject.set(x, "_getPlainPKCS8HexFromEncryptedPKCS8PEM", js.Any.fromFunction2(value))
  }
}
