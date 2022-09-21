package typings.googleapis.tpuV2alpha1Mod.tpuV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGuestAttributesValue extends StObject {
  
  /**
    * The list of guest attributes entries.
    */
  var items: js.UndefOr[js.Array[SchemaGuestAttributesEntry]] = js.undefined
}
object SchemaGuestAttributesValue {
  
  inline def apply(): SchemaGuestAttributesValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuestAttributesValue]
  }
  
  extension [Self <: SchemaGuestAttributesValue](x: Self) {
    
    inline def setItems(value: js.Array[SchemaGuestAttributesEntry]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaGuestAttributesEntry*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
