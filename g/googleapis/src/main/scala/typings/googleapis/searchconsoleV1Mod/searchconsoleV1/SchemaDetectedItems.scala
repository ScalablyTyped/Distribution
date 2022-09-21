package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDetectedItems extends StObject {
  
  /**
    * List of Rich Results items.
    */
  var items: js.UndefOr[js.Array[SchemaItem]] = js.undefined
  
  /**
    * Rich Results type
    */
  var richResultType: js.UndefOr[String | Null] = js.undefined
}
object SchemaDetectedItems {
  
  inline def apply(): SchemaDetectedItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetectedItems]
  }
  
  extension [Self <: SchemaDetectedItems](x: Self) {
    
    inline def setItems(value: js.Array[SchemaItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setRichResultType(value: String): Self = StObject.set(x, "richResultType", value.asInstanceOf[js.Any])
    
    inline def setRichResultTypeNull: Self = StObject.set(x, "richResultType", null)
    
    inline def setRichResultTypeUndefined: Self = StObject.set(x, "richResultType", js.undefined)
  }
}
