package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingsettingsCustomBatchResponse extends StObject {
  
  /** The result of the execution of the batch requests. */
  var entries: js.UndefOr[js.Array[ShippingsettingsCustomBatchResponseEntry]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#shippingsettingsCustomBatchResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object ShippingsettingsCustomBatchResponse {
  
  inline def apply(): ShippingsettingsCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingsettingsCustomBatchResponse]
  }
  
  extension [Self <: ShippingsettingsCustomBatchResponse](x: Self) {
    
    inline def setEntries(value: js.Array[ShippingsettingsCustomBatchResponseEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: ShippingsettingsCustomBatchResponseEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
