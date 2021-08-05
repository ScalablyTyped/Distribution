package typings.jsSha512

import org.scalablytyped.runtime.Shortcut
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("js-sha512", JSImport.Namespace)
  @js.native
  val ^ : JSSha512Static = js.native
  
  trait Hash extends StObject {
    
    def array(): js.Array[Double]
    
    def arrayBuffer(): ArrayBuffer
    
    def digest(): js.Array[Double]
    
    def hex(): String
    
    def update(messageToHash: String): Hash
  }
  object Hash {
    
    inline def apply(
      array: () => js.Array[Double],
      arrayBuffer: () => ArrayBuffer,
      digest: () => js.Array[Double],
      hex: () => String,
      update: String => Hash
    ): Hash = {
      val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), arrayBuffer = js.Any.fromFunction0(arrayBuffer), digest = js.Any.fromFunction0(digest), hex = js.Any.fromFunction0(hex), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Hash]
    }
    
    extension [Self <: Hash](x: Self) {
      
      inline def setArray(value: () => js.Array[Double]): Self = StObject.set(x, "array", js.Any.fromFunction0(value))
      
      inline def setArrayBuffer(value: () => ArrayBuffer): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
      
      inline def setDigest(value: () => js.Array[Double]): Self = StObject.set(x, "digest", js.Any.fromFunction0(value))
      
      inline def setHex(value: () => String): Self = StObject.set(x, "hex", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: String => Hash): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait HashStatic extends StObject {
    
    def apply(messageToHash: String): String = js.native
    
    def array(messageToHash: String): js.Array[Double] = js.native
    
    def arrayBuffer(messageToHash: String): ArrayBuffer = js.native
    
    def create(): Hash = js.native
    
    def digest(messageToHash: String): js.Array[Double] = js.native
    
    def hex(messageToHash: String): String = js.native
    
    def hmac(key: String, messageToHash: String): String = js.native
    @JSName("hmac")
    var hmac_Original: HmacStatic = js.native
    
    def update(messageToHash: String): Hash = js.native
  }
  
  @js.native
  trait HmacStatic extends StObject {
    
    def apply(key: String, messageToHash: String): String = js.native
    
    def create(key: String): Hash = js.native
    
    def update(key: String, messageToHash: String): Hash = js.native
  }
  
  @js.native
  trait JSSha512Static
    extends StObject
       with HashStatic {
    
    def sha384(messageToHash: String): String = js.native
    @JSName("sha384")
    var sha384_Original: HashStatic = js.native
    
    def sha512(messageToHash: String): String = js.native
    
    def sha512_224(messageToHash: String): String = js.native
    @JSName("sha512_224")
    var sha512_224_Original: HashStatic = js.native
    
    def sha512_256(messageToHash: String): String = js.native
    @JSName("sha512_256")
    var sha512_256_Original: HashStatic = js.native
    
    @JSName("sha512")
    var sha512_Original: HashStatic = js.native
  }
  
  type _To = JSSha512Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: JSSha512Static = ^
}
