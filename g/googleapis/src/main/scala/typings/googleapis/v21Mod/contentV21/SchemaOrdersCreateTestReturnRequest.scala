package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersCreateTestReturnRequest extends StObject {
  
  /**
    * Returned items.
    */
  var items: js.UndefOr[js.Array[SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem]] = js.undefined
}
object SchemaOrdersCreateTestReturnRequest {
  
  inline def apply(): SchemaOrdersCreateTestReturnRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCreateTestReturnRequest]
  }
  
  extension [Self <: SchemaOrdersCreateTestReturnRequest](x: Self) {
    
    inline def setItems(value: js.Array[SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
