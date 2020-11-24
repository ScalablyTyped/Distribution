package typings.imagekit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compression extends js.Object {
  
  var Compression: Double = js.native
  
  var ResolutionUnit: Double = js.native
  
  var ThumbnailLength: Double = js.native
  
  var ThumbnailOffset: Double = js.native
  
  var XResolution: Double = js.native
  
  var YResolution: Double = js.native
}
object Compression {
  
  @scala.inline
  def apply(
    Compression: Double,
    ResolutionUnit: Double,
    ThumbnailLength: Double,
    ThumbnailOffset: Double,
    XResolution: Double,
    YResolution: Double
  ): Compression = {
    val __obj = js.Dynamic.literal(Compression = Compression.asInstanceOf[js.Any], ResolutionUnit = ResolutionUnit.asInstanceOf[js.Any], ThumbnailLength = ThumbnailLength.asInstanceOf[js.Any], ThumbnailOffset = ThumbnailOffset.asInstanceOf[js.Any], XResolution = XResolution.asInstanceOf[js.Any], YResolution = YResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compression]
  }
  
  @scala.inline
  implicit class CompressionOps[Self <: Compression] (val x: Self) extends AnyVal {
    
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
    def setCompression(value: Double): Self = this.set("Compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUnit(value: Double): Self = this.set("ResolutionUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailLength(value: Double): Self = this.set("ThumbnailLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailOffset(value: Double): Self = this.set("ThumbnailOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXResolution(value: Double): Self = this.set("XResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYResolution(value: Double): Self = this.set("YResolution", value.asInstanceOf[js.Any])
  }
}
