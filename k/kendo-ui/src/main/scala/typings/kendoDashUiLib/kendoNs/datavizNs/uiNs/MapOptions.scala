package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MapOptions extends js.Object {
  var beforeReset: js.UndefOr[js.Function1[/* e */ MapBeforeResetEvent, scala.Unit]] = js.undefined
  var center: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.datavizNs.mapNs.Location] = js.undefined
  var click: js.UndefOr[js.Function1[/* e */ MapClickEvent, scala.Unit]] = js.undefined
  var controls: js.UndefOr[MapControls] = js.undefined
  var layerDefaults: js.UndefOr[MapLayerDefaults] = js.undefined
  var layers: js.UndefOr[js.Array[MapLayer]] = js.undefined
  var markerActivate: js.UndefOr[js.Function1[/* e */ MapMarkerActivateEvent, scala.Unit]] = js.undefined
  var markerClick: js.UndefOr[js.Function1[/* e */ MapMarkerClickEvent, scala.Unit]] = js.undefined
  var markerCreated: js.UndefOr[js.Function1[/* e */ MapMarkerCreatedEvent, scala.Unit]] = js.undefined
  var markerDefaults: js.UndefOr[MapMarkerDefaults] = js.undefined
  var markers: js.UndefOr[js.Array[MapMarker]] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minSize: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pan: js.UndefOr[js.Function1[/* e */ MapPanEvent, scala.Unit]] = js.undefined
  var panEnd: js.UndefOr[js.Function1[/* e */ MapPanEndEvent, scala.Unit]] = js.undefined
  var pannable: js.UndefOr[scala.Boolean] = js.undefined
  var reset: js.UndefOr[js.Function1[/* e */ MapResetEvent, scala.Unit]] = js.undefined
  var shapeClick: js.UndefOr[js.Function1[/* e */ MapShapeClickEvent, scala.Unit]] = js.undefined
  var shapeCreated: js.UndefOr[js.Function1[/* e */ MapShapeCreatedEvent, scala.Unit]] = js.undefined
  var shapeFeatureCreated: js.UndefOr[js.Function1[/* e */ MapShapeFeatureCreatedEvent, scala.Unit]] = js.undefined
  var shapeMouseEnter: js.UndefOr[js.Function1[/* e */ MapShapeMouseEnterEvent, scala.Unit]] = js.undefined
  var shapeMouseLeave: js.UndefOr[js.Function1[/* e */ MapShapeMouseLeaveEvent, scala.Unit]] = js.undefined
  var wraparound: js.UndefOr[scala.Boolean] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
  var zoomEnd: js.UndefOr[js.Function1[/* e */ MapZoomEndEvent, scala.Unit]] = js.undefined
  var zoomStart: js.UndefOr[js.Function1[/* e */ MapZoomStartEvent, scala.Unit]] = js.undefined
  var zoomable: js.UndefOr[scala.Boolean] = js.undefined
}

