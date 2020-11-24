package typings.imagekit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApertureValue extends js.Object {
  
  var ApertureValue: Double = js.native
  
  var ColorSpace: Double = js.native
  
  var CreateDate: String = js.native
  
  var CustomRendered: Double = js.native
  
  var DateTimeOriginal: String = js.native
  
  var ExifImageHeight: Double = js.native
  
  var ExifImageWidth: Double = js.native
  
  var ExifVersion: String = js.native
  
  var ExposureCompensation: Double = js.native
  
  var ExposureMode: Double = js.native
  
  var ExposureProgram: Double = js.native
  
  var ExposureTime: Double = js.native
  
  var FNumber: Double = js.native
  
  var Flash: Double = js.native
  
  var FlashpixVersion: String = js.native
  
  var FocalLength: Double = js.native
  
  var FocalPlaneResolutionUnit: Double = js.native
  
  var FocalPlaneXResolution: Double = js.native
  
  var FocalPlaneYResolution: Double = js.native
  
  var ISO: Double = js.native
  
  var InteropOffset: Double = js.native
  
  var MeteringMode: Double = js.native
  
  var SceneCaptureType: Double = js.native
  
  var ShutterSpeedValue: Double = js.native
  
  var SubSecTime: String = js.native
  
  var SubSecTimeDigitized: String = js.native
  
  var SubSecTimeOriginal: String = js.native
  
  var WhiteBalance: Double = js.native
}
object ApertureValue {
  
  @scala.inline
  def apply(
    ApertureValue: Double,
    ColorSpace: Double,
    CreateDate: String,
    CustomRendered: Double,
    DateTimeOriginal: String,
    ExifImageHeight: Double,
    ExifImageWidth: Double,
    ExifVersion: String,
    ExposureCompensation: Double,
    ExposureMode: Double,
    ExposureProgram: Double,
    ExposureTime: Double,
    FNumber: Double,
    Flash: Double,
    FlashpixVersion: String,
    FocalLength: Double,
    FocalPlaneResolutionUnit: Double,
    FocalPlaneXResolution: Double,
    FocalPlaneYResolution: Double,
    ISO: Double,
    InteropOffset: Double,
    MeteringMode: Double,
    SceneCaptureType: Double,
    ShutterSpeedValue: Double,
    SubSecTime: String,
    SubSecTimeDigitized: String,
    SubSecTimeOriginal: String,
    WhiteBalance: Double
  ): ApertureValue = {
    val __obj = js.Dynamic.literal(ApertureValue = ApertureValue.asInstanceOf[js.Any], ColorSpace = ColorSpace.asInstanceOf[js.Any], CreateDate = CreateDate.asInstanceOf[js.Any], CustomRendered = CustomRendered.asInstanceOf[js.Any], DateTimeOriginal = DateTimeOriginal.asInstanceOf[js.Any], ExifImageHeight = ExifImageHeight.asInstanceOf[js.Any], ExifImageWidth = ExifImageWidth.asInstanceOf[js.Any], ExifVersion = ExifVersion.asInstanceOf[js.Any], ExposureCompensation = ExposureCompensation.asInstanceOf[js.Any], ExposureMode = ExposureMode.asInstanceOf[js.Any], ExposureProgram = ExposureProgram.asInstanceOf[js.Any], ExposureTime = ExposureTime.asInstanceOf[js.Any], FNumber = FNumber.asInstanceOf[js.Any], Flash = Flash.asInstanceOf[js.Any], FlashpixVersion = FlashpixVersion.asInstanceOf[js.Any], FocalLength = FocalLength.asInstanceOf[js.Any], FocalPlaneResolutionUnit = FocalPlaneResolutionUnit.asInstanceOf[js.Any], FocalPlaneXResolution = FocalPlaneXResolution.asInstanceOf[js.Any], FocalPlaneYResolution = FocalPlaneYResolution.asInstanceOf[js.Any], ISO = ISO.asInstanceOf[js.Any], InteropOffset = InteropOffset.asInstanceOf[js.Any], MeteringMode = MeteringMode.asInstanceOf[js.Any], SceneCaptureType = SceneCaptureType.asInstanceOf[js.Any], ShutterSpeedValue = ShutterSpeedValue.asInstanceOf[js.Any], SubSecTime = SubSecTime.asInstanceOf[js.Any], SubSecTimeDigitized = SubSecTimeDigitized.asInstanceOf[js.Any], SubSecTimeOriginal = SubSecTimeOriginal.asInstanceOf[js.Any], WhiteBalance = WhiteBalance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApertureValue]
  }
  
  @scala.inline
  implicit class ApertureValueOps[Self <: ApertureValue] (val x: Self) extends AnyVal {
    
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
    def setApertureValue(value: Double): Self = this.set("ApertureValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSpace(value: Double): Self = this.set("ColorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDate(value: String): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomRendered(value: Double): Self = this.set("CustomRendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeOriginal(value: String): Self = this.set("DateTimeOriginal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExifImageHeight(value: Double): Self = this.set("ExifImageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExifImageWidth(value: Double): Self = this.set("ExifImageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExifVersion(value: String): Self = this.set("ExifVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureCompensation(value: Double): Self = this.set("ExposureCompensation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureMode(value: Double): Self = this.set("ExposureMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureProgram(value: Double): Self = this.set("ExposureProgram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureTime(value: Double): Self = this.set("ExposureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFNumber(value: Double): Self = this.set("FNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlash(value: Double): Self = this.set("Flash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlashpixVersion(value: String): Self = this.set("FlashpixVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocalLength(value: Double): Self = this.set("FocalLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocalPlaneResolutionUnit(value: Double): Self = this.set("FocalPlaneResolutionUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocalPlaneXResolution(value: Double): Self = this.set("FocalPlaneXResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocalPlaneYResolution(value: Double): Self = this.set("FocalPlaneYResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setISO(value: Double): Self = this.set("ISO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteropOffset(value: Double): Self = this.set("InteropOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeteringMode(value: Double): Self = this.set("MeteringMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSceneCaptureType(value: Double): Self = this.set("SceneCaptureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShutterSpeedValue(value: Double): Self = this.set("ShutterSpeedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubSecTime(value: String): Self = this.set("SubSecTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubSecTimeDigitized(value: String): Self = this.set("SubSecTimeDigitized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubSecTimeOriginal(value: String): Self = this.set("SubSecTimeOriginal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteBalance(value: Double): Self = this.set("WhiteBalance", value.asInstanceOf[js.Any])
  }
}
