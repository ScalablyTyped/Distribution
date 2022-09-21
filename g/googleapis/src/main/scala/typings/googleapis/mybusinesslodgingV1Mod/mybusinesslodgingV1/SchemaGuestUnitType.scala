package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGuestUnitType extends StObject {
  
  /**
    * Required. Unit or room code identifiers for a single GuestUnitType. Each code must be unique within a Lodging instance.
    */
  var codes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Features and available amenities of the GuestUnitType.
    */
  var features: js.UndefOr[SchemaGuestUnitFeatures] = js.undefined
  
  /**
    * Required. Short, English label or name of the GuestUnitType. Target <50 chars.
    */
  var label: js.UndefOr[String | Null] = js.undefined
}
object SchemaGuestUnitType {
  
  inline def apply(): SchemaGuestUnitType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuestUnitType]
  }
  
  extension [Self <: SchemaGuestUnitType](x: Self) {
    
    inline def setCodes(value: js.Array[String]): Self = StObject.set(x, "codes", value.asInstanceOf[js.Any])
    
    inline def setCodesNull: Self = StObject.set(x, "codes", null)
    
    inline def setCodesUndefined: Self = StObject.set(x, "codes", js.undefined)
    
    inline def setCodesVarargs(value: String*): Self = StObject.set(x, "codes", js.Array(value*))
    
    inline def setFeatures(value: SchemaGuestUnitFeatures): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
