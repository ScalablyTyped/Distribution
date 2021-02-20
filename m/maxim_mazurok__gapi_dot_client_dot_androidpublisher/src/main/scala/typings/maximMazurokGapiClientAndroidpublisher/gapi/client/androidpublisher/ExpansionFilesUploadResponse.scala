package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpansionFilesUploadResponse extends StObject {
  
  /** The uploaded expansion file configuration. */
  var expansionFile: js.UndefOr[ExpansionFile] = js.native
}
object ExpansionFilesUploadResponse {
  
  @scala.inline
  def apply(): ExpansionFilesUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionFilesUploadResponse]
  }
  
  @scala.inline
  implicit class ExpansionFilesUploadResponseMutableBuilder[Self <: ExpansionFilesUploadResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpansionFile(value: ExpansionFile): Self = StObject.set(x, "expansionFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpansionFileUndefined: Self = StObject.set(x, "expansionFile", js.undefined)
  }
}
