package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnaddressCustomBatchRequest extends StObject {
  
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[ReturnaddressCustomBatchRequestEntry]] = js.undefined
}
object ReturnaddressCustomBatchRequest {
  
  inline def apply(): ReturnaddressCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnaddressCustomBatchRequest]
  }
  
  extension [Self <: ReturnaddressCustomBatchRequest](x: Self) {
    
    inline def setEntries(value: js.Array[ReturnaddressCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: ReturnaddressCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
