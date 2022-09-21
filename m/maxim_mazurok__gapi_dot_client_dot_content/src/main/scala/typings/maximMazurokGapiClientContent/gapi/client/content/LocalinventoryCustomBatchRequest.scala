package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalinventoryCustomBatchRequest extends StObject {
  
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[LocalinventoryCustomBatchRequestEntry]] = js.undefined
}
object LocalinventoryCustomBatchRequest {
  
  inline def apply(): LocalinventoryCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalinventoryCustomBatchRequest]
  }
  
  extension [Self <: LocalinventoryCustomBatchRequest](x: Self) {
    
    inline def setEntries(value: js.Array[LocalinventoryCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: LocalinventoryCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
