package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPropertyOrder extends StObject {
  
  /**
    * The direction to order by. Defaults to `ASCENDING`.
    */
  var direction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The property to order by.
    */
  var property: js.UndefOr[SchemaPropertyReference] = js.undefined
}
object SchemaPropertyOrder {
  
  inline def apply(): SchemaPropertyOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPropertyOrder]
  }
  
  extension [Self <: SchemaPropertyOrder](x: Self) {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionNull: Self = StObject.set(x, "direction", null)
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setProperty(value: SchemaPropertyReference): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
  }
}
