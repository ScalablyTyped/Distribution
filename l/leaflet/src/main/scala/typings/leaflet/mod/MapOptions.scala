package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapOptions extends StObject {
  
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
  
  inline def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
    
    inline def setAttributionControl(value: Boolean): Self = StObject.set(x, "attributionControl", value.asInstanceOf[js.Any])
    
    inline def setAttributionControlUndefined: Self = StObject.set(x, "attributionControl", js.undefined)
    
    inline def setBounceAtZoomLimits(value: Boolean): Self = StObject.set(x, "bounceAtZoomLimits", value.asInstanceOf[js.Any])
    
    inline def setBounceAtZoomLimitsUndefined: Self = StObject.set(x, "bounceAtZoomLimits", js.undefined)
    
    inline def setBoxZoom(value: Boolean): Self = StObject.set(x, "boxZoom", value.asInstanceOf[js.Any])
    
    inline def setBoxZoomUndefined: Self = StObject.set(x, "boxZoom", js.undefined)
    
    inline def setCenter(value: LatLngExpression): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setClosePopupOnClick(value: Boolean): Self = StObject.set(x, "closePopupOnClick", value.asInstanceOf[js.Any])
    
    inline def setClosePopupOnClickUndefined: Self = StObject.set(x, "closePopupOnClick", js.undefined)
    
    inline def setCrs(value: CRS): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
    
    inline def setCrsUndefined: Self = StObject.set(x, "crs", js.undefined)
    
    inline def setDoubleClickZoom(value: Zoom): Self = StObject.set(x, "doubleClickZoom", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickZoomUndefined: Self = StObject.set(x, "doubleClickZoom", js.undefined)
    
    inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    inline def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
    
    inline def setEaseLinearity(value: Double): Self = StObject.set(x, "easeLinearity", value.asInstanceOf[js.Any])
    
    inline def setEaseLinearityUndefined: Self = StObject.set(x, "easeLinearity", js.undefined)
    
    inline def setFadeAnimation(value: Boolean): Self = StObject.set(x, "fadeAnimation", value.asInstanceOf[js.Any])
    
    inline def setFadeAnimationUndefined: Self = StObject.set(x, "fadeAnimation", js.undefined)
    
    inline def setInertia(value: Boolean): Self = StObject.set(x, "inertia", value.asInstanceOf[js.Any])
    
    inline def setInertiaDeceleration(value: Double): Self = StObject.set(x, "inertiaDeceleration", value.asInstanceOf[js.Any])
    
    inline def setInertiaDecelerationUndefined: Self = StObject.set(x, "inertiaDeceleration", js.undefined)
    
    inline def setInertiaMaxSpeed(value: Double): Self = StObject.set(x, "inertiaMaxSpeed", value.asInstanceOf[js.Any])
    
    inline def setInertiaMaxSpeedUndefined: Self = StObject.set(x, "inertiaMaxSpeed", js.undefined)
    
    inline def setInertiaUndefined: Self = StObject.set(x, "inertia", js.undefined)
    
    inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardPanDelta(value: Double): Self = StObject.set(x, "keyboardPanDelta", value.asInstanceOf[js.Any])
    
    inline def setKeyboardPanDeltaUndefined: Self = StObject.set(x, "keyboardPanDelta", js.undefined)
    
    inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    inline def setLayers(value: js.Array[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setMarkerZoomAnimation(value: Boolean): Self = StObject.set(x, "markerZoomAnimation", value.asInstanceOf[js.Any])
    
    inline def setMarkerZoomAnimationUndefined: Self = StObject.set(x, "markerZoomAnimation", js.undefined)
    
    inline def setMaxBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "maxBounds", value.asInstanceOf[js.Any])
    
    inline def setMaxBoundsUndefined: Self = StObject.set(x, "maxBounds", js.undefined)
    
    inline def setMaxBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "maxBounds", js.Array(value*))
    
    inline def setMaxBoundsViscosity(value: Double): Self = StObject.set(x, "maxBoundsViscosity", value.asInstanceOf[js.Any])
    
    inline def setMaxBoundsViscosityUndefined: Self = StObject.set(x, "maxBoundsViscosity", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setPreferCanvas(value: Boolean): Self = StObject.set(x, "preferCanvas", value.asInstanceOf[js.Any])
    
    inline def setPreferCanvasUndefined: Self = StObject.set(x, "preferCanvas", js.undefined)
    
    inline def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setScrollWheelZoom(value: Zoom): Self = StObject.set(x, "scrollWheelZoom", value.asInstanceOf[js.Any])
    
    inline def setScrollWheelZoomUndefined: Self = StObject.set(x, "scrollWheelZoom", js.undefined)
    
    inline def setTap(value: Boolean): Self = StObject.set(x, "tap", value.asInstanceOf[js.Any])
    
    inline def setTapTolerance(value: Double): Self = StObject.set(x, "tapTolerance", value.asInstanceOf[js.Any])
    
    inline def setTapToleranceUndefined: Self = StObject.set(x, "tapTolerance", js.undefined)
    
    inline def setTapUndefined: Self = StObject.set(x, "tap", js.undefined)
    
    inline def setTouchZoom(value: Zoom): Self = StObject.set(x, "touchZoom", value.asInstanceOf[js.Any])
    
    inline def setTouchZoomUndefined: Self = StObject.set(x, "touchZoom", js.undefined)
    
    inline def setTrackResize(value: Boolean): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
    
    inline def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
    
    inline def setTransform3DLimit(value: Double): Self = StObject.set(x, "transform3DLimit", value.asInstanceOf[js.Any])
    
    inline def setTransform3DLimitUndefined: Self = StObject.set(x, "transform3DLimit", js.undefined)
    
    inline def setWheelDebounceTime(value: Double): Self = StObject.set(x, "wheelDebounceTime", value.asInstanceOf[js.Any])
    
    inline def setWheelDebounceTimeUndefined: Self = StObject.set(x, "wheelDebounceTime", js.undefined)
    
    inline def setWheelPxPerZoomLevel(value: Double): Self = StObject.set(x, "wheelPxPerZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setWheelPxPerZoomLevelUndefined: Self = StObject.set(x, "wheelPxPerZoomLevel", js.undefined)
    
    inline def setWorldCopyJump(value: Boolean): Self = StObject.set(x, "worldCopyJump", value.asInstanceOf[js.Any])
    
    inline def setWorldCopyJumpUndefined: Self = StObject.set(x, "worldCopyJump", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomAnimation(value: Boolean): Self = StObject.set(x, "zoomAnimation", value.asInstanceOf[js.Any])
    
    inline def setZoomAnimationThreshold(value: Double): Self = StObject.set(x, "zoomAnimationThreshold", value.asInstanceOf[js.Any])
    
    inline def setZoomAnimationThresholdUndefined: Self = StObject.set(x, "zoomAnimationThreshold", js.undefined)
    
    inline def setZoomAnimationUndefined: Self = StObject.set(x, "zoomAnimation", js.undefined)
    
    inline def setZoomControl(value: Boolean): Self = StObject.set(x, "zoomControl", value.asInstanceOf[js.Any])
    
    inline def setZoomControlUndefined: Self = StObject.set(x, "zoomControl", js.undefined)
    
    inline def setZoomDelta(value: Double): Self = StObject.set(x, "zoomDelta", value.asInstanceOf[js.Any])
    
    inline def setZoomDeltaUndefined: Self = StObject.set(x, "zoomDelta", js.undefined)
    
    inline def setZoomSnap(value: Double): Self = StObject.set(x, "zoomSnap", value.asInstanceOf[js.Any])
    
    inline def setZoomSnapUndefined: Self = StObject.set(x, "zoomSnap", js.undefined)
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
