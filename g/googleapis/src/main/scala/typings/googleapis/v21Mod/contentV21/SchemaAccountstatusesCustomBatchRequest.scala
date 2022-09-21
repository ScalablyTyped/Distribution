package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountstatusesCustomBatchRequest extends StObject {
  
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[SchemaAccountstatusesCustomBatchRequestEntry]] = js.undefined
}
object SchemaAccountstatusesCustomBatchRequest {
  
  inline def apply(): SchemaAccountstatusesCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountstatusesCustomBatchRequest]
  }
  
  extension [Self <: SchemaAccountstatusesCustomBatchRequest](x: Self) {
    
    inline def setEntries(value: js.Array[SchemaAccountstatusesCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: SchemaAccountstatusesCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
