package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountsCustomBatchRequest extends StObject {
  
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[AccountsCustomBatchRequestEntry]] = js.undefined
}
object AccountsCustomBatchRequest {
  
  inline def apply(): AccountsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountsCustomBatchRequest]
  }
  
  extension [Self <: AccountsCustomBatchRequest](x: Self) {
    
    inline def setEntries(value: js.Array[AccountsCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: AccountsCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
