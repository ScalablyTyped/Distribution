package typings.googlemaps.google.maps.places

import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.LatLngBoundsLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchBoxOptions extends StObject {
  
  var bounds: LatLngBounds | LatLngBoundsLiteral
}
object SearchBoxOptions {
  
  @scala.inline
  def apply(bounds: LatLngBounds | LatLngBoundsLiteral): SearchBoxOptions = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBoxOptions]
  }
  
  @scala.inline
  implicit class SearchBoxOptionsMutableBuilder[Self <: SearchBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
  }
}
