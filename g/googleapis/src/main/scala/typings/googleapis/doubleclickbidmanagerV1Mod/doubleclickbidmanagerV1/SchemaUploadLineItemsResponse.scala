package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Upload line items response.
  */
@js.native
trait SchemaUploadLineItemsResponse extends StObject {
  
  /**
    * Status of upload.
    */
  var uploadStatus: js.UndefOr[SchemaUploadStatus] = js.native
}
object SchemaUploadLineItemsResponse {
  
  @scala.inline
  def apply(): SchemaUploadLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadLineItemsResponse]
  }
  
  @scala.inline
  implicit class SchemaUploadLineItemsResponseMutableBuilder[Self <: SchemaUploadLineItemsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUploadStatus(value: SchemaUploadStatus): Self = StObject.set(x, "uploadStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadStatusUndefined: Self = StObject.set(x, "uploadStatus", js.undefined)
  }
}
