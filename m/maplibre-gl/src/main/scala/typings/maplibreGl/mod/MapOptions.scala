package typings.maplibreGl.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapOptions extends StObject {
  
  var antialias: js.UndefOr[Boolean] = js.undefined
  
  var attributionControl: js.UndefOr[Boolean] = js.undefined
  
  var bearing: js.UndefOr[Double] = js.undefined
  
  var bearingSnap: js.UndefOr[Double] = js.undefined
  
  var bounds: js.UndefOr[LngLatBoundsLike] = js.undefined
  
  var boxZoom: js.UndefOr[Boolean] = js.undefined
  
  var center: js.UndefOr[LngLatLike] = js.undefined
  
  var clickTolerance: js.UndefOr[Double] = js.undefined
  
  var collectResourceTiming: js.UndefOr[Boolean] = js.undefined
  
  var container: HTMLElement | String
  
  var cooperativeGestures: js.UndefOr[Boolean | GestureOptions] = js.undefined
  
  var crossSourceCollisions: js.UndefOr[Boolean] = js.undefined
  
  var customAttribution: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var doubleClickZoom: js.UndefOr[Boolean] = js.undefined
  
  var dragPan: js.UndefOr[DragPanOptions | Boolean] = js.undefined
  
  var dragRotate: js.UndefOr[Boolean] = js.undefined
  
  var fadeDuration: js.UndefOr[Double] = js.undefined
  
  var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined
  
  var fitBoundsOptions: js.UndefOr[js.Object] = js.undefined
  
  var hash: js.UndefOr[Boolean | String] = js.undefined
  
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  var keyboard: js.UndefOr[Boolean] = js.undefined
  
  var localIdeographFontFamily: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[Any] = js.undefined
  
  var logoPosition: js.UndefOr[ControlPosition] = js.undefined
  
  var maplibreLogo: js.UndefOr[Boolean] = js.undefined
  
  var maxBounds: js.UndefOr[LngLatBoundsLike] = js.undefined
  
  var maxPitch: js.UndefOr[Double | Null] = js.undefined
  
  var maxTileCacheSize: js.UndefOr[Double] = js.undefined
  
  var maxZoom: js.UndefOr[Double | Null] = js.undefined
  
  var minPitch: js.UndefOr[Double | Null] = js.undefined
  
  var minZoom: js.UndefOr[Double | Null] = js.undefined
  
  var pitch: js.UndefOr[Double] = js.undefined
  
  var pitchWithRotate: js.UndefOr[Boolean] = js.undefined
  
  var pixelRatio: js.UndefOr[Double] = js.undefined
  
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  
  var refreshExpiredTiles: js.UndefOr[Boolean] = js.undefined
  
  var renderWorldCopies: js.UndefOr[Boolean] = js.undefined
  
  var scrollZoom: js.UndefOr[Boolean] = js.undefined
  
  var style: StyleSpecification | String
  
  var touchPitch: js.UndefOr[Boolean] = js.undefined
  
  var touchZoomRotate: js.UndefOr[Boolean] = js.undefined
  
  var trackResize: js.UndefOr[Boolean] = js.undefined
  
  var transformRequest: js.UndefOr[RequestTransformFunction] = js.undefined
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object MapOptions {
  
  inline def apply(container: HTMLElement | String, style: StyleSpecification | String): MapOptions = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
    
    inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    inline def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    inline def setAttributionControl(value: Boolean): Self = StObject.set(x, "attributionControl", value.asInstanceOf[js.Any])
    
    inline def setAttributionControlUndefined: Self = StObject.set(x, "attributionControl", js.undefined)
    
    inline def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    inline def setBearingSnap(value: Double): Self = StObject.set(x, "bearingSnap", value.asInstanceOf[js.Any])
    
    inline def setBearingSnapUndefined: Self = StObject.set(x, "bearingSnap", js.undefined)
    
    inline def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
    
    inline def setBounds(value: LngLatBoundsLike): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setBoxZoom(value: Boolean): Self = StObject.set(x, "boxZoom", value.asInstanceOf[js.Any])
    
    inline def setBoxZoomUndefined: Self = StObject.set(x, "boxZoom", js.undefined)
    
    inline def setCenter(value: LngLatLike): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setClickTolerance(value: Double): Self = StObject.set(x, "clickTolerance", value.asInstanceOf[js.Any])
    
    inline def setClickToleranceUndefined: Self = StObject.set(x, "clickTolerance", js.undefined)
    
    inline def setCollectResourceTiming(value: Boolean): Self = StObject.set(x, "collectResourceTiming", value.asInstanceOf[js.Any])
    
    inline def setCollectResourceTimingUndefined: Self = StObject.set(x, "collectResourceTiming", js.undefined)
    
    inline def setContainer(value: HTMLElement | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setCooperativeGestures(value: Boolean | GestureOptions): Self = StObject.set(x, "cooperativeGestures", value.asInstanceOf[js.Any])
    
    inline def setCooperativeGesturesUndefined: Self = StObject.set(x, "cooperativeGestures", js.undefined)
    
    inline def setCrossSourceCollisions(value: Boolean): Self = StObject.set(x, "crossSourceCollisions", value.asInstanceOf[js.Any])
    
    inline def setCrossSourceCollisionsUndefined: Self = StObject.set(x, "crossSourceCollisions", js.undefined)
    
    inline def setCustomAttribution(value: String | js.Array[String]): Self = StObject.set(x, "customAttribution", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributionUndefined: Self = StObject.set(x, "customAttribution", js.undefined)
    
    inline def setCustomAttributionVarargs(value: String*): Self = StObject.set(x, "customAttribution", js.Array(value*))
    
    inline def setDoubleClickZoom(value: Boolean): Self = StObject.set(x, "doubleClickZoom", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickZoomUndefined: Self = StObject.set(x, "doubleClickZoom", js.undefined)
    
    inline def setDragPan(value: DragPanOptions | Boolean): Self = StObject.set(x, "dragPan", value.asInstanceOf[js.Any])
    
    inline def setDragPanUndefined: Self = StObject.set(x, "dragPan", js.undefined)
    
    inline def setDragRotate(value: Boolean): Self = StObject.set(x, "dragRotate", value.asInstanceOf[js.Any])
    
    inline def setDragRotateUndefined: Self = StObject.set(x, "dragRotate", js.undefined)
    
    inline def setFadeDuration(value: Double): Self = StObject.set(x, "fadeDuration", value.asInstanceOf[js.Any])
    
    inline def setFadeDurationUndefined: Self = StObject.set(x, "fadeDuration", js.undefined)
    
    inline def setFailIfMajorPerformanceCaveat(value: Boolean): Self = StObject.set(x, "failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
    
    inline def setFailIfMajorPerformanceCaveatUndefined: Self = StObject.set(x, "failIfMajorPerformanceCaveat", js.undefined)
    
    inline def setFitBoundsOptions(value: js.Object): Self = StObject.set(x, "fitBoundsOptions", value.asInstanceOf[js.Any])
    
    inline def setFitBoundsOptionsUndefined: Self = StObject.set(x, "fitBoundsOptions", js.undefined)
    
    inline def setHash(value: Boolean | String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    inline def setLocalIdeographFontFamily(value: String): Self = StObject.set(x, "localIdeographFontFamily", value.asInstanceOf[js.Any])
    
    inline def setLocalIdeographFontFamilyUndefined: Self = StObject.set(x, "localIdeographFontFamily", js.undefined)
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLogoPosition(value: ControlPosition): Self = StObject.set(x, "logoPosition", value.asInstanceOf[js.Any])
    
    inline def setLogoPositionUndefined: Self = StObject.set(x, "logoPosition", js.undefined)
    
    inline def setMaplibreLogo(value: Boolean): Self = StObject.set(x, "maplibreLogo", value.asInstanceOf[js.Any])
    
    inline def setMaplibreLogoUndefined: Self = StObject.set(x, "maplibreLogo", js.undefined)
    
    inline def setMaxBounds(value: LngLatBoundsLike): Self = StObject.set(x, "maxBounds", value.asInstanceOf[js.Any])
    
    inline def setMaxBoundsUndefined: Self = StObject.set(x, "maxBounds", js.undefined)
    
    inline def setMaxPitch(value: Double): Self = StObject.set(x, "maxPitch", value.asInstanceOf[js.Any])
    
    inline def setMaxPitchNull: Self = StObject.set(x, "maxPitch", null)
    
    inline def setMaxPitchUndefined: Self = StObject.set(x, "maxPitch", js.undefined)
    
    inline def setMaxTileCacheSize(value: Double): Self = StObject.set(x, "maxTileCacheSize", value.asInstanceOf[js.Any])
    
    inline def setMaxTileCacheSizeUndefined: Self = StObject.set(x, "maxTileCacheSize", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomNull: Self = StObject.set(x, "maxZoom", null)
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinPitch(value: Double): Self = StObject.set(x, "minPitch", value.asInstanceOf[js.Any])
    
    inline def setMinPitchNull: Self = StObject.set(x, "minPitch", null)
    
    inline def setMinPitchUndefined: Self = StObject.set(x, "minPitch", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomNull: Self = StObject.set(x, "minZoom", null)
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setPitchWithRotate(value: Boolean): Self = StObject.set(x, "pitchWithRotate", value.asInstanceOf[js.Any])
    
    inline def setPitchWithRotateUndefined: Self = StObject.set(x, "pitchWithRotate", js.undefined)
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    inline def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    inline def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
    
    inline def setRefreshExpiredTiles(value: Boolean): Self = StObject.set(x, "refreshExpiredTiles", value.asInstanceOf[js.Any])
    
    inline def setRefreshExpiredTilesUndefined: Self = StObject.set(x, "refreshExpiredTiles", js.undefined)
    
    inline def setRenderWorldCopies(value: Boolean): Self = StObject.set(x, "renderWorldCopies", value.asInstanceOf[js.Any])
    
    inline def setRenderWorldCopiesUndefined: Self = StObject.set(x, "renderWorldCopies", js.undefined)
    
    inline def setScrollZoom(value: Boolean): Self = StObject.set(x, "scrollZoom", value.asInstanceOf[js.Any])
    
    inline def setScrollZoomUndefined: Self = StObject.set(x, "scrollZoom", js.undefined)
    
    inline def setStyle(value: StyleSpecification | String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTouchPitch(value: Boolean): Self = StObject.set(x, "touchPitch", value.asInstanceOf[js.Any])
    
    inline def setTouchPitchUndefined: Self = StObject.set(x, "touchPitch", js.undefined)
    
    inline def setTouchZoomRotate(value: Boolean): Self = StObject.set(x, "touchZoomRotate", value.asInstanceOf[js.Any])
    
    inline def setTouchZoomRotateUndefined: Self = StObject.set(x, "touchZoomRotate", js.undefined)
    
    inline def setTrackResize(value: Boolean): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
    
    inline def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
    
    inline def setTransformRequest(value: (/* url */ String, /* resourceType */ js.UndefOr[ResourceTypeEnum]) => RequestParameters): Self = StObject.set(x, "transformRequest", js.Any.fromFunction2(value))
    
    inline def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
