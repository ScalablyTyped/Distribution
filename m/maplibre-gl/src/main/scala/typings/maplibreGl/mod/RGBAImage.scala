package typings.maplibreGl.mod

import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "RGBAImage")
@js.native
open class RGBAImage protected ()
  extends StObject
     with DataTextureImage {
  def this(size: Size) = this()
  def this(size: Size, data: js.typedarray.Uint8Array) = this()
  def this(size: Size, data: js.typedarray.Uint8ClampedArray) = this()
  
  var data: js.typedarray.Uint8Array = js.native
  
  var height: Double = js.native
  
  def replace(data: js.typedarray.Uint8Array): scala.Unit = js.native
  def replace(data: js.typedarray.Uint8Array, copy: Boolean): scala.Unit = js.native
  def replace(data: js.typedarray.Uint8ClampedArray): scala.Unit = js.native
  def replace(data: js.typedarray.Uint8ClampedArray, copy: Boolean): scala.Unit = js.native
  
  def resize(size: Size): scala.Unit = js.native
  
  var width: Double = js.native
}
/* static members */
object RGBAImage {
  
  @JSImport("maplibre-gl", "RGBAImage")
  @js.native
  val ^ : js.Any = js.native
  
  inline def copy(srcImg: RGBAImage, dstImg: RGBAImage, srcPt: Point2D, dstPt: Point2D, size: Size): scala.Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(srcImg.asInstanceOf[js.Any], dstImg.asInstanceOf[js.Any], srcPt.asInstanceOf[js.Any], dstPt.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  inline def copy(srcImg: ImageData, dstImg: RGBAImage, srcPt: Point2D, dstPt: Point2D, size: Size): scala.Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(srcImg.asInstanceOf[js.Any], dstImg.asInstanceOf[js.Any], srcPt.asInstanceOf[js.Any], dstPt.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
