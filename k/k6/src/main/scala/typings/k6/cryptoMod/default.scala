package typings.k6.cryptoMod

import typings.k6.mod.bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This module provides common hashing functionality available in the GoLang crypto package.
  * https://k6.io/docs/javascript-api/k6-crypto
  */
@JSImport("k6/crypto", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Create an HMAC hashing object.
    * https://k6.io/docs/javascript-api/k6-crypto/createhmac-algorithm-secret
    * @param algorithm - Hash algorithm.
    * @param secret - Shared secret.
    * @returns HMAC hashing object.
    * @example
    * let hasher = crypto.createHMAC('sha256', 'a secret');
    * hasher.update('hello ');
    * hasher.update('world!');
    * console.log(hasher.digest('hex'));
    */
  def createHMAC(algorithm: Algorithm, secret: String): Hasher = js.native
  
  /**
    * Create a hashing object.
    * https://k6.io/docs/javascript-api/k6-crypto/createhash-algorithm
    * @param algorithm - Hash algorithm.
    * @returns Hashing object.
    * @example
    * let hasher = crypto.createHash('sha256');
    * hasher.update('hello ');
    * hasher.update('world!');
    * console.log(hasher.digest('hex'));
    */
  def createHash(algorithm: Algorithm): Hasher = js.native
  
  /**
    * Produce HMAC.
    * https://k6.io/docs/javascript-api/k6-crypto/hmac-algorithm-secret-data-outputencoding
    * @param algorithm - Hash algorithm.
    * @param secret - Shared secret.
    * @param data - Input data.
    * @param outputEncoding - Output encoding.
    * @returns Produced HMAC.
    * @example
    * crypto.hmac('sha256', 'mysecret', 'hello world!', 'hex')
    */
  def hmac[OE /* <: OutputEncoding */](algorithm: Algorithm, secret: String, data: String, outputEncoding: OE): Output[OE] = js.native
  
  /**
    * Hash with MD4.
    * https://k6.io/docs/javascript-api/k6-crypto/md4-input-outputencoding
    * @param input - Data to hash.
    * @param outputEncoding - Output encoding.
    * @returns MD4 digest.
    * @example
    * crypto.md4('hello world!', 'hex')
    */
  def md4[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  
  /**
    * Hash with MD5.
    * https://k6.io/docs/javascript-api/k6-crypto/md5-input-outputencoding
    * @param input - Data to hash.
    * @param outputEncoding - Output encoding.
    * @returns MD5 digest.
    * @example
    * crypto.md5("hello world!", "hex")
    */
  def md5[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  
  /**
    * Generate random bytes.
    * @param size - Number of bytes to generate.
    * @returns Random bytes.
    * @example
    * crypto.randomBytes(42)
    */
  def randomBytes(size: Double): bytes = js.native
  
  /**
    * Hash with RIPEMD-160.
    * https://k6.io/docs/javascript-api/k6-crypto/ripemd160-input-outputencoding
    * @param input - Data to hash.
    * @param outputEncoding - Output encoding.
    * @returns RIPEMD-160 digest.
    * @example
    * crypto.ripemd160('hello world!', 'hex')
    */
  def ripemd160[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  
  /**
    * Hash with SHA-1.
    * https://k6.io/docs/javascript-api/k6-crypto/sha1-input-outputencoding
    * @param input - Data to hash.
    * @param outputEncoding - Output encoding.
    * @returns SHA-1 digest.
    * @example
    * crypto.sha1('hello world!', 'hex')
    */
  def sha1[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  
  /**
    * Hash with SHA-256.
    * https://k6.io/docs/javascript-api/k6-crypto/sha256-input-outputencoding
    * @param input - Data to hash.
    * @param outputEncoding - Output encoding.
    * @returns SHA-256 digest.
    * @example
    * crypto.sha256('hello world!', 'hex')
    */
  def sha256[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  
  /**
    * Hash with SHA-384.
    * https://k6.io/docs/javascript-api/k6-crypto/sha384-input-outputencoding
    * @param input - Data to hash.
    * @param outputEncoding - Output encoding.
    * @returns SHA-384 digest.
    * @example
    * crypto.sha384('hello world!', 'hex')
    */
  def sha384[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  
  /**
    * Hash with SHA-512.
    * https://k6.io/docs/javascript-api/k6-crypto/sha512-input-outputencoding
    * @param input - Data to hash.
    * @param outputEncoding - Output encoding.
    * @returns SHA-512 digest.
    * @example
    * crypto.sha512('hello world!', 'hex')
    */
  def sha512[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  
  /**
    * Hash with SHA-512/224.
    * https://k6.io/docs/javascript-api/k6-crypto/sha512_224-input-outputencoding
    * @param input - Data to hash.
    * @param outputEncoding - Output encoding.
    * @returns SHA-512/224 digest.
    * @example
    * crypto.sha512_224('hello world!', 'hex')
    */
  @JSName("sha512_224")
  def sha512224[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  
  /**
    * Hash with SHA-512/256.
    * https://k6.io/docs/javascript-api/k6-crypto/sha512_256-input-outputencoding
    * @param input - Data to hash.
    * @param outputEncoding - Output encoding.
    * @returns SHA-512/256 digest.
    * @example
    * crypto.sha512_256('hello world!', 'hex')
    */
  @JSName("sha512_256")
  def sha512256[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
}
