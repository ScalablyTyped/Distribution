package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A distance matrix query sent by the {@link DistanceMatrixService} containing arrays of origin and destination
  * locations, and various options for computing metrics.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest Maps JavaScript API}
  */
trait DistanceMatrixRequest extends StObject {
  
  /**
    * If true, instructs the Distance Matrix service to avoid ferries where possible.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest.avoidFerries Maps JavaScript API}
    */
  var avoidFerries: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, instructs the Distance Matrix service to avoid highways where possible.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest.avoidHighways Maps JavaScript API}
    */
  var avoidHighways: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, instructs the Distance Matrix service to avoid toll roads where possible.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest.avoidTolls Maps JavaScript API}
    */
  var avoidTolls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array containing destination address strings, or {@link LatLng}, or {@link Place} objects, to which to
    * calculate distance and time.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest.destinations Maps JavaScript API}
    */
  var destinations: js.Array[String | LatLng | LatLngLiteral | Place]
  
  /**
    * Settings that apply only to requests where {@link travelMode} is {@link TravelMode.DRIVING DRIVING}. This
    * object will have no effect for other travel modes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest.drivingOptions Maps JavaScript API}
    */
  var drivingOptions: js.UndefOr[DrivingOptions] = js.undefined
  
  /**
    * An array containing origin address strings, or {@link LatLng}, or {@link Place} objects, from which to
    * calculate distance and time.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest.origins Maps JavaScript API}
    */
  var origins: js.Array[String | LatLng | LatLngLiteral | Place]
  
  /**
    * Region code used as a bias for geocoding requests.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest.region Maps JavaScript API}
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Settings that apply only to requests where {@link travelMode} is {@link TravelMode.TRANSIT TRANSIT}. This
    * object will have no effect for other travel modes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest.transitOptions Maps JavaScript API}
    */
  var transitOptions: js.UndefOr[TransitOptions] = js.undefined
  
  /**
    * Type of routing requested.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest.travelMode Maps JavaScript API}
    */
  var travelMode: TravelMode
  
  /**
    * Preferred unit system to use when displaying distance.
    * @default UnitSystem.METRIC
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest.unitSystem Maps JavaScript API}
    */
  var unitSystem: js.UndefOr[UnitSystem] = js.undefined
}
object DistanceMatrixRequest {
  
  @scala.inline
  def apply(
    destinations: js.Array[String | LatLng | LatLngLiteral | Place],
    origins: js.Array[String | LatLng | LatLngLiteral | Place],
    travelMode: TravelMode
  ): DistanceMatrixRequest = {
    val __obj = js.Dynamic.literal(destinations = destinations.asInstanceOf[js.Any], origins = origins.asInstanceOf[js.Any], travelMode = travelMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMatrixRequest]
  }
  
  @scala.inline
  implicit class DistanceMatrixRequestMutableBuilder[Self <: DistanceMatrixRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvoidFerries(value: Boolean): Self = StObject.set(x, "avoidFerries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvoidFerriesUndefined: Self = StObject.set(x, "avoidFerries", js.undefined)
    
    @scala.inline
    def setAvoidHighways(value: Boolean): Self = StObject.set(x, "avoidHighways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvoidHighwaysUndefined: Self = StObject.set(x, "avoidHighways", js.undefined)
    
    @scala.inline
    def setAvoidTolls(value: Boolean): Self = StObject.set(x, "avoidTolls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvoidTollsUndefined: Self = StObject.set(x, "avoidTolls", js.undefined)
    
    @scala.inline
    def setDestinations(value: js.Array[String | LatLng | LatLngLiteral | Place]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsVarargs(value: (String | LatLng | LatLngLiteral | Place)*): Self = StObject.set(x, "destinations", js.Array(value :_*))
    
    @scala.inline
    def setDrivingOptions(value: DrivingOptions): Self = StObject.set(x, "drivingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrivingOptionsUndefined: Self = StObject.set(x, "drivingOptions", js.undefined)
    
    @scala.inline
    def setOrigins(value: js.Array[String | LatLng | LatLngLiteral | Place]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginsVarargs(value: (String | LatLng | LatLngLiteral | Place)*): Self = StObject.set(x, "origins", js.Array(value :_*))
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setTransitOptions(value: TransitOptions): Self = StObject.set(x, "transitOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitOptionsUndefined: Self = StObject.set(x, "transitOptions", js.undefined)
    
    @scala.inline
    def setTravelMode(value: TravelMode): Self = StObject.set(x, "travelMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitSystem(value: UnitSystem): Self = StObject.set(x, "unitSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitSystemUndefined: Self = StObject.set(x, "unitSystem", js.undefined)
  }
}
