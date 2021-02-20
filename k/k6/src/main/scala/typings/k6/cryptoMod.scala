package typings.k6

import typings.k6.k6Strings.binary
import typings.k6.mod.bytes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoMod {
  
  /**
    * This module provides common hashing functionality available in the GoLang crypto package.
    * https://k6.io/docs/javascript-api/k6-crypto
    */
  object default {
    
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
    @JSImport("k6/crypto", "default.createHMAC")
    @js.native
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
    @JSImport("k6/crypto", "default.createHash")
    @js.native
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
    @JSImport("k6/crypto", "default.hmac")
    @js.native
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
    @JSImport("k6/crypto", "default.md4")
    @js.native
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
    @JSImport("k6/crypto", "default.md5")
    @js.native
    def md5[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
    
    /**
      * Generate random bytes.
      * @param size - Number of bytes to generate.
      * @returns Random bytes.
      * @example
      * crypto.randomBytes(42)
      */
    @JSImport("k6/crypto", "default.randomBytes")
    @js.native
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
    @JSImport("k6/crypto", "default.ripemd160")
    @js.native
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
    @JSImport("k6/crypto", "default.sha1")
    @js.native
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
    @JSImport("k6/crypto", "default.sha256")
    @js.native
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
    @JSImport("k6/crypto", "default.sha384")
    @js.native
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
    @JSImport("k6/crypto", "default.sha512")
    @js.native
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
    @JSImport("k6/crypto", "default.sha512_224")
    @js.native
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
    @JSImport("k6/crypto", "default.sha512_256")
    @js.native
    def sha512256[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  }
  
  @JSImport("k6/crypto", "Hasher")
  @js.native
  abstract class Hasher () extends StObject {
    
    /**
      * Return a digest from the data added so far.
      * https://k6.io/docs/javascript-api/k6-crypto/hasher
      * @param outputEncoding - Output encoding.
      * @returns Digest of data added so far.
      * @example
      * let hasher = crypto.createHMAC('sha256', 'a secret');
      * hasher.update('hello ');
      * hasher.update('world!');
      * console.log(hasher.digest('hex'));
      */
    def digest[OE /* <: OutputEncoding */](outputEncoding: OE): Output[OE] = js.native
    
    /**
      * Add more data to the string we want to create a hash of.
      * https://k6.io/docs/javascript-api/k6-crypto/hasher
      * @param input - Data to add.
      * @example
      * let hasher = crypto.createHMAC('sha256', 'a secret');
      * hasher.update('hello ');
      * hasher.update('world!');
      * console.log(hasher.digest('hex'));
      */
    def update(input: String): Unit = js.native
  }
  
  @JSImport("k6/crypto", "createHMAC")
  @js.native
  def createHMAC(algorithm: Algorithm, secret: String): Hasher = js.native
  
  @JSImport("k6/crypto", "createHash")
  @js.native
  def createHash(algorithm: Algorithm): Hasher = js.native
  
  @JSImport("k6/crypto", "hmac")
  @js.native
  def hmac[OE /* <: OutputEncoding */](algorithm: Algorithm, secret: String, data: String, outputEncoding: OE): Output[OE] = js.native
  
  @JSImport("k6/crypto", "md4")
  @js.native
  def md4[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  
  @JSImport("k6/crypto", "md5")
  @js.native
  def md5[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  
  @JSImport("k6/crypto", "randomBytes")
  @js.native
  def randomBytes(size: Double): bytes = js.native
  
  @JSImport("k6/crypto", "ripemd160")
  @js.native
  def ripemd160[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  
  @JSImport("k6/crypto", "sha1")
  @js.native
  def sha1[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  
  @JSImport("k6/crypto", "sha256")
  @js.native
  def sha256[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  
  @JSImport("k6/crypto", "sha384")
  @js.native
  def sha384[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  
  @JSImport("k6/crypto", "sha512")
  @js.native
  def sha512[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  
  @JSImport("k6/crypto", "sha512_224")
  @js.native
  def sha512224[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  
  @JSImport("k6/crypto", "sha512_256")
  @js.native
  def sha512256[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.k6.k6Strings.md4
    - typings.k6.k6Strings.md5
    - typings.k6.k6Strings.sha1
    - typings.k6.k6Strings.sha256
    - typings.k6.k6Strings.sha384
    - typings.k6.k6Strings.sha512
    - typings.k6.k6Strings.sha512_224
    - typings.k6.k6Strings.sha512_256
    - typings.k6.k6Strings.ripemd160
  */
  trait Algorithm extends StObject
  object Algorithm {
    
    @scala.inline
    def md4: typings.k6.k6Strings.md4 = "md4".asInstanceOf[typings.k6.k6Strings.md4]
    
    @scala.inline
    def md5: typings.k6.k6Strings.md5 = "md5".asInstanceOf[typings.k6.k6Strings.md5]
    
    @scala.inline
    def ripemd160: typings.k6.k6Strings.ripemd160 = "ripemd160".asInstanceOf[typings.k6.k6Strings.ripemd160]
    
    @scala.inline
    def sha1: typings.k6.k6Strings.sha1 = "sha1".asInstanceOf[typings.k6.k6Strings.sha1]
    
    @scala.inline
    def sha256: typings.k6.k6Strings.sha256 = "sha256".asInstanceOf[typings.k6.k6Strings.sha256]
    
    @scala.inline
    def sha384: typings.k6.k6Strings.sha384 = "sha384".asInstanceOf[typings.k6.k6Strings.sha384]
    
    @scala.inline
    def sha512: typings.k6.k6Strings.sha512 = "sha512".asInstanceOf[typings.k6.k6Strings.sha512]
    
    @scala.inline
    def sha512_224: typings.k6.k6Strings.sha512_224 = "sha512_224".asInstanceOf[typings.k6.k6Strings.sha512_224]
    
    @scala.inline
    def sha512_256: typings.k6.k6Strings.sha512_256 = "sha512_256".asInstanceOf[typings.k6.k6Strings.sha512_256]
  }
  
  type BinaryEncoding = binary
  
  type Output[OE /* <: OutputEncoding */] = bytes | String
  
  type OutputEncoding = StringEncoding | BinaryEncoding
  
  /* Rewritten from type alias, can be one of: 
    - typings.k6.k6Strings.hex
    - typings.k6.k6Strings.base64
    - typings.k6.k6Strings.base64url
    - typings.k6.k6Strings.base64rawurl
  */
  trait StringEncoding extends StObject
  object StringEncoding {
    
    @scala.inline
    def base64: typings.k6.k6Strings.base64 = "base64".asInstanceOf[typings.k6.k6Strings.base64]
    
    @scala.inline
    def base64rawurl: typings.k6.k6Strings.base64rawurl = "base64rawurl".asInstanceOf[typings.k6.k6Strings.base64rawurl]
    
    @scala.inline
    def base64url: typings.k6.k6Strings.base64url = "base64url".asInstanceOf[typings.k6.k6Strings.base64url]
    
    @scala.inline
    def hex: typings.k6.k6Strings.hex = "hex".asInstanceOf[typings.k6.k6Strings.hex]
  }
  
  /**
    * This module provides common hashing functionality available in the GoLang crypto package.
    * https://k6.io/docs/javascript-api/k6-crypto
    */
  object crypto
}
