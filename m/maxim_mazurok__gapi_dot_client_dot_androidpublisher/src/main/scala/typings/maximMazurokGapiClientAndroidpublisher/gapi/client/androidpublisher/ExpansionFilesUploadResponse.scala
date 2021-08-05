package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpansionFilesUploadResponse extends StObject {
  
  /** The uploaded expansion file configuration. */
  var expansionFile: js.UndefOr[ExpansionFile] = js.undefined
}
object ExpansionFilesUploadResponse {
  
  inline def apply(): ExpansionFilesUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionFilesUploadResponse]
  }
  
  extension [Self <: ExpansionFilesUploadResponse](x: Self) {
    
    inline def setExpansionFile(value: ExpansionFile): Self = StObject.set(x, "expansionFile", value.asInstanceOf[js.Any])
    
    inline def setExpansionFileUndefined: Self = StObject.set(x, "expansionFile", js.undefined)
  }
}
