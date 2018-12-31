package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutingControlOptions extends ItineraryOptions {
  var altLineOptions: js.UndefOr[LineOptions] = js.undefined
  var autoRoute: js.UndefOr[scala.Boolean] = js.undefined
   // IGeocorder is from other library;
  var fitSelectedRoutes: js.UndefOr[
    leafletDashRoutingDashMachineLib.leafletDashRoutingDashMachineLibStrings.smart | scala.Boolean
  ] = js.undefined
  var geocoder: js.UndefOr[js.Any] = js.undefined
  var lineOptions: js.UndefOr[LineOptions] = js.undefined
  var plan: js.UndefOr[Plan] = js.undefined
  var routeDragInterval: js.UndefOr[scala.Double] = js.undefined
  var routeLine: js.UndefOr[js.Function2[/* route */ IRoute, /* options */ LineOptions, Line]] = js.undefined
  var routeWhileDragging: js.UndefOr[scala.Boolean] = js.undefined
  var router: js.UndefOr[IRouter] = js.undefined
  var showAlternatives: js.UndefOr[scala.Boolean] = js.undefined
  var useZoomParameter: js.UndefOr[scala.Boolean] = js.undefined
  var waypointMode: js.UndefOr[java.lang.String] = js.undefined
  var waypoints: js.UndefOr[js.Array[Waypoint] | js.Array[leafletLib.leafletMod.LatLng]] = js.undefined
}

