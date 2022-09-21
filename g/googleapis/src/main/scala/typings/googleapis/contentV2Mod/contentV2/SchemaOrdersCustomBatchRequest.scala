package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersCustomBatchRequest extends StObject {
  
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[SchemaOrdersCustomBatchRequestEntry]] = js.undefined
}
object SchemaOrdersCustomBatchRequest {
  
  inline def apply(): SchemaOrdersCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequest]
  }
  
  extension [Self <: SchemaOrdersCustomBatchRequest](x: Self) {
    
    inline def setEntries(value: js.Array[SchemaOrdersCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: SchemaOrdersCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
