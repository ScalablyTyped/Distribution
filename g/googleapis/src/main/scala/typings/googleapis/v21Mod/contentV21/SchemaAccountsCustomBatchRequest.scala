package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountsCustomBatchRequest extends StObject {
  
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[SchemaAccountsCustomBatchRequestEntry]] = js.undefined
}
object SchemaAccountsCustomBatchRequest {
  
  inline def apply(): SchemaAccountsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsCustomBatchRequest]
  }
  
  extension [Self <: SchemaAccountsCustomBatchRequest](x: Self) {
    
    inline def setEntries(value: js.Array[SchemaAccountsCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: SchemaAccountsCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
