package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p2beta1Property extends StObject {
  
  /**
    * Name of the property.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value of numeric properties.
    */
  var uint64Value: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value of the property.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1Property {
  
  inline def apply(): SchemaGoogleCloudVisionV1p2beta1Property = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1Property]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p2beta1Property](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUint64Value(value: String): Self = StObject.set(x, "uint64Value", value.asInstanceOf[js.Any])
    
    inline def setUint64ValueNull: Self = StObject.set(x, "uint64Value", null)
    
    inline def setUint64ValueUndefined: Self = StObject.set(x, "uint64Value", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
