package typings.jsrsasign.jsrsasign

import typings.jsrsasign.jsrsasignNumbers.`0`
import typings.jsrsasign.jsrsasignNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Tom Wu's RSA Key class and extension */
@JSGlobal("jsrsasign.RSAKey")
@js.native
class RSAKey () extends js.Object {
  /**
    * read an ASN.1 hexadecimal string of X.509 RSA public key certificate
    * @param h hexadecimal string of X.509 RSA public key certificate
    * @param nthPKI nth index of publicKeyInfo. (DEFAULT: 6 for X509v3)
    */
  def readCertPubKeyHex(h: String, nthPKI: Double): Unit = js.native
  /**
    * read an ASN.1 hexadecimal string of PKCS#1/5 plain RSA private key
    * @param h hexadecimal string of PKCS#1/5 plain RSA private key
    */
  def readPKCS5PrvKeyHex(h: String): Unit = js.native
  /**
    * read an ASN.1 hexadecimal string of PKCS#5 RSA public key
    * @param h hexadecimal string of PKCS#5 public key
    */
  def readPKCS5PubKeyHex(h: String): Unit = js.native
  /**
    * read an ASN.1 hexadecimal string of PKCS#8 plain RSA private key
    * @param h hexadecimal string of PKCS#8 plain RSA private key
    */
  def readPKCS8PrvKeyHex(h: String): Unit = js.native
  /**
    * read an ASN.1 hexadecimal string of PKCS#8 RSA public key
    * @param h hexadecimal string of PKCS#8 public key
    */
  def readPKCS8PubKeyHex(h: String): Unit = js.native
  /**
    * read PKCS#1 private key from a string
    * @param keyPEM string of PKCS#1 private key.
    */
  def readPrivateKeyFromPEMString(keyPEM: String): Unit = js.native
  /**
    * verifies a sigature for a message string with RSA public key.
    * @param sMsg message string to be verified.
    * @param hSig hexadecimal string of signature.
    *             non-hexadecimal characters including new lines will be ignored.
    * @return returns 1 if valid, otherwise 0
    */
  def verify(sMsg: String, hSig: String): `0` | `1` = js.native
}

/* static members */
@JSGlobal("jsrsasign.RSAKey")
@js.native
object RSAKey extends js.Object {
  /**
    * static method to get array of hex field values from hexadecimal PKCS#5 RSA private key.
    * @param sPEMPrivateKey PEM PKCS#1/5 s private key string
    * @return array of field hex value
    * @example
    * RSAKey.getHexValueArrayOfChildrenFromHex("3082...") → ["00", "3b42...", ...]
    */
  def getHexValueArrayOfChildrenFromHex(sPEMPrivateKey: String): js.Array[String] = js.native
  /**
    * static method to get array of field positions from hexadecimal PKCS#5 RSA private key.
    * @param sPEMPrivateKey PEM PKCS#1/5 s private key string
    * @return array of field positions
    * @example
    * RSAKey.getPosArrayOfChildrenFromHex("3082...") → [8, 32, ...]
    */
  def getPosArrayOfChildrenFromHex(sPEMPrivateKey: String): js.Array[Double] = js.native
  /**
    * sign for a message string with RSA private key.
    * @param s message string to be signed.
    * @param hashAlg hash algorithm name for signing.
    * @return returns hexadecimal string of signature value.
    */
  def sign(s: String, hashAlg: String): String = js.native
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
  def signPSS(s: String, hashAlg: String, sLen: Double): String = js.native
  /**
    * sign hash value of message to be signed with RSA private key.
    * @param sHashHex hexadecimal string of hash value of message to be signed.
    * @param hashAlg hash algorithm name for signing.
    * @return returns hexadecimal string of signature value.
    */
  def signWithMessageHash(sHashHex: String, hashAlg: String): String = js.native
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
  def signWithMessageHashPSS(hHash: String, hashAlg: String, sLen: Double): String = js.native
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
  def verifyPSS(sMsg: String, hSig: String, hashAlg: String, sLen: Double): Boolean = js.native
  /**
    * verifies a sigature for a message string with RSA public key.
    * @param sHashHex hexadecimal hash value of message to be verified.
    * @param hSig hexadecimal string of siganture.
    *                 non-hexadecimal charactors including new lines will be ignored.
    * @return returns 1 if valid, otherwise 0
    */
  def verifyWithMessageHash(sHashHex: String, hSig: String): `0` | `1` = js.native
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
  def verifyWithMessageHashPSS(hHash: String, hSig: String, hashAlg: String, sLen: Double): Boolean = js.native
}

