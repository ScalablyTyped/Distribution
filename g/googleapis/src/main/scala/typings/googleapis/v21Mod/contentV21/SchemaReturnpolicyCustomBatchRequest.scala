package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReturnpolicyCustomBatchRequest extends StObject {
  
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[SchemaReturnpolicyCustomBatchRequestEntry]] = js.undefined
}
object SchemaReturnpolicyCustomBatchRequest {
  
  inline def apply(): SchemaReturnpolicyCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReturnpolicyCustomBatchRequest]
  }
  
  extension [Self <: SchemaReturnpolicyCustomBatchRequest](x: Self) {
    
    inline def setEntries(value: js.Array[SchemaReturnpolicyCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: SchemaReturnpolicyCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
