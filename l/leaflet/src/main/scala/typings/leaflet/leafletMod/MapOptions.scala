package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  // Control options
  var attributionControl: js.UndefOr[Boolean] = js.undefined
  var bounceAtZoomLimits: js.UndefOr[Boolean] = js.undefined
  var boxZoom: js.UndefOr[Boolean] = js.undefined
  var center: js.UndefOr[LatLngExpression] = js.undefined
  // Interaction options
  var closePopupOnClick: js.UndefOr[Boolean] = js.undefined
  // Map state options
  var crs: js.UndefOr[CRS] = js.undefined
  var doubleClickZoom: js.UndefOr[Zoom] = js.undefined
  var dragging: js.UndefOr[Boolean] = js.undefined
  var easeLinearity: js.UndefOr[Double] = js.undefined
  // Animation options
  var fadeAnimation: js.UndefOr[Boolean] = js.undefined
  // Panning inertia options
  var inertia: js.UndefOr[Boolean] = js.undefined
  var inertiaDeceleration: js.UndefOr[Double] = js.undefined
  var inertiaMaxSpeed: js.UndefOr[Double] = js.undefined
  // Keyboard navigation options
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var keyboardPanDelta: js.UndefOr[Double] = js.undefined
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  var markerZoomAnimation: js.UndefOr[Boolean] = js.undefined
  var maxBounds: js.UndefOr[LatLngBoundsExpression] = js.undefined
  var maxBoundsViscosity: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var preferCanvas: js.UndefOr[Boolean] = js.undefined
  var renderer: js.UndefOr[Renderer] = js.undefined
  // Mousewheel options
  var scrollWheelZoom: js.UndefOr[Zoom] = js.undefined
  // Touch interaction options
  var tap: js.UndefOr[Boolean] = js.undefined
  var tapTolerance: js.UndefOr[Double] = js.undefined
  var touchZoom: js.UndefOr[Zoom] = js.undefined
  var trackResize: js.UndefOr[Boolean] = js.undefined
  var transform3DLimit: js.UndefOr[Double] = js.undefined
  var wheelDebounceTime: js.UndefOr[Double] = js.undefined
  var wheelPxPerZoomLevel: js.UndefOr[Double] = js.undefined
  var worldCopyJump: js.UndefOr[Boolean] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
  var zoomAnimation: js.UndefOr[Boolean] = js.undefined
  var zoomAnimationThreshold: js.UndefOr[Double] = js.undefined
  var zoomControl: js.UndefOr[Boolean] = js.undefined
  var zoomDelta: js.UndefOr[Double] = js.undefined
  var zoomSnap: js.UndefOr[Double] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    attributionControl: js.UndefOr[Boolean] = js.undefined,
    bounceAtZoomLimits: js.UndefOr[Boolean] = js.undefined,
    boxZoom: js.UndefOr[Boolean] = js.undefined,
    center: LatLngExpression = null,
    closePopupOnClick: js.UndefOr[Boolean] = js.undefined,
    crs: CRS = null,
    doubleClickZoom: Zoom = null,
    dragging: js.UndefOr[Boolean] = js.undefined,
    easeLinearity: Int | Double = null,
    fadeAnimation: js.UndefOr[Boolean] = js.undefined,
    inertia: js.UndefOr[Boolean] = js.undefined,
    inertiaDeceleration: Int | Double = null,
    inertiaMaxSpeed: Int | Double = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    keyboardPanDelta: Int | Double = null,
    layers: js.Array[Layer] = null,
    markerZoomAnimation: js.UndefOr[Boolean] = js.undefined,
    maxBounds: LatLngBoundsExpression = null,
    maxBoundsViscosity: Int | Double = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    preferCanvas: js.UndefOr[Boolean] = js.undefined,
    renderer: Renderer = null,
    scrollWheelZoom: Zoom = null,
    tap: js.UndefOr[Boolean] = js.undefined,
    tapTolerance: Int | Double = null,
    touchZoom: Zoom = null,
    trackResize: js.UndefOr[Boolean] = js.undefined,
    transform3DLimit: Int | Double = null,
    wheelDebounceTime: Int | Double = null,
    wheelPxPerZoomLevel: Int | Double = null,
    worldCopyJump: js.UndefOr[Boolean] = js.undefined,
    zoom: Int | Double = null,
    zoomAnimation: js.UndefOr[Boolean] = js.undefined,
    zoomAnimationThreshold: Int | Double = null,
    zoomControl: js.UndefOr[Boolean] = js.undefined,
    zoomDelta: Int | Double = null,
    zoomSnap: Int | Double = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attributionControl)) __obj.updateDynamic("attributionControl")(attributionControl.asInstanceOf[js.Any])
    if (!js.isUndefined(bounceAtZoomLimits)) __obj.updateDynamic("bounceAtZoomLimits")(bounceAtZoomLimits.asInstanceOf[js.Any])
    if (!js.isUndefined(boxZoom)) __obj.updateDynamic("boxZoom")(boxZoom.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(closePopupOnClick)) __obj.updateDynamic("closePopupOnClick")(closePopupOnClick.asInstanceOf[js.Any])
    if (crs != null) __obj.updateDynamic("crs")(crs.asInstanceOf[js.Any])
    if (doubleClickZoom != null) __obj.updateDynamic("doubleClickZoom")(doubleClickZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging.asInstanceOf[js.Any])
    if (easeLinearity != null) __obj.updateDynamic("easeLinearity")(easeLinearity.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeAnimation)) __obj.updateDynamic("fadeAnimation")(fadeAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(inertia)) __obj.updateDynamic("inertia")(inertia.asInstanceOf[js.Any])
    if (inertiaDeceleration != null) __obj.updateDynamic("inertiaDeceleration")(inertiaDeceleration.asInstanceOf[js.Any])
    if (inertiaMaxSpeed != null) __obj.updateDynamic("inertiaMaxSpeed")(inertiaMaxSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (keyboardPanDelta != null) __obj.updateDynamic("keyboardPanDelta")(keyboardPanDelta.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (!js.isUndefined(markerZoomAnimation)) __obj.updateDynamic("markerZoomAnimation")(markerZoomAnimation.asInstanceOf[js.Any])
    if (maxBounds != null) __obj.updateDynamic("maxBounds")(maxBounds.asInstanceOf[js.Any])
    if (maxBoundsViscosity != null) __obj.updateDynamic("maxBoundsViscosity")(maxBoundsViscosity.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(preferCanvas)) __obj.updateDynamic("preferCanvas")(preferCanvas.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (scrollWheelZoom != null) __obj.updateDynamic("scrollWheelZoom")(scrollWheelZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(tap)) __obj.updateDynamic("tap")(tap.asInstanceOf[js.Any])
    if (tapTolerance != null) __obj.updateDynamic("tapTolerance")(tapTolerance.asInstanceOf[js.Any])
    if (touchZoom != null) __obj.updateDynamic("touchZoom")(touchZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(trackResize)) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (transform3DLimit != null) __obj.updateDynamic("transform3DLimit")(transform3DLimit.asInstanceOf[js.Any])
    if (wheelDebounceTime != null) __obj.updateDynamic("wheelDebounceTime")(wheelDebounceTime.asInstanceOf[js.Any])
    if (wheelPxPerZoomLevel != null) __obj.updateDynamic("wheelPxPerZoomLevel")(wheelPxPerZoomLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(worldCopyJump)) __obj.updateDynamic("worldCopyJump")(worldCopyJump.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomAnimation)) __obj.updateDynamic("zoomAnimation")(zoomAnimation.asInstanceOf[js.Any])
    if (zoomAnimationThreshold != null) __obj.updateDynamic("zoomAnimationThreshold")(zoomAnimationThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomControl)) __obj.updateDynamic("zoomControl")(zoomControl.asInstanceOf[js.Any])
    if (zoomDelta != null) __obj.updateDynamic("zoomDelta")(zoomDelta.asInstanceOf[js.Any])
    if (zoomSnap != null) __obj.updateDynamic("zoomSnap")(zoomSnap.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

