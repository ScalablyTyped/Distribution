package typings.jsrsasign.mod

import typings.jsrsasign.anon.E
import typings.jsrsasign.anon.PrvKeyObj_
import typings.jsrsasign.jsrsasign.CSRHexResult
import typings.jsrsasign.jsrsasign.ECCPrivateKey
import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.KJUR.jws.JWS.JsonWebKey
import typings.jsrsasign.jsrsasign.PrivateKeyOutputFormatType
import typings.jsrsasign.jsrsasignStrings.EC
import typings.jsrsasign.jsrsasignStrings.RSA
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
@JSImport("jsrsasign", "KEYUTIL")
@js.native
class KEYUTIL ()
  extends typings.jsrsasign.jsrsasign.KEYUTIL
object KEYUTIL {
  
  @JSImport("jsrsasign", "KEYUTIL.generateKeypair")
  @js.native
  def generateKeypair_EC(alg: EC, keylenOrCurve: String): PrvKeyObj_ = js.native
  @JSImport("jsrsasign", "KEYUTIL.generateKeypair")
  @js.native
  def generateKeypair_EC(alg: EC, keylenOrCurve: Double): PrvKeyObj_ = js.native
  @JSImport("jsrsasign", "KEYUTIL.generateKeypair")
  @js.native
  def generateKeypair_RSA(alg: RSA, keylenOrCurve: String): PrvKeyObj_ = js.native
  /**
    * @param alg 'RSA' or 'EC'
    * @param keylenOrCurve key length for RSA or curve name for EC
    * @return associative array of keypair which has prvKeyObj and pubKeyObj parameters
    * @description
    * This method generates a key pair of public key algorithm.
    * The result will be an associative array which has following
    * parameters:
    *
    * - prvKeyObj - RSAKey or ECDSA object of private key
    * - pubKeyObj - RSAKey or ECDSA object of public key
    *
    * NOTE1: As for RSA algoirthm, public exponent has fixed
    * value '0x10001'.
    * NOTE2: As for EC algorithm, supported names of curve are
    * secp256r1, secp256k1 and secp384r1.
    * NOTE3: DSA is not supported yet.
    * @example
    * var rsaKeypair = KEYUTIL.generateKeypair("RSA", 1024);
    * var ecKeypair = KEYUTIL.generateKeypair("EC", "secp256r1");
    *
    */
  /* static member */
  @JSImport("jsrsasign", "KEYUTIL.generateKeypair")
  @js.native
  def generateKeypair_RSA(alg: RSA, keylenOrCurve: Double): PrvKeyObj_ = js.native
  
  @JSImport("jsrsasign", "KEYUTIL.getJWKFromKey")
  @js.native
  def getJWKFromKey(keyObj: DSA): JsonWebKey = js.native
  @JSImport("jsrsasign", "KEYUTIL.getJWKFromKey")
  @js.native
  def getJWKFromKey(keyObj: ECDSA): JsonWebKey = js.native
  /**
    * convert from RSAKey/KJUR.crypto.ECDSA public/private key object to RFC 7517 JSON Web Key(JWK)
    * @param keyObj RSAKey/KJUR.crypto.ECDSA public/private key object
    * @return JWK object
    * @description
    * This static method convert from RSAKey/KJUR.crypto.ECDSA public/private key object
    * to RFC 7517 JSON Web Key(JWK)
    * @example
    * kp1 = KEYUTIL.generateKeypair("EC", "P-256");
    * jwkPrv1 = KEYUTIL.getJWKFromKey(kp1.prvKeyObj);
    * jwkPub1 = KEYUTIL.getJWKFromKey(kp1.pubKeyObj);
    *
    * kp2 = KEYUTIL.generateKeypair("RSA", 2048);
    * jwkPrv2 = KEYUTIL.getJWKFromKey(kp2.prvKeyObj);
    * jwkPub2 = KEYUTIL.getJWKFromKey(kp2.pubKeyObj);
    *
    * // if you need RFC 7638 JWK thumprint as kid do like this:
    * jwkPub2.kid = KJUR.jws.JWS.getJWKthumbprint(jwkPub2);
    */
  /* static member */
  @JSImport("jsrsasign", "KEYUTIL.getJWKFromKey")
  @js.native
  def getJWKFromKey(keyObj: typings.jsrsasign.jsrsasign.RSAKey): JsonWebKey = js.native
  
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: String, passcode: js.UndefOr[scala.Nothing], hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: String, passcode: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: String, passcode: String, hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: String, passcode: Null, hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: E): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: E, passcode: js.UndefOr[scala.Nothing], hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: E, passcode: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: E, passcode: String, hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: E, passcode: Null, hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: ECCPrivateKey): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: ECCPrivateKey, passcode: js.UndefOr[scala.Nothing], hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: ECCPrivateKey, passcode: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: ECCPrivateKey, passcode: String, hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: ECCPrivateKey, passcode: Null, hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: DSA): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: DSA, passcode: js.UndefOr[scala.Nothing], hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: DSA, passcode: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: DSA, passcode: String, hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: DSA, passcode: Null, hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: ECDSA): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: ECDSA, passcode: js.UndefOr[scala.Nothing], hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: ECDSA, passcode: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: ECDSA, passcode: String, hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: ECDSA, passcode: Null, hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: JsonWebKey): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: JsonWebKey, passcode: js.UndefOr[scala.Nothing], hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: JsonWebKey, passcode: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: JsonWebKey, passcode: String, hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: JsonWebKey, passcode: Null, hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  /**
    * get private or public key object from any arguments
    * @param param parameter to get key object. see description in detail.
    * @param passcode (OPTION) parameter to get key object. see description in detail.
    * @param hextype (OPTION) parameter to get key object. see description in detail.
    * @return `RSAKey`, `KJUR.crypto.ECDSA` or `KJUR.crypto.ECDSA` object
    * @description
    * This method gets private or public key object(`RSAKey`, `KJUR.crypto.DSA` or `KJUR.crypto.ECDSA`)
    * for RSA, DSA and ECC.
    * Arguments for this methods depends on a key format you specify.
    * Following key representations are supported.
    *
    * - ECC private/public key object(as is): param=KJUR.crypto.ECDSA
    * - DSA private/public key object(as is): param=KJUR.crypto.DSA
    * - RSA private/public key object(as is): param=RSAKey
    * - ECC private key parameters: param={d: d, curve: curveName}
    * - RSA private key parameters: param={n: n, e: e, d: d, p: p, q: q, dp: dp, dq: dq, co: co}
    *   NOTE: Each value shall be hexadecimal string of key spec.
    * - DSA private key parameters: param={p: p, q: q, g: g, y: y, x: x}
    *   NOTE: Each value shall be hexadecimal string of key spec.
    * - ECC public key parameters: param={xy: xy, curve: curveName}
    *   NOTE: ECC public key 'xy' shall be concatination of "04", x-bytes-hex and y-bytes-hex.
    * - DSA public key parameters: param={p: p, q: q, g: g, y: y}
    *   NOTE: Each value shall be hexadecimal string of key spec.
    * - RSA public key parameters: param={n: n, e: e}
    * - X.509v1/v3 PEM certificate (RSA/DSA/ECC): param=pemString
    * - PKCS#8 hexadecimal RSA/ECC public key: param=pemString, null, "pkcs8pub"
    * - PKCS#8 PEM RSA/DSA/ECC public key: param=pemString
    * - PKCS#5 plain hexadecimal RSA private key: param=hexString, null, "pkcs5prv"
    * - PKCS#5 plain PEM DSA/RSA private key: param=pemString
    * - PKCS#8 plain PEM RSA/ECDSA private key: param=pemString
    * - PKCS#5 encrypted PEM RSA/DSA private key: param=pemString, passcode
    * - PKCS#8 encrypted PEM RSA/ECDSA private key: param=pemString, passcode
    *
    * Please note following limitation on encrypted keys:
    *
    * - Encrypted PKCS#8 only supports PBKDF2/HmacSHA1/3DES
    * - Encrypted PKCS#5 supports DES-CBC, DES-EDE3-CBC, AES-{128,192.256}-CBC
    * - JWT plain ECC private/public key
    * - JWT plain RSA public key
    * - JWT plain RSA private key with P/Q/DP/DQ/COEFF
    * - JWT plain RSA private key without P/Q/DP/DQ/COEFF (since jsrsasign 5.0.0)
    *
    * NOTE1: [RFC 7517 JSON Web Key(JWK)](https://tools.ietf.org/html/rfc7517) support for RSA/ECC private/public key from jsrsasign 4.8.1.
    * NOTE2: X509v1 support is added since jsrsasign 5.0.11.
    *
    * @example
    * // 1. loading private key from PEM string
    * keyObj = KEYUTIL.getKey("-----BEGIN RSA PRIVATE KEY...");
    * keyObj = KEYUTIL.getKey("-----BEGIN RSA PRIVATE KEY..., "passcode");
    * keyObj = KEYUTIL.getKey("-----BEGIN PRIVATE KEY...");
    * keyObj = KEYUTIL.getKey("-----BEGIN PRIVATE KEY...", "passcode");
    * // 2. loading public key from PEM string
    * keyObj = KEYUTIL.getKey("-----BEGIN PUBLIC KEY...");
    * keyObj = KEYUTIL.getKey("-----BEGIN X509 CERTIFICATE...");
    * // 3. loading hexadecimal PKCS#5/PKCS#8 key
    * keyObj = KEYUTIL.getKey("308205c1...", null, "pkcs8pub");
    * keyObj = KEYUTIL.getKey("3082048b...", null, "pkcs5prv");
    * // 4. loading JSON Web Key(JWK)
    * keyObj = KEYUTIL.getKey({kty: "RSA", n: "0vx7...", e: "AQAB"});
    * keyObj = KEYUTIL.getKey({kty: "EC", crv: "P-256",
    *                          x: "MKBC...", y: "4Etl6...", d: "870Mb..."});
    * // 5. bare hexadecimal key
    * keyObj = KEYUTIL.getKey({n: "75ab..", e: "010001"});
    */
  /* static member */
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: typings.jsrsasign.jsrsasign.RSAKey): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: typings.jsrsasign.jsrsasign.RSAKey, passcode: js.UndefOr[scala.Nothing], hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: typings.jsrsasign.jsrsasign.RSAKey, passcode: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: typings.jsrsasign.jsrsasign.RSAKey, passcode: String, hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  @JSImport("jsrsasign", "KEYUTIL.getKey")
  @js.native
  def getKey(param: typings.jsrsasign.jsrsasign.RSAKey, passcode: Null, hextype: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  
  /**
    * get RSAKey/DSA/ECDSA public key object from hexadecimal string of PKCS#10 CSR
    * @param csrHex hexadecimal string of PKCS#10 CSR
    * @return RSAKey/DSA/ECDSA public key object
    */
  /* static member */
  @JSImport("jsrsasign", "KEYUTIL.getKeyFromCSRHex")
  @js.native
  def getKeyFromCSRHex(csrHex: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  
  /**
    * get RSAKey/DSA/ECDSA public key object from PEM formatted PKCS#10 CSR string
    * @param csrPEM PEM formatted PKCS#10 CSR string
    * @return RSAKey/DSA/ECDSA public key object
    */
  /* static member */
  @JSImport("jsrsasign", "KEYUTIL.getKeyFromCSRPEM")
  @js.native
  def getKeyFromCSRPEM(csrPEM: String): typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA = js.native
  
  /**
    * get PEM formatted private or public key file from a RSA/ECDSA/DSA key object
    * @param keyObjOrHex key object `RSAKey`, `KJUR.crypto.ECDSA` or `KJUR.crypto.DSA` to encode to
    * @param formatType (OPTION) output format type of "PKCS1PRV", "PKCS5PRV" or "PKCS8PRV" for private key
    * @param passwd (OPTION) password to protect private key
    * @param encAlg (OPTION) encryption algorithm for PKCS#5. currently supports DES-CBC, DES-EDE3-CBC and AES-{128,192,256}-CBC
    * @param hexType (OPTION) type of hex string (ex. pkcs5prv, pkcs8prv)
    * @param ivsaltHex hexadecimal string of IV and salt (default generated random IV)
    * @description
    *
    * __NOTE1:__ PKCS#5 encrypted private key protection algorithm supports DES-CBC, DES-EDE3-CBC and AES-{128,192,256}-CBC
    * __NOTE2:__ OpenSSL supports
    * __NOTE3:__ Parameter "ivsaltHex" supported since jsrsasign 8.0.0 keyutil 1.2.0.
    *
    * @example
    * KEYUTIL.getPEM(publicKey) => generates PEM PKCS#8 public key
    * KEYUTIL.getPEM(privateKey, "PKCS1PRV") => generates PEM PKCS#1 plain private key
    * KEYUTIL.getPEM(privateKey, "PKCS5PRV", "pass") => generates PEM PKCS#5 encrypted private key
    *                                                          with DES-EDE3-CBC (DEFAULT)
    * KEYUTIL.getPEM(privateKey, "PKCS5PRV", "pass", "DES-CBC") => generates PEM PKCS#5 encrypted
    *                                                                 private key with DES-CBC
    * KEYUTIL.getPEM(privateKey, "PKCS8PRV") => generates PEM PKCS#8 plain private key
    * KEYUTIL.getPEM(privateKey, "PKCS8PRV", "pass") => generates PEM PKCS#8 encrypted private key
    *                                                      with PBKDF2_HmacSHA1_3DES
    */
  /* static member */
  @JSImport("jsrsasign", "KEYUTIL.getPEM")
  @js.native
  def getPEM(
    keyObjOrHex: typings.jsrsasign.jsrsasign.RSAKey | DSA | ECDSA,
    formatType: js.UndefOr[PrivateKeyOutputFormatType],
    passwd: js.UndefOr[String],
    encAlg: js.UndefOr[String],
    hexType: js.UndefOr[String],
    ivsaltHex: js.UndefOr[String]
  ): String = js.native
  
  /**
    * parse hexadecimal string of PKCS#10 CSR (certificate signing request)
    * @param csrHex hexadecimal string of PKCS#10 CSR
    * @return associative array of parsed CSR
    * @description
    * Resulted associative array has following properties:
    *
    * - p8pubkeyhex - hexadecimal string of subject public key in PKCS#8
    *
    */
  /* static member */
  @JSImport("jsrsasign", "KEYUTIL.parseCSRHex")
  @js.native
  def parseCSRHex(csrHex: String): CSRHexResult = js.native
  
  /* static member */
  @JSImport("jsrsasign", "KEYUTIL.version")
  @js.native
  val version: String = js.native
}
