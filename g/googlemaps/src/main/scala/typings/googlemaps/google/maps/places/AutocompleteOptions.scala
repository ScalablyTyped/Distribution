package typings.googlemaps.google.maps.places

import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.LatLngBoundsLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutocompleteOptions extends StObject {
  
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.native
  
  var componentRestrictions: js.UndefOr[ComponentRestrictions] = js.native
  
  var fields: js.UndefOr[js.Array[String]] = js.native
  
  var placeIdOnly: js.UndefOr[Boolean] = js.native
  
  var strictBounds: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var types: js.UndefOr[js.Array[String]] = js.native
}
object AutocompleteOptions {
  
  @scala.inline
  def apply(): AutocompleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteOptions]
  }
  
  @scala.inline
  implicit class AutocompleteOptionsMutableBuilder[Self <: AutocompleteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setComponentRestrictions(value: ComponentRestrictions): Self = StObject.set(x, "componentRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRestrictionsUndefined: Self = StObject.set(x, "componentRestrictions", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setPlaceIdOnly(value: Boolean): Self = StObject.set(x, "placeIdOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceIdOnlyUndefined: Self = StObject.set(x, "placeIdOnly", js.undefined)
    
    @scala.inline
    def setStrictBounds(value: Boolean): Self = StObject.set(x, "strictBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictBoundsUndefined: Self = StObject.set(x, "strictBounds", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
