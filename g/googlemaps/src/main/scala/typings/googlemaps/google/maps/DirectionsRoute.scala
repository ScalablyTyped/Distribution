package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single route containing a set of legs in a DirectionsResult.
  * Note that though this object is "JSON-like," it is not strictly JSON,
  * as it directly and indirectly includes LatLng objects.
  */
@js.native
trait DirectionsRoute extends js.Object {
  
  /** The bounds for this route. */
  var bounds: LatLngBounds = js.native
  
  /** Copyrights text to be displayed for this route. */
  var copyrights: String = js.native
  
  /**
    * The total fare for the whole transit trip. Only applicable to transit
    * requests.
    */
  var fare: TransitFare = js.native
  
  /**
    * An array of DirectionsLegs, each of which contains information about the
    * steps of which it is composed. There will be one leg for each stopover
    * waypoint or destination specified. So a route with no stopover waypoints
    * will contain one DirectionsLeg and a route with one stopover waypoint
    * will contain two.
    */
  var legs: js.Array[DirectionsLeg] = js.native
  
  /**
    * An array of LatLngs representing the entire course of this route. The
    * path is simplified in order to make it suitable in contexts where a small
    * number of vertices is required (such as Static Maps API URLs).
    */
  var overview_path: js.Array[LatLng] = js.native
  
  /**
    * An encoded polyline representation of the route in overview_path.
    * This polyline is an approximate (smoothed) path of the resulting
    * directions.
    */
  var overview_polyline: String = js.native
  
  /** Warnings to be displayed when showing these directions. */
  var warnings: js.Array[String] = js.native
  
  /**
    * If optimizeWaypoints was set to true, this field will contain the
    * re-ordered permutation of the input waypoints. For example, if the input
    * was: Origin: Los Angeles Waypoints: Dallas, Bangor, Phoenix Destination:
    * New York and the optimized output was ordered as follows: Origin: Los
    * Angeles Waypoints: Phoenix, Dallas, Bangor Destination: New York then
    * this field will be an Array containing the values [2, 0, 1]. Note that
    * the numbering of waypoints is zero-based. If any of the input waypoints
    * has stopover set to false, this field will be empty, since route
    * optimization is not available for such queries.
    */
  var waypoint_order: js.Array[Double] = js.native
}
object DirectionsRoute {
  
  @scala.inline
  def apply(
    bounds: LatLngBounds,
    copyrights: String,
    fare: TransitFare,
    legs: js.Array[DirectionsLeg],
    overview_path: js.Array[LatLng],
    overview_polyline: String,
    warnings: js.Array[String],
    waypoint_order: js.Array[Double]
  ): DirectionsRoute = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], copyrights = copyrights.asInstanceOf[js.Any], fare = fare.asInstanceOf[js.Any], legs = legs.asInstanceOf[js.Any], overview_path = overview_path.asInstanceOf[js.Any], overview_polyline = overview_polyline.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any], waypoint_order = waypoint_order.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsRoute]
  }
  
  @scala.inline
  implicit class DirectionsRouteOps[Self <: DirectionsRoute] (val x: Self) extends AnyVal {
    
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
    def setBounds(value: LatLngBounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrights(value: String): Self = this.set("copyrights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFare(value: TransitFare): Self = this.set("fare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegsVarargs(value: DirectionsLeg*): Self = this.set("legs", js.Array(value :_*))
    
    @scala.inline
    def setLegs(value: js.Array[DirectionsLeg]): Self = this.set("legs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverview_pathVarargs(value: LatLng*): Self = this.set("overview_path", js.Array(value :_*))
    
    @scala.inline
    def setOverview_path(value: js.Array[LatLng]): Self = this.set("overview_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverview_polyline(value: String): Self = this.set("overview_polyline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = this.set("warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypoint_orderVarargs(value: Double*): Self = this.set("waypoint_order", js.Array(value :_*))
    
    @scala.inline
    def setWaypoint_order(value: js.Array[Double]): Self = this.set("waypoint_order", value.asInstanceOf[js.Any])
  }
}
