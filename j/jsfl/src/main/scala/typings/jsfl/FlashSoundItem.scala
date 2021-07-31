package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashSoundItem extends StObject {
  
  var bitRate: String
  
  var bits: String
  
  var compressionType: String
  
  var convertStereoToMono: Boolean
  
  def exportToFile(fileURI: String): Boolean
  
  var fileLastModifiedDate: String
  
  var originalCompressionType: String
  
  var quality: String
  
  var sampleRate: String
  
  var sourceFileExists: Boolean
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
  implicit class FlashSoundItemMutableBuilder[Self <: FlashSoundItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitRate(value: String): Self = StObject.set(x, "bitRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBits(value: String): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionType(value: String): Self = StObject.set(x, "compressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertStereoToMono(value: Boolean): Self = StObject.set(x, "convertStereoToMono", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportToFile(value: String => Boolean): Self = StObject.set(x, "exportToFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFileLastModifiedDate(value: String): Self = StObject.set(x, "fileLastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalCompressionType(value: String): Self = StObject.set(x, "originalCompressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: String): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRate(value: String): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFileExists(value: Boolean): Self = StObject.set(x, "sourceFileExists", value.asInstanceOf[js.Any])
  }
}
