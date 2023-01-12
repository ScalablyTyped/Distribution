package typings.heicDecode

import typings.std.ArrayBufferLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @async
    */
  inline def apply(bufobj: HasBuffer): js.Promise[DecodedImage] = ^.asInstanceOf[js.Dynamic].apply(bufobj.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DecodedImage]]
  
  @JSImport("heic-decode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @async
    */
  inline def all(bufobj: HasBuffer): js.Promise[js.Array[Decodable]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(bufobj.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Decodable]]]
  
  trait Decodable extends StObject {
    
    def decode(): js.Promise[DecodedImage]
  }
  object Decodable {
    
    inline def apply(decode: () => js.Promise[DecodedImage]): Decodable = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction0(decode))
      __obj.asInstanceOf[Decodable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Decodable] (val x: Self) extends AnyVal {
      
      inline def setDecode(value: () => js.Promise[DecodedImage]): Self = StObject.set(x, "decode", js.Any.fromFunction0(value))
    }
  }
  
  trait DecodedImage extends StObject {
    
    var data: js.typedarray.ArrayBuffer
    
    var height: Double
    
    var width: Double
  }
  object DecodedImage {
    
    inline def apply(data: js.typedarray.ArrayBuffer, height: Double, width: Double): DecodedImage = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodedImage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecodedImage] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait HasBuffer extends StObject {
    
    var buffer: ArrayBufferLike
  }
  object HasBuffer {
    
    inline def apply(buffer: ArrayBufferLike): HasBuffer = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasBuffer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HasBuffer] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: ArrayBufferLike): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    }
  }
}
