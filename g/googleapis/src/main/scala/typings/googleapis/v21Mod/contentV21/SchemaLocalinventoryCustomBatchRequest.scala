package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocalinventoryCustomBatchRequest extends StObject {
  
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[SchemaLocalinventoryCustomBatchRequestEntry]] = js.undefined
}
object SchemaLocalinventoryCustomBatchRequest {
  
  inline def apply(): SchemaLocalinventoryCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalinventoryCustomBatchRequest]
  }
  
  extension [Self <: SchemaLocalinventoryCustomBatchRequest](x: Self) {
    
    inline def setEntries(value: js.Array[SchemaLocalinventoryCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: SchemaLocalinventoryCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
