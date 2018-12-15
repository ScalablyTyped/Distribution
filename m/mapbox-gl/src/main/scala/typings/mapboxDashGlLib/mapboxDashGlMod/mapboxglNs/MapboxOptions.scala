package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MapboxOptions extends js.Object {
  /** If true, an attribution control will be added to the map. */
  var attributionControl: js.UndefOr[scala.Boolean] = js.undefined
  var bearing: js.UndefOr[scala.Double] = js.undefined
  /** Snap to north threshold in degrees. */
  var bearingSnap: js.UndefOr[scala.Double] = js.undefined
  /** If true, enable the "box zoom" interaction (see BoxZoomHandler) */
  var boxZoom: js.UndefOr[scala.Boolean] = js.undefined
  /** initial map center */
  var center: js.UndefOr[LngLatLike] = js.undefined
  /**
           * The max number of pixels a user can shift the mouse pointer during a click for it to be
           * considered a valid click (as opposed to a mouse drag).
           *
           * @default 3
           */
  var clickTolerance: js.UndefOr[scala.Double] = js.undefined
  /**
           * If `true`, Resource Timing API information will be collected for requests made by GeoJSON
           * and Vector Tile web workers (this information is normally inaccessible from the main
           * Javascript thread). Information will be returned in a `resourceTiming` property of
           * relevant `data` events.
           *
           * @default false
           */
  var collectResourceTiming: js.UndefOr[scala.Boolean] = js.undefined
  /** ID of the container element */
  var container: java.lang.String | stdLib.Element
  /**
           * If `true`, symbols from multiple sources can collide with each other during collision
           * detection. If `false`, collision detection is run separately for the symbols in each source.
           *
           * @default true
           */
  var crossSourceCollisions: js.UndefOr[scala.Boolean] = js.undefined
  /** String or strings to show in an AttributionControl.
           * Only applicable if options.attributionControl is `true`. */
  var customAttribution: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** If true, enable the "double click to zoom" interaction (see DoubleClickZoomHandler). */
  var doubleClickZoom: js.UndefOr[scala.Boolean] = js.undefined
  /** If true, enable the "drag to pan" interaction (see DragPanHandler). */
  var dragPan: js.UndefOr[scala.Boolean] = js.undefined
  /** If true, enable the "drag to rotate" interaction (see DragRotateHandler). */
  var dragRotate: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Controls the duration of the fade-in/fade-out animation for label collisions, in milliseconds.
           * This setting affects all symbol layers. This setting does not affect the duration of runtime
           * styling transitions or raster tile cross-fading.
           *
           * @default 300
           */
  var fadeDuration: js.UndefOr[scala.Double] = js.undefined
  /** If true, map creation will fail if the implementation determines that the performance of the created WebGL context would be dramatically lower than expected. */
  var failIfMajorPerformanceCaveat: js.UndefOr[scala.Boolean] = js.undefined
  /** If true, the map will track and update the page URL according to map position */
  var hash: js.UndefOr[scala.Boolean] = js.undefined
  /** If false, no mouse, touch, or keyboard listeners are attached to the map, so it will not respond to input */
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  /** If true, enable keyboard shortcuts (see KeyboardHandler). */
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If specified, defines a CSS font-family for locally overriding generation of glyphs in the
           * 'CJK Unified Ideographs' and 'Hangul Syllables' ranges. In these ranges, font settings from
           * the map's style will be ignored, except for font-weight keywords (light/regular/medium/bold).
           * The purpose of this option is to avoid bandwidth-intensive glyph server requests.
           *
           * @default null
           */
  var localIdeographFontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
           * A string representing the position of the Mapbox wordmark on the map.
           *
           * @default "bottom-left"
           */
  var logoPosition: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.`top-left` | mapboxDashGlLib.mapboxDashGlLibStrings.`top-right` | mapboxDashGlLib.mapboxDashGlLibStrings.`bottom-left` | mapboxDashGlLib.mapboxDashGlLibStrings.`bottom-right`
  ] = js.undefined
  /** If set, the map is constrained to the given bounds. */
  var maxBounds: js.UndefOr[LngLatBoundsLike] = js.undefined
  /**
           * The maximum number of tiles stored in the tile cache for a given source. If omitted, the
           * cache will be dynamically sized based on the current viewport.
           *
           * @default null
           */
  var maxTileCacheSize: js.UndefOr[scala.Double] = js.undefined
  /** Maximum zoom of the map */
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  /** Minimum zoom of the map */
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  /**
           * The initial pitch (tilt) of the map, measured in degrees away from the plane of the
           * screen (0-60).
           *
           * @default 0
           */
  var pitch: js.UndefOr[scala.Double] = js.undefined
  /**
           * If `false`, the map's pitch (tilt) control with "drag to rotate" interaction will be disabled.
           *
           * @default true
           */
  var pitchWithRotate: js.UndefOr[scala.Boolean] = js.undefined
  /** If true, The maps canvas can be exported to a PNG using map.getCanvas().toDataURL();. This is false by default as a performance optimization. */
  var preserveDrawingBuffer: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If `false`, the map won't attempt to re-request tiles once they expire per their HTTP
           * `cacheControl`/`expires` headers.
           *
           * @default true
           */
  var refreshExpiredTiles: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If `true`, multiple copies of the world will be rendered, when zoomed out.
           *
           * @default true
           */
  var renderWorldCopies: js.UndefOr[scala.Boolean] = js.undefined
  /** If true, enable the "scroll to zoom" interaction */
  var scrollZoom: js.UndefOr[scala.Boolean] = js.undefined
  /** stylesheet location */
  var style: js.UndefOr[Style | java.lang.String] = js.undefined
  /** If true, enable the "pinch to rotate and zoom" interaction (see TouchZoomRotateHandler). */
  var touchZoomRotate: js.UndefOr[scala.Boolean] = js.undefined
  /** If  true, the map will automatically resize when the browser window resizes */
  var trackResize: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * A callback run before the Map makes a request for an external URL. The callback can be
           * used to modify the url, set headers, or set the credentials property for cross-origin requests.
           *
           * @default null
           */
  var transformRequest: js.UndefOr[TransformRequestFunction] = js.undefined
  /** Initial zoom level */
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

