package typings.leafletRoutingMachine.mod.Routing_

import typings.leaflet.mod.LatLng_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocoderElementOptions extends StObject {
  
  var autocompleteOptions: js.UndefOr[js.Object] = js.native
  
  var createGeocoder: js.UndefOr[js.Function3[/* i */ Double, /* nWps */ Double, /* options */ this.type, _]] = js.native
  
  var geocoderClass: js.UndefOr[js.Function0[String]] = js.native
  
  var geocoderPlaceholder: js.UndefOr[
    js.Function3[
      /* i */ Double, 
      /* numberWaypoints */ Double, 
      /* geocoderElement */ GeocoderElement_, 
      String
    ]
  ] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var maxGeocoderTolerance: js.UndefOr[Double] = js.native
  
  var waypointNameFallback: js.UndefOr[js.Function1[/* latLng */ LatLng_, String]] = js.native
}
object GeocoderElementOptions {
  
  @scala.inline
  def apply(): GeocoderElementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderElementOptions]
  }
  
  @scala.inline
  implicit class GeocoderElementOptionsMutableBuilder[Self <: GeocoderElementOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutocompleteOptions(value: js.Object): Self = StObject.set(x, "autocompleteOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutocompleteOptionsUndefined: Self = StObject.set(x, "autocompleteOptions", js.undefined)
    
    @scala.inline
    def setCreateGeocoder(value: (/* i */ Double, /* nWps */ Double, GeocoderElementOptions) => _): Self = StObject.set(x, "createGeocoder", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreateGeocoderUndefined: Self = StObject.set(x, "createGeocoder", js.undefined)
    
    @scala.inline
    def setGeocoderClass(value: () => String): Self = StObject.set(x, "geocoderClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGeocoderClassUndefined: Self = StObject.set(x, "geocoderClass", js.undefined)
    
    @scala.inline
    def setGeocoderPlaceholder(
      value: (/* i */ Double, /* numberWaypoints */ Double, /* geocoderElement */ GeocoderElement_) => String
    ): Self = StObject.set(x, "geocoderPlaceholder", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGeocoderPlaceholderUndefined: Self = StObject.set(x, "geocoderPlaceholder", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setMaxGeocoderTolerance(value: Double): Self = StObject.set(x, "maxGeocoderTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxGeocoderToleranceUndefined: Self = StObject.set(x, "maxGeocoderTolerance", js.undefined)
    
    @scala.inline
    def setWaypointNameFallback(value: /* latLng */ LatLng_ => String): Self = StObject.set(x, "waypointNameFallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWaypointNameFallbackUndefined: Self = StObject.set(x, "waypointNameFallback", js.undefined)
  }
}
