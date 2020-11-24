package typings.imagemagickNative.mod

import typings.imagemagickNative.anon.Height
import typings.imagemagickNative.anon.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIdentifyResult extends js.Object {
  
  var density: Height = js.native
  
  var depth: Double = js.native
  
  var exif: Orientation = js.native
  
  var format: String = js.native
  
  var height: Double = js.native
  
  var width: Double = js.native
}
object IIdentifyResult {
  
  @scala.inline
  def apply(density: Height, depth: Double, exif: Orientation, format: String, height: Double, width: Double): IIdentifyResult = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], exif = exif.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIdentifyResult]
  }
  
  @scala.inline
  implicit class IIdentifyResultOps[Self <: IIdentifyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDensity(value: Height): Self = this.set("density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExif(value: Orientation): Self = this.set("exif", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
