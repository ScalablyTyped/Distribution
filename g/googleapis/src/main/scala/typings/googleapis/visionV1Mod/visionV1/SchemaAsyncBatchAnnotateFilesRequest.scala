package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Multiple async file annotation requests are batched into a single service
  * call.
  */
trait SchemaAsyncBatchAnnotateFilesRequest extends StObject {
  
  /**
    * Individual async file annotation requests for this batch.
    */
  var requests: js.UndefOr[js.Array[SchemaAsyncAnnotateFileRequest]] = js.undefined
}
object SchemaAsyncBatchAnnotateFilesRequest {
  
  inline def apply(): SchemaAsyncBatchAnnotateFilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsyncBatchAnnotateFilesRequest]
  }
  
  extension [Self <: SchemaAsyncBatchAnnotateFilesRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaAsyncAnnotateFileRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaAsyncAnnotateFileRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
