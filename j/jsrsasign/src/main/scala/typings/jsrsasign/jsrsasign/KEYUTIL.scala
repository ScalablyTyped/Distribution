package typings.jsrsasign.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait KEYUTIL extends StObject {
  
  /**
    * get RSAKey/DSA/ECDSA public key object from hexadecimal string of PKCS#8 public key
    * name _getKeyFromPublicPKCS8Hex
    * memberOf KEYUTIL
    *
    * @param pkcsPub8Hex hexadecimal string of PKCS#8 public key
    * @return RSAKey or KJUR.crypto.{ECDSA,DSA} private key object
    * @since pkcs5pkey 1.0.5
    */
  def _getKeyFromPublicPKCS8Hex(h: String): RSAKey | ECDSA | DSA
  
  /*
    * read PEM formatted encrypted PKCS#8 private key and returns hexadecimal string of plain PKCS#8 private key
    * name getPlainPKCS8HexFromEncryptedPKCS8PEM
    * memberOf KEYUTIL
    *
    * @param pkcs8PEM PEM formatted encrypted PKCS#8 private key
    * @param passcode passcode to decrypto private key
    * @return hexadecimal string of plain PKCS#8 private key
    * @since pkcs5pkey 1.0.3
    * @description
    * Currently, this method only supports PKCS#5v2.0 with PBES2/PBDKF2 of HmacSHA1 and TripleDES.
    * <ul>
    * <li>keyDerivationFunc = pkcs5PBKDF2 with HmacSHA1</li>
    * <li>encryptionScheme = des-EDE3-CBC(i.e. TripleDES</li>
    * </ul>
    * @example
    * // to convert plain PKCS#5 private key to encrypted PKCS#8 private
    * // key with PBKDF2 with TripleDES
    * % openssl pkcs8 -in plain_p5.pem -topk8 -v2 -des3 -out encrypted_p8.pem
    */
  def _getPlainPKCS8HexFromEncryptedPKCS8PEM(pkcs8PEM: String, passcode: String): String
  
  def decryptKeyB64(privateKeyB64: String, sharedKeyAlgName: String, sharedKeyHex: String, ivsaltHex: String): String
  
  /**
    * decrypt PEM formatted protected PKCS#5 private key with passcode
    * name getDecryptedKeyHex
    * memberOf KEYUTIL
    *
    * @param sEncryptedPEM PEM formatted protected passcode protected PKCS#5 private key
    * @param passcode passcode to decrypt private key (ex. 'password')
    * @return hexadecimal string of decrypted RSA priavte key
    */
  def getDecryptedKeyHex(sEncryptedPEM: String, passcode: String): String
  
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
  def getEncryptedPKCS5PEMFromPrvKeyHex(pemHeadAlg: String, hPrvKey: String, passcode: String, sharedKeyAlgName: String, ivsaltHex: String): String
  
  /**
    * the same function as OpenSSL EVP_BytsToKey to generate shared key and IV
    * name getKeyAndUnusedIvByPasscodeAndIvsalt
    * memberOf KEYUTIL
    *
    * @param algName name of symmetric key algorithm (ex. 'DES-EBE3-CBC')
    * @param passcode passcode to decrypt private key (ex. 'password')
    * @param hexadecimal string of IV. heading 8 bytes will be used for passcode salt
    * @return hash of key and unused IV (ex. {keyhex:2fe3..., ivhex:3fad..})
    */
  def getKeyAndUnusedIvByPasscodeAndIvsalt(algName: String, passcode: String, hexadecimal: String): HashOfKeyAndUnusedIV
  
  /**
    * get RSAKey/ECDSA private key object from encrypted PEM PKCS#8 private key
    * name getKeyFromEncryptedPKCS8PEM
    * memberOf KEYUTIL
    *
    * @param pkcs8PEM string of PEM formatted PKCS#8 private key
    * @param passcode passcode string to decrypt key
    * @return RSAKey or KJUR.crypto.ECDSA private key object
    * @since pkcs5pkey 1.0.5
    */
  def getKeyFromEncryptedPKCS8PEM(pkcs8PEM: String, passcode: String): RSAKey | ECDSA
  
  /**
    * get RSAKey/DSA/ECDSA private key object from HEX plain PEM PKCS#8 private key
    * name getKeyFromPlainPrivatePKCS8Hex
    * memberOf KEYUTIL
    *
    * @param prvKeyHex hexadecimal string of plain PKCS#8 private key
    * @return RSAKey or KJUR.crypto.{DSA,ECDSA} private key object
    * @since pkcs5pkey 1.0.5
    */
  def getKeyFromPlainPrivatePKCS8Hex(prvKeyHex: String): RSAKey | DSA | ECDSA
  
  /**
    * get RSAKey/ECDSA private key object from PEM plain PEM PKCS#8 private key
    * name getKeyFromPlainPrivatePKCS8PEM
    * memberOf KEYUTIL
    *
    * @param pkcs8PEM string of plain PEM formatted PKCS#8 private key
    * @return RSAKey or KJUR.crypto.ECDSA private key object
    * @since pkcs5pkey 1.0.5
    */
  def getKeyFromPlainPrivatePKCS8PEM(pkcs8PEM: String): RSAKey | ECDSA
  
  /**
    * generate PBKDF2 key hexstring with specified passcode and information
    * name getPBKDF2KeyHexFromParam
    * memberOf KEYUTIL
    *
    * @param info result of {@link parseHexOfEncryptedPKCS8} which has preference of PKCS#8 file
    * @param passcode passcode to decrypto private key
    * @return hexadecimal string of PBKDF2 key
    * @since pkcs5pkey 1.0.3
    * @description
    * As for info, this uses following properties:
    * <ul>
    * <li>info.pbkdf2Salt - hexadecimal string of PBKDF2 salt</li>
    * <li>info.pkbdf2Iter - iteration count</li>
    * </ul>
    * Currently, this method only supports PKCS#5v2.0 with PBES2/PBDKF2 of HmacSHA1 and TripleDES.
    * <ul>
    * <li>keyDerivationFunc = pkcs5PBKDF2 with HmacSHA1</li>
    * <li>encryptionScheme = des-EDE3-CBC(i.e. TripleDES</li>
    * </ul>
    * @example
    * // to convert plain PKCS#5 private key to encrypted PKCS#8 private
    * // key with PBKDF2 with TripleDES
    * % openssl pkcs8 -in plain_p5.pem -topk8 -v2 -des3 -out encrypted_p8.pem
    */
  def getPBKDF2KeyHexFromParam(info: PKCS8Info, passcode: String): String
  
  /**
    * generate PBKDF2 key hexstring with specified passcode and information
    * name parseHexOfEncryptedPKCS8
    * memberOf KEYUTIL
    *
    * @param passcode passcode to decrypto private key
    * @return info associative array of PKCS#8 parameters
    * @since pkcs5pkey 1.0.3
    * @description
    * The associative array which is returned by this method has following properties:
    * <ul>
    * <li>info.pbkdf2Salt - hexadecimal string of PBKDF2 salt</li>
    * <li>info.pkbdf2Iter - iteration count</li>
    * <li>info.ciphertext - hexadecimal string of encrypted private key</li>
    * <li>info.encryptionSchemeAlg - encryption algorithm name (currently TripleDES only)</li>
    * <li>info.encryptionSchemeIV - initial vector for encryption algorithm</li>
    * </ul>
    * Currently, this method only supports PKCS#5v2.0 with PBES2/PBDKF2 of HmacSHA1 and TripleDES.
    * <ul>
    * <li>keyDerivationFunc = pkcs5PBKDF2 with HmacSHA1</li>
    * <li>encryptionScheme = des-EDE3-CBC(i.e. TripleDES</li>
    * </ul>
    * @example
    * // to convert plain PKCS#5 private key to encrypted PKCS#8 private
    * // key with PBKDF2 with TripleDES
    * % openssl pkcs8 -in plain_p5.pem -topk8 -v2 -des3 -out encrypted_p8.pem
    */
  def parseHexOfEncryptedPKCS8(passcode: String): PKCS8Info
  
  /**
    * parse PEM formatted passcode protected PKCS#5 private key
    * @param sEncryptedPEM PEM formatted protected passcode protected PKCS#5 private key
    * @return hash of key information
    * @description
    * Resulted hash has following attributes.
    * <ul>
    * <li>cipher - symmetric key algorithm name (ex. 'DES-EBE3-CBC', 'AES-256-CBC')</li>
    * <li>ivsalt - IV used for decrypt. Its heading 8 bytes will be used for passcode salt.</li>
    * <li>type - asymmetric key algorithm name of private key described in PEM header.</li>
    * <li>data - base64 encoded encrypted private key.</li>
    * </ul>
    *
    */
  def parsePKCS5PEM(sEncryptedPEM: String): HashOfKeyInformation
  
  /**
    * parse hexadecimal string of plain PKCS#8 private key
    * name parsePlainPrivatePKCS8Hex
    * memberOf KEYUTIL
    *
    * @param pkcs8PrvHex hexadecimal string of PKCS#8 plain private key
    * @return associative array of parsed key
    * @since pkcs5pkey 1.0.5
    * @description
    * Resulted associative array has following properties:
    * <ul>
    * <li>algoid - hexadecimal string of OID of asymmetric key algorithm</li>
    * <li>algparam - hexadecimal string of OID of ECC curve name or null</li>
    * <li>keyidx - string starting index of key in pkcs8PrvHex</li>
    * </ul>
    */
  def parsePlainPrivatePKCS8Hex(pkcs8PrvHex: String): PrivatePKCS8HexResult
  
  /**
    * parse hexadecimal string of PKCS#8 RSA/EC/DSA public key
    * name parsePublicPKCS8Hex
    * memberOf KEYUTIL
    *
    * @param pkcs8PubHex hexadecimal string of PKCS#8 public key
    * @return hash of key information
    * @description
    * Resulted hash has following attributes.
    * <ul>
    * <li>algoid - hexadecimal string of OID of asymmetric key algorithm</li>
    * <li>algparam - hexadecimal string of OID of ECC curve name, parameter SEQUENCE of DSA or null</li>
    * <li>key - hexadecimal string of public key</li>
    * </ul>
    */
  def parsePublicPKCS8Hex(pkcs8PubHex: String): PublicPKCS8HexResult
  
  /**
    * parse hexadecimal string of plain PKCS#8 private key
    * name parsePublicRawRSAKeyHex
    * memberOf KEYUTIL
    *
    * @param pubRawRSAHex hexadecimal string of ASN.1 encoded PKCS#8 public key
    * @return associative array of parsed key
    * @since pkcs5pkey 1.0.5
    * @description
    * Resulted associative array has following properties:
    * <ul>
    * <li>n - hexadecimal string of public key
    * <li>e - hexadecimal string of public exponent
    * </ul>
    */
  def parsePublicRawRSAKeyHex(pubRawRSAHex: String): PublicRawRSAKeyHexResult
}
object KEYUTIL {
  
  inline def apply(
    _getKeyFromPublicPKCS8Hex: String => RSAKey | ECDSA | DSA,
    _getPlainPKCS8HexFromEncryptedPKCS8PEM: (String, String) => String,
    decryptKeyB64: (String, String, String, String) => String,
    getDecryptedKeyHex: (String, String) => String,
    getEncryptedPKCS5PEMFromPrvKeyHex: (String, String, String, String, String) => String,
    getKeyAndUnusedIvByPasscodeAndIvsalt: (String, String, String) => HashOfKeyAndUnusedIV,
    getKeyFromEncryptedPKCS8PEM: (String, String) => RSAKey | ECDSA,
    getKeyFromPlainPrivatePKCS8Hex: String => RSAKey | DSA | ECDSA,
    getKeyFromPlainPrivatePKCS8PEM: String => RSAKey | ECDSA,
    getPBKDF2KeyHexFromParam: (PKCS8Info, String) => String,
    parseHexOfEncryptedPKCS8: String => PKCS8Info,
    parsePKCS5PEM: String => HashOfKeyInformation,
    parsePlainPrivatePKCS8Hex: String => PrivatePKCS8HexResult,
    parsePublicPKCS8Hex: String => PublicPKCS8HexResult,
    parsePublicRawRSAKeyHex: String => PublicRawRSAKeyHexResult
  ): KEYUTIL = {
    val __obj = js.Dynamic.literal(_getKeyFromPublicPKCS8Hex = js.Any.fromFunction1(_getKeyFromPublicPKCS8Hex), _getPlainPKCS8HexFromEncryptedPKCS8PEM = js.Any.fromFunction2(_getPlainPKCS8HexFromEncryptedPKCS8PEM), decryptKeyB64 = js.Any.fromFunction4(decryptKeyB64), getDecryptedKeyHex = js.Any.fromFunction2(getDecryptedKeyHex), getEncryptedPKCS5PEMFromPrvKeyHex = js.Any.fromFunction5(getEncryptedPKCS5PEMFromPrvKeyHex), getKeyAndUnusedIvByPasscodeAndIvsalt = js.Any.fromFunction3(getKeyAndUnusedIvByPasscodeAndIvsalt), getKeyFromEncryptedPKCS8PEM = js.Any.fromFunction2(getKeyFromEncryptedPKCS8PEM), getKeyFromPlainPrivatePKCS8Hex = js.Any.fromFunction1(getKeyFromPlainPrivatePKCS8Hex), getKeyFromPlainPrivatePKCS8PEM = js.Any.fromFunction1(getKeyFromPlainPrivatePKCS8PEM), getPBKDF2KeyHexFromParam = js.Any.fromFunction2(getPBKDF2KeyHexFromParam), parseHexOfEncryptedPKCS8 = js.Any.fromFunction1(parseHexOfEncryptedPKCS8), parsePKCS5PEM = js.Any.fromFunction1(parsePKCS5PEM), parsePlainPrivatePKCS8Hex = js.Any.fromFunction1(parsePlainPrivatePKCS8Hex), parsePublicPKCS8Hex = js.Any.fromFunction1(parsePublicPKCS8Hex), parsePublicRawRSAKeyHex = js.Any.fromFunction1(parsePublicRawRSAKeyHex))
    __obj.asInstanceOf[KEYUTIL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KEYUTIL] (val x: Self) extends AnyVal {
    
    inline def setDecryptKeyB64(value: (String, String, String, String) => String): Self = StObject.set(x, "decryptKeyB64", js.Any.fromFunction4(value))
    
    inline def setGetDecryptedKeyHex(value: (String, String) => String): Self = StObject.set(x, "getDecryptedKeyHex", js.Any.fromFunction2(value))
    
    inline def setGetEncryptedPKCS5PEMFromPrvKeyHex(value: (String, String, String, String, String) => String): Self = StObject.set(x, "getEncryptedPKCS5PEMFromPrvKeyHex", js.Any.fromFunction5(value))
    
    inline def setGetKeyAndUnusedIvByPasscodeAndIvsalt(value: (String, String, String) => HashOfKeyAndUnusedIV): Self = StObject.set(x, "getKeyAndUnusedIvByPasscodeAndIvsalt", js.Any.fromFunction3(value))
    
    inline def setGetKeyFromEncryptedPKCS8PEM(value: (String, String) => RSAKey | ECDSA): Self = StObject.set(x, "getKeyFromEncryptedPKCS8PEM", js.Any.fromFunction2(value))
    
    inline def setGetKeyFromPlainPrivatePKCS8Hex(value: String => RSAKey | DSA | ECDSA): Self = StObject.set(x, "getKeyFromPlainPrivatePKCS8Hex", js.Any.fromFunction1(value))
    
    inline def setGetKeyFromPlainPrivatePKCS8PEM(value: String => RSAKey | ECDSA): Self = StObject.set(x, "getKeyFromPlainPrivatePKCS8PEM", js.Any.fromFunction1(value))
    
    inline def setGetPBKDF2KeyHexFromParam(value: (PKCS8Info, String) => String): Self = StObject.set(x, "getPBKDF2KeyHexFromParam", js.Any.fromFunction2(value))
    
    inline def setParseHexOfEncryptedPKCS8(value: String => PKCS8Info): Self = StObject.set(x, "parseHexOfEncryptedPKCS8", js.Any.fromFunction1(value))
    
    inline def setParsePKCS5PEM(value: String => HashOfKeyInformation): Self = StObject.set(x, "parsePKCS5PEM", js.Any.fromFunction1(value))
    
    inline def setParsePlainPrivatePKCS8Hex(value: String => PrivatePKCS8HexResult): Self = StObject.set(x, "parsePlainPrivatePKCS8Hex", js.Any.fromFunction1(value))
    
    inline def setParsePublicPKCS8Hex(value: String => PublicPKCS8HexResult): Self = StObject.set(x, "parsePublicPKCS8Hex", js.Any.fromFunction1(value))
    
    inline def setParsePublicRawRSAKeyHex(value: String => PublicRawRSAKeyHexResult): Self = StObject.set(x, "parsePublicRawRSAKeyHex", js.Any.fromFunction1(value))
    
    inline def set_getKeyFromPublicPKCS8Hex(value: String => RSAKey | ECDSA | DSA): Self = StObject.set(x, "_getKeyFromPublicPKCS8Hex", js.Any.fromFunction1(value))
    
    inline def set_getPlainPKCS8HexFromEncryptedPKCS8PEM(value: (String, String) => String): Self = StObject.set(x, "_getPlainPKCS8HexFromEncryptedPKCS8PEM", js.Any.fromFunction2(value))
  }
}
