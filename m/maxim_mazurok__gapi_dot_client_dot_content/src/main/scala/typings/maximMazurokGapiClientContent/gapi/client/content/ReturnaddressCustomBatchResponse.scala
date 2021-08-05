package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnaddressCustomBatchResponse extends StObject {
  
  /** The result of the execution of the batch requests. */
  var entries: js.UndefOr[js.Array[ReturnaddressCustomBatchResponseEntry]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#returnaddressCustomBatchResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object ReturnaddressCustomBatchResponse {
  
  inline def apply(): ReturnaddressCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnaddressCustomBatchResponse]
  }
  
  extension [Self <: ReturnaddressCustomBatchResponse](x: Self) {
    
    inline def setEntries(value: js.Array[ReturnaddressCustomBatchResponseEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: ReturnaddressCustomBatchResponseEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
