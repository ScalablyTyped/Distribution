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

object PlanOptions {
  @scala.inline
  def apply(
    addButtonClassName: java.lang.String = null,
    addWaypoints: js.UndefOr[scala.Boolean] = js.undefined,
    createGeocoder: js.Function3[
      /* waypointIndex */ scala.Double, 
      /* numberWaypoints */ scala.Double, 
      /* plan */ Plan, 
      js.Object
    ] = null,
    createMarker: js.Function3[
      /* waypointIndex */ scala.Double, 
      /* waypoint */ Waypoint, 
      /* numberWaypoints */ scala.Double, 
      leafletLib.leafletMod.Marker[_]
    ] = null,
    dragStyles: js.Array[leafletLib.leafletMod.PathOptions] = null,
    draggableWaypoints: js.UndefOr[scala.Boolean] = js.undefined,
    geocoder: js.Any = null,
    geocoderClass: js.Function2[/* waypointIndex */ scala.Double, /* numberWaypoints */ scala.Double, scala.Unit] = null,
    geocoderPlaceholder: js.Function2[
      /* waypointIndex */ scala.Double, 
      /* numberWaypoints */ scala.Double, 
      java.lang.String
    ] = null,
    geocodersClassName: java.lang.String = null,
    maxGeocoderTolerance: scala.Int | scala.Double = null,
    reverseWaypoints: js.UndefOr[scala.Boolean] = js.undefined,
    routeWhileDragging: js.UndefOr[scala.Boolean] = js.undefined,
    waypointNameFallback: js.Function1[/* latLng */ leafletLib.leafletMod.LatLng, java.lang.String] = null
  ): PlanOptions = {
    val __obj = js.Dynamic.literal()
    if (addButtonClassName != null) __obj.updateDynamic("addButtonClassName")(addButtonClassName)
    if (!js.isUndefined(addWaypoints)) __obj.updateDynamic("addWaypoints")(addWaypoints)
    if (createGeocoder != null) __obj.updateDynamic("createGeocoder")(createGeocoder)
    if (createMarker != null) __obj.updateDynamic("createMarker")(createMarker)
    if (dragStyles != null) __obj.updateDynamic("dragStyles")(dragStyles)
    if (!js.isUndefined(draggableWaypoints)) __obj.updateDynamic("draggableWaypoints")(draggableWaypoints)
    if (geocoder != null) __obj.updateDynamic("geocoder")(geocoder)
    if (geocoderClass != null) __obj.updateDynamic("geocoderClass")(geocoderClass)
    if (geocoderPlaceholder != null) __obj.updateDynamic("geocoderPlaceholder")(geocoderPlaceholder)
    if (geocodersClassName != null) __obj.updateDynamic("geocodersClassName")(geocodersClassName)
    if (maxGeocoderTolerance != null) __obj.updateDynamic("maxGeocoderTolerance")(maxGeocoderTolerance.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseWaypoints)) __obj.updateDynamic("reverseWaypoints")(reverseWaypoints)
    if (!js.isUndefined(routeWhileDragging)) __obj.updateDynamic("routeWhileDragging")(routeWhileDragging)
    if (waypointNameFallback != null) __obj.updateDynamic("waypointNameFallback")(waypointNameFallback)
    __obj.asInstanceOf[PlanOptions]
  }
}

