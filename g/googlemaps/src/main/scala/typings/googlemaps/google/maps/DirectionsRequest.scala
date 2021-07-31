package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A directions query to be sent to the DirectionsService. */
trait DirectionsRequest extends StObject {
  
  /**
    * If true, instructs the Directions service to avoid ferries where
    * possible. Optional.
    */
  var avoidFerries: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, instructs the Directions service to avoid highways where
    * possible. Optional.
    */
  var avoidHighways: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, instructs the Directions service to avoid toll roads where
    * possible. Optional.
    */
  var avoidTolls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Location of destination. This can be specified as either a string to be
    * geocoded, or a LatLng, or a Place. Required.
    */
  var destination: js.UndefOr[String | LatLng | LatLngLiteral | Place] = js.undefined
  
  /**
    * Settings that apply only to requests where travelMode is DRIVING. This
    * object will have no effect for other travel modes.
    */
  var drivingOptions: js.UndefOr[DrivingOptions] = js.undefined
  
  /** Deprecated. Use drivingOptions field instead */
  var durationInTraffic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, the DirectionService will attempt to re-order the
    * supplied intermediate waypoints to minimize overall cost of the route. If
    * waypoints are optimized, inspect DirectionsRoute.waypoint_order in the
    * response to determine the new ordering.
    */
  var optimizeWaypoints: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Location of origin. This can be specified as either a string to be
    * geocoded, or a LatLng, or a Place. Required.
    */
  var origin: js.UndefOr[String | LatLng | LatLngLiteral | Place] = js.undefined
  
  /** Whether or not route alternatives should be provided. Optional. */
  var provideRouteAlternatives: js.UndefOr[Boolean] = js.undefined
  
  /** Region code used as a bias for geocoding requests. Optional. */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Settings that apply only to requests where travelMode is TRANSIT. This
    * object will have no effect for other travel modes.
    */
  var transitOptions: js.UndefOr[TransitOptions] = js.undefined
  
  /** Type of routing requested. Required. */
  var travelMode: js.UndefOr[TravelMode] = js.undefined
  
  /**
    * Preferred unit system to use when displaying distance. Defaults to the
    * unit system used in the country of origin.
    */
  var unitSystem: js.UndefOr[UnitSystem] = js.undefined
  
  /**
    * Array of intermediate waypoints. Directions will be calculated from the
    * origin to the destination by way of each waypoint in this array. The
    * maximum allowed waypoints is 8, plus the origin, and destination. Premium
    * Plan customers are allowed 23 waypoints, plus the origin, and
    * destination. Waypoints are not supported for transit directions.
    * Optional.
    */
  var waypoints: js.UndefOr[js.Array[DirectionsWaypoint]] = js.undefined
}
object DirectionsRequest {
  
  @scala.inline
  def apply(): DirectionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsRequest]
  }
  
  @scala.inline
  implicit class DirectionsRequestMutableBuilder[Self <: DirectionsRequest] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: String | LatLng | LatLngLiteral | Place): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setDrivingOptions(value: DrivingOptions): Self = StObject.set(x, "drivingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrivingOptionsUndefined: Self = StObject.set(x, "drivingOptions", js.undefined)
    
    @scala.inline
    def setDurationInTraffic(value: Boolean): Self = StObject.set(x, "durationInTraffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationInTrafficUndefined: Self = StObject.set(x, "durationInTraffic", js.undefined)
    
    @scala.inline
    def setOptimizeWaypoints(value: Boolean): Self = StObject.set(x, "optimizeWaypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeWaypointsUndefined: Self = StObject.set(x, "optimizeWaypoints", js.undefined)
    
    @scala.inline
    def setOrigin(value: String | LatLng | LatLngLiteral | Place): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setProvideRouteAlternatives(value: Boolean): Self = StObject.set(x, "provideRouteAlternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvideRouteAlternativesUndefined: Self = StObject.set(x, "provideRouteAlternatives", js.undefined)
    
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
    def setTravelModeUndefined: Self = StObject.set(x, "travelMode", js.undefined)
    
    @scala.inline
    def setUnitSystem(value: UnitSystem): Self = StObject.set(x, "unitSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitSystemUndefined: Self = StObject.set(x, "unitSystem", js.undefined)
    
    @scala.inline
    def setWaypoints(value: js.Array[DirectionsWaypoint]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypointsUndefined: Self = StObject.set(x, "waypoints", js.undefined)
    
    @scala.inline
    def setWaypointsVarargs(value: DirectionsWaypoint*): Self = StObject.set(x, "waypoints", js.Array(value :_*))
  }
}
