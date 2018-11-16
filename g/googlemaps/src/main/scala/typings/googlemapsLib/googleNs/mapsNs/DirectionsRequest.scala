package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DirectionsRequest extends js.Object {
  /**
       * If true, instructs the Directions service to avoid ferries where
       * possible. Optional.
       */
  var avoidFerries: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true, instructs the Directions service to avoid highways where
       * possible. Optional.
       */
  var avoidHighways: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true, instructs the Directions service to avoid toll roads where
       * possible. Optional.
       */
  var avoidTolls: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Location of destination. This can be specified as either a string to be
       * geocoded, or a LatLng, or a Place. Required.
       */
  var destination: js.UndefOr[java.lang.String | LatLng | LatLngLiteral | Place] = js.undefined
  /**
       * Settings that apply only to requests where travelMode is DRIVING. This
       * object will have no effect for other travel modes.
       */
  var drivingOptions: js.UndefOr[DrivingOptions] = js.undefined
  /** Deprecated. Use drivingOptions field instead */
  var durationInTraffic: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If set to true, the DirectionService will attempt to re-order the
       * supplied intermediate waypoints to minimize overall cost of the route. If
       * waypoints are optimized, inspect DirectionsRoute.waypoint_order in the
       * response to determine the new ordering.
       */
  var optimizeWaypoints: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Location of origin. This can be specified as either a string to be
       * geocoded, or a LatLng, or a Place. Required.
       */
  var origin: js.UndefOr[java.lang.String | LatLng | LatLngLiteral | Place] = js.undefined
  /** Whether or not route alternatives should be provided. Optional. */
  var provideRouteAlternatives: js.UndefOr[scala.Boolean] = js.undefined
  /** Region code used as a bias for geocoding requests. Optional. */
  var region: js.UndefOr[java.lang.String] = js.undefined
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

