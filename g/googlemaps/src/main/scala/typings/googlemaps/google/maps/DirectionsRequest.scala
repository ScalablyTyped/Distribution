package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A directions query to be sent to the DirectionsService. */
@js.native
trait DirectionsRequest extends js.Object {
  /**
    * If true, instructs the Directions service to avoid ferries where
    * possible. Optional.
    */
  var avoidFerries: js.UndefOr[Boolean] = js.native
  /**
    * If true, instructs the Directions service to avoid highways where
    * possible. Optional.
    */
  var avoidHighways: js.UndefOr[Boolean] = js.native
  /**
    * If true, instructs the Directions service to avoid toll roads where
    * possible. Optional.
    */
  var avoidTolls: js.UndefOr[Boolean] = js.native
  /**
    * Location of destination. This can be specified as either a string to be
    * geocoded, or a LatLng, or a Place. Required.
    */
  var destination: js.UndefOr[String | LatLng | LatLngLiteral | Place] = js.native
  /**
    * Settings that apply only to requests where travelMode is DRIVING. This
    * object will have no effect for other travel modes.
    */
  var drivingOptions: js.UndefOr[DrivingOptions] = js.native
  /** Deprecated. Use drivingOptions field instead */
  var durationInTraffic: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the DirectionService will attempt to re-order the
    * supplied intermediate waypoints to minimize overall cost of the route. If
    * waypoints are optimized, inspect DirectionsRoute.waypoint_order in the
    * response to determine the new ordering.
    */
  var optimizeWaypoints: js.UndefOr[Boolean] = js.native
  /**
    * Location of origin. This can be specified as either a string to be
    * geocoded, or a LatLng, or a Place. Required.
    */
  var origin: js.UndefOr[String | LatLng | LatLngLiteral | Place] = js.native
  /** Whether or not route alternatives should be provided. Optional. */
  var provideRouteAlternatives: js.UndefOr[Boolean] = js.native
  /** Region code used as a bias for geocoding requests. Optional. */
  var region: js.UndefOr[String] = js.native
  /**
    * Settings that apply only to requests where travelMode is TRANSIT. This
    * object will have no effect for other travel modes.
    */
  var transitOptions: js.UndefOr[TransitOptions] = js.native
  /** Type of routing requested. Required. */
  var travelMode: js.UndefOr[TravelMode] = js.native
  /**
    * Preferred unit system to use when displaying distance. Defaults to the
    * unit system used in the country of origin.
    */
  var unitSystem: js.UndefOr[UnitSystem] = js.native
  /**
    * Array of intermediate waypoints. Directions will be calculated from the
    * origin to the destination by way of each waypoint in this array. The
    * maximum allowed waypoints is 8, plus the origin, and destination. Premium
    * Plan customers are allowed 23 waypoints, plus the origin, and
    * destination. Waypoints are not supported for transit directions.
    * Optional.
    */
  var waypoints: js.UndefOr[js.Array[DirectionsWaypoint]] = js.native
}

object DirectionsRequest {
  @scala.inline
  def apply(): DirectionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsRequest]
  }
  @scala.inline
  implicit class DirectionsRequestOps[Self <: DirectionsRequest] (val x: Self) extends AnyVal {
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
    def setDestination(value: String | LatLng | LatLngLiteral | Place): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setDrivingOptions(value: DrivingOptions): Self = this.set("drivingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrivingOptions: Self = this.set("drivingOptions", js.undefined)
    @scala.inline
    def setDurationInTraffic(value: Boolean): Self = this.set("durationInTraffic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationInTraffic: Self = this.set("durationInTraffic", js.undefined)
    @scala.inline
    def setOptimizeWaypoints(value: Boolean): Self = this.set("optimizeWaypoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimizeWaypoints: Self = this.set("optimizeWaypoints", js.undefined)
    @scala.inline
    def setOrigin(value: String | LatLng | LatLngLiteral | Place): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setProvideRouteAlternatives(value: Boolean): Self = this.set("provideRouteAlternatives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvideRouteAlternatives: Self = this.set("provideRouteAlternatives", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setTransitOptions(value: TransitOptions): Self = this.set("transitOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitOptions: Self = this.set("transitOptions", js.undefined)
    @scala.inline
    def setTravelMode(value: TravelMode): Self = this.set("travelMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTravelMode: Self = this.set("travelMode", js.undefined)
    @scala.inline
    def setUnitSystem(value: UnitSystem): Self = this.set("unitSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitSystem: Self = this.set("unitSystem", js.undefined)
    @scala.inline
    def setWaypointsVarargs(value: DirectionsWaypoint*): Self = this.set("waypoints", js.Array(value :_*))
    @scala.inline
    def setWaypoints(value: js.Array[DirectionsWaypoint]): Self = this.set("waypoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaypoints: Self = this.set("waypoints", js.undefined)
  }
  
}

