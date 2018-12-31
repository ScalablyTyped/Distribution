package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlanOptions extends js.Object {
  var addButtonClassName: js.UndefOr[java.lang.String] = js.undefined
   // IGeocoder
  var addWaypoints: js.UndefOr[scala.Boolean] = js.undefined
  var createGeocoder: js.UndefOr[
    js.Function3[
      /* waypointIndex */ scala.Double, 
      /* numberWaypoints */ scala.Double, 
      /* plan */ Plan, 
      js.Object
    ]
  ] = js.undefined
  var createMarker: js.UndefOr[
    js.Function3[
      /* waypointIndex */ scala.Double, 
      /* waypoint */ Waypoint, 
      /* numberWaypoints */ scala.Double, 
      leafletLib.leafletMod.Marker[_]
    ]
  ] = js.undefined
  var dragStyles: js.UndefOr[js.Array[leafletLib.leafletMod.PathOptions]] = js.undefined
  var draggableWaypoints: js.UndefOr[scala.Boolean] = js.undefined
  var geocoder: js.UndefOr[js.Any] = js.undefined
  var geocoderClass: js.UndefOr[
    js.Function2[/* waypointIndex */ scala.Double, /* numberWaypoints */ scala.Double, scala.Unit]
  ] = js.undefined
  var geocoderPlaceholder: js.UndefOr[
    js.Function2[
      /* waypointIndex */ scala.Double, 
      /* numberWaypoints */ scala.Double, 
      java.lang.String
    ]
  ] = js.undefined
  var geocodersClassName: js.UndefOr[java.lang.String] = js.undefined
  var maxGeocoderTolerance: js.UndefOr[scala.Double] = js.undefined
  var reverseWaypoints: js.UndefOr[scala.Boolean] = js.undefined
  var routeWhileDragging: js.UndefOr[scala.Boolean] = js.undefined
  var waypointNameFallback: js.UndefOr[js.Function1[/* latLng */ leafletLib.leafletMod.LatLng, java.lang.String]] = js.undefined
}

