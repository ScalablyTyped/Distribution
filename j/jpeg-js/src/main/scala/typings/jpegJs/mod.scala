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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jpeg-js", "decode")
  @js.native
  def decode(jpegData: BufferLike): BufferRetcommentsArraystr = js.native
  @JSImport("jpeg-js", "decode")
  @js.native
  def decode(jpegData: BufferLike, opts: ColorTransform): UintArrRetcommentsArrayst = js.native
  @JSImport("jpeg-js", "decode")
  @js.native
  def decode(jpegData: BufferLike, opts: FormatAsRGBA): BufferRetcommentsArraystr = js.native
  
  @JSImport("jpeg-js", "encode")
  @js.native
  def encode(imgData: RawImageData[BufferLike]): BufferRet = js.native
  @JSImport("jpeg-js", "encode")
  @js.native
  def encode(imgData: RawImageData[BufferLike], quality: Double): BufferRet = js.native
  
  type BufferLike = Buffer | Uint8Array | ArrayLike[Double] | Iterable[Double] | ArrayBuffer
  
  type BufferRet = RawImageData[Buffer]
  
  type ImageData = BufferRet | UintArrRet
  
  @js.native
  trait RawImageData[T] extends StObject {
    
    var data: T = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object RawImageData {
    
    @scala.inline
    def apply[T](data: T, height: Double, width: Double): RawImageData[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawImageData[T]]
    }
    
    @scala.inline
    implicit class RawImageDataMutableBuilder[Self <: RawImageData[_], T] (val x: Self with RawImageData[T]) extends AnyVal {
      
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
