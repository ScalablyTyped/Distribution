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

object MapOptions {
  @scala.inline
  def apply(
    beforeReset: /* e */ MapBeforeResetEvent => scala.Unit = null,
    center: js.Any | kendoDashUiLib.kendoNs.datavizNs.mapNs.Location = null,
    click: /* e */ MapClickEvent => scala.Unit = null,
    controls: MapControls = null,
    layerDefaults: MapLayerDefaults = null,
    layers: js.Array[MapLayer] = null,
    markerActivate: /* e */ MapMarkerActivateEvent => scala.Unit = null,
    markerClick: /* e */ MapMarkerClickEvent => scala.Unit = null,
    markerCreated: /* e */ MapMarkerCreatedEvent => scala.Unit = null,
    markerDefaults: MapMarkerDefaults = null,
    markers: js.Array[MapMarker] = null,
    maxZoom: scala.Int | scala.Double = null,
    minSize: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    pan: /* e */ MapPanEvent => scala.Unit = null,
    panEnd: /* e */ MapPanEndEvent => scala.Unit = null,
    pannable: js.UndefOr[scala.Boolean] = js.undefined,
    reset: /* e */ MapResetEvent => scala.Unit = null,
    shapeClick: /* e */ MapShapeClickEvent => scala.Unit = null,
    shapeCreated: /* e */ MapShapeCreatedEvent => scala.Unit = null,
    shapeFeatureCreated: /* e */ MapShapeFeatureCreatedEvent => scala.Unit = null,
    shapeMouseEnter: /* e */ MapShapeMouseEnterEvent => scala.Unit = null,
    shapeMouseLeave: /* e */ MapShapeMouseLeaveEvent => scala.Unit = null,
    wraparound: js.UndefOr[scala.Boolean] = js.undefined,
    zoom: scala.Int | scala.Double = null,
    zoomEnd: /* e */ MapZoomEndEvent => scala.Unit = null,
    zoomStart: /* e */ MapZoomStartEvent => scala.Unit = null,
    zoomable: js.UndefOr[scala.Boolean] = js.undefined
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeReset != null) __obj.updateDynamic("beforeReset")(js.Any.fromFunction1(beforeReset))
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (controls != null) __obj.updateDynamic("controls")(controls)
    if (layerDefaults != null) __obj.updateDynamic("layerDefaults")(layerDefaults)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (markerActivate != null) __obj.updateDynamic("markerActivate")(js.Any.fromFunction1(markerActivate))
    if (markerClick != null) __obj.updateDynamic("markerClick")(js.Any.fromFunction1(markerClick))
    if (markerCreated != null) __obj.updateDynamic("markerCreated")(js.Any.fromFunction1(markerCreated))
    if (markerDefaults != null) __obj.updateDynamic("markerDefaults")(markerDefaults)
    if (markers != null) __obj.updateDynamic("markers")(markers)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (pan != null) __obj.updateDynamic("pan")(js.Any.fromFunction1(pan))
    if (panEnd != null) __obj.updateDynamic("panEnd")(js.Any.fromFunction1(panEnd))
    if (!js.isUndefined(pannable)) __obj.updateDynamic("pannable")(pannable)
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction1(reset))
    if (shapeClick != null) __obj.updateDynamic("shapeClick")(js.Any.fromFunction1(shapeClick))
    if (shapeCreated != null) __obj.updateDynamic("shapeCreated")(js.Any.fromFunction1(shapeCreated))
    if (shapeFeatureCreated != null) __obj.updateDynamic("shapeFeatureCreated")(js.Any.fromFunction1(shapeFeatureCreated))
    if (shapeMouseEnter != null) __obj.updateDynamic("shapeMouseEnter")(js.Any.fromFunction1(shapeMouseEnter))
    if (shapeMouseLeave != null) __obj.updateDynamic("shapeMouseLeave")(js.Any.fromFunction1(shapeMouseLeave))
    if (!js.isUndefined(wraparound)) __obj.updateDynamic("wraparound")(wraparound)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (zoomEnd != null) __obj.updateDynamic("zoomEnd")(js.Any.fromFunction1(zoomEnd))
    if (zoomStart != null) __obj.updateDynamic("zoomStart")(js.Any.fromFunction1(zoomStart))
    if (!js.isUndefined(zoomable)) __obj.updateDynamic("zoomable")(zoomable)
    __obj.asInstanceOf[MapOptions]
  }
}

