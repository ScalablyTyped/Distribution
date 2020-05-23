package typings.jsrsasign.jsrsasign.KJUR.crypto

import typings.jsrsasign.jsrsasign.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for DSA signing and verification
  * @description
  *
  * CAUTION: Most of the case, you don't need to use this class.
  * Please use `KJUR.crypto.Signature` class instead.
  *
  *
  * NOTE: Until jsrsasign 6.2.3, DSA class have used codes from openpgpjs library 1.0.0
  * licenced under LGPL licence. To avoid license issue dsa-2.0.js was re-written with
  * my own codes in jsrsasign 7.0.0.
  * Some random number generators used in dsa-2.0.js was newly defined
  * in KJUR.crypto.Util class. Now all of LGPL codes are removed.
  */
@js.native
trait DSA extends js.Object {
  /**
    * parse hexadecimal ASN.1 DSA signature value
    * @param hSigVal hexadecimal string of ASN.1 encoded DSA signature value
    * @return array [r, s] of DSA signature value. Both r and s are BigInteger.
    */
  def parseASN1Signature(hSigVal: String): js.Tuple2[BigInteger, BigInteger] = js.native
  /**
    * read an ASN.1 hexadecimal string of X.509 DSA public key certificate
    * @param h hexadecimal string of X.509 DSA public key certificate
    * @param nthPKI nth index of publicKeyInfo. (DEFAULT: 6 for X509v3)
    */
  def readCertPubKeyHex(h: String, nthPKI: Double): Unit = js.native
  /**
    * read an ASN.1 hexadecimal string of PKCS#1/5 plain DSA private key
    * @param h hexadecimal string of PKCS#1/5 DSA private key
    */
  def readPKCS5PrvKeyHex(h: String): Unit = js.native
  /**
    * read an ASN.1 hexadecimal string of PKCS#8 plain DSA private key
    * @param h hexadecimal string of PKCS#8 DSA private key
    */
  def readPKCS8PrvKeyHex(h: String): Unit = js.native
  /**
    * read an ASN.1 hexadecimal string of PKCS#8 plain DSA private key
    * @param h hexadecimal string of PKCS#8 DSA private key
    */
  def readPKCS8PubKeyHex(h: String): Unit = js.native
  def setPrivate(p: BigInteger, q: BigInteger, g: BigInteger, y: Null, x: BigInteger): Unit = js.native
  /**
    * set DSA private key by key parameters of BigInteger object
    * @param p prime P parameter
    * @param q sub prime Q parameter
    * @param g base G parameter
    * @param y public key Y or null
    * @param x private key X
    */
  def setPrivate(p: BigInteger, q: BigInteger, g: BigInteger, y: BigInteger, x: BigInteger): Unit = js.native
  /**
    * set DSA private key by key parameters of hexadecimal string
    * @param hP prime P parameter
    * @param hQ sub prime Q parameter
    * @param hG base G parameter
    * @param hY public key Y or null
    * @param hX private key X
    */
  def setPrivateHex(hP: String, hQ: String, hG: String, hY: String, hX: String): Unit = js.native
  /**
    * set DSA public key by key parameters of BigInteger object
    * @param p prime P parameter
    * @param q sub prime Q parameter
    * @param g base G parameter
    * @param y public key Y
    */
  def setPublic(p: BigInteger, q: BigInteger, g: BigInteger, y: BigInteger): Unit = js.native
  /**
    * set DSA public key by key parameters of hexadecimal string
    * @param hP prime P parameter
    * @param hQ sub prime Q parameter
    * @param hG base G parameter
    * @param hY public key Y
    */
  def setPublicHex(hP: String, hQ: String, hG: String, hY: String): Unit = js.native
  /**
    * sign to hashed message by this DSA private key object
    * @param sHashHex hexadecimal string of hashed message
    * @return hexadecimal string of ASN.1 encoded DSA signature value
    */
  def signWithMessageHash(sHashHex: String): String = js.native
  /**
    * verify signature by this DSA public key object
    * @param sHashHex hexadecimal string of hashed message
    * @param hSigVal hexadecimal string of ASN.1 encoded DSA signature value
    * @return true if the signature is valid otherwise false.
    */
  def verifyWithMessageHash(sHashHex: String, hSigVal: String): Boolean = js.native
}

