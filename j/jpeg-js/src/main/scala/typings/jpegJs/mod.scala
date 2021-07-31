package typings.jpegJs

import typings.jpegJs.anon.BufferRetcommentsArraystr
import typings.jpegJs.anon.ColorTransform
import typings.jpegJs.anon.FormatAsRGBA
import typings.jpegJs.anon.UintArrRetcommentsArrayst
import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.ArrayLike
import typings.std.Iterable
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jpeg-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decode(jpegData: BufferLike): BufferRetcommentsArraystr = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(jpegData.asInstanceOf[js.Any]).asInstanceOf[BufferRetcommentsArraystr]
  @scala.inline
  def decode(jpegData: BufferLike, opts: ColorTransform): UintArrRetcommentsArrayst = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(jpegData.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[UintArrRetcommentsArrayst]
  @scala.inline
  def decode(jpegData: BufferLike, opts: FormatAsRGBA): BufferRetcommentsArraystr = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(jpegData.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BufferRetcommentsArraystr]
  
  @scala.inline
  def encode(imgData: RawImageData[BufferLike]): BufferRet = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(imgData.asInstanceOf[js.Any]).asInstanceOf[BufferRet]
  @scala.inline
  def encode(imgData: RawImageData[BufferLike], quality: Double): BufferRet = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(imgData.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[BufferRet]
  
  type BufferLike = Buffer | Uint8Array | ArrayLike[Double] | Iterable[Double] | ArrayBuffer
  
  type BufferRet = RawImageData[Buffer]
  
  type ImageData = BufferRet | UintArrRet
  
  trait RawImageData[T] extends StObject {
    
    var data: T
    
    var height: Double
    
    var width: Double
  }
  object RawImageData {
    
    @scala.inline
    def apply[T](data: T, height: Double, width: Double): RawImageData[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawImageData[T]]
    }
    
    @scala.inline
    implicit class RawImageDataMutableBuilder[Self <: RawImageData[?], T] (val x: Self & RawImageData[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type UintArrRet = RawImageData[Uint8Array]
}
