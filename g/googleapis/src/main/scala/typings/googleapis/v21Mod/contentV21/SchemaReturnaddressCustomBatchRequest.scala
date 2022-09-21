package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReturnaddressCustomBatchRequest extends StObject {
  
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[SchemaReturnaddressCustomBatchRequestEntry]] = js.undefined
}
object SchemaReturnaddressCustomBatchRequest {
  
  inline def apply(): SchemaReturnaddressCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReturnaddressCustomBatchRequest]
  }
  
  extension [Self <: SchemaReturnaddressCustomBatchRequest](x: Self) {
    
    inline def setEntries(value: js.Array[SchemaReturnaddressCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: SchemaReturnaddressCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
