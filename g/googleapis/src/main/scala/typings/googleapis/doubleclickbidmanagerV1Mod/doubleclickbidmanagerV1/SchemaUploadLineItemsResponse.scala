package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Upload line items response.
  */
trait SchemaUploadLineItemsResponse extends StObject {
  
  /**
    * Status of upload.
    */
  var uploadStatus: js.UndefOr[SchemaUploadStatus] = js.undefined
}
object SchemaUploadLineItemsResponse {
  
  inline def apply(): SchemaUploadLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadLineItemsResponse]
  }
  
  extension [Self <: SchemaUploadLineItemsResponse](x: Self) {
    
    inline def setUploadStatus(value: SchemaUploadStatus): Self = StObject.set(x, "uploadStatus", value.asInstanceOf[js.Any])
    
    inline def setUploadStatusUndefined: Self = StObject.set(x, "uploadStatus", js.undefined)
  }
}
