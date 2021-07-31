package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashVideoItem extends StObject {
  
  def exportToFLV(fileURI: String): Boolean
  
  var fileLastModifiedDate: String
  
  var sourceFileExists: Boolean
  
  var sourceFileIsCurrent: Boolean
  
  var sourceFilePath: String
  
  var videoType: String
}
object FlashVideoItem {
  
  @scala.inline
  def apply(
    exportToFLV: String => Boolean,
    fileLastModifiedDate: String,
    sourceFileExists: Boolean,
    sourceFileIsCurrent: Boolean,
    sourceFilePath: String,
    videoType: String
  ): FlashVideoItem = {
    val __obj = js.Dynamic.literal(exportToFLV = js.Any.fromFunction1(exportToFLV), fileLastModifiedDate = fileLastModifiedDate.asInstanceOf[js.Any], sourceFileExists = sourceFileExists.asInstanceOf[js.Any], sourceFileIsCurrent = sourceFileIsCurrent.asInstanceOf[js.Any], sourceFilePath = sourceFilePath.asInstanceOf[js.Any], videoType = videoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashVideoItem]
  }
  
  @scala.inline
  implicit class FlashVideoItemMutableBuilder[Self <: FlashVideoItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportToFLV(value: String => Boolean): Self = StObject.set(x, "exportToFLV", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFileLastModifiedDate(value: String): Self = StObject.set(x, "fileLastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFileExists(value: Boolean): Self = StObject.set(x, "sourceFileExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFileIsCurrent(value: Boolean): Self = StObject.set(x, "sourceFileIsCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFilePath(value: String): Self = StObject.set(x, "sourceFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoType(value: String): Self = StObject.set(x, "videoType", value.asInstanceOf[js.Any])
  }
}
