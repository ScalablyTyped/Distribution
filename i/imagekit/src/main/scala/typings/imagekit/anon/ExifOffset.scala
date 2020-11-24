package typings.imagekit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExifOffset extends js.Object {
  
  var ExifOffset: Double = js.native
  
  var GPSInfo: Double = js.native
  
  var Make: String = js.native
  
  var Model: String = js.native
  
  var ModifyDate: String = js.native
  
  var Orientation: Double = js.native
  
  var ResolutionUnit: Double = js.native
  
  var Software: String = js.native
  
  var XResolution: Double = js.native
  
  var YCbCrPositioning: Double = js.native
  
  var YResolution: Double = js.native
}
object ExifOffset {
  
  @scala.inline
  def apply(
    ExifOffset: Double,
    GPSInfo: Double,
    Make: String,
    Model: String,
    ModifyDate: String,
    Orientation: Double,
    ResolutionUnit: Double,
    Software: String,
    XResolution: Double,
    YCbCrPositioning: Double,
    YResolution: Double
  ): ExifOffset = {
    val __obj = js.Dynamic.literal(ExifOffset = ExifOffset.asInstanceOf[js.Any], GPSInfo = GPSInfo.asInstanceOf[js.Any], Make = Make.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], ModifyDate = ModifyDate.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], ResolutionUnit = ResolutionUnit.asInstanceOf[js.Any], Software = Software.asInstanceOf[js.Any], XResolution = XResolution.asInstanceOf[js.Any], YCbCrPositioning = YCbCrPositioning.asInstanceOf[js.Any], YResolution = YResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExifOffset]
  }
  
  @scala.inline
  implicit class ExifOffsetOps[Self <: ExifOffset] (val x: Self) extends AnyVal {
    
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
    def setExifOffset(value: Double): Self = this.set("ExifOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGPSInfo(value: Double): Self = this.set("GPSInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMake(value: String): Self = this.set("Make", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = this.set("Model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyDate(value: String): Self = this.set("ModifyDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: Double): Self = this.set("Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUnit(value: Double): Self = this.set("ResolutionUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftware(value: String): Self = this.set("Software", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXResolution(value: Double): Self = this.set("XResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYCbCrPositioning(value: Double): Self = this.set("YCbCrPositioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYResolution(value: Double): Self = this.set("YResolution", value.asInstanceOf[js.Any])
  }
}
