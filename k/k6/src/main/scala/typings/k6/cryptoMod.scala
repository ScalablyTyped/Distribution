package typings.k6

import typings.k6.k6Strings.binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoMod {
  
  @JSImport("k6/crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This module provides common hashing functionality available in the GoLang crypto package.
    * https://k6.io/docs/javascript-api/k6-crypto/
    */
  object default {
    
    @JSImport("k6/crypto", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an HMAC hashing object.
      * https://k6.io/docs/javascript-api/k6-crypto/createhmac-algorithm-secret/
      * @param algorithm - Hash algorithm.
      * @param secret - Shared secret.
      * @returns HMAC hashing object.
      * @example
      * let hasher = crypto.createHMAC('sha256', 'a secret');
      * hasher.update('hello ');
      * hasher.update('world!');
      * console.log(hasher.digest('hex'));
      */
    inline def createHMAC(algorithm: Algorithm, secret: String): Hasher = (^.asInstanceOf[js.Dynamic].applyDynamic("createHMAC")(algorithm.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[Hasher]
    inline def createHMAC(algorithm: Algorithm, secret: js.typedarray.ArrayBuffer): Hasher = (^.asInstanceOf[js.Dynamic].applyDynamic("createHMAC")(algorithm.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[Hasher]
    
    /**
      * Create a hashing object.
      * https://k6.io/docs/javascript-api/k6-crypto/createhash-algorithm/
      * @param algorithm - Hash algorithm.
      * @returns Hashing object.
      * @example
      * let hasher = crypto.createHash('sha256');
      * hasher.update('hello ');
      * hasher.update('world!');
      * console.log(hasher.digest('hex'));
      */
    inline def createHash(algorithm: Algorithm): Hasher = ^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any]).asInstanceOf[Hasher]
    
    /**
      * Produce HMAC.
      * https://k6.io/docs/javascript-api/k6-crypto/hmac-algorithm-secret-data-outputencoding/
      * @param algorithm - Hash algorithm.
      * @param secret - Shared secret.
      * @param input - Input data.
      * @param outputEncoding - Output encoding.
      * @returns Produced HMAC.
      * @example
      * crypto.hmac('sha256', 'mysecret', 'hello world!', 'hex')
      */
    inline def hmac[OE /* <: OutputEncoding */](algorithm: Algorithm, secret: String, input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(algorithm.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    inline def hmac[OE /* <: OutputEncoding */](algorithm: Algorithm, secret: String, input: js.typedarray.ArrayBuffer, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(algorithm.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    inline def hmac[OE /* <: OutputEncoding */](algorithm: Algorithm, secret: js.typedarray.ArrayBuffer, input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(algorithm.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    inline def hmac[OE /* <: OutputEncoding */](
      algorithm: Algorithm,
      secret: js.typedarray.ArrayBuffer,
      input: js.typedarray.ArrayBuffer,
      outputEncoding: OE
    ): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(algorithm.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    
    /**
      * Hash with MD4.
      * https://k6.io/docs/javascript-api/k6-crypto/md4-input-outputencoding/
      * @param input - Data to hash.
      * @param outputEncoding - Output encoding.
      * @returns MD4 digest.
      * @example
      * crypto.md4('hello world!', 'hex')
      */
    inline def md4[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("md4")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    inline def md4[OE /* <: OutputEncoding */](input: js.typedarray.ArrayBuffer, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("md4")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    
    /**
      * Hash with MD5.
      * https://k6.io/docs/javascript-api/k6-crypto/md5-input-outputencoding/
      * @param input - Data to hash.
      * @param outputEncoding - Output encoding.
      * @returns MD5 digest.
      * @example
      * crypto.md5("hello world!", "hex")
      */
    inline def md5[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("md5")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    inline def md5[OE /* <: OutputEncoding */](input: js.typedarray.ArrayBuffer, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("md5")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    
    /**
      * Generate random bytes.
      * @param size - Number of bytes to generate.
      * @returns An ArrayBuffer with cryptographically random bytes.
      * @example
      * const bytes = crypto.randomBytes(42);
      * const view = new Uint8Array(bytes);
      * console.log(view); // 156,71,245,191,56,...
      */
    inline def randomBytes(size: Double): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    
    /**
      * Hash with RIPEMD-160.
      * https://k6.io/docs/javascript-api/k6-crypto/ripemd160-input-outputencoding/
      * @param input - Data to hash.
      * @param outputEncoding - Output encoding.
      * @returns RIPEMD-160 digest.
      * @example
      * crypto.ripemd160('hello world!', 'hex')
      */
    inline def ripemd160[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    inline def ripemd160[OE /* <: OutputEncoding */](input: js.typedarray.ArrayBuffer, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    
    /**
      * Hash with SHA-1.
      * https://k6.io/docs/javascript-api/k6-crypto/sha1-input-outputencoding/
      * @param input - Data to hash.
      * @param outputEncoding - Output encoding.
      * @returns SHA-1 digest.
      * @example
      * crypto.sha1('hello world!', 'hex')
      */
    inline def sha1[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    inline def sha1[OE /* <: OutputEncoding */](input: js.typedarray.ArrayBuffer, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    
    /**
      * Hash with SHA-256.
      * https://k6.io/docs/javascript-api/k6-crypto/sha256-input-outputencoding/
      * @param input - Data to hash.
      * @param outputEncoding - Output encoding.
      * @returns SHA-256 digest.
      * @example
      * crypto.sha256('hello world!', 'hex')
      */
    inline def sha256[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    inline def sha256[OE /* <: OutputEncoding */](input: js.typedarray.ArrayBuffer, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    
    /**
      * Hash with SHA-384.
      * https://k6.io/docs/javascript-api/k6-crypto/sha384-input-outputencoding/
      * @param input - Data to hash.
      * @param outputEncoding - Output encoding.
      * @returns SHA-384 digest.
      * @example
      * crypto.sha384('hello world!', 'hex')
      */
    inline def sha384[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    inline def sha384[OE /* <: OutputEncoding */](input: js.typedarray.ArrayBuffer, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    
    /**
      * Hash with SHA-512.
      * https://k6.io/docs/javascript-api/k6-crypto/sha512-input-outputencoding/
      * @param input - Data to hash.
      * @param outputEncoding - Output encoding.
      * @returns SHA-512 digest.
      * @example
      * crypto.sha512('hello world!', 'hex')
      */
    inline def sha512[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    inline def sha512[OE /* <: OutputEncoding */](input: js.typedarray.ArrayBuffer, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    
    /**
      * Hash with SHA-512/224.
      * https://k6.io/docs/javascript-api/k6-crypto/sha512_224-input-outputencoding/
      * @param input - Data to hash.
      * @param outputEncoding - Output encoding.
      * @returns SHA-512/224 digest.
      * @example
      * crypto.sha512_224('hello world!', 'hex')
      */
    inline def sha512224[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512_224")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    inline def sha512224[OE /* <: OutputEncoding */](input: js.typedarray.ArrayBuffer, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512_224")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    
    /**
      * Hash with SHA-512/256.
      * https://k6.io/docs/javascript-api/k6-crypto/sha512_256-input-outputencoding/
      * @param input - Data to hash.
      * @param outputEncoding - Output encoding.
      * @returns SHA-512/256 digest.
      * @example
      * crypto.sha512_256('hello world!', 'hex')
      */
    inline def sha512256[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512_256")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
    inline def sha512256[OE /* <: OutputEncoding */](input: js.typedarray.ArrayBuffer, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512_256")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  }
  
  /* note: abstract class */ @JSImport("k6/crypto", "Hasher")
  @js.native
  open class Hasher () extends StObject {
    
    /**
      * Return a digest from the data added so far.
      * https://k6.io/docs/javascript-api/k6-crypto/hasher/
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
      * https://k6.io/docs/javascript-api/k6-crypto/hasher/
      * @param input - Data to add.
      * @example
      * let hasher = crypto.createHMAC('sha256', 'a secret');
      * hasher.update('hello ');
      * hasher.update('world!');
      * console.log(hasher.digest('hex'));
      */
    def update(input: String): Unit = js.native
    def update(input: js.typedarray.ArrayBuffer): Unit = js.native
  }
  
  inline def createHMAC(algorithm: Algorithm, secret: String): Hasher = (^.asInstanceOf[js.Dynamic].applyDynamic("createHMAC")(algorithm.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[Hasher]
  inline def createHMAC(algorithm: Algorithm, secret: js.typedarray.ArrayBuffer): Hasher = (^.asInstanceOf[js.Dynamic].applyDynamic("createHMAC")(algorithm.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[Hasher]
  
  inline def createHash(algorithm: Algorithm): Hasher = ^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any]).asInstanceOf[Hasher]
  
  inline def hmac[OE /* <: OutputEncoding */](algorithm: Algorithm, secret: String, input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(algorithm.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  inline def hmac[OE /* <: OutputEncoding */](algorithm: Algorithm, secret: String, input: js.typedarray.ArrayBuffer, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(algorithm.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  inline def hmac[OE /* <: OutputEncoding */](algorithm: Algorithm, secret: js.typedarray.ArrayBuffer, input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(algorithm.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  inline def hmac[OE /* <: OutputEncoding */](
    algorithm: Algorithm,
    secret: js.typedarray.ArrayBuffer,
    input: js.typedarray.ArrayBuffer,
    outputEncoding: OE
  ): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac")(algorithm.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  
  inline def md4[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("md4")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  inline def md4[OE /* <: OutputEncoding */](input: js.typedarray.ArrayBuffer, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("md4")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  
  inline def md5[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("md5")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  inline def md5[OE /* <: OutputEncoding */](input: js.typedarray.ArrayBuffer, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("md5")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  
  inline def randomBytes(size: Double): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  inline def ripemd160[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  inline def ripemd160[OE /* <: OutputEncoding */](input: js.typedarray.ArrayBuffer, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  
  inline def sha1[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  inline def sha1[OE /* <: OutputEncoding */](input: js.typedarray.ArrayBuffer, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  
  inline def sha256[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  inline def sha256[OE /* <: OutputEncoding */](input: js.typedarray.ArrayBuffer, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  
  inline def sha384[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  inline def sha384[OE /* <: OutputEncoding */](input: js.typedarray.ArrayBuffer, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  
  inline def sha512[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  inline def sha512[OE /* <: OutputEncoding */](input: js.typedarray.ArrayBuffer, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  
  inline def sha512224[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512_224")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  inline def sha512224[OE /* <: OutputEncoding */](input: js.typedarray.ArrayBuffer, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512_224")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  
  inline def sha512256[OE /* <: OutputEncoding */](input: String, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512_256")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  inline def sha512256[OE /* <: OutputEncoding */](input: js.typedarray.ArrayBuffer, outputEncoding: OE): Output[OE] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512_256")(input.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Output[OE]]
  
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
    
    inline def md4: typings.k6.k6Strings.md4 = "md4".asInstanceOf[typings.k6.k6Strings.md4]
    
    inline def md5: typings.k6.k6Strings.md5 = "md5".asInstanceOf[typings.k6.k6Strings.md5]
    
    inline def ripemd160: typings.k6.k6Strings.ripemd160 = "ripemd160".asInstanceOf[typings.k6.k6Strings.ripemd160]
    
    inline def sha1: typings.k6.k6Strings.sha1 = "sha1".asInstanceOf[typings.k6.k6Strings.sha1]
    
    inline def sha256: typings.k6.k6Strings.sha256 = "sha256".asInstanceOf[typings.k6.k6Strings.sha256]
    
    inline def sha384: typings.k6.k6Strings.sha384 = "sha384".asInstanceOf[typings.k6.k6Strings.sha384]
    
    inline def sha512: typings.k6.k6Strings.sha512 = "sha512".asInstanceOf[typings.k6.k6Strings.sha512]
    
    inline def sha512_224: typings.k6.k6Strings.sha512_224 = "sha512_224".asInstanceOf[typings.k6.k6Strings.sha512_224]
    
    inline def sha512_256: typings.k6.k6Strings.sha512_256 = "sha512_256".asInstanceOf[typings.k6.k6Strings.sha512_256]
  }
  
  type BinaryEncoding = binary
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    OE extends k6.k6/crypto.StringEncoding ? string : OE extends k6.k6/crypto.BinaryEncoding ? k6.k6.bytes : never
    }}}
    */
  type Output[OE /* <: OutputEncoding */] = String
  
  type OutputEncoding = StringEncoding | BinaryEncoding
  
  /* Rewritten from type alias, can be one of: 
    - typings.k6.k6Strings.hex
    - typings.k6.k6Strings.base64
    - typings.k6.k6Strings.base64url
    - typings.k6.k6Strings.base64rawurl
  */
  trait StringEncoding extends StObject
  object StringEncoding {
    
    inline def base64: typings.k6.k6Strings.base64 = "base64".asInstanceOf[typings.k6.k6Strings.base64]
    
    inline def base64rawurl: typings.k6.k6Strings.base64rawurl = "base64rawurl".asInstanceOf[typings.k6.k6Strings.base64rawurl]
    
    inline def base64url: typings.k6.k6Strings.base64url = "base64url".asInstanceOf[typings.k6.k6Strings.base64url]
    
    inline def hex: typings.k6.k6Strings.hex = "hex".asInstanceOf[typings.k6.k6Strings.hex]
  }
}
