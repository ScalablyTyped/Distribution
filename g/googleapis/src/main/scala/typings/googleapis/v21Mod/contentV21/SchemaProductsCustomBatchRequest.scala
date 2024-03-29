package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductsCustomBatchRequest extends StObject {
  
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[SchemaProductsCustomBatchRequestEntry]] = js.undefined
}
object SchemaProductsCustomBatchRequest {
  
  inline def apply(): SchemaProductsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductsCustomBatchRequest]
  }
  
  extension [Self <: SchemaProductsCustomBatchRequest](x: Self) {
    
    inline def setEntries(value: js.Array[SchemaProductsCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: SchemaProductsCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
