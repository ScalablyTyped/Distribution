package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashBitmapItem extends StObject {
  
  var allowSmoothing: Boolean
  
  var compressionType: String
  
  def exportToFile(fileURI: String): Boolean
  
  var fileLastModifiedDate: String
  
  var originalCompressionType: String
  
  var sourceFileExists: Boolean
  
  var sourceFileIsCurrent: Boolean
  
  var sourceFilePath: String
  
  var useDeblocking: Boolean
  
  var useImportedJPEGQuality: Boolean
}
object FlashBitmapItem {
  
  inline def apply(
    allowSmoothing: Boolean,
    compressionType: String,
    exportToFile: String => Boolean,
    fileLastModifiedDate: String,
    originalCompressionType: String,
    sourceFileExists: Boolean,
    sourceFileIsCurrent: Boolean,
    sourceFilePath: String,
    useDeblocking: Boolean,
    useImportedJPEGQuality: Boolean
  ): FlashBitmapItem = {
    val __obj = js.Dynamic.literal(allowSmoothing = allowSmoothing.asInstanceOf[js.Any], compressionType = compressionType.asInstanceOf[js.Any], exportToFile = js.Any.fromFunction1(exportToFile), fileLastModifiedDate = fileLastModifiedDate.asInstanceOf[js.Any], originalCompressionType = originalCompressionType.asInstanceOf[js.Any], sourceFileExists = sourceFileExists.asInstanceOf[js.Any], sourceFileIsCurrent = sourceFileIsCurrent.asInstanceOf[js.Any], sourceFilePath = sourceFilePath.asInstanceOf[js.Any], useDeblocking = useDeblocking.asInstanceOf[js.Any], useImportedJPEGQuality = useImportedJPEGQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashBitmapItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlashBitmapItem] (val x: Self) extends AnyVal {
    
    inline def setAllowSmoothing(value: Boolean): Self = StObject.set(x, "allowSmoothing", value.asInstanceOf[js.Any])
    
    inline def setCompressionType(value: String): Self = StObject.set(x, "compressionType", value.asInstanceOf[js.Any])
    
    inline def setExportToFile(value: String => Boolean): Self = StObject.set(x, "exportToFile", js.Any.fromFunction1(value))
    
    inline def setFileLastModifiedDate(value: String): Self = StObject.set(x, "fileLastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setOriginalCompressionType(value: String): Self = StObject.set(x, "originalCompressionType", value.asInstanceOf[js.Any])
    
    inline def setSourceFileExists(value: Boolean): Self = StObject.set(x, "sourceFileExists", value.asInstanceOf[js.Any])
    
    inline def setSourceFileIsCurrent(value: Boolean): Self = StObject.set(x, "sourceFileIsCurrent", value.asInstanceOf[js.Any])
    
    inline def setSourceFilePath(value: String): Self = StObject.set(x, "sourceFilePath", value.asInstanceOf[js.Any])
    
    inline def setUseDeblocking(value: Boolean): Self = StObject.set(x, "useDeblocking", value.asInstanceOf[js.Any])
    
    inline def setUseImportedJPEGQuality(value: Boolean): Self = StObject.set(x, "useImportedJPEGQuality", value.asInstanceOf[js.Any])
  }
}
