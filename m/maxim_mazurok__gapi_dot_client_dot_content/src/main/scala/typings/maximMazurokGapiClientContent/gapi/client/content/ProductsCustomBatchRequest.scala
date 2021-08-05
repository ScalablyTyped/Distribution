package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductsCustomBatchRequest extends StObject {
  
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[ProductsCustomBatchRequestEntry]] = js.undefined
}
object ProductsCustomBatchRequest {
  
  inline def apply(): ProductsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductsCustomBatchRequest]
  }
  
  extension [Self <: ProductsCustomBatchRequest](x: Self) {
    
    inline def setEntries(value: js.Array[ProductsCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: ProductsCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
