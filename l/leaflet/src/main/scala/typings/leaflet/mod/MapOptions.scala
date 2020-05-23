package typings.leaflet.mod

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
    easeLinearity: js.UndefOr[Double] = js.undefined,
    fadeAnimation: js.UndefOr[Boolean] = js.undefined,
    inertia: js.UndefOr[Boolean] = js.undefined,
    inertiaDeceleration: js.UndefOr[Double] = js.undefined,
    inertiaMaxSpeed: js.UndefOr[Double] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    keyboardPanDelta: js.UndefOr[Double] = js.undefined,
    layers: js.Array[Layer] = null,
    markerZoomAnimation: js.UndefOr[Boolean] = js.undefined,
    maxBounds: LatLngBoundsExpression = null,
    maxBoundsViscosity: js.UndefOr[Double] = js.undefined,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    preferCanvas: js.UndefOr[Boolean] = js.undefined,
    renderer: Renderer = null,
    scrollWheelZoom: Zoom = null,
    tap: js.UndefOr[Boolean] = js.undefined,
    tapTolerance: js.UndefOr[Double] = js.undefined,
    touchZoom: Zoom = null,
    trackResize: js.UndefOr[Boolean] = js.undefined,
    transform3DLimit: js.UndefOr[Double] = js.undefined,
    wheelDebounceTime: js.UndefOr[Double] = js.undefined,
    wheelPxPerZoomLevel: js.UndefOr[Double] = js.undefined,
    worldCopyJump: js.UndefOr[Boolean] = js.undefined,
    zoom: js.UndefOr[Double] = js.undefined,
    zoomAnimation: js.UndefOr[Boolean] = js.undefined,
    zoomAnimationThreshold: js.UndefOr[Double] = js.undefined,
    zoomControl: js.UndefOr[Boolean] = js.undefined,
    zoomDelta: js.UndefOr[Double] = js.undefined,
    zoomSnap: js.UndefOr[Double] = js.undefined
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attributionControl)) __obj.updateDynamic("attributionControl")(attributionControl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bounceAtZoomLimits)) __obj.updateDynamic("bounceAtZoomLimits")(bounceAtZoomLimits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(boxZoom)) __obj.updateDynamic("boxZoom")(boxZoom.get.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(closePopupOnClick)) __obj.updateDynamic("closePopupOnClick")(closePopupOnClick.get.asInstanceOf[js.Any])
    if (crs != null) __obj.updateDynamic("crs")(crs.asInstanceOf[js.Any])
    if (doubleClickZoom != null) __obj.updateDynamic("doubleClickZoom")(doubleClickZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(easeLinearity)) __obj.updateDynamic("easeLinearity")(easeLinearity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeAnimation)) __obj.updateDynamic("fadeAnimation")(fadeAnimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inertia)) __obj.updateDynamic("inertia")(inertia.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inertiaDeceleration)) __obj.updateDynamic("inertiaDeceleration")(inertiaDeceleration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inertiaMaxSpeed)) __obj.updateDynamic("inertiaMaxSpeed")(inertiaMaxSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardPanDelta)) __obj.updateDynamic("keyboardPanDelta")(keyboardPanDelta.get.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (!js.isUndefined(markerZoomAnimation)) __obj.updateDynamic("markerZoomAnimation")(markerZoomAnimation.get.asInstanceOf[js.Any])
    if (maxBounds != null) __obj.updateDynamic("maxBounds")(maxBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBoundsViscosity)) __obj.updateDynamic("maxBoundsViscosity")(maxBoundsViscosity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preferCanvas)) __obj.updateDynamic("preferCanvas")(preferCanvas.get.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (scrollWheelZoom != null) __obj.updateDynamic("scrollWheelZoom")(scrollWheelZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(tap)) __obj.updateDynamic("tap")(tap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tapTolerance)) __obj.updateDynamic("tapTolerance")(tapTolerance.get.asInstanceOf[js.Any])
    if (touchZoom != null) __obj.updateDynamic("touchZoom")(touchZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(trackResize)) __obj.updateDynamic("trackResize")(trackResize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transform3DLimit)) __obj.updateDynamic("transform3DLimit")(transform3DLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wheelDebounceTime)) __obj.updateDynamic("wheelDebounceTime")(wheelDebounceTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wheelPxPerZoomLevel)) __obj.updateDynamic("wheelPxPerZoomLevel")(wheelPxPerZoomLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(worldCopyJump)) __obj.updateDynamic("worldCopyJump")(worldCopyJump.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomAnimation)) __obj.updateDynamic("zoomAnimation")(zoomAnimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomAnimationThreshold)) __obj.updateDynamic("zoomAnimationThreshold")(zoomAnimationThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomControl)) __obj.updateDynamic("zoomControl")(zoomControl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomDelta)) __obj.updateDynamic("zoomDelta")(zoomDelta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomSnap)) __obj.updateDynamic("zoomSnap")(zoomSnap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

