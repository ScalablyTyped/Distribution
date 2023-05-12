package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Tom Wu's RSA Key class and extension */
trait RSAKey extends StObject {
  
  /**
    * read an ASN.1 hexadecimal string of X.509 RSA public key certificate
    * @param h hexadecimal string of X.509 RSA public key certificate
    * @param nthPKI nth index of publicKeyInfo. (DEFAULT: 6 for X509v3)
    */
  def readCertPubKeyHex(h: String, nthPKI: Double): Unit
  
  /**
    * read an ASN.1 hexadecimal string of PKCS#1/5 plain RSA private key
    * @param h hexadecimal string of PKCS#1/5 plain RSA private key
    */
  def readPKCS5PrvKeyHex(h: String): Unit
  
  /**
    * read an ASN.1 hexadecimal string of PKCS#5 RSA public key
    * @param h hexadecimal string of PKCS#5 public key
    */
  def readPKCS5PubKeyHex(h: String): Unit
  
  /**
    * read an ASN.1 hexadecimal string of PKCS#8 plain RSA private key
    * @param h hexadecimal string of PKCS#8 plain RSA private key
    */
  def readPKCS8PrvKeyHex(h: String): Unit
  
  /**
    * read an ASN.1 hexadecimal string of PKCS#8 RSA public key
    * @param h hexadecimal string of PKCS#8 public key
    */
  def readPKCS8PubKeyHex(h: String): Unit
  
  /**
    * read PKCS#1 private key from a string
    * @param keyPEM string of PKCS#1 private key.
    */
  def readPrivateKeyFromPEMString(keyPEM: String): Unit
  
  /**
    * sign for a message string with RSA private key.
    * @param s message string to be signed.
    * @param hashAlg hash algorithm name for signing.
    * @return returns hexadecimal string of signature value.
    */
  def sign(s: String, hashAlg: String): String
  
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
  def signPSS(s: String, hashAlg: String, sLen: Double): String
  
  /**
    * sign hash value of message to be signed with RSA private key.
    * @param sHashHex hexadecimal string of hash value of message to be signed.
    * @param hashAlg hash algorithm name for signing.
    * @return returns hexadecimal string of signature value.
    */
  def signWithMessageHash(sHashHex: String, hashAlg: String): String
  
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
  def signWithMessageHashPSS(hHash: String, hashAlg: String, sLen: Double): String
  
  /**
    * verifies a sigature for a message string with RSA public key.
    * @param sMsg message string to be verified.
    * @param hSig hexadecimal string of signature.
    *             non-hexadecimal characters including new lines will be ignored.
    * @return returns true if valid, otherwise false
    */
  def verify(sMsg: String, hSig: String): Boolean
  
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
  def verifyPSS(sMsg: String, hSig: String, hashAlg: String, sLen: Double): Boolean
  
  /**
    * verifies a sigature for a message string with RSA public key.
    * @param sHashHex hexadecimal hash value of message to be verified.
    * @param hSig hexadecimal string of siganture.
    *                 non-hexadecimal charactors including new lines will be ignored.
    * @return returns true if valid, otherwise false
    */
  def verifyWithMessageHash(sHashHex: String, hSig: String): Boolean
  
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
  def verifyWithMessageHashPSS(hHash: String, hSig: String, hashAlg: String, sLen: Double): Boolean
}
object RSAKey {
  
  inline def apply(
    readCertPubKeyHex: (String, Double) => Unit,
    readPKCS5PrvKeyHex: String => Unit,
    readPKCS5PubKeyHex: String => Unit,
    readPKCS8PrvKeyHex: String => Unit,
    readPKCS8PubKeyHex: String => Unit,
    readPrivateKeyFromPEMString: String => Unit,
    sign: (String, String) => String,
    signPSS: (String, String, Double) => String,
    signWithMessageHash: (String, String) => String,
    signWithMessageHashPSS: (String, String, Double) => String,
    verify: (String, String) => Boolean,
    verifyPSS: (String, String, String, Double) => Boolean,
    verifyWithMessageHash: (String, String) => Boolean,
    verifyWithMessageHashPSS: (String, String, String, Double) => Boolean
  ): RSAKey = {
    val __obj = js.Dynamic.literal(readCertPubKeyHex = js.Any.fromFunction2(readCertPubKeyHex), readPKCS5PrvKeyHex = js.Any.fromFunction1(readPKCS5PrvKeyHex), readPKCS5PubKeyHex = js.Any.fromFunction1(readPKCS5PubKeyHex), readPKCS8PrvKeyHex = js.Any.fromFunction1(readPKCS8PrvKeyHex), readPKCS8PubKeyHex = js.Any.fromFunction1(readPKCS8PubKeyHex), readPrivateKeyFromPEMString = js.Any.fromFunction1(readPrivateKeyFromPEMString), sign = js.Any.fromFunction2(sign), signPSS = js.Any.fromFunction3(signPSS), signWithMessageHash = js.Any.fromFunction2(signWithMessageHash), signWithMessageHashPSS = js.Any.fromFunction3(signWithMessageHashPSS), verify = js.Any.fromFunction2(verify), verifyPSS = js.Any.fromFunction4(verifyPSS), verifyWithMessageHash = js.Any.fromFunction2(verifyWithMessageHash), verifyWithMessageHashPSS = js.Any.fromFunction4(verifyWithMessageHashPSS))
    __obj.asInstanceOf[RSAKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RSAKey] (val x: Self) extends AnyVal {
    
    inline def setReadCertPubKeyHex(value: (String, Double) => Unit): Self = StObject.set(x, "readCertPubKeyHex", js.Any.fromFunction2(value))
    
    inline def setReadPKCS5PrvKeyHex(value: String => Unit): Self = StObject.set(x, "readPKCS5PrvKeyHex", js.Any.fromFunction1(value))
    
    inline def setReadPKCS5PubKeyHex(value: String => Unit): Self = StObject.set(x, "readPKCS5PubKeyHex", js.Any.fromFunction1(value))
    
    inline def setReadPKCS8PrvKeyHex(value: String => Unit): Self = StObject.set(x, "readPKCS8PrvKeyHex", js.Any.fromFunction1(value))
    
    inline def setReadPKCS8PubKeyHex(value: String => Unit): Self = StObject.set(x, "readPKCS8PubKeyHex", js.Any.fromFunction1(value))
    
    inline def setReadPrivateKeyFromPEMString(value: String => Unit): Self = StObject.set(x, "readPrivateKeyFromPEMString", js.Any.fromFunction1(value))
    
    inline def setSign(value: (String, String) => String): Self = StObject.set(x, "sign", js.Any.fromFunction2(value))
    
    inline def setSignPSS(value: (String, String, Double) => String): Self = StObject.set(x, "signPSS", js.Any.fromFunction3(value))
    
    inline def setSignWithMessageHash(value: (String, String) => String): Self = StObject.set(x, "signWithMessageHash", js.Any.fromFunction2(value))
    
    inline def setSignWithMessageHashPSS(value: (String, String, Double) => String): Self = StObject.set(x, "signWithMessageHashPSS", js.Any.fromFunction3(value))
    
    inline def setVerify(value: (String, String) => Boolean): Self = StObject.set(x, "verify", js.Any.fromFunction2(value))
    
    inline def setVerifyPSS(value: (String, String, String, Double) => Boolean): Self = StObject.set(x, "verifyPSS", js.Any.fromFunction4(value))
    
    inline def setVerifyWithMessageHash(value: (String, String) => Boolean): Self = StObject.set(x, "verifyWithMessageHash", js.Any.fromFunction2(value))
    
    inline def setVerifyWithMessageHashPSS(value: (String, String, String, Double) => Boolean): Self = StObject.set(x, "verifyWithMessageHashPSS", js.Any.fromFunction4(value))
  }
}
