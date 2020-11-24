package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashSoundItem extends js.Object {
  
  var bitRate: String = js.native
  
  var bits: String = js.native
  
  var compressionType: String = js.native
  
  var convertStereoToMono: Boolean = js.native
  
  def exportToFile(fileURI: String): Boolean = js.native
  
  var fileLastModifiedDate: String = js.native
  
  var originalCompressionType: String = js.native
  
  var quality: String = js.native
  
  var sampleRate: String = js.native
  
  var sourceFileExists: Boolean = js.native
}
object FlashSoundItem {
  
  @scala.inline
  def apply(
    bitRate: String,
    bits: String,
    compressionType: String,
    convertStereoToMono: Boolean,
    exportToFile: String => Boolean,
    fileLastModifiedDate: String,
    originalCompressionType: String,
    quality: String,
    sampleRate: String,
    sourceFileExists: Boolean
  ): FlashSoundItem = {
    val __obj = js.Dynamic.literal(bitRate = bitRate.asInstanceOf[js.Any], bits = bits.asInstanceOf[js.Any], compressionType = compressionType.asInstanceOf[js.Any], convertStereoToMono = convertStereoToMono.asInstanceOf[js.Any], exportToFile = js.Any.fromFunction1(exportToFile), fileLastModifiedDate = fileLastModifiedDate.asInstanceOf[js.Any], originalCompressionType = originalCompressionType.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any], sourceFileExists = sourceFileExists.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashSoundItem]
  }
  
  @scala.inline
  implicit class FlashSoundItemOps[Self <: FlashSoundItem] (val x: Self) extends AnyVal {
    
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
    def setBitRate(value: String): Self = this.set("bitRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBits(value: String): Self = this.set("bits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionType(value: String): Self = this.set("compressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertStereoToMono(value: Boolean): Self = this.set("convertStereoToMono", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportToFile(value: String => Boolean): Self = this.set("exportToFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFileLastModifiedDate(value: String): Self = this.set("fileLastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalCompressionType(value: String): Self = this.set("originalCompressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: String): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRate(value: String): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFileExists(value: Boolean): Self = this.set("sourceFileExists", value.asInstanceOf[js.Any])
  }
}
