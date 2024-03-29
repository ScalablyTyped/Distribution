package typings.googleapis.storageV1beta2Mod.storageV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaObjectAccessControls extends StObject {
  
  /**
    * The list of items.
    */
  var items: js.UndefOr[js.Array[Any] | Null] = js.undefined
  
  /**
    * The kind of item this is. For lists of object access control entries, this is always storage#objectAccessControls.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaObjectAccessControls {
  
  inline def apply(): SchemaObjectAccessControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectAccessControls]
  }
  
  extension [Self <: SchemaObjectAccessControls](x: Self) {
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsNull: Self = StObject.set(x, "items", null)
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
