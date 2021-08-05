package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A pair Property / Value.
  */
trait SchemaPropertyValue extends StObject {
  
  /**
    * A property.
    */
  var property: js.UndefOr[String] = js.undefined
  
  /**
    * The property&#39;s value.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaPropertyValue {
  
  inline def apply(): SchemaPropertyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPropertyValue]
  }
  
  extension [Self <: SchemaPropertyValue](x: Self) {
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
