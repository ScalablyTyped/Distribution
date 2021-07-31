package typings.googleapis.storageV1Mod.storageV1

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
  var items: js.UndefOr[js.Array[SchemaObjectAccessControl]] = js.undefined
  
  /**
    * The kind of item this is. For lists of object access control entries,
    * this is always storage#objectAccessControls.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaObjectAccessControls {
  
  @scala.inline
  def apply(): SchemaObjectAccessControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectAccessControls]
  }
  
  @scala.inline
  implicit class SchemaObjectAccessControlsMutableBuilder[Self <: SchemaObjectAccessControls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaObjectAccessControl]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaObjectAccessControl*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
