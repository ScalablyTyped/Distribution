package typings.mapboxGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxGl.mapboxGlStrings.`bottom-left`
import typings.mapboxGl.mapboxGlStrings.`bottom-right`
import typings.mapboxGl.mapboxGlStrings.`top-left`
import typings.mapboxGl.mapboxGlStrings.`top-right`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapboxOptions extends StObject {
  
  /**
    * If specified, map will use this token instead of the one defined in mapboxgl.accessToken.
    *
    * @default null
    */
  var accessToken: js.UndefOr[String] = js.native
  
  /**
    * If true, the gl context will be created with MSA antialiasing, which can be useful for antialiasing custom layers.
    * This is false by default as a performance optimization.
    */
  var antialias: js.UndefOr[Boolean] = js.native
  
  /** If true, an attribution control will be added to the map. */
  var attributionControl: js.UndefOr[Boolean] = js.native
  
  var bearing: js.UndefOr[Double] = js.native
  
  /** Snap to north threshold in degrees. */
  var bearingSnap: js.UndefOr[Double] = js.native
  
  /** The initial bounds of the map. If bounds is specified, it overrides center and zoom constructor options. */
  var bounds: js.UndefOr[LngLatBoundsLike] = js.native
  
  /** If true, enable the "box zoom" interaction (see BoxZoomHandler) */
  var boxZoom: js.UndefOr[Boolean] = js.native
  
  /** initial map center */
  var center: js.UndefOr[LngLatLike] = js.native
  
  /**
    * The max number of pixels a user can shift the mouse pointer during a click for it to be
    * considered a valid click (as opposed to a mouse drag).
    *
    * @default 3
    */
  var clickTolerance: js.UndefOr[Double] = js.native
  
  /**
    * If `true`, Resource Timing API information will be collected for requests made by GeoJSON
    * and Vector Tile web workers (this information is normally inaccessible from the main
    * Javascript thread). Information will be returned in a `resourceTiming` property of
    * relevant `data` events.
    *
    * @default false
    */
  var collectResourceTiming: js.UndefOr[Boolean] = js.native
  
  /** ID of the container element */
  var container: String | HTMLElement = js.native
  
  /**
    * If `true`, symbols from multiple sources can collide with each other during collision
    * detection. If `false`, collision detection is run separately for the symbols in each source.
    *
    * @default true
    */
  var crossSourceCollisions: js.UndefOr[Boolean] = js.native
  
  /** String or strings to show in an AttributionControl.
    * Only applicable if options.attributionControl is `true`. */
  var customAttribution: js.UndefOr[String | js.Array[String]] = js.native
  
  /** If true, enable the "double click to zoom" interaction (see DoubleClickZoomHandler). */
  var doubleClickZoom: js.UndefOr[Boolean] = js.native
  
  /** If true, enable the "drag to pan" interaction (see DragPanHandler). */
  var dragPan: js.UndefOr[Boolean] = js.native
  
  /** If true, enable the "drag to rotate" interaction (see DragRotateHandler). */
  var dragRotate: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls the duration of the fade-in/fade-out animation for label collisions, in milliseconds.
    * This setting affects all symbol layers. This setting does not affect the duration of runtime
    * styling transitions or raster tile cross-fading.
    *
    * @default 300
    */
  var fadeDuration: js.UndefOr[Double] = js.native
  
  /** If true, map creation will fail if the implementation determines that the performance of the created WebGL context would be dramatically lower than expected. */
  var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.native
  
  /** A fitBounds options object to use only when setting the bounds option. */
  var fitBoundsOptions: js.UndefOr[FitBoundsOptions] = js.native
  
  /** If `true`, the map's position (zoom, center latitude, center longitude, bearing, and pitch) will be synced with the hash fragment of the page's URL.
    * For example, `http://path/to/my/page.html#2.59/39.26/53.07/-24.1/60`.
    * An additional string may optionally be provided to indicate a parameter-styled hash,
    * e.g. http://path/to/my/page.html#map=2.59/39.26/53.07/-24.1/60&foo=bar, where foo
    * is a custom parameter and bar is an arbitrary hash distinct from the map hash.
    * */
  var hash: js.UndefOr[Boolean | String] = js.native
  
  /** If false, no mouse, touch, or keyboard listeners are attached to the map, so it will not respond to input */
  var interactive: js.UndefOr[Boolean] = js.native
  
  /** If true, enable keyboard shortcuts (see KeyboardHandler). */
  var keyboard: js.UndefOr[Boolean] = js.native
  
  /**
    * If specified, defines a CSS font-family for locally overriding generation of glyphs in the
    * 'CJK Unified Ideographs' and 'Hangul Syllables' ranges. In these ranges, font settings from
    * the map's style will be ignored, except for font-weight keywords (light/regular/medium/bold).
    * The purpose of this option is to avoid bandwidth-intensive glyph server requests.
    *
    * @default null
    */
  var localIdeographFontFamily: js.UndefOr[String] = js.native
  
  /** A patch to apply to the default localization table for UI strings, e.g. control tooltips.
    * The `locale` object maps namespaced UI string IDs to translated strings in the target language;
    * see `src/ui/default_locale.js` for an example with all supported string IDs.
    * The object may specify all UI strings (thereby adding support for a new translation) or
    * only a subset of strings (thereby patching the default translation table).
    */
  var locale: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * A string representing the position of the Mapbox wordmark on the map.
    *
    * @default "bottom-left"
    */
  var logoPosition: js.UndefOr[`top-left` | `top-right` | `bottom-left` | `bottom-right`] = js.native
  
  /** If set, the map is constrained to the given bounds. */
  var maxBounds: js.UndefOr[LngLatBoundsLike] = js.native
  
  /** Maximum pitch of the map. */
  var maxPitch: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of tiles stored in the tile cache for a given source. If omitted, the
    * cache will be dynamically sized based on the current viewport.
    *
    * @default null
    */
  var maxTileCacheSize: js.UndefOr[Double] = js.native
  
  /** Maximum zoom of the map. */
  var maxZoom: js.UndefOr[Double] = js.native
  
  /** Minimum pitch of the map. */
  var minPitch: js.UndefOr[Double] = js.native
  
  /** Minimum zoom of the map. */
  var minZoom: js.UndefOr[Double] = js.native
  
  /**
    * The initial pitch (tilt) of the map, measured in degrees away from the plane of the
    * screen (0-60).
    *
    * @default 0
    */
  var pitch: js.UndefOr[Double] = js.native
  
  /**
    * If `false`, the map's pitch (tilt) control with "drag to rotate" interaction will be disabled.
    *
    * @default true
    */
  var pitchWithRotate: js.UndefOr[Boolean] = js.native
  
  /** If true, The maps canvas can be exported to a PNG using map.getCanvas().toDataURL();. This is false by default as a performance optimization. */
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.native
  
  /**
    * If `false`, the map won't attempt to re-request tiles once they expire per their HTTP
    * `cacheControl`/`expires` headers.
    *
    * @default true
    */
  var refreshExpiredTiles: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, multiple copies of the world will be rendered, when zoomed out.
    *
    * @default true
    */
  var renderWorldCopies: js.UndefOr[Boolean] = js.native
  
  /** If true, enable the "scroll to zoom" interaction */
  var scrollZoom: js.UndefOr[Boolean] = js.native
  
  /** stylesheet location */
  var style: js.UndefOr[Style | String] = js.native
  
  /** If true, the "drag to pitch" interaction is enabled */
  var touchPitch: js.UndefOr[Boolean] = js.native
  
  /** If true, enable the "pinch to rotate and zoom" interaction (see TouchZoomRotateHandler). */
  var touchZoomRotate: js.UndefOr[Boolean] = js.native
  
  /** If  true, the map will automatically resize when the browser window resizes */
  var trackResize: js.UndefOr[Boolean] = js.native
  
  /**
    * A callback run before the Map makes a request for an external URL. The callback can be
    * used to modify the url, set headers, or set the credentials property for cross-origin requests.
    *
    * @default null
    */
  var transformRequest: js.UndefOr[TransformRequestFunction] = js.native
  
  /** Initial zoom level */
  var zoom: js.UndefOr[Double] = js.native
}
object MapboxOptions {
  
  @scala.inline
  def apply(container: String | HTMLElement): MapboxOptions = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxOptions]
  }
  
  @scala.inline
  implicit class MapboxOptionsMutableBuilder[Self <: MapboxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    @scala.inline
    def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    @scala.inline
    def setAttributionControl(value: Boolean): Self = StObject.set(x, "attributionControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionControlUndefined: Self = StObject.set(x, "attributionControl", js.undefined)
    
    @scala.inline
    def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBearingSnap(value: Double): Self = StObject.set(x, "bearingSnap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBearingSnapUndefined: Self = StObject.set(x, "bearingSnap", js.undefined)
    
    @scala.inline
    def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
    
    @scala.inline
    def setBounds(value: LngLatBoundsLike): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setBoxZoom(value: Boolean): Self = StObject.set(x, "boxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxZoomUndefined: Self = StObject.set(x, "boxZoom", js.undefined)
    
    @scala.inline
    def setCenter(value: LngLatLike): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setClickTolerance(value: Double): Self = StObject.set(x, "clickTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickToleranceUndefined: Self = StObject.set(x, "clickTolerance", js.undefined)
    
    @scala.inline
    def setCollectResourceTiming(value: Boolean): Self = StObject.set(x, "collectResourceTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectResourceTimingUndefined: Self = StObject.set(x, "collectResourceTiming", js.undefined)
    
    @scala.inline
    def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossSourceCollisions(value: Boolean): Self = StObject.set(x, "crossSourceCollisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossSourceCollisionsUndefined: Self = StObject.set(x, "crossSourceCollisions", js.undefined)
    
    @scala.inline
    def setCustomAttribution(value: String | js.Array[String]): Self = StObject.set(x, "customAttribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAttributionUndefined: Self = StObject.set(x, "customAttribution", js.undefined)
    
    @scala.inline
    def setCustomAttributionVarargs(value: String*): Self = StObject.set(x, "customAttribution", js.Array(value :_*))
    
    @scala.inline
    def setDoubleClickZoom(value: Boolean): Self = StObject.set(x, "doubleClickZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleClickZoomUndefined: Self = StObject.set(x, "doubleClickZoom", js.undefined)
    
    @scala.inline
    def setDragPan(value: Boolean): Self = StObject.set(x, "dragPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragPanUndefined: Self = StObject.set(x, "dragPan", js.undefined)
    
    @scala.inline
    def setDragRotate(value: Boolean): Self = StObject.set(x, "dragRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragRotateUndefined: Self = StObject.set(x, "dragRotate", js.undefined)
    
    @scala.inline
    def setFadeDuration(value: Double): Self = StObject.set(x, "fadeDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeDurationUndefined: Self = StObject.set(x, "fadeDuration", js.undefined)
    
    @scala.inline
    def setFailIfMajorPerformanceCaveat(value: Boolean): Self = StObject.set(x, "failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailIfMajorPerformanceCaveatUndefined: Self = StObject.set(x, "failIfMajorPerformanceCaveat", js.undefined)
    
    @scala.inline
    def setFitBoundsOptions(value: FitBoundsOptions): Self = StObject.set(x, "fitBoundsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitBoundsOptionsUndefined: Self = StObject.set(x, "fitBoundsOptions", js.undefined)
    
    @scala.inline
    def setHash(value: Boolean | String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setLocalIdeographFontFamily(value: String): Self = StObject.set(x, "localIdeographFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalIdeographFontFamilyUndefined: Self = StObject.set(x, "localIdeographFontFamily", js.undefined)
    
    @scala.inline
    def setLocale(value: StringDictionary[String]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setLogoPosition(value: `top-left` | `top-right` | `bottom-left` | `bottom-right`): Self = StObject.set(x, "logoPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoPositionUndefined: Self = StObject.set(x, "logoPosition", js.undefined)
    
    @scala.inline
    def setMaxBounds(value: LngLatBoundsLike): Self = StObject.set(x, "maxBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBoundsUndefined: Self = StObject.set(x, "maxBounds", js.undefined)
    
    @scala.inline
    def setMaxPitch(value: Double): Self = StObject.set(x, "maxPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPitchUndefined: Self = StObject.set(x, "maxPitch", js.undefined)
    
    @scala.inline
    def setMaxTileCacheSize(value: Double): Self = StObject.set(x, "maxTileCacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTileCacheSizeUndefined: Self = StObject.set(x, "maxTileCacheSize", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMinPitch(value: Double): Self = StObject.set(x, "minPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPitchUndefined: Self = StObject.set(x, "minPitch", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    @scala.inline
    def setPitchWithRotate(value: Boolean): Self = StObject.set(x, "pitchWithRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchWithRotateUndefined: Self = StObject.set(x, "pitchWithRotate", js.undefined)
    
    @scala.inline
    def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
    
    @scala.inline
    def setRefreshExpiredTiles(value: Boolean): Self = StObject.set(x, "refreshExpiredTiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshExpiredTilesUndefined: Self = StObject.set(x, "refreshExpiredTiles", js.undefined)
    
    @scala.inline
    def setRenderWorldCopies(value: Boolean): Self = StObject.set(x, "renderWorldCopies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderWorldCopiesUndefined: Self = StObject.set(x, "renderWorldCopies", js.undefined)
    
    @scala.inline
    def setScrollZoom(value: Boolean): Self = StObject.set(x, "scrollZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollZoomUndefined: Self = StObject.set(x, "scrollZoom", js.undefined)
    
    @scala.inline
    def setStyle(value: Style | String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTouchPitch(value: Boolean): Self = StObject.set(x, "touchPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchPitchUndefined: Self = StObject.set(x, "touchPitch", js.undefined)
    
    @scala.inline
    def setTouchZoomRotate(value: Boolean): Self = StObject.set(x, "touchZoomRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchZoomRotateUndefined: Self = StObject.set(x, "touchZoomRotate", js.undefined)
    
    @scala.inline
    def setTrackResize(value: Boolean): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
    
    @scala.inline
    def setTransformRequest(value: (/* url */ String, /* resourceType */ ResourceType) => RequestParameters): Self = StObject.set(x, "transformRequest", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
