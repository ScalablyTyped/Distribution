package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaExpansionFilesUploadResponse extends StObject {
  
  var expansionFile: js.UndefOr[SchemaExpansionFile] = js.native
}
object SchemaExpansionFilesUploadResponse {
  
  @scala.inline
  def apply(): SchemaExpansionFilesUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExpansionFilesUploadResponse]
  }
  
  @scala.inline
  implicit class SchemaExpansionFilesUploadResponseMutableBuilder[Self <: SchemaExpansionFilesUploadResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpansionFile(value: SchemaExpansionFile): Self = StObject.set(x, "expansionFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpansionFileUndefined: Self = StObject.set(x, "expansionFile", js.undefined)
  }
}
