package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountstatusesCustomBatchRequest extends StObject {
  
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[AccountstatusesCustomBatchRequestEntry]] = js.undefined
}
object AccountstatusesCustomBatchRequest {
  
  inline def apply(): AccountstatusesCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountstatusesCustomBatchRequest]
  }
  
  extension [Self <: AccountstatusesCustomBatchRequest](x: Self) {
    
    inline def setEntries(value: js.Array[AccountstatusesCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: AccountstatusesCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
