package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLabeledItem extends StObject {
  
  /**
    * Internal id associated with the item.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display string as entered by user.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaLabeledItem {
  
  inline def apply(): SchemaLabeledItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLabeledItem]
  }
  
  extension [Self <: SchemaLabeledItem](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
