package typings.jsrsasign.global.jsrsasign

import typings.jsrsasign.jsrsasignNumbers.`0`
import typings.jsrsasign.jsrsasignNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Tom Wu's RSA Key class and extension */
@JSGlobal("jsrsasign.RSAKey")
@js.native
class RSAKey ()
  extends typings.jsrsasign.jsrsasign.RSAKey
object RSAKey {
  
  /**
    * static method to get array of hex field values from hexadecimal PKCS#5 RSA private key.
    * @param sPEMPrivateKey PEM PKCS#1/5 s private key string
    * @return array of field hex value
    * @example
    * RSAKey.getHexValueArrayOfChildrenFromHex("3082...") → ["00", "3b42...", ...]
    */
  /* static member */
  @JSGlobal("jsrsasign.RSAKey.getHexValueArrayOfChildrenFromHex")
  @js.native
  def getHexValueArrayOfChildrenFromHex(sPEMPrivateKey: String): js.Array[String] = js.native
  
  /**
    * static method to get array of field positions from hexadecimal PKCS#5 RSA private key.
    * @param sPEMPrivateKey PEM PKCS#1/5 s private key string
    * @return array of field positions
    * @example
    * RSAKey.getPosArrayOfChildrenFromHex("3082...") → [8, 32, ...]
    */
  /* static member */
  @JSGlobal("jsrsasign.RSAKey.getPosArrayOfChildrenFromHex")
  @js.native
  def getPosArrayOfChildrenFromHex(sPEMPrivateKey: String): js.Array[Double] = js.native
  
  /**
    * sign for a message string with RSA private key.
    * @param s message string to be signed.
    * @param hashAlg hash algorithm name for signing.
    * @return returns hexadecimal string of signature value.
    */
  /* static member */
  @JSGlobal("jsrsasign.RSAKey.sign")
  @js.native
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
  /* static member */
  @JSGlobal("jsrsasign.RSAKey.signPSS")
  @js.native
  def signPSS(s: String, hashAlg: String, sLen: Double): String = js.native
  
  /**
    * sign hash value of message to be signed with RSA private key.
    * @param sHashHex hexadecimal string of hash value of message to be signed.
    * @param hashAlg hash algorithm name for signing.
    * @return returns hexadecimal string of signature value.
    */
  /* static member */
  @JSGlobal("jsrsasign.RSAKey.signWithMessageHash")
  @js.native
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
  /* static member */
  @JSGlobal("jsrsasign.RSAKey.signWithMessageHashPSS")
  @js.native
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
  /* static member */
  @JSGlobal("jsrsasign.RSAKey.verifyPSS")
  @js.native
  def verifyPSS(sMsg: String, hSig: String, hashAlg: String, sLen: Double): Boolean = js.native
  
  /**
    * verifies a sigature for a message string with RSA public key.
    * @param sHashHex hexadecimal hash value of message to be verified.
    * @param hSig hexadecimal string of siganture.
    *                 non-hexadecimal charactors including new lines will be ignored.
    * @return returns 1 if valid, otherwise 0
    */
  /* static member */
  @JSGlobal("jsrsasign.RSAKey.verifyWithMessageHash")
  @js.native
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
  /* static member */
  @JSGlobal("jsrsasign.RSAKey.verifyWithMessageHashPSS")
  @js.native
  def verifyWithMessageHashPSS(hHash: String, hSig: String, hashAlg: String, sLen: Double): Boolean = js.native
}
