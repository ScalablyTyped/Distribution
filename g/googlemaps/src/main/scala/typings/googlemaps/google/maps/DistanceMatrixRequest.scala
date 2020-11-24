package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A distance matrix query sent by the {@link DistanceMatrixService} containing arrays of origin and destination
  * locations, and various options for computing metrics.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest Maps JavaScript API}
  */
@js.native
trait DistanceMatrixRequest extends js.Object {
  
  /**
    * If true, instructs the Distance Matrix service to avoid ferries where possible.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest.avoidFerries Maps JavaScript API}
    */
  var avoidFerries: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, instructs the Distance Matrix service to avoid highways where possible.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest.avoidHighways Maps JavaScript API}
    */
  var avoidHighways: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, instructs the Distance Matrix service to avoid toll roads where possible.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest.avoidTolls Maps JavaScript API}
    */
  var avoidTolls: js.UndefOr[Boolean] = js.native
  
  /**
    * An array containing destination address strings, or {@link LatLng}, or {@link Place} objects, to which to
    * calculate distance and time.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest.destinations Maps JavaScript API}
    */
  var destinations: js.Array[String | LatLng | LatLngLiteral | Place] = js.native
  
  /**
    * Settings that apply only to requests where {@link travelMode} is {@link TravelMode.DRIVING DRIVING}. This
    * object will have no effect for other travel modes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest.drivingOptions Maps JavaScript API}
    */
  var drivingOptions: js.UndefOr[DrivingOptions] = js.native
  
  /**
    * An array containing origin address strings, or {@link LatLng}, or {@link Place} objects, from which to
    * calculate distance and time.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest.origins Maps JavaScript API}
    */
  var origins: js.Array[String | LatLng | LatLngLiteral | Place] = js.native
  
  /**
    * Region code used as a bias for geocoding requests.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest.region Maps JavaScript API}
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * Settings that apply only to requests where {@link travelMode} is {@link TravelMode.TRANSIT TRANSIT}. This
    * object will have no effect for other travel modes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest.transitOptions Maps JavaScript API}
    */
  var transitOptions: js.UndefOr[TransitOptions] = js.native
  
  /**
    * Type of routing requested.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest.travelMode Maps JavaScript API}
    */
  var travelMode: TravelMode = js.native
  
  /**
    * Preferred unit system to use when displaying distance.
    * @default UnitSystem.METRIC
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixRequest.unitSystem Maps JavaScript API}
    */
  var unitSystem: js.UndefOr[UnitSystem] = js.native
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
  implicit class DistanceMatrixRequestOps[Self <: DistanceMatrixRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestinationsVarargs(value: (String | LatLng | LatLngLiteral | Place)*): Self = this.set("destinations", js.Array(value :_*))
    
    @scala.inline
    def setDestinations(value: js.Array[String | LatLng | LatLngLiteral | Place]): Self = this.set("destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginsVarargs(value: (String | LatLng | LatLngLiteral | Place)*): Self = this.set("origins", js.Array(value :_*))
    
    @scala.inline
    def setOrigins(value: js.Array[String | LatLng | LatLngLiteral | Place]): Self = this.set("origins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTravelMode(value: TravelMode): Self = this.set("travelMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvoidFerries(value: Boolean): Self = this.set("avoidFerries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoidFerries: Self = this.set("avoidFerries", js.undefined)
    
    @scala.inline
    def setAvoidHighways(value: Boolean): Self = this.set("avoidHighways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoidHighways: Self = this.set("avoidHighways", js.undefined)
    
    @scala.inline
    def setAvoidTolls(value: Boolean): Self = this.set("avoidTolls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoidTolls: Self = this.set("avoidTolls", js.undefined)
    
    @scala.inline
    def setDrivingOptions(value: DrivingOptions): Self = this.set("drivingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrivingOptions: Self = this.set("drivingOptions", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setTransitOptions(value: TransitOptions): Self = this.set("transitOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitOptions: Self = this.set("transitOptions", js.undefined)
    
    @scala.inline
    def setUnitSystem(value: UnitSystem): Self = this.set("unitSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitSystem: Self = this.set("unitSystem", js.undefined)
  }
}
