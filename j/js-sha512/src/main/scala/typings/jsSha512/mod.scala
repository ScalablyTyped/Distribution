package typings.jsSha512

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-sha512", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("js-sha512", "sha384")
  @js.native
  def sha384: Hash = js.native
  inline def sha384_=(x: Hash): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha384")(x.asInstanceOf[js.Any])
  
  @JSImport("js-sha512", "sha512")
  @js.native
  def sha512: Hash = js.native
  
  @JSImport("js-sha512", "sha512_224")
  @js.native
  def sha512224: Hash = js.native
  
  inline def sha512224_=(x: Hash): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha512_224")(x.asInstanceOf[js.Any])
  
  @JSImport("js-sha512", "sha512_256")
  @js.native
  def sha512256: Hash = js.native
  
  inline def sha512256_=(x: Hash): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha512_256")(x.asInstanceOf[js.Any])
  
  inline def sha512_=(x: Hash): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha512")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Hash extends StObject {
    
    /**
      * Hash and return hex string.
      *
      * @param message The message you want to hash.
      */
    def apply(message: Message): String = js.native
    
    /**
      * Hash and return integer array.
      *
      * @param message The message you want to hash.
      */
    def array(message: Message): js.Array[Double] = js.native
    
    /**
      * Hash and return ArrayBuffer.
      *
      * @param message The message you want to hash.
      */
    def arrayBuffer(message: Message): js.typedarray.ArrayBuffer = js.native
    
    /**
      * Create a hash object.
      */
    def create(): Hasher = js.native
    
    /**
      * Hash and return integer array.
      *
      * @param message The message you want to hash.
      */
    def digest(message: Message): js.Array[Double] = js.native
    
    /**
      * Hash and return hex string.
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
  
  trait Hasher extends StObject {
    
    /**
      * Return hash in integer array.
      */
    def array(): js.Array[Double]
    
    /**
      * Return hash in ArrayBuffer.
      */
    def arrayBuffer(): js.typedarray.ArrayBuffer
    
    /**
      * Return hash in integer array.
      */
    def digest(): js.Array[Double]
    
    /**
      * Return hash in hex string.
      */
    def hex(): String
    
    /**
      * Update hash
      *
      * @param message The message you want to hash.
      */
    def update(message: Message): Hasher
  }
  object Hasher {
    
    inline def apply(
      array: () => js.Array[Double],
      arrayBuffer: () => js.typedarray.ArrayBuffer,
      digest: () => js.Array[Double],
      hex: () => String,
      update: Message => Hasher
    ): Hasher = {
      val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), arrayBuffer = js.Any.fromFunction0(arrayBuffer), digest = js.Any.fromFunction0(digest), hex = js.Any.fromFunction0(hex), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Hasher]
    }
    
    extension [Self <: Hasher](x: Self) {
      
      inline def setArray(value: () => js.Array[Double]): Self = StObject.set(x, "array", js.Any.fromFunction0(value))
      
      inline def setArrayBuffer(value: () => js.typedarray.ArrayBuffer): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
      
      inline def setDigest(value: () => js.Array[Double]): Self = StObject.set(x, "digest", js.Any.fromFunction0(value))
      
      inline def setHex(value: () => String): Self = StObject.set(x, "hex", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: Message => Hasher): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
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
    def arrayBuffer(secretKey: String, message: Message): js.typedarray.ArrayBuffer = js.native
    
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
  
  type Message = String | js.Array[Double] | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array
}
