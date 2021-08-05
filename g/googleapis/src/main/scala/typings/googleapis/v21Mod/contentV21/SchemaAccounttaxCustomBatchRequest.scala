package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccounttaxCustomBatchRequest extends StObject {
  
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[SchemaAccounttaxCustomBatchRequestEntry]] = js.undefined
}
object SchemaAccounttaxCustomBatchRequest {
  
  inline def apply(): SchemaAccounttaxCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccounttaxCustomBatchRequest]
  }
  
  extension [Self <: SchemaAccounttaxCustomBatchRequest](x: Self) {
    
    inline def setEntries(value: js.Array[SchemaAccounttaxCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: SchemaAccounttaxCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
