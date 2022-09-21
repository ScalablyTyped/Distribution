package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResponse extends StObject {
  
  /**
    * The result of creating an item.
    */
  var createItem: js.UndefOr[SchemaCreateItemResponse] = js.undefined
}
object SchemaResponse {
  
  inline def apply(): SchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponse]
  }
  
  extension [Self <: SchemaResponse](x: Self) {
    
    inline def setCreateItem(value: SchemaCreateItemResponse): Self = StObject.set(x, "createItem", value.asInstanceOf[js.Any])
    
    inline def setCreateItemUndefined: Self = StObject.set(x, "createItem", js.undefined)
  }
}
