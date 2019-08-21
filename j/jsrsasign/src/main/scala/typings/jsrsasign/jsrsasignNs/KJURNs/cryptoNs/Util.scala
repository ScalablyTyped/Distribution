package typings.jsrsasign.jsrsasignNs.KJURNs.cryptoNs

import typings.jsrsasign.Anon_Hmacmd5
import typings.jsrsasign.Anon_Md2
import typings.jsrsasign.Anon_Md5Ripemd160
import typings.jsrsasign.jsrsasignNs.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** static object for cryptographic function utilities */
@JSGlobal("jsrsasign.KJUR.crypto.Util")
@js.native
object Util extends js.Object {
  var CRYPTOJSMESSAGEDIGESTNAME: Anon_Md5Ripemd160 = js.native
  /** associative array of default provider name for each hash and signature algorithms */
  var DEFAULTPROVIDER: Anon_Hmacmd5 = js.native
  /** PKCS#1 DigestInfo heading hexadecimal bytes for each hash algorithms */
  var DIGESTINFOHEAD: Anon_Md2 = js.native
  /**
    * get hexadecimal DigestInfo
    * @param hHash hexadecimal hash value
    * @param alg hash algorithm name (ex. 'sha1')
    * @return hexadecimal string DigestInfo ASN.1 structure
    */
  def getDigestInfoHex(hHash: String, alg: String): String = js.native
  /**
    * get PKCS#1 padded hexadecimal DigestInfo
    * @param hHash hexadecimal hash value of message to be signed
    * @param alg hash algorithm name (ex. 'sha1')
    * @param keySize key bit length (ex. 1024)
    * @return hexadecimal string of PKCS#1 padded DigestInfo
    */
  def getPaddedDigestInfoHex(hHash: String, alg: String, keySize: Double): String = js.native
  /**
    * get BigInteger object of random value from min value to max value
    * @param biMin min value of BigInteger object for random value
    * @param biMax max value of BigInteger object for random value
    * @return BigInteger object of specified random value
    * @description
    * This static method generates a BigInteger object with random value
    * greater than or equal to biMin and smaller than or equal to biMax
    * (i.e. biMin ≤ result ≤ biMax).
    * @example
    * biMin = new BigInteger("2fa411...", 16);
    * biMax = new BigInteger("3fa411...", 16);
    * KJUR.crypto.Util.getRandomBigIntegerMinToMax(biMin, biMax) → 32f1... of BigInteger
    */
  def getRandomBigIntegerMinToMax(biMin: Double, biMax: Double): BigInteger = js.native
  /**
    * get BigInteger object of random value from with specified bit length
    * @param n length of bits of random
    * @return BigInteger object of specified random value
    * @example
    * KJUR.crypto.Util.getRandomBigIntegerOfNbits(24) → 6314af of BigInteger
    * KJUR.crypto.Util.getRandomBigIntegerOfNbits(1024) → 8fbc... of BigInteger
    */
  def getRandomBigIntegerOfNbits(n: Double): BigInteger = js.native
  /**
    * get BigInteger object of random value from with specified byte length
    * @param n length of bytes of random
    * @return BigInteger object of specified random value
    * @example
    * KJUR.crypto.Util.getRandomBigIntegerOfNbytes(3) → 6314af of BigInteger
    * KJUR.crypto.Util.getRandomBigIntegerOfNbytes(128) → 8fbc... of BigInteger
    */
  def getRandomBigIntegerOfNbytes(n: Double): BigInteger = js.native
  /**
    * get BigInteger object of random value from zero to max value
    * @param biMax max value of BigInteger object for random value
    * @return BigInteger object of specified random value
    * @description
    * This static method generates a BigInteger object with random value
    * greater than or equal to zero and smaller than or equal to biMax
    * (i.e. 0 ≤ result ≤ biMax).
    * @example
    * biMax = new BigInteger("3fa411...", 16);
    * KJUR.crypto.Util.getRandomBigIntegerZeroToMax(biMax) → 8fbc... of BigInteger
    */
  def getRandomBigIntegerZeroToMax(biMax: Double): BigInteger = js.native
  /**
    * get hexadecimal string of random value from with specified bit length
    * @param n length of bits of random
    * @return hexadecimal string of random
    * @example
    * KJUR.crypto.Util.getRandomHexOfNbits(24) → "6314af", "000000" or "001fb4"
    * KJUR.crypto.Util.getRandomHexOfNbits(1024) → "8fbc..." in 1024bits
    */
  def getRandomHexOfNbits(n: Double): String = js.native
  /**
    * get hexadecimal string of random value from with specified byte length
    * @param n length of bytes of random
    * @return hexadecimal string of random
    * @example
    * KJUR.crypto.Util.getRandomHexOfNbytes(3) → "6314af", "000000" or "001fb4"
    * KJUR.crypto.Util.getRandomHexOfNbytes(128) → "8fbc..." in 1024bits
    */
  def getRandomHexOfNbytes(n: Double): String = js.native
  /**
    * get hexadecimal hash of hexadecimal string with specified algorithm
    * @param sHex input hexadecimal string to be hashed
    * @param alg hash algorithm name
    * @return hexadecimal string of hash value
    */
  def hashHex(sHex: String, alg: String): String = js.native
  /**
    * get hexadecimal hash of string with specified algorithm
    * @param s input string to be hashed
    * @param alg hash algorithm name
    * @return hexadecimal string of hash value
    */
  def hashString(s: String, alg: String): String = js.native
  /**
    * get hexadecimal MD5 hash of string
    * @param s input string to be hashed
    * @return hexadecimal string of hash value
    * @example
    * Util.md5('aaa') → 47bce5c74f589f4867dbd57e9ca9f808
    */
  def md5(s: String): String = js.native
  /**
    * get hexadecimal RIPEMD160 hash of string
    * @param s input string to be hashed
    * @return hexadecimal string of hash value
    * @example
    * KJUR.crypto.Util.ripemd160("aaa") → 08889bd7b151aa174c21f33f59147fa65381edea
    */
  def ripemd160(s: String): String = js.native
  /**
    * get hexadecimal SHA1 hash of string
    * @param s input string to be hashed
    * @return hexadecimal string of hash value
    */
  def sha1(s: String): String = js.native
  /**
    * get hexadecimal SHA256 hash of string
    * @param s input string to be hashed
    * @return hexadecimal string of hash value
    */
  def sha256(s: String): String = js.native
  def sha256Hex(s: String): String = js.native
  /**
    * get hexadecimal SHA512 hash of string
    * @param s input string to be hashed
    * @return hexadecimal string of hash value
    */
  def sha512(s: String): String = js.native
}

