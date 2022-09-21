package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatafeedsCustomBatchRequest extends StObject {
  
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[DatafeedsCustomBatchRequestEntry]] = js.undefined
}
object DatafeedsCustomBatchRequest {
  
  inline def apply(): DatafeedsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedsCustomBatchRequest]
  }
  
  extension [Self <: DatafeedsCustomBatchRequest](x: Self) {
    
    inline def setEntries(value: js.Array[DatafeedsCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: DatafeedsCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
