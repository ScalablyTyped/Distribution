package typings.mapboxGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxGl.mapboxGlStrings.`bottom-left`
import typings.mapboxGl.mapboxGlStrings.`bottom-right`
import typings.mapboxGl.mapboxGlStrings.`top-left`
import typings.mapboxGl.mapboxGlStrings.`top-right`
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapboxOptions extends js.Object {
  
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
  implicit class MapboxOptionsOps[Self <: MapboxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainer(value: String | HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    
    @scala.inline
    def setAntialias(value: Boolean): Self = this.set("antialias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAntialias: Self = this.set("antialias", js.undefined)
    
    @scala.inline
    def setAttributionControl(value: Boolean): Self = this.set("attributionControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributionControl: Self = this.set("attributionControl", js.undefined)
    
    @scala.inline
    def setBearing(value: Double): Self = this.set("bearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBearing: Self = this.set("bearing", js.undefined)
    
    @scala.inline
    def setBearingSnap(value: Double): Self = this.set("bearingSnap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBearingSnap: Self = this.set("bearingSnap", js.undefined)
    
    @scala.inline
    def setBounds(value: LngLatBoundsLike): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    
    @scala.inline
    def setBoxZoom(value: Boolean): Self = this.set("boxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxZoom: Self = this.set("boxZoom", js.undefined)
    
    @scala.inline
    def setCenter(value: LngLatLike): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setClickTolerance(value: Double): Self = this.set("clickTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickTolerance: Self = this.set("clickTolerance", js.undefined)
    
    @scala.inline
    def setCollectResourceTiming(value: Boolean): Self = this.set("collectResourceTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectResourceTiming: Self = this.set("collectResourceTiming", js.undefined)
    
    @scala.inline
    def setCrossSourceCollisions(value: Boolean): Self = this.set("crossSourceCollisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossSourceCollisions: Self = this.set("crossSourceCollisions", js.undefined)
    
    @scala.inline
    def setCustomAttributionVarargs(value: String*): Self = this.set("customAttribution", js.Array(value :_*))
    
    @scala.inline
    def setCustomAttribution(value: String | js.Array[String]): Self = this.set("customAttribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAttribution: Self = this.set("customAttribution", js.undefined)
    
    @scala.inline
    def setDoubleClickZoom(value: Boolean): Self = this.set("doubleClickZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleClickZoom: Self = this.set("doubleClickZoom", js.undefined)
    
    @scala.inline
    def setDragPan(value: Boolean): Self = this.set("dragPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragPan: Self = this.set("dragPan", js.undefined)
    
    @scala.inline
    def setDragRotate(value: Boolean): Self = this.set("dragRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragRotate: Self = this.set("dragRotate", js.undefined)
    
    @scala.inline
    def setFadeDuration(value: Double): Self = this.set("fadeDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeDuration: Self = this.set("fadeDuration", js.undefined)
    
    @scala.inline
    def setFailIfMajorPerformanceCaveat(value: Boolean): Self = this.set("failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailIfMajorPerformanceCaveat: Self = this.set("failIfMajorPerformanceCaveat", js.undefined)
    
    @scala.inline
    def setFitBoundsOptions(value: FitBoundsOptions): Self = this.set("fitBoundsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFitBoundsOptions: Self = this.set("fitBoundsOptions", js.undefined)
    
    @scala.inline
    def setHash(value: Boolean | String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    
    @scala.inline
    def setLocalIdeographFontFamily(value: String): Self = this.set("localIdeographFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalIdeographFontFamily: Self = this.set("localIdeographFontFamily", js.undefined)
    
    @scala.inline
    def setLocale(value: StringDictionary[String]): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLogoPosition(value: `top-left` | `top-right` | `bottom-left` | `bottom-right`): Self = this.set("logoPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogoPosition: Self = this.set("logoPosition", js.undefined)
    
    @scala.inline
    def setMaxBounds(value: LngLatBoundsLike): Self = this.set("maxBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBounds: Self = this.set("maxBounds", js.undefined)
    
    @scala.inline
    def setMaxPitch(value: Double): Self = this.set("maxPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPitch: Self = this.set("maxPitch", js.undefined)
    
    @scala.inline
    def setMaxTileCacheSize(value: Double): Self = this.set("maxTileCacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTileCacheSize: Self = this.set("maxTileCacheSize", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setMinPitch(value: Double): Self = this.set("minPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPitch: Self = this.set("minPitch", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = this.set("pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePitch: Self = this.set("pitch", js.undefined)
    
    @scala.inline
    def setPitchWithRotate(value: Boolean): Self = this.set("pitchWithRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePitchWithRotate: Self = this.set("pitchWithRotate", js.undefined)
    
    @scala.inline
    def setPreserveDrawingBuffer(value: Boolean): Self = this.set("preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveDrawingBuffer: Self = this.set("preserveDrawingBuffer", js.undefined)
    
    @scala.inline
    def setRefreshExpiredTiles(value: Boolean): Self = this.set("refreshExpiredTiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshExpiredTiles: Self = this.set("refreshExpiredTiles", js.undefined)
    
    @scala.inline
    def setRenderWorldCopies(value: Boolean): Self = this.set("renderWorldCopies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderWorldCopies: Self = this.set("renderWorldCopies", js.undefined)
    
    @scala.inline
    def setScrollZoom(value: Boolean): Self = this.set("scrollZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollZoom: Self = this.set("scrollZoom", js.undefined)
    
    @scala.inline
    def setStyle(value: Style | String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTouchPitch(value: Boolean): Self = this.set("touchPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchPitch: Self = this.set("touchPitch", js.undefined)
    
    @scala.inline
    def setTouchZoomRotate(value: Boolean): Self = this.set("touchZoomRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchZoomRotate: Self = this.set("touchZoomRotate", js.undefined)
    
    @scala.inline
    def setTrackResize(value: Boolean): Self = this.set("trackResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackResize: Self = this.set("trackResize", js.undefined)
    
    @scala.inline
    def setTransformRequest(value: (/* url */ String, /* resourceType */ ResourceType) => RequestParameters): Self = this.set("transformRequest", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTransformRequest: Self = this.set("transformRequest", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
