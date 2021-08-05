package typings.jsrsasign.global.jsrsasign

import typings.jsrsasign.jsrsasignNumbers.`0`
import typings.jsrsasign.jsrsasignNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Tom Wu's RSA Key class and extension */
@JSGlobal("jsrsasign.RSAKey")
@js.native
class RSAKey ()
  extends StObject
     with typings.jsrsasign.jsrsasign.RSAKey {
  
  /**
    * read an ASN.1 hexadecimal string of X.509 RSA public key certificate
    * @param h hexadecimal string of X.509 RSA public key certificate
    * @param nthPKI nth index of publicKeyInfo. (DEFAULT: 6 for X509v3)
    */
  /* CompleteClass */
  override def readCertPubKeyHex(h: String, nthPKI: Double): Unit = js.native
  
  /**
    * read an ASN.1 hexadecimal string of PKCS#1/5 plain RSA private key
    * @param h hexadecimal string of PKCS#1/5 plain RSA private key
    */
  /* CompleteClass */
  override def readPKCS5PrvKeyHex(h: String): Unit = js.native
  
  /**
    * read an ASN.1 hexadecimal string of PKCS#5 RSA public key
    * @param h hexadecimal string of PKCS#5 public key
    */
  /* CompleteClass */
  override def readPKCS5PubKeyHex(h: String): Unit = js.native
  
  /**
    * read an ASN.1 hexadecimal string of PKCS#8 plain RSA private key
    * @param h hexadecimal string of PKCS#8 plain RSA private key
    */
  /* CompleteClass */
  override def readPKCS8PrvKeyHex(h: String): Unit = js.native
  
  /**
    * read an ASN.1 hexadecimal string of PKCS#8 RSA public key
    * @param h hexadecimal string of PKCS#8 public key
    */
  /* CompleteClass */
  override def readPKCS8PubKeyHex(h: String): Unit = js.native
  
  /**
    * read PKCS#1 private key from a string
    * @param keyPEM string of PKCS#1 private key.
    */
  /* CompleteClass */
  override def readPrivateKeyFromPEMString(keyPEM: String): Unit = js.native
  
  /**
    * verifies a sigature for a message string with RSA public key.
    * @param sMsg message string to be verified.
    * @param hSig hexadecimal string of signature.
    *             non-hexadecimal characters including new lines will be ignored.
    * @return returns 1 if valid, otherwise 0
    */
  /* CompleteClass */
  override def verify(sMsg: String, hSig: String): `0` | `1` = js.native
}
object RSAKey {
  
  @JSGlobal("jsrsasign.RSAKey")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * static method to get array of hex field values from hexadecimal PKCS#5 RSA private key.
    * @param sPEMPrivateKey PEM PKCS#1/5 s private key string
    * @return array of field hex value
    * @example
    * RSAKey.getHexValueArrayOfChildrenFromHex("3082...") → ["00", "3b42...", ...]
    */
  /* static member */
  inline def getHexValueArrayOfChildrenFromHex(sPEMPrivateKey: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHexValueArrayOfChildrenFromHex")(sPEMPrivateKey.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  /**
    * static method to get array of field positions from hexadecimal PKCS#5 RSA private key.
    * @param sPEMPrivateKey PEM PKCS#1/5 s private key string
    * @return array of field positions
    * @example
    * RSAKey.getPosArrayOfChildrenFromHex("3082...") → [8, 32, ...]
    */
  /* static member */
  inline def getPosArrayOfChildrenFromHex(sPEMPrivateKey: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPosArrayOfChildrenFromHex")(sPEMPrivateKey.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  /**
    * sign for a message string with RSA private key.
    * @param s message string to be signed.
    * @param hashAlg hash algorithm name for signing.
    * @return returns hexadecimal string of signature value.
    */
  /* static member */
  inline def sign(s: String, hashAlg: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(s.asInstanceOf[js.Any], hashAlg.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * sign for a message string with RSA private key by PKCS#1 PSS signing.
    * @param s message string to be signed.
    * @param hashAlg hash algorithm name for signing.
    * @param sLen salt byte length from 0 to (keybytelen - hashbytelen - 2).
    *        There are two special values:
    *        * -1: sets the salt length to the digest length
    *        * -2: sets the salt length to maximum permissible value
    *           (i.e. keybytelen - hashbytelen - 2)
    *
    *        DEFAULT is -1. (NOTE: OpenSSL's default is -2.)
    * @return returns hexadecimal string of signature value.
    */
  /* static member */
  inline def signPSS(s: String, hashAlg: String, sLen: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("signPSS")(s.asInstanceOf[js.Any], hashAlg.asInstanceOf[js.Any], sLen.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * sign hash value of message to be signed with RSA private key.
    * @param sHashHex hexadecimal string of hash value of message to be signed.
    * @param hashAlg hash algorithm name for signing.
    * @return returns hexadecimal string of signature value.
    */
  /* static member */
  inline def signWithMessageHash(sHashHex: String, hashAlg: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("signWithMessageHash")(sHashHex.asInstanceOf[js.Any], hashAlg.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * sign hash value of message with RSA private key by PKCS#1 PSS signing.
    * @param hHash hexadecimal hash value of message to be signed.
    * @param hashAlg hash algorithm name for signing.
    * @param sLen salt byte length from 0 to (keybytelen - hashbytelen - 2).
    *        There are two special values:
    *        * -1: sets the salt length to the digest length
    *        * -2: sets the salt length to maximum permissible value
    *           (i.e. keybytelen - hashbytelen - 2)
    *
    *        DEFAULT is -1. (NOTE: OpenSSL's default is -2.)
    * @return returns hexadecimal string of signature value.
    */
  /* static member */
  inline def signWithMessageHashPSS(hHash: String, hashAlg: String, sLen: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("signWithMessageHashPSS")(hHash.asInstanceOf[js.Any], hashAlg.asInstanceOf[js.Any], sLen.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * verifies a sigature for a message string with RSA public key by PKCS#1 PSS sign.
    * @param sMsg message string to be verified.
    * @param hSig hexadecimal string of signature value
    * @param hashAlg hash algorithm name
    * @param sLen salt byte length from 0 to (keybytelen - hashbytelen - 2).
    *        There are two special values:
    *        * -1: sets the salt length to the digest length
    *        * -2: sets the salt length to maximum permissible value
    *           (i.e. keybytelen - hashbytelen - 2)
    *
    *        DEFAULT is -1. (NOTE: OpenSSL's default is -2.)
    * @return returns true if valid, otherwise false
    */
  /* static member */
  inline def verifyPSS(sMsg: String, hSig: String, hashAlg: String, sLen: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyPSS")(sMsg.asInstanceOf[js.Any], hSig.asInstanceOf[js.Any], hashAlg.asInstanceOf[js.Any], sLen.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * verifies a sigature for a message string with RSA public key.
    * @param sHashHex hexadecimal hash value of message to be verified.
    * @param hSig hexadecimal string of siganture.
    *                 non-hexadecimal charactors including new lines will be ignored.
    * @return returns 1 if valid, otherwise 0
    */
  /* static member */
  inline def verifyWithMessageHash(sHashHex: String, hSig: String): `0` | `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyWithMessageHash")(sHashHex.asInstanceOf[js.Any], hSig.asInstanceOf[js.Any])).asInstanceOf[`0` | `1`]
  
  /**
    * verifies a sigature for a hash value of message string with RSA public key by PKCS#1 PSS sign.
    * @param hHash hexadecimal hash value of message string to be verified.
    * @param hSig hexadecimal string of signature value
    * @param hashAlg hash algorithm name
    * @param sLen salt byte length from 0 to (keybytelen - hashbytelen - 2).
    *        There are two special values:
    *        * -1: sets the salt length to the digest length
    *        * -2: sets the salt length to maximum permissible value
    *           (i.e. keybytelen - hashbytelen - 2)
    *
    *        DEFAULT is -1 (NOTE: OpenSSL's default is -2.)
    * @return returns true if valid, otherwise false
    */
  /* static member */
  inline def verifyWithMessageHashPSS(hHash: String, hSig: String, hashAlg: String, sLen: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyWithMessageHashPSS")(hHash.asInstanceOf[js.Any], hSig.asInstanceOf[js.Any], hashAlg.asInstanceOf[js.Any], sLen.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
