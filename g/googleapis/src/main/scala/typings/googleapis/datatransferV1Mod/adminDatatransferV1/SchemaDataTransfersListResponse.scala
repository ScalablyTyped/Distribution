package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataTransfersListResponse extends StObject {
  
  /**
    * List of data transfer requests.
    */
  var dataTransfers: js.UndefOr[js.Array[SchemaDataTransfer]] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies the resource as a collection of data transfer requests.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Continuation token which will be used to specify next page in list API.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaDataTransfersListResponse {
  
  inline def apply(): SchemaDataTransfersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataTransfersListResponse]
  }
  
  extension [Self <: SchemaDataTransfersListResponse](x: Self) {
    
    inline def setDataTransfers(value: js.Array[SchemaDataTransfer]): Self = StObject.set(x, "dataTransfers", value.asInstanceOf[js.Any])
    
    inline def setDataTransfersUndefined: Self = StObject.set(x, "dataTransfers", js.undefined)
    
    inline def setDataTransfersVarargs(value: SchemaDataTransfer*): Self = StObject.set(x, "dataTransfers", js.Array(value*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
