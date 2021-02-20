package typings.iron

import typings.iron.anon.Data
import typings.iron.anon.IvBits
import typings.iron.anon.KeyBits
import typings.iron.ironStrings.`aes-128-ctr`
import typings.iron.ironStrings.`aes-256-cbc`
import typings.iron.ironStrings.sha256
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iron", "algorithms")
  @js.native
  val algorithms: Algorithms_ = js.native
  
  @JSImport("iron", "decrypt")
  @js.native
  def decrypt(password: String, options: GenerateKeyOptions, data: String): js.Promise[Buffer] = js.native
  
  @JSImport("iron", "defaults")
  @js.native
  val defaults: SealOptions = js.native
  
  @JSImport("iron", "encrypt")
  @js.native
  def encrypt(password: String, options: GenerateKeyOptions, data: String): js.Promise[Data] = js.native
  
  @JSImport("iron", "generateKey")
  @js.native
  def generateKey(password: String, options: GenerateKeyOptions): js.Promise[Key] = js.native
  
  @JSImport("iron", "hmacWithPassword")
  @js.native
  def hmacWithPassword(password: String, options: GenerateKeyOptions, data: String): js.Promise[HMacResult] = js.native
  
  @JSImport("iron", "macFormatVersion")
  @js.native
  val macFormatVersion: String = js.native
  
  @JSImport("iron", "macPrefix")
  @js.native
  val macPrefix: String = js.native
  
  @JSImport("iron", "seal")
  @js.native
  def seal(obj: js.Object, password: String, options: SealOptions): js.Promise[String] = js.native
  
  @JSImport("iron", "unseal")
  @js.native
  def unseal(data: String, password: String, options: SealOptions): js.Promise[js.Object] = js.native
  
  @js.native
  trait Algorithms_ extends StObject {
    
    var `aes-128-ctr`: IvBits = js.native
    
    var `aes-256-cbc`: IvBits = js.native
    
    var sha256: KeyBits = js.native
  }
  object Algorithms_ {
    
    @scala.inline
    def apply(`aes-128-ctr`: IvBits, `aes-256-cbc`: IvBits, sha256: KeyBits): Algorithms_ = {
      val __obj = js.Dynamic.literal(sha256 = sha256.asInstanceOf[js.Any])
      __obj.updateDynamic("aes-128-ctr")(`aes-128-ctr`.asInstanceOf[js.Any])
      __obj.updateDynamic("aes-256-cbc")(`aes-256-cbc`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Algorithms_]
    }
    
    @scala.inline
    implicit class Algorithms_MutableBuilder[Self <: Algorithms_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAes-128-ctr`(value: IvBits): Self = StObject.set(x, "aes-128-ctr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAes-256-cbc`(value: IvBits): Self = StObject.set(x, "aes-256-cbc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha256(value: KeyBits): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Pick<iron.iron.SealOptionsSub, 'algorithm' | 'iterations' | 'minPasswordlength'> */
  @js.native
  trait GenerateKeyOptions extends StObject {
    
    var algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256 = js.native
    
    var iterations: Double = js.native
    
    var iv: js.UndefOr[String] = js.native
    
    var minPasswordlength: Double = js.native
    
    var salt: js.UndefOr[String] = js.native
    
    var saltBits: js.UndefOr[Double] = js.native
  }
  object GenerateKeyOptions {
    
    @scala.inline
    def apply(algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256, iterations: Double, minPasswordlength: Double): GenerateKeyOptions = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], minPasswordlength = minPasswordlength.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateKeyOptions]
    }
    
    @scala.inline
    implicit class GenerateKeyOptionsMutableBuilder[Self <: GenerateKeyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: `aes-128-ctr` | `aes-256-cbc` | sha256): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      @scala.inline
      def setMinPasswordlength(value: Double): Self = StObject.set(x, "minPasswordlength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltBits(value: Double): Self = StObject.set(x, "saltBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltBitsUndefined: Self = StObject.set(x, "saltBits", js.undefined)
      
      @scala.inline
      def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    }
  }
  
  @js.native
  trait HMacResult extends StObject {
    
    var digest: String = js.native
    
    var salt: String = js.native
  }
  object HMacResult {
    
    @scala.inline
    def apply(digest: String, salt: String): HMacResult = {
      val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[HMacResult]
    }
    
    @scala.inline
    implicit class HMacResultMutableBuilder[Self <: HMacResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var iv: String = js.native
    
    var key: Buffer = js.native
    
    var salt: String = js.native
  }
  object Key {
    
    @scala.inline
    def apply(iv: String, key: Buffer, salt: String): Key = {
      val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SealOptions extends StObject {
    
    /**
      * defines the options used by the encryption process.
      */
    var encryption: SealOptionsSub = js.native
    
    /**
      * defines the options used by the HMAC integrity verification process.
      */
    var integrity: SealOptionsSub = js.native
    
    /**
      * local clock time offset, expressed in number of milliseconds (positive or negative). Defaults to 0.
      */
    var localtimeOffsetMsec: Double = js.native
    
    /**
      * number of seconds of permitted clock skew for incoming expirations. Defaults to 60 seconds.
      */
    var timestampSkewSec: Double = js.native
    
    /**
      * sealed object lifetime in milliseconds where 0 means forever. Defaults to 0.
      */
    var ttl: Double = js.native
  }
  object SealOptions {
    
    @scala.inline
    def apply(
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
    implicit class SealOptionsMutableBuilder[Self <: SealOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryption(value: SealOptionsSub): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrity(value: SealOptionsSub): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaltimeOffsetMsec(value: Double): Self = StObject.set(x, "localtimeOffsetMsec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampSkewSec(value: Double): Self = StObject.set(x, "timestampSkewSec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SealOptionsSub extends StObject {
    
    /**
      * the algorithm used ('aes-256-cbc' for encryption and 'sha256' for integrity are the only two supported at this time).
      */
    var algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256 = js.native
    
    /**
      * the number of iterations used to derive a key from the password. Set to 1 by default. The number of ideal iterations
      * to use is dependent on your application's performance requirements. More iterations means it takes longer to generate the key.
      */
    var iterations: Double = js.native
    
    /**
      * minimum password size
      */
    var minPasswordlength: Double = js.native
    
    /**
      * the size of the salt (random buffer used to ensure that two identical objects will generate a different encrypted result.
      */
    var saltBits: Double = js.native
  }
  object SealOptionsSub {
    
    @scala.inline
    def apply(
      algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256,
      iterations: Double,
      minPasswordlength: Double,
      saltBits: Double
    ): SealOptionsSub = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], minPasswordlength = minPasswordlength.asInstanceOf[js.Any], saltBits = saltBits.asInstanceOf[js.Any])
      __obj.asInstanceOf[SealOptionsSub]
    }
    
    @scala.inline
    implicit class SealOptionsSubMutableBuilder[Self <: SealOptionsSub] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: `aes-128-ctr` | `aes-256-cbc` | sha256): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPasswordlength(value: Double): Self = StObject.set(x, "minPasswordlength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltBits(value: Double): Self = StObject.set(x, "saltBits", value.asInstanceOf[js.Any])
    }
  }
}
