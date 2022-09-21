package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPropertyValue extends StObject {
  
  /**
    * A property.
    */
  var property: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The property's value.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaPropertyValue {
  
  inline def apply(): SchemaPropertyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPropertyValue]
  }
  
  extension [Self <: SchemaPropertyValue](x: Self) {
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyNull: Self = StObject.set(x, "property", null)
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
