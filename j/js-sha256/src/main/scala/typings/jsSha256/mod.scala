package typings.jsSha256

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-sha256", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("js-sha256", "sha224")
  @js.native
  def sha224: Hash = js.native
  @scala.inline
  def sha224_=(x: Hash): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha224")(x.asInstanceOf[js.Any])
  
  @JSImport("js-sha256", "sha256")
  @js.native
  def sha256: Hash = js.native
  @scala.inline
  def sha256_=(x: Hash): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha256")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Hash extends StObject {
    
    /**
      * Hash and return hex string.
      *
      * @param message The message you want to hash.
      */
    def apply(message: Message): String = js.native
    
    /**
      * Return hash in integer array.
      *
      * @param message The message you want to hash.
      */
    def array(message: Message): js.Array[Double] = js.native
    
    /**
      * Return hash in ArrayBuffer.
      *
      * @param message The message you want to hash.
      */
    def arrayBuffer(message: Message): ArrayBuffer = js.native
    
    /**
      * Create a hash object.
      */
    def create(): Hasher = js.native
    
    /**
      * Return hash in integer array.
      *
      * @param message The message you want to hash.
      */
    def digest(message: Message): js.Array[Double] = js.native
    
    /**
      * Return hash in hex string.
      *
      * @param message The message you want to hash.
      */
    def hex(message: Message): String = js.native
    
    /**
      * Computes a Hash-based message authentication code (HMAC) using a secret key
      *
      * @param secretKey The Secret Key
      * @param message The message you want to hash.
      */
    /**
      * HMAC interface
      */
    def hmac(secretKey: String, message: Message): String = js.native
    /**
      * HMAC interface
      */
    @JSName("hmac")
    var hmac_Original: Hmac = js.native
    
    /**
      * Create a hash object and hash message.
      *
      * @param message The message you want to hash.
      */
    def update(message: Message): Hasher = js.native
  }
  
  @js.native
  trait Hasher extends StObject {
    
    /**
      * Return hash in integer array.
      */
    def array(): js.Array[Double] = js.native
    
    /**
      * Return hash in ArrayBuffer.
      */
    def arrayBuffer(): ArrayBuffer = js.native
    
    /**
      * Return hash in integer array.
      */
    def digest(): js.Array[Double] = js.native
    
    /**
      * Return hash in hex string.
      */
    def hex(): String = js.native
    
    /**
      * Update hash
      *
      * @param message The message you want to hash.
      */
    def update(message: Message): Hasher = js.native
  }
  object Hasher {
    
    @scala.inline
    def apply(
      array: () => js.Array[Double],
      arrayBuffer: () => ArrayBuffer,
      digest: () => js.Array[Double],
      hex: () => String,
      update: Message => Hasher
    ): Hasher = {
      val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), arrayBuffer = js.Any.fromFunction0(arrayBuffer), digest = js.Any.fromFunction0(digest), hex = js.Any.fromFunction0(hex), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Hasher]
    }
    
    @scala.inline
    implicit class HasherMutableBuilder[Self <: Hasher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArray(value: () => js.Array[Double]): Self = StObject.set(x, "array", js.Any.fromFunction0(value))
      
      @scala.inline
      def setArrayBuffer(value: () => ArrayBuffer): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDigest(value: () => js.Array[Double]): Self = StObject.set(x, "digest", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHex(value: () => String): Self = StObject.set(x, "hex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: Message => Hasher): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Hmac extends StObject {
    
    /**
      * Computes a Hash-based message authentication code (HMAC) using a secret key
      *
      * @param secretKey The Secret Key
      * @param message The message you want to hash.
      */
    def apply(secretKey: String, message: Message): String = js.native
    
    /**
      * Return hash in integer array.
      *
      * @param secretKey The Secret Key
      * @param message The message you want to hash.
      */
    def array(secretKey: String, message: Message): js.Array[Double] = js.native
    
    /**
      * Return hash in ArrayBuffer.
      *
      * @param secretKey The Secret Key
      * @param message The message you want to hash.
      */
    def arrayBuffer(secretKey: String, message: Message): ArrayBuffer = js.native
    
    /**
      * Create a hash object using a secret key.
      *
      * @param secretKey The Secret Key
      */
    def create(secretKey: String): Hasher = js.native
    
    /**
      * Return hash in integer array.
      *
      * @param secretKey The Secret Key
      * @param message The message you want to hash.
      */
    def digest(secretKey: String, message: Message): js.Array[Double] = js.native
    
    /**
      * Return hash in hex string.
      *
      * @param secretKey The Secret Key
      * @param message The message you want to hash.
      */
    def hex(secretKey: String, message: Message): String = js.native
    
    /**
      * Create a hash object and hash message using a secret key
      *
      * @param secretKey The Secret Key
      * @param message The message you want to hash.
      */
    def update(secretKey: String, message: Message): Hasher = js.native
  }
  
  type Message = String | js.Array[Double] | ArrayBuffer | Uint8Array
}
