package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import typings.kendoDashUi.kendoNs.datavizNs.mapNs.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var beforeReset: js.UndefOr[js.Function1[/* e */ MapBeforeResetEvent, Unit]] = js.undefined
  var center: js.UndefOr[js.Any | Location] = js.undefined
  var click: js.UndefOr[js.Function1[/* e */ MapClickEvent, Unit]] = js.undefined
  var controls: js.UndefOr[MapControls] = js.undefined
  var layerDefaults: js.UndefOr[MapLayerDefaults] = js.undefined
  var layers: js.UndefOr[js.Array[MapLayer]] = js.undefined
  var markerActivate: js.UndefOr[js.Function1[/* e */ MapMarkerActivateEvent, Unit]] = js.undefined
  var markerClick: js.UndefOr[js.Function1[/* e */ MapMarkerClickEvent, Unit]] = js.undefined
  var markerCreated: js.UndefOr[js.Function1[/* e */ MapMarkerCreatedEvent, Unit]] = js.undefined
  var markerDefaults: js.UndefOr[MapMarkerDefaults] = js.undefined
  var markers: js.UndefOr[js.Array[MapMarker]] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minSize: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pan: js.UndefOr[js.Function1[/* e */ MapPanEvent, Unit]] = js.undefined
  var panEnd: js.UndefOr[js.Function1[/* e */ MapPanEndEvent, Unit]] = js.undefined
  var pannable: js.UndefOr[Boolean] = js.undefined
  var reset: js.UndefOr[js.Function1[/* e */ MapResetEvent, Unit]] = js.undefined
  var shapeClick: js.UndefOr[js.Function1[/* e */ MapShapeClickEvent, Unit]] = js.undefined
  var shapeCreated: js.UndefOr[js.Function1[/* e */ MapShapeCreatedEvent, Unit]] = js.undefined
  var shapeFeatureCreated: js.UndefOr[js.Function1[/* e */ MapShapeFeatureCreatedEvent, Unit]] = js.undefined
  var shapeMouseEnter: js.UndefOr[js.Function1[/* e */ MapShapeMouseEnterEvent, Unit]] = js.undefined
  var shapeMouseLeave: js.UndefOr[js.Function1[/* e */ MapShapeMouseLeaveEvent, Unit]] = js.undefined
  var wraparound: js.UndefOr[Boolean] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
  var zoomEnd: js.UndefOr[js.Function1[/* e */ MapZoomEndEvent, Unit]] = js.undefined
  var zoomStart: js.UndefOr[js.Function1[/* e */ MapZoomStartEvent, Unit]] = js.undefined
  var zoomable: js.UndefOr[Boolean] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    beforeReset: /* e */ MapBeforeResetEvent => Unit = null,
    center: js.Any | Location = null,
    click: /* e */ MapClickEvent => Unit = null,
    controls: MapControls = null,
    layerDefaults: MapLayerDefaults = null,
    layers: js.Array[MapLayer] = null,
    markerActivate: /* e */ MapMarkerActivateEvent => Unit = null,
    markerClick: /* e */ MapMarkerClickEvent => Unit = null,
    markerCreated: /* e */ MapMarkerCreatedEvent => Unit = null,
    markerDefaults: MapMarkerDefaults = null,
    markers: js.Array[MapMarker] = null,
    maxZoom: Int | Double = null,
    minSize: Int | Double = null,
    minZoom: Int | Double = null,
    name: String = null,
    pan: /* e */ MapPanEvent => Unit = null,
    panEnd: /* e */ MapPanEndEvent => Unit = null,
    pannable: js.UndefOr[Boolean] = js.undefined,
    reset: /* e */ MapResetEvent => Unit = null,
    shapeClick: /* e */ MapShapeClickEvent => Unit = null,
    shapeCreated: /* e */ MapShapeCreatedEvent => Unit = null,
    shapeFeatureCreated: /* e */ MapShapeFeatureCreatedEvent => Unit = null,
    shapeMouseEnter: /* e */ MapShapeMouseEnterEvent => Unit = null,
    shapeMouseLeave: /* e */ MapShapeMouseLeaveEvent => Unit = null,
    wraparound: js.UndefOr[Boolean] = js.undefined,
    zoom: Int | Double = null,
    zoomEnd: /* e */ MapZoomEndEvent => Unit = null,
    zoomStart: /* e */ MapZoomStartEvent => Unit = null,
    zoomable: js.UndefOr[Boolean] = js.undefined
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

