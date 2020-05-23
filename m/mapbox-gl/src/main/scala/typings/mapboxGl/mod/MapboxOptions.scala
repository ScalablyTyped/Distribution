package typings.mapboxGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxGl.mapboxGlStrings.`bottom-left`
import typings.mapboxGl.mapboxGlStrings.`bottom-right`
import typings.mapboxGl.mapboxGlStrings.`top-left`
import typings.mapboxGl.mapboxGlStrings.`top-right`
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapboxOptions extends js.Object {
  /**
    * If specified, map will use this token instead of the one defined in mapboxgl.accessToken.
    *
    * @default null
    */
  var accessToken: js.UndefOr[String] = js.undefined
  /**
    * If true, the gl context will be created with MSA antialiasing, which can be useful for antialiasing custom layers.
    * This is false by default as a performance optimization.
    */
  var antialias: js.UndefOr[Boolean] = js.undefined
  /** If true, an attribution control will be added to the map. */
  var attributionControl: js.UndefOr[Boolean] = js.undefined
  var bearing: js.UndefOr[Double] = js.undefined
  /** Snap to north threshold in degrees. */
  var bearingSnap: js.UndefOr[Double] = js.undefined
  /** The initial bounds of the map. If bounds is specified, it overrides center and zoom constructor options. */
  var bounds: js.UndefOr[LngLatBoundsLike] = js.undefined
  /** If true, enable the "box zoom" interaction (see BoxZoomHandler) */
  var boxZoom: js.UndefOr[Boolean] = js.undefined
  /** initial map center */
  var center: js.UndefOr[LngLatLike] = js.undefined
  /**
    * The max number of pixels a user can shift the mouse pointer during a click for it to be
    * considered a valid click (as opposed to a mouse drag).
    *
    * @default 3
    */
  var clickTolerance: js.UndefOr[Double] = js.undefined
  /**
    * If `true`, Resource Timing API information will be collected for requests made by GeoJSON
    * and Vector Tile web workers (this information is normally inaccessible from the main
    * Javascript thread). Information will be returned in a `resourceTiming` property of
    * relevant `data` events.
    *
    * @default false
    */
  var collectResourceTiming: js.UndefOr[Boolean] = js.undefined
  /** ID of the container element */
  var container: String | HTMLElement
  /**
    * If `true`, symbols from multiple sources can collide with each other during collision
    * detection. If `false`, collision detection is run separately for the symbols in each source.
    *
    * @default true
    */
  var crossSourceCollisions: js.UndefOr[Boolean] = js.undefined
  /** String or strings to show in an AttributionControl.
    * Only applicable if options.attributionControl is `true`. */
  var customAttribution: js.UndefOr[String | js.Array[String]] = js.undefined
  /** If true, enable the "double click to zoom" interaction (see DoubleClickZoomHandler). */
  var doubleClickZoom: js.UndefOr[Boolean] = js.undefined
  /** If true, enable the "drag to pan" interaction (see DragPanHandler). */
  var dragPan: js.UndefOr[Boolean] = js.undefined
  /** If true, enable the "drag to rotate" interaction (see DragRotateHandler). */
  var dragRotate: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls the duration of the fade-in/fade-out animation for label collisions, in milliseconds.
    * This setting affects all symbol layers. This setting does not affect the duration of runtime
    * styling transitions or raster tile cross-fading.
    *
    * @default 300
    */
  var fadeDuration: js.UndefOr[Double] = js.undefined
  /** If true, map creation will fail if the implementation determines that the performance of the created WebGL context would be dramatically lower than expected. */
  var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined
  /** A fitBounds options object to use only when setting the bounds option. */
  var fitBoundsOptions: js.UndefOr[FitBoundsOptions] = js.undefined
  /** If `true`, the map's position (zoom, center latitude, center longitude, bearing, and pitch) will be synced with the hash fragment of the page's URL.
    * For example, `http://path/to/my/page.html#2.59/39.26/53.07/-24.1/60`.
    * An additional string may optionally be provided to indicate a parameter-styled hash,
    * e.g. http://path/to/my/page.html#map=2.59/39.26/53.07/-24.1/60&foo=bar, where foo
    * is a custom parameter and bar is an arbitrary hash distinct from the map hash.
    * */
  var hash: js.UndefOr[Boolean | String] = js.undefined
  /** If false, no mouse, touch, or keyboard listeners are attached to the map, so it will not respond to input */
  var interactive: js.UndefOr[Boolean] = js.undefined
  /** If true, enable keyboard shortcuts (see KeyboardHandler). */
  var keyboard: js.UndefOr[Boolean] = js.undefined
  /**
    * If specified, defines a CSS font-family for locally overriding generation of glyphs in the
    * 'CJK Unified Ideographs' and 'Hangul Syllables' ranges. In these ranges, font settings from
    * the map's style will be ignored, except for font-weight keywords (light/regular/medium/bold).
    * The purpose of this option is to avoid bandwidth-intensive glyph server requests.
    *
    * @default null
    */
  var localIdeographFontFamily: js.UndefOr[String] = js.undefined
  /** A patch to apply to the default localization table for UI strings, e.g. control tooltips.
    * The `locale` object maps namespaced UI string IDs to translated strings in the target language;
    * see `src/ui/default_locale.js` for an example with all supported string IDs.
    * The object may specify all UI strings (thereby adding support for a new translation) or
    * only a subset of strings (thereby patching the default translation table).
    */
  var locale: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * A string representing the position of the Mapbox wordmark on the map.
    *
    * @default "bottom-left"
    */
  var logoPosition: js.UndefOr[`top-left` | `top-right` | `bottom-left` | `bottom-right`] = js.undefined
  /** If set, the map is constrained to the given bounds. */
  var maxBounds: js.UndefOr[LngLatBoundsLike] = js.undefined
  /** Maximum pitch of the map */
  var maxPitch: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of tiles stored in the tile cache for a given source. If omitted, the
    * cache will be dynamically sized based on the current viewport.
    *
    * @default null
    */
  var maxTileCacheSize: js.UndefOr[Double] = js.undefined
  /** Maximum zoom of the map */
  var maxZoom: js.UndefOr[Double] = js.undefined
  /** Minimum pitch of the map */
  var minPitch: js.UndefOr[Double] = js.undefined
  /** Minimum zoom of the map */
  var minZoom: js.UndefOr[Double] = js.undefined
  /**
    * The initial pitch (tilt) of the map, measured in degrees away from the plane of the
    * screen (0-60).
    *
    * @default 0
    */
  var pitch: js.UndefOr[Double] = js.undefined
  /**
    * If `false`, the map's pitch (tilt) control with "drag to rotate" interaction will be disabled.
    *
    * @default true
    */
  var pitchWithRotate: js.UndefOr[Boolean] = js.undefined
  /** If true, The maps canvas can be exported to a PNG using map.getCanvas().toDataURL();. This is false by default as a performance optimization. */
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  /**
    * If `false`, the map won't attempt to re-request tiles once they expire per their HTTP
    * `cacheControl`/`expires` headers.
    *
    * @default true
    */
  var refreshExpiredTiles: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, multiple copies of the world will be rendered, when zoomed out.
    *
    * @default true
    */
  var renderWorldCopies: js.UndefOr[Boolean] = js.undefined
  /** If true, enable the "scroll to zoom" interaction */
  var scrollZoom: js.UndefOr[Boolean] = js.undefined
  /** stylesheet location */
  var style: js.UndefOr[Style | String] = js.undefined
  /** If true, the "drag to pitch" interaction is enabled */
  var touchPitch: js.UndefOr[Boolean] = js.undefined
  /** If true, enable the "pinch to rotate and zoom" interaction (see TouchZoomRotateHandler). */
  var touchZoomRotate: js.UndefOr[Boolean] = js.undefined
  /** If  true, the map will automatically resize when the browser window resizes */
  var trackResize: js.UndefOr[Boolean] = js.undefined
  /**
    * A callback run before the Map makes a request for an external URL. The callback can be
    * used to modify the url, set headers, or set the credentials property for cross-origin requests.
    *
    * @default null
    */
  var transformRequest: js.UndefOr[TransformRequestFunction] = js.undefined
  /** Initial zoom level */
  var zoom: js.UndefOr[Double] = js.undefined
}

object MapboxOptions {
  @scala.inline
  def apply(
    container: String | HTMLElement,
    accessToken: String = null,
    antialias: js.UndefOr[Boolean] = js.undefined,
    attributionControl: js.UndefOr[Boolean] = js.undefined,
    bearing: js.UndefOr[Double] = js.undefined,
    bearingSnap: js.UndefOr[Double] = js.undefined,
    bounds: LngLatBoundsLike = null,
    boxZoom: js.UndefOr[Boolean] = js.undefined,
    center: LngLatLike = null,
    clickTolerance: js.UndefOr[Double] = js.undefined,
    collectResourceTiming: js.UndefOr[Boolean] = js.undefined,
    crossSourceCollisions: js.UndefOr[Boolean] = js.undefined,
    customAttribution: String | js.Array[String] = null,
    doubleClickZoom: js.UndefOr[Boolean] = js.undefined,
    dragPan: js.UndefOr[Boolean] = js.undefined,
    dragRotate: js.UndefOr[Boolean] = js.undefined,
    fadeDuration: js.UndefOr[Double] = js.undefined,
    failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined,
    fitBoundsOptions: FitBoundsOptions = null,
    hash: Boolean | String = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    localIdeographFontFamily: String = null,
    locale: StringDictionary[String] = null,
    logoPosition: `top-left` | `top-right` | `bottom-left` | `bottom-right` = null,
    maxBounds: LngLatBoundsLike = null,
    maxPitch: js.UndefOr[Double] = js.undefined,
    maxTileCacheSize: js.UndefOr[Double] = js.undefined,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minPitch: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    pitch: js.UndefOr[Double] = js.undefined,
    pitchWithRotate: js.UndefOr[Boolean] = js.undefined,
    preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined,
    refreshExpiredTiles: js.UndefOr[Boolean] = js.undefined,
    renderWorldCopies: js.UndefOr[Boolean] = js.undefined,
    scrollZoom: js.UndefOr[Boolean] = js.undefined,
    style: Style | String = null,
    touchPitch: js.UndefOr[Boolean] = js.undefined,
    touchZoomRotate: js.UndefOr[Boolean] = js.undefined,
    trackResize: js.UndefOr[Boolean] = js.undefined,
    transformRequest: (/* url */ String, /* resourceType */ ResourceType) => RequestParameters = null,
    zoom: js.UndefOr[Double] = js.undefined
  ): MapboxOptions = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias.get.asInstanceOf[js.Any])
    if (!js.isUndefined(attributionControl)) __obj.updateDynamic("attributionControl")(attributionControl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bearing)) __obj.updateDynamic("bearing")(bearing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bearingSnap)) __obj.updateDynamic("bearingSnap")(bearingSnap.get.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(boxZoom)) __obj.updateDynamic("boxZoom")(boxZoom.get.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(clickTolerance)) __obj.updateDynamic("clickTolerance")(clickTolerance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collectResourceTiming)) __obj.updateDynamic("collectResourceTiming")(collectResourceTiming.get.asInstanceOf[js.Any])
    if (!js.isUndefined(crossSourceCollisions)) __obj.updateDynamic("crossSourceCollisions")(crossSourceCollisions.get.asInstanceOf[js.Any])
    if (customAttribution != null) __obj.updateDynamic("customAttribution")(customAttribution.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleClickZoom)) __obj.updateDynamic("doubleClickZoom")(doubleClickZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dragPan)) __obj.updateDynamic("dragPan")(dragPan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dragRotate)) __obj.updateDynamic("dragRotate")(dragRotate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeDuration)) __obj.updateDynamic("fadeDuration")(fadeDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failIfMajorPerformanceCaveat)) __obj.updateDynamic("failIfMajorPerformanceCaveat")(failIfMajorPerformanceCaveat.get.asInstanceOf[js.Any])
    if (fitBoundsOptions != null) __obj.updateDynamic("fitBoundsOptions")(fitBoundsOptions.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.get.asInstanceOf[js.Any])
    if (localIdeographFontFamily != null) __obj.updateDynamic("localIdeographFontFamily")(localIdeographFontFamily.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (logoPosition != null) __obj.updateDynamic("logoPosition")(logoPosition.asInstanceOf[js.Any])
    if (maxBounds != null) __obj.updateDynamic("maxBounds")(maxBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPitch)) __obj.updateDynamic("maxPitch")(maxPitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTileCacheSize)) __obj.updateDynamic("maxTileCacheSize")(maxTileCacheSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minPitch)) __obj.updateDynamic("minPitch")(minPitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pitchWithRotate)) __obj.updateDynamic("pitchWithRotate")(pitchWithRotate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshExpiredTiles)) __obj.updateDynamic("refreshExpiredTiles")(refreshExpiredTiles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renderWorldCopies)) __obj.updateDynamic("renderWorldCopies")(renderWorldCopies.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollZoom)) __obj.updateDynamic("scrollZoom")(scrollZoom.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(touchPitch)) __obj.updateDynamic("touchPitch")(touchPitch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchZoomRotate)) __obj.updateDynamic("touchZoomRotate")(touchZoomRotate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trackResize)) __obj.updateDynamic("trackResize")(trackResize.get.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction2(transformRequest))
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxOptions]
  }
}

