package typings.hapiIron

import org.scalablytyped.runtime.StringDictionary
import typings.hapiIron.anon.Encrypted
import typings.hapiIron.anon.IvBits
import typings.hapiIron.anon.KeyBits
import typings.hapiIron.hapiIronStrings.`aes-128-ctr`
import typings.hapiIron.hapiIronStrings.`aes-256-cbc`
import typings.hapiIron.hapiIronStrings.sha256
import typings.hapiIron.mod.password.Hash
import typings.hapiIron.mod.password.Secret
import typings.hapiIron.mod.password.Specific
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/iron", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@hapi/iron", "algorithms")
  @js.native
  val algorithms: Algorithms_ = js.native
  
  inline def decrypt(password: Password_, options: GenerateKeyOptions, data: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(password.asInstanceOf[js.Any], options.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("@hapi/iron", "defaults")
  @js.native
  val defaults: SealOptions = js.native
  
  inline def encrypt(password: Password_, options: GenerateKeyOptions, data: String): js.Promise[Encrypted] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(password.asInstanceOf[js.Any], options.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Encrypted]]
  
  inline def generateKey(password: Password_, options: GenerateKeyOptions): js.Promise[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Key]]
  
  inline def hmacWithPassword(password: Password_, options: GenerateKeyOptions, data: String): js.Promise[HMacResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("hmacWithPassword")(password.asInstanceOf[js.Any], options.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HMacResult]]
  
  @JSImport("@hapi/iron", "macFormatVersion")
  @js.native
  val macFormatVersion: String = js.native
  
  @JSImport("@hapi/iron", "macPrefix")
  @js.native
  val macPrefix: String = js.native
  
  inline def seal(`object`: Any, password: Password_, options: SealOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("seal")(`object`.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def seal(`object`: Any, password: Secret, options: SealOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("seal")(`object`.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def seal(`object`: Any, password: Specific, options: SealOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("seal")(`object`.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def unseal(`sealed`: String, password: Password_): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("unseal")(`sealed`.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def unseal(`sealed`: String, password: Password_, options: SealOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("unseal")(`sealed`.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def unseal(`sealed`: String, password: Hash): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("unseal")(`sealed`.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def unseal(`sealed`: String, password: Hash, options: SealOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("unseal")(`sealed`.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
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
    
    extension [Self <: Algorithms_](x: Self) {
      
      inline def `setAes-128-ctr`(value: IvBits): Self = StObject.set(x, "aes-128-ctr", value.asInstanceOf[js.Any])
      
      inline def `setAes-256-cbc`(value: IvBits): Self = StObject.set(x, "aes-256-cbc", value.asInstanceOf[js.Any])
      
      inline def setSha256(value: KeyBits): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Pick<@hapi/iron.@hapi/iron.SealOptionsSub, 'algorithm' | 'iterations' | 'minPasswordlength'> */
  trait GenerateKeyOptions extends StObject {
    
    var algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256
    
    var iterations: Double
    
    var iv: js.UndefOr[Buffer] = js.undefined
    
    var minPasswordlength: Double
    
    var salt: js.UndefOr[String] = js.undefined
    
    var saltBits: js.UndefOr[Double] = js.undefined
  }
  object GenerateKeyOptions {
    
    inline def apply(algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256, iterations: Double, minPasswordlength: Double): GenerateKeyOptions = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], minPasswordlength = minPasswordlength.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateKeyOptions]
    }
    
    extension [Self <: GenerateKeyOptions](x: Self) {
      
      inline def setAlgorithm(value: `aes-128-ctr` | `aes-256-cbc` | sha256): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setIv(value: Buffer): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
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
    
    extension [Self <: HMacResult](x: Self) {
      
      inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var iv: Buffer
    
    var key: Buffer
    
    var salt: String
  }
  object Key {
    
    inline def apply(iv: Buffer, key: Buffer, salt: String): Key = {
      val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setIv(value: Buffer): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  /**
  Password secret string or buffer.
  */
  type Password_ = String | Buffer
  
  trait SealOptions extends StObject {
    
    /**
      Encryption step options.
      */
    var encryption: SealOptionsSub
    
    /**
      Integrity step options.
      */
    var integrity: SealOptionsSub
    
    /**
      Local clock time offset, expressed in number of milliseconds (positive or negative). Defaults to 0.
      */
    var localtimeOffsetMsec: Double
    
    /**
      Number of seconds of permitted clock skew for incoming expirations. Defaults to 60 seconds.
      */
    var timestampSkewSec: Double
    
    /**
      Sealed object lifetime in milliseconds where 0 means forever. Defaults to 0.
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
    
    extension [Self <: SealOptions](x: Self) {
      
      inline def setEncryption(value: SealOptionsSub): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
      
      inline def setIntegrity(value: SealOptionsSub): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setLocaltimeOffsetMsec(value: Double): Self = StObject.set(x, "localtimeOffsetMsec", value.asInstanceOf[js.Any])
      
      inline def setTimestampSkewSec(value: Double): Self = StObject.set(x, "timestampSkewSec", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  trait SealOptionsSub extends StObject {
    
    /**
      The algorithm used. Defaults to 'aes-256-cbc' for encryption and 'sha256' for integrity.
      */
    var algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256
    
    /**
      The number of iterations used to derive a key from the password. Defaults to 1.
      */
    var iterations: Double
    
    /**
      Minimum password size. Defaults to 32.
      */
    var minPasswordlength: Double
    
    /**
      The length of the salt (random buffer used to ensure that two identical objects will generate a different encrypted result). Defaults to 256.
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
    
    extension [Self <: SealOptionsSub](x: Self) {
      
      inline def setAlgorithm(value: `aes-128-ctr` | `aes-256-cbc` | sha256): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setMinPasswordlength(value: Double): Self = StObject.set(x, "minPasswordlength", value.asInstanceOf[js.Any])
      
      inline def setSaltBits(value: Double): Self = StObject.set(x, "saltBits", value.asInstanceOf[js.Any])
    }
  }
  
  object password {
    
    /**
      Key-value pairs hash of password id to value
      */
    type Hash = StringDictionary[Password_ | Secret | Specific]
    
    /**
      Secret object with optional id.
      */
    trait Secret extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var secret: Password_
    }
    object Secret {
      
      inline def apply(secret: Password_): Secret = {
        val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
        __obj.asInstanceOf[Secret]
      }
      
      extension [Self <: Secret](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setSecret(value: Password_): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      Secret object with optional id and specified password for each encryption and integrity.
      */
    trait Specific extends StObject {
      
      var encryption: Password_
      
      var id: js.UndefOr[String] = js.undefined
      
      var integrity: Password_
    }
    object Specific {
      
      inline def apply(encryption: Password_, integrity: Password_): Specific = {
        val __obj = js.Dynamic.literal(encryption = encryption.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any])
        __obj.asInstanceOf[Specific]
      }
      
      extension [Self <: Specific](x: Self) {
        
        inline def setEncryption(value: Password_): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setIntegrity(value: Password_): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      }
    }
  }
}
