package typings.googlemaps.google.maps.places

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.LatLngBoundsLiteral
import typings.googlemaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutocompletionRequest extends StObject {
  
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  
  var componentRestrictions: js.UndefOr[ComponentRestrictions] = js.undefined
  
  var input: String
  
  var location: js.UndefOr[LatLng] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * The location where {@link AutocompletePrediction#distance_meters} is calculated from.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/places-autocomplete-service#AutocompletionRequest.origin Maps JavaScript API}
    */
  var origin: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var sessionToken: js.UndefOr[AutocompleteSessionToken] = js.undefined
  
  var types: js.UndefOr[js.Array[String]] = js.undefined
}
object AutocompletionRequest {
  
  @scala.inline
  def apply(input: String): AutocompletionRequest = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompletionRequest]
  }
  
  @scala.inline
  implicit class AutocompletionRequestMutableBuilder[Self <: AutocompletionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setComponentRestrictions(value: ComponentRestrictions): Self = StObject.set(x, "componentRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentRestrictionsUndefined: Self = StObject.set(x, "componentRestrictions", js.undefined)
    
    @scala.inline
    def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOrigin(value: LatLng | LatLngLiteral): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setSessionToken(value: AutocompleteSessionToken): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
