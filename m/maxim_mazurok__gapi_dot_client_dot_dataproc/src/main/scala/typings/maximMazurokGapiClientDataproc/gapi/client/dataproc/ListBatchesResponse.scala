package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBatchesResponse extends StObject {
  
  /** The batches from the specified collection. */
  var batches: js.UndefOr[js.Array[Batch]] = js.undefined
  
  /** A token, which can be sent as page_token to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListBatchesResponse {
  
  inline def apply(): ListBatchesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBatchesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBatchesResponse] (val x: Self) extends AnyVal {
    
    inline def setBatches(value: js.Array[Batch]): Self = StObject.set(x, "batches", value.asInstanceOf[js.Any])
    
    inline def setBatchesUndefined: Self = StObject.set(x, "batches", js.undefined)
    
    inline def setBatchesVarargs(value: Batch*): Self = StObject.set(x, "batches", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
