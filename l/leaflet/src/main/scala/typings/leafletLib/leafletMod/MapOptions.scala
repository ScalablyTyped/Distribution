package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  // Control options
  var attributionControl: js.UndefOr[scala.Boolean] = js.undefined
  var bounceAtZoomLimits: js.UndefOr[scala.Boolean] = js.undefined
  var boxZoom: js.UndefOr[scala.Boolean] = js.undefined
  var center: js.UndefOr[LatLngExpression] = js.undefined
  // Interaction options
  var closePopupOnClick: js.UndefOr[scala.Boolean] = js.undefined
  // Map state options
  var crs: js.UndefOr[CRS] = js.undefined
  var doubleClickZoom: js.UndefOr[Zoom] = js.undefined
  var dragging: js.UndefOr[scala.Boolean] = js.undefined
  var easeLinearity: js.UndefOr[scala.Double] = js.undefined
  // Animation options
  var fadeAnimation: js.UndefOr[scala.Boolean] = js.undefined
  // Panning inertia options
  var inertia: js.UndefOr[scala.Boolean] = js.undefined
  var inertiaDeceleration: js.UndefOr[scala.Double] = js.undefined
  var inertiaMaxSpeed: js.UndefOr[scala.Double] = js.undefined
  // Keyboard navigation options
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  var keyboardPanDelta: js.UndefOr[scala.Double] = js.undefined
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  var markerZoomAnimation: js.UndefOr[scala.Boolean] = js.undefined
  var maxBounds: js.UndefOr[LatLngBoundsExpression] = js.undefined
  var maxBoundsViscosity: js.UndefOr[scala.Double] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var preferCanvas: js.UndefOr[scala.Boolean] = js.undefined
  var renderer: js.UndefOr[Renderer] = js.undefined
  // Mousewheel options
  var scrollWheelZoom: js.UndefOr[Zoom] = js.undefined
  // Touch interaction options
  var tap: js.UndefOr[scala.Boolean] = js.undefined
  var tapTolerance: js.UndefOr[scala.Double] = js.undefined
  var touchZoom: js.UndefOr[Zoom] = js.undefined
  var trackResize: js.UndefOr[scala.Boolean] = js.undefined
  var transform3DLimit: js.UndefOr[scala.Double] = js.undefined
  var wheelDebounceTime: js.UndefOr[scala.Double] = js.undefined
  var wheelPxPerZoomLevel: js.UndefOr[scala.Double] = js.undefined
  var worldCopyJump: js.UndefOr[scala.Boolean] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
  var zoomAnimation: js.UndefOr[scala.Boolean] = js.undefined
  var zoomAnimationThreshold: js.UndefOr[scala.Double] = js.undefined
  var zoomControl: js.UndefOr[scala.Boolean] = js.undefined
  var zoomDelta: js.UndefOr[scala.Double] = js.undefined
  var zoomSnap: js.UndefOr[scala.Double] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    attributionControl: js.UndefOr[scala.Boolean] = js.undefined,
    bounceAtZoomLimits: js.UndefOr[scala.Boolean] = js.undefined,
    boxZoom: js.UndefOr[scala.Boolean] = js.undefined,
    center: LatLngExpression = null,
    closePopupOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    crs: CRS = null,
    doubleClickZoom: Zoom = null,
    dragging: js.UndefOr[scala.Boolean] = js.undefined,
    easeLinearity: scala.Int | scala.Double = null,
    fadeAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    inertia: js.UndefOr[scala.Boolean] = js.undefined,
    inertiaDeceleration: scala.Int | scala.Double = null,
    inertiaMaxSpeed: scala.Int | scala.Double = null,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    keyboardPanDelta: scala.Int | scala.Double = null,
    layers: js.Array[Layer] = null,
    markerZoomAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    maxBounds: LatLngBoundsExpression = null,
    maxBoundsViscosity: scala.Int | scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    preferCanvas: js.UndefOr[scala.Boolean] = js.undefined,
    renderer: Renderer = null,
    scrollWheelZoom: Zoom = null,
    tap: js.UndefOr[scala.Boolean] = js.undefined,
    tapTolerance: scala.Int | scala.Double = null,
    touchZoom: Zoom = null,
    trackResize: js.UndefOr[scala.Boolean] = js.undefined,
    transform3DLimit: scala.Int | scala.Double = null,
    wheelDebounceTime: scala.Int | scala.Double = null,
    wheelPxPerZoomLevel: scala.Int | scala.Double = null,
    worldCopyJump: js.UndefOr[scala.Boolean] = js.undefined,
    zoom: scala.Int | scala.Double = null,
    zoomAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    zoomAnimationThreshold: scala.Int | scala.Double = null,
    zoomControl: js.UndefOr[scala.Boolean] = js.undefined,
    zoomDelta: scala.Int | scala.Double = null,
    zoomSnap: scala.Int | scala.Double = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attributionControl)) __obj.updateDynamic("attributionControl")(attributionControl)
    if (!js.isUndefined(bounceAtZoomLimits)) __obj.updateDynamic("bounceAtZoomLimits")(bounceAtZoomLimits)
    if (!js.isUndefined(boxZoom)) __obj.updateDynamic("boxZoom")(boxZoom)
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(closePopupOnClick)) __obj.updateDynamic("closePopupOnClick")(closePopupOnClick)
    if (crs != null) __obj.updateDynamic("crs")(crs)
    if (doubleClickZoom != null) __obj.updateDynamic("doubleClickZoom")(doubleClickZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging)
    if (easeLinearity != null) __obj.updateDynamic("easeLinearity")(easeLinearity.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeAnimation)) __obj.updateDynamic("fadeAnimation")(fadeAnimation)
    if (!js.isUndefined(inertia)) __obj.updateDynamic("inertia")(inertia)
    if (inertiaDeceleration != null) __obj.updateDynamic("inertiaDeceleration")(inertiaDeceleration.asInstanceOf[js.Any])
    if (inertiaMaxSpeed != null) __obj.updateDynamic("inertiaMaxSpeed")(inertiaMaxSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (keyboardPanDelta != null) __obj.updateDynamic("keyboardPanDelta")(keyboardPanDelta.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (!js.isUndefined(markerZoomAnimation)) __obj.updateDynamic("markerZoomAnimation")(markerZoomAnimation)
    if (maxBounds != null) __obj.updateDynamic("maxBounds")(maxBounds.asInstanceOf[js.Any])
    if (maxBoundsViscosity != null) __obj.updateDynamic("maxBoundsViscosity")(maxBoundsViscosity.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(preferCanvas)) __obj.updateDynamic("preferCanvas")(preferCanvas)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (scrollWheelZoom != null) __obj.updateDynamic("scrollWheelZoom")(scrollWheelZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(tap)) __obj.updateDynamic("tap")(tap)
    if (tapTolerance != null) __obj.updateDynamic("tapTolerance")(tapTolerance.asInstanceOf[js.Any])
    if (touchZoom != null) __obj.updateDynamic("touchZoom")(touchZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(trackResize)) __obj.updateDynamic("trackResize")(trackResize)
    if (transform3DLimit != null) __obj.updateDynamic("transform3DLimit")(transform3DLimit.asInstanceOf[js.Any])
    if (wheelDebounceTime != null) __obj.updateDynamic("wheelDebounceTime")(wheelDebounceTime.asInstanceOf[js.Any])
    if (wheelPxPerZoomLevel != null) __obj.updateDynamic("wheelPxPerZoomLevel")(wheelPxPerZoomLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(worldCopyJump)) __obj.updateDynamic("worldCopyJump")(worldCopyJump)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomAnimation)) __obj.updateDynamic("zoomAnimation")(zoomAnimation)
    if (zoomAnimationThreshold != null) __obj.updateDynamic("zoomAnimationThreshold")(zoomAnimationThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomControl)) __obj.updateDynamic("zoomControl")(zoomControl)
    if (zoomDelta != null) __obj.updateDynamic("zoomDelta")(zoomDelta.asInstanceOf[js.Any])
    if (zoomSnap != null) __obj.updateDynamic("zoomSnap")(zoomSnap.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

