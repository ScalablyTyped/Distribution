package typings.googleapis.storageV1beta2Mod.storageV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An access-control list.
  */
trait SchemaObjectAccessControls extends StObject {
  
  /**
    * The list of items.
    */
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * The kind of item this is. For lists of object access control entries,
    * this is always storage#objectAccessControls.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaObjectAccessControls {
  
  inline def apply(): SchemaObjectAccessControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectAccessControls]
  }
  
  extension [Self <: SchemaObjectAccessControls](x: Self) {
    
    inline def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
