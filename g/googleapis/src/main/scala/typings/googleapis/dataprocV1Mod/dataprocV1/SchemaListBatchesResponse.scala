package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListBatchesResponse extends StObject {
  
  /**
    * The batches from the specified collection.
    */
  var batches: js.UndefOr[js.Array[SchemaBatch]] = js.undefined
  
  /**
    * A token, which can be sent as page_token to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListBatchesResponse {
  
  inline def apply(): SchemaListBatchesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBatchesResponse]
  }
  
  extension [Self <: SchemaListBatchesResponse](x: Self) {
    
    inline def setBatches(value: js.Array[SchemaBatch]): Self = StObject.set(x, "batches", value.asInstanceOf[js.Any])
    
    inline def setBatchesUndefined: Self = StObject.set(x, "batches", js.undefined)
    
    inline def setBatchesVarargs(value: SchemaBatch*): Self = StObject.set(x, "batches", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
