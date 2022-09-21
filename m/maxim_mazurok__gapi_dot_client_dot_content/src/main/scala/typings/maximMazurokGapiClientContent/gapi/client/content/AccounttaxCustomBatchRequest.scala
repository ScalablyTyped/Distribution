package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccounttaxCustomBatchRequest extends StObject {
  
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[AccounttaxCustomBatchRequestEntry]] = js.undefined
}
object AccounttaxCustomBatchRequest {
  
  inline def apply(): AccounttaxCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccounttaxCustomBatchRequest]
  }
  
  extension [Self <: AccounttaxCustomBatchRequest](x: Self) {
    
    inline def setEntries(value: js.Array[AccounttaxCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: AccounttaxCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
