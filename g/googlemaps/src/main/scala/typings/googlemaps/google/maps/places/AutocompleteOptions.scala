package typings.googlemaps.google.maps.places

import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.LatLngBoundsLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutocompleteOptions extends StObject {
  
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  
  var componentRestrictions: js.UndefOr[ComponentRestrictions] = js.undefined
  
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  
  var placeIdOnly: js.UndefOr[Boolean] = js.undefined
  
  var strictBounds: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var types: js.UndefOr[js.Array[String]] = js.undefined
}
object AutocompleteOptions {
  
  inline def apply(): AutocompleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteOptions]
  }
  
  extension [Self <: AutocompleteOptions](x: Self) {
    
    inline def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setComponentRestrictions(value: ComponentRestrictions): Self = StObject.set(x, "componentRestrictions", value.asInstanceOf[js.Any])
    
    inline def setComponentRestrictionsUndefined: Self = StObject.set(x, "componentRestrictions", js.undefined)
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setPlaceIdOnly(value: Boolean): Self = StObject.set(x, "placeIdOnly", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdOnlyUndefined: Self = StObject.set(x, "placeIdOnly", js.undefined)
    
    inline def setStrictBounds(value: Boolean): Self = StObject.set(x, "strictBounds", value.asInstanceOf[js.Any])
    
    inline def setStrictBoundsUndefined: Self = StObject.set(x, "strictBounds", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
