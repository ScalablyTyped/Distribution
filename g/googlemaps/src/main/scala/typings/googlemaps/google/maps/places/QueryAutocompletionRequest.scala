package typings.googlemaps.google.maps.places

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.LatLngBoundsLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAutocompletionRequest extends StObject {
  
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  
  var input: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[LatLng] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
}
object QueryAutocompletionRequest {
  
  @scala.inline
  def apply(): QueryAutocompletionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryAutocompletionRequest]
  }
  
  @scala.inline
  implicit class QueryAutocompletionRequestMutableBuilder[Self <: QueryAutocompletionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
