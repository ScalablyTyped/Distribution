package typings.iron

import typings.iron.anon.Data
import typings.iron.anon.IvBits
import typings.iron.anon.KeyBits
import typings.iron.ironStrings.`aes-128-ctr`
import typings.iron.ironStrings.`aes-256-cbc`
import typings.iron.ironStrings.sha256
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iron", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("iron", "algorithms")
  @js.native
  val algorithms: Algorithms_ = js.native
  
  inline def decrypt(password: String, options: GenerateKeyOptions, data: String): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(password.asInstanceOf[js.Any], options.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  @JSImport("iron", "defaults")
  @js.native
  val defaults: SealOptions = js.native
  
  inline def encrypt(password: String, options: GenerateKeyOptions, data: String): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(password.asInstanceOf[js.Any], options.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
  
  inline def generateKey(password: String, options: GenerateKeyOptions): js.Promise[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Key]]
  
  inline def hmacWithPassword(password: String, options: GenerateKeyOptions, data: String): js.Promise[HMacResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("hmacWithPassword")(password.asInstanceOf[js.Any], options.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HMacResult]]
  
  @JSImport("iron", "macFormatVersion")
  @js.native
  val macFormatVersion: String = js.native
  
  @JSImport("iron", "macPrefix")
  @js.native
  val macPrefix: String = js.native
  
  inline def seal(obj: js.Object, password: String, options: SealOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("seal")(obj.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def unseal(data: String, password: String, options: SealOptions): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("unseal")(data.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  
  trait Algorithms_ extends StObject {
    
    var `aes-128-ctr`: IvBits
    
    var `aes-256-cbc`: IvBits
    
    var sha256: KeyBits
  }
  object Algorithms_ {
    
    inline def apply(`aes-128-ctr`: IvBits, `aes-256-cbc`: IvBits, sha256: KeyBits): Algorithms_ = {
      val __obj = js.Dynamic.literal(sha256 = sha256.asInstanceOf[js.Any])
      __obj.updateDynamic("aes-128-ctr")(`aes-128-ctr`.asInstanceOf[js.Any])
      __obj.updateDynamic("aes-256-cbc")(`aes-256-cbc`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Algorithms_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Algorithms_] (val x: Self) extends AnyVal {
      
      inline def `setAes-128-ctr`(value: IvBits): Self = StObject.set(x, "aes-128-ctr", value.asInstanceOf[js.Any])
      
      inline def `setAes-256-cbc`(value: IvBits): Self = StObject.set(x, "aes-256-cbc", value.asInstanceOf[js.Any])
      
      inline def setSha256(value: KeyBits): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Pick<iron.iron.SealOptionsSub, 'algorithm' | 'iterations' | 'minPasswordlength'> */
  trait GenerateKeyOptions extends StObject {
    
    var algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256
    
    var iterations: Double
    
    var iv: js.UndefOr[String] = js.undefined
    
    var minPasswordlength: Double
    
    var salt: js.UndefOr[String] = js.undefined
    
    var saltBits: js.UndefOr[Double] = js.undefined
  }
  object GenerateKeyOptions {
    
    inline def apply(algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256, iterations: Double, minPasswordlength: Double): GenerateKeyOptions = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], minPasswordlength = minPasswordlength.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateKeyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenerateKeyOptions] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: `aes-128-ctr` | `aes-256-cbc` | sha256): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      inline def setMinPasswordlength(value: Double): Self = StObject.set(x, "minPasswordlength", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltBits(value: Double): Self = StObject.set(x, "saltBits", value.asInstanceOf[js.Any])
      
      inline def setSaltBitsUndefined: Self = StObject.set(x, "saltBits", js.undefined)
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    }
  }
  
  trait HMacResult extends StObject {
    
    var digest: String
    
    var salt: String
  }
  object HMacResult {
    
    inline def apply(digest: String, salt: String): HMacResult = {
      val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[HMacResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HMacResult] (val x: Self) extends AnyVal {
      
      inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var iv: String
    
    var key: Buffer
    
    var salt: String
  }
  object Key {
    
    inline def apply(iv: String, key: Buffer, salt: String): Key = {
      val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  trait SealOptions extends StObject {
    
    /**
      * defines the options used by the encryption process.
      */
    var encryption: SealOptionsSub
    
    /**
      * defines the options used by the HMAC integrity verification process.
      */
    var integrity: SealOptionsSub
    
    /**
      * local clock time offset, expressed in number of milliseconds (positive or negative). Defaults to 0.
      */
    var localtimeOffsetMsec: Double
    
    /**
      * number of seconds of permitted clock skew for incoming expirations. Defaults to 60 seconds.
      */
    var timestampSkewSec: Double
    
    /**
      * sealed object lifetime in milliseconds where 0 means forever. Defaults to 0.
      */
    var ttl: Double
  }
  object SealOptions {
    
    inline def apply(
      encryption: SealOptionsSub,
      integrity: SealOptionsSub,
      localtimeOffsetMsec: Double,
      timestampSkewSec: Double,
      ttl: Double
    ): SealOptions = {
      val __obj = js.Dynamic.literal(encryption = encryption.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any], localtimeOffsetMsec = localtimeOffsetMsec.asInstanceOf[js.Any], timestampSkewSec = timestampSkewSec.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.asInstanceOf[SealOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SealOptions] (val x: Self) extends AnyVal {
      
      inline def setEncryption(value: SealOptionsSub): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
      
      inline def setIntegrity(value: SealOptionsSub): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setLocaltimeOffsetMsec(value: Double): Self = StObject.set(x, "localtimeOffsetMsec", value.asInstanceOf[js.Any])
      
      inline def setTimestampSkewSec(value: Double): Self = StObject.set(x, "timestampSkewSec", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  trait SealOptionsSub extends StObject {
    
    /**
      * the algorithm used ('aes-256-cbc' for encryption and 'sha256' for integrity are the only two supported at this time).
      */
    var algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256
    
    /**
      * the number of iterations used to derive a key from the password. Set to 1 by default. The number of ideal iterations
      * to use is dependent on your application's performance requirements. More iterations means it takes longer to generate the key.
      */
    var iterations: Double
    
    /**
      * minimum password size
      */
    var minPasswordlength: Double
    
    /**
      * the size of the salt (random buffer used to ensure that two identical objects will generate a different encrypted result.
      */
    var saltBits: Double
  }
  object SealOptionsSub {
    
    inline def apply(
      algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256,
      iterations: Double,
      minPasswordlength: Double,
      saltBits: Double
    ): SealOptionsSub = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], minPasswordlength = minPasswordlength.asInstanceOf[js.Any], saltBits = saltBits.asInstanceOf[js.Any])
      __obj.asInstanceOf[SealOptionsSub]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SealOptionsSub] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: `aes-128-ctr` | `aes-256-cbc` | sha256): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setMinPasswordlength(value: Double): Self = StObject.set(x, "minPasswordlength", value.asInstanceOf[js.Any])
      
      inline def setSaltBits(value: Double): Self = StObject.set(x, "saltBits", value.asInstanceOf[js.Any])
    }
  }
}
