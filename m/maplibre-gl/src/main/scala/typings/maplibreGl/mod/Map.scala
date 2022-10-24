package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.anon.Data
import typings.maplibreGl.anon.Delegates
import typings.maplibreGl.anon.Filter
import typings.maplibreGl.anon.PartialStyleImageMetadata
import typings.maplibreGl.anon.diffbooleanundefinedStyle
import typings.maplibreGl.maplibreGlStrings.boxzoomcancel
import typings.maplibreGl.maplibreGlStrings.boxzoomend
import typings.maplibreGl.maplibreGlStrings.boxzoomstart
import typings.maplibreGl.maplibreGlStrings.click
import typings.maplibreGl.maplibreGlStrings.contextmenu
import typings.maplibreGl.maplibreGlStrings.data
import typings.maplibreGl.maplibreGlStrings.dataabort
import typings.maplibreGl.maplibreGlStrings.dataloading
import typings.maplibreGl.maplibreGlStrings.dblclick
import typings.maplibreGl.maplibreGlStrings.drag
import typings.maplibreGl.maplibreGlStrings.dragend
import typings.maplibreGl.maplibreGlStrings.dragstart
import typings.maplibreGl.maplibreGlStrings.error
import typings.maplibreGl.maplibreGlStrings.idle
import typings.maplibreGl.maplibreGlStrings.load
import typings.maplibreGl.maplibreGlStrings.mousedown
import typings.maplibreGl.maplibreGlStrings.mouseenter
import typings.maplibreGl.maplibreGlStrings.mouseleave
import typings.maplibreGl.maplibreGlStrings.mousemove
import typings.maplibreGl.maplibreGlStrings.mouseout
import typings.maplibreGl.maplibreGlStrings.mouseover
import typings.maplibreGl.maplibreGlStrings.mouseup
import typings.maplibreGl.maplibreGlStrings.move
import typings.maplibreGl.maplibreGlStrings.moveend
import typings.maplibreGl.maplibreGlStrings.movestart
import typings.maplibreGl.maplibreGlStrings.pitch
import typings.maplibreGl.maplibreGlStrings.pitchend
import typings.maplibreGl.maplibreGlStrings.pitchstart
import typings.maplibreGl.maplibreGlStrings.remove
import typings.maplibreGl.maplibreGlStrings.render
import typings.maplibreGl.maplibreGlStrings.resize
import typings.maplibreGl.maplibreGlStrings.rotate
import typings.maplibreGl.maplibreGlStrings.rotateend
import typings.maplibreGl.maplibreGlStrings.rotatestart
import typings.maplibreGl.maplibreGlStrings.sourcedata
import typings.maplibreGl.maplibreGlStrings.sourcedataabort
import typings.maplibreGl.maplibreGlStrings.sourcedataloading
import typings.maplibreGl.maplibreGlStrings.styledata
import typings.maplibreGl.maplibreGlStrings.styledataloading
import typings.maplibreGl.maplibreGlStrings.styleimagemissing
import typings.maplibreGl.maplibreGlStrings.terrain
import typings.maplibreGl.maplibreGlStrings.tiledataloading
import typings.maplibreGl.maplibreGlStrings.touchcancel
import typings.maplibreGl.maplibreGlStrings.touchend
import typings.maplibreGl.maplibreGlStrings.touchmove
import typings.maplibreGl.maplibreGlStrings.touchstart
import typings.maplibreGl.maplibreGlStrings.webglcontextlost
import typings.maplibreGl.maplibreGlStrings.webglcontextrestored
import typings.maplibreGl.maplibreGlStrings.wheel
import typings.maplibreGl.maplibreGlStrings.zoom
import typings.maplibreGl.maplibreGlStrings.zoomend
import typings.maplibreGl.maplibreGlStrings.zoomstart
import typings.std.ErrorEvent
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import typings.std.ImageData
import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Map")
@js.native
open class Map protected () extends Camera {
  def this(options: MapOptions) = this()
  
  var _antialias: Boolean = js.native
  
  var _canvas: HTMLCanvasElement = js.native
  
  var _canvasContainer: HTMLElement = js.native
  
  var _clickTolerance: Double = js.native
  
  var _collectResourceTiming: Boolean = js.native
  
  var _container: HTMLElement = js.native
  
  def _containerDimensions(): js.Array[Double] = js.native
  
  def _contextLost(event: Any): scala.Unit = js.native
  
  def _contextRestored(event: Any): scala.Unit = js.native
  
  var _controlContainer: HTMLElement = js.native
  
  var _controlPositions: StringDictionary[HTMLElement] = js.native
  
  var _controls: js.Array[IControl] = js.native
  
  var _cooperativeGestures: Boolean | GestureOptions = js.native
  
  var _cooperativeGesturesScreen: HTMLElement = js.native
  
  def _createDelegatedListener(`type`: String, layerId: String, listener: Listener): Delegates = js.native
  def _createDelegatedListener(`type`: MapEvent, layerId: String, listener: Listener): Delegates = js.native
  
  var _crossFadingFactor: Double = js.native
  
  var _crossSourceCollisions: Boolean = js.native
  
  var _delegatedListeners: Any = js.native
  
  def _diffStyle(style: String): scala.Unit = js.native
  def _diffStyle(style: String, options: diffbooleanundefinedStyle): scala.Unit = js.native
  def _diffStyle(style: StyleSpecification): scala.Unit = js.native
  def _diffStyle(style: StyleSpecification, options: diffbooleanundefinedStyle): scala.Unit = js.native
  
  var _fadeDuration: Double = js.native
  
  var _failIfMajorPerformanceCaveat: Boolean = js.native
  
  var _frame: Cancelable = js.native
  
  var _fullyLoaded: Boolean = js.native
  
  def _getMapId(): Double = js.native
  
  def _getUIString(key: String): Any = js.native
  
  var _hash: Hash = js.native
  
  var _interactive: Boolean = js.native
  
  def _lazyInitEmptyStyle(): scala.Unit = js.native
  
  var _loaded: Boolean = js.native
  
  var _localIdeographFontFamily: String = js.native
  
  var _locale: Any = js.native
  
  var _mapId: Double = js.native
  
  var _maxTileCacheSize: Double = js.native
  
  var _metaPress: Boolean = js.native
  
  def _onCooperativeGesture(event: Any, metaPress: Any, touches: Any): Boolean = js.native
  
  def _onMapScroll(event: Any): Boolean = js.native
  
  def _onWindowOnline(): scala.Unit = js.native
  
  def _onWindowResize(event: Event): scala.Unit = js.native
  
  var _pixelRatio: Double = js.native
  
  var _placementDirty: Boolean = js.native
  
  var _preserveDrawingBuffer: Boolean = js.native
  
  var _refreshExpiredTiles: Boolean = js.native
  
  var _removed: Boolean = js.native
  
  /**
  	 * Call when a (re-)render of the map is required:
  	 * - The style has changed (`setPaintProperty()`, etc.)
  	 * - Source data has changed (e.g. tiles have finished loading)
  	 * - The map has is moving (or just finished moving)
  	 * - A transition is in progress
  	 *
  	 * @param {number} paintStartTimeStamp  The time when the animation frame began executing.
  	 *
  	 * @returns {Map} this
  	 * @private
  	 */
  def _render(paintStartTimeStamp: Double): this.type = js.native
  
  var _renderTaskQueue: TaskQueue = js.native
  
  var _repaint: Boolean = js.native
  
  var _requestManager: RequestManager = js.native
  
  def _resizeCanvas(width: Double, height: Double, pixelRatio: Double): scala.Unit = js.native
  
  def _setCacheLimits(limit: Double, checkThreshold: Double): scala.Unit = js.native
  
  def _setupContainer(): scala.Unit = js.native
  
  def _setupCooperativeGestures(): scala.Unit = js.native
  
  def _setupPainter(): scala.Unit = js.native
  
  var _showCollisionBoxes: Boolean = js.native
  
  var _showOverdrawInspector: Boolean = js.native
  
  var _showPadding: Boolean = js.native
  
  var _showTileBoundaries: Boolean = js.native
  
  var _sourcesDirty: Boolean = js.native
  
  var _styleDirty: Boolean = js.native
  
  var _trackResize: Boolean = js.native
  
  /**
  	 * Update this map's style and sources, and re-render the map.
  	 *
  	 * @param {boolean} updateStyle mark the map's style for reprocessing as
  	 * well as its sources
  	 * @returns {Map} this
  	 * @private
  	 */
  def _update(): this.type = js.native
  def _update(updateStyle: Boolean): this.type = js.native
  
  def _updateDiff(style: StyleSpecification): scala.Unit = js.native
  def _updateDiff(style: StyleSpecification, options: diffbooleanundefinedStyle): scala.Unit = js.native
  
  def _updateStyle(): this.type = js.native
  def _updateStyle(style: String): this.type = js.native
  def _updateStyle(style: String, options: diffbooleanundefinedStyle): this.type = js.native
  def _updateStyle(style: Null, options: diffbooleanundefinedStyle): this.type = js.native
  def _updateStyle(style: StyleSpecification): this.type = js.native
  def _updateStyle(style: StyleSpecification, options: diffbooleanundefinedStyle): this.type = js.native
  
  var _vertices: Boolean = js.native
  
  /**
  	 * Adds an {@link IControl} to the map, calling `control.onAdd(this)`.
  	 *
  	 * @param {IControl} control The {@link IControl} to add.
  	 * @param {string} [position] position on the map to which the control will be added.
  	 * Valid values are `'top-left'`, `'top-right'`, `'bottom-left'`, and `'bottom-right'`. Defaults to `'top-right'`.
  	 * @returns {Map} `this`
  	 * @example
  	 * // Add zoom and rotation controls to the map.
  	 * map.addControl(new maplibregl.NavigationControl());
  	 * @see [Display map navigation controls](https://maplibre.org/maplibre-gl-js-docs/example/navigation/)
  	 */
  def addControl(control: IControl): this.type = js.native
  def addControl(control: IControl, position: ControlPosition): this.type = js.native
  
  def addImage(id: String, image: Data): this.type = js.native
  def addImage(id: String, image: Data, param2: PartialStyleImageMetadata): this.type = js.native
  def addImage(id: String, image: StyleImageInterface): this.type = js.native
  def addImage(id: String, image: StyleImageInterface, param2: PartialStyleImageMetadata): this.type = js.native
  /**
  	 * Add an image to the style. This image can be displayed on the map like any other icon in the style's
  	 * sprite using the image's ID with
  	 * [`icon-image`](https://maplibre.org/maplibre-gl-js-docs/style-spec/#layout-symbol-icon-image),
  	 * [`background-pattern`](https://maplibre.org/maplibre-gl-js-docs/style-spec/#paint-background-background-pattern),
  	 * [`fill-pattern`](https://maplibre.org/maplibre-gl-js-docs/style-spec/#paint-fill-fill-pattern),
  	 * or [`line-pattern`](https://maplibre.org/maplibre-gl-js-docs/style-spec/#paint-line-line-pattern).
  	 * A {@link Map.event:error} event will be fired if there is not enough space in the sprite to add this image.
  	 *
  	 * @param id The ID of the image.
  	 * @param image The image as an `HTMLImageElement`, `ImageData`, `ImageBitmap` or object with `width`, `height`, and `data`
  	 * properties with the same format as `ImageData`.
  	 * @param options Options object.
  	 * @param options.pixelRatio The ratio of pixels in the image to physical pixels on the screen
  	 * @param options.sdf Whether the image should be interpreted as an SDF image
  	 * @param options.content `[x1, y1, x2, y2]`  If `icon-text-fit` is used in a layer with this image, this option defines the part of the image that can be covered by the content in `text-field`.
  	 * @param options.stretchX `[[x1, x2], ...]` If `icon-text-fit` is used in a layer with this image, this option defines the part(s) of the image that can be stretched horizontally.
  	 * @param options.stretchY `[[y1, y2], ...]` If `icon-text-fit` is used in a layer with this image, this option defines the part(s) of the image that can be stretched vertically.
  	 *
  	 * @example
  	 * // If the style's sprite does not already contain an image with ID 'cat',
  	 * // add the image 'cat-icon.png' to the style's sprite with the ID 'cat'.
  	 * map.loadImage('https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/Cat_silhouette.svg/400px-Cat_silhouette.svg.png', function(error, image) {
  	 *    if (error) throw error;
  	 *    if (!map.hasImage('cat')) map.addImage('cat', image);
  	 * });
  	 *
  	 *
  	 * // Add a stretchable image that can be used with `icon-text-fit`
  	 * // In this example, the image is 600px wide by 400px high.
  	 * map.loadImage('https://upload.wikimedia.org/wikipedia/commons/8/89/Black_and_White_Boxed_%28bordered%29.png', function(error, image) {
  	 *    if (error) throw error;
  	 *    if (!map.hasImage('border-image')) {
  	 *      map.addImage('border-image', image, {
  	 *          content: [16, 16, 300, 384], // place text over left half of image, avoiding the 16px border
  	 *          stretchX: [[16, 584]], // stretch everything horizontally except the 16px border
  	 *          stretchY: [[16, 384]], // stretch everything vertically except the 16px border
  	 *      });
  	 *    }
  	 * });
  	 *
  	 *
  	 * @see Use `HTMLImageElement`: [Add an icon to the map](https://maplibre.org/maplibre-gl-js-docs/example/add-image/)
  	 * @see Use `ImageData`: [Add a generated icon to the map](https://maplibre.org/maplibre-gl-js-docs/example/add-image-generated/)
  	 */
  def addImage(id: String, image: HTMLImageElement): this.type = js.native
  def addImage(id: String, image: HTMLImageElement, param2: PartialStyleImageMetadata): this.type = js.native
  def addImage(id: String, image: ImageBitmap): this.type = js.native
  def addImage(id: String, image: ImageBitmap, param2: PartialStyleImageMetadata): this.type = js.native
  def addImage(id: String, image: ImageData): this.type = js.native
  def addImage(id: String, image: ImageData, param2: PartialStyleImageMetadata): this.type = js.native
  
  /**
  	 * Adds a [MapLibre style layer](https://maplibre.org/maplibre-gl-js-docs/style-spec/#layers)
  	 * to the map's style.
  	 *
  	 * A layer defines how data from a specified source will be styled. Read more about layer types
  	 * and available paint and layout properties in the [MapLibre Style Specification](https://maplibre.org/maplibre-gl-js-docs/style-spec/#layers).
  	 *
  	 * TODO: JSDoc can't pass @param {(LayerSpecification & {source?: string | SourceSpecification}) | CustomLayerInterface} layer The layer to add,
  	 * @param {Object} layer
  	 * conforming to either the MapLibre Style Specification's [layer definition](https://maplibre.org/maplibre-gl-js-docs/style-spec/#layers) or,
  	 * less commonly, the {@link CustomLayerInterface} specification.
  	 * The MapLibre Style Specification's layer definition is appropriate for most layers.
  	 *
  	 * @param {string} layer.id A unique identifer that you define.
  	 * @param {string} layer.type The type of layer (for example `fill` or `symbol`).
  	 * A list of layer types is available in the [MapLibre Style Specification](https://maplibre.org/maplibre-gl-js-docs/style-spec/layers/#type).
  	 *
  	 * (This can also be `custom`. For more information, see {@link CustomLayerInterface}.)
  	 * @param {string | SourceSpecification} [layer.source] The data source for the layer.
  	 * Reference a source that has _already been defined_ using the source's unique id.
  	 * Reference a _new source_ using a source object (as defined in the [MapLibre Style Specification](https://maplibre.org/maplibre-gl-js-docs/style-spec/sources/)) directly.
  	 * This is **required** for all `layer.type` options _except_ for `custom` and `background`.
  	 * @param {string} [layer.sourceLayer] (optional) The name of the source layer within the specified `layer.source` to use for this style layer.
  	 * This is only applicable for vector tile sources and is **required** when `layer.source` is of the type `vector`.
  	 * @param {array} [layer.filter] (optional) An expression specifying conditions on source features.
  	 * Only features that match the filter are displayed.
  	 * The MapLibre Style Specification includes more information on the limitations of the [`filter`](https://maplibre.org/maplibre-gl-js-docs/style-spec/layers/#filter) parameter
  	 * and a complete list of available [expressions](https://maplibre.org/maplibre-gl-js-docs/style-spec/expressions/).
  	 * If no filter is provided, all features in the source (or source layer for vector tilesets) will be displayed.
  	 * @param {Object} [layer.paint] (optional) Paint properties for the layer.
  	 * Available paint properties vary by `layer.type`.
  	 * A full list of paint properties for each layer type is available in the [MapLibre Style Specification](https://maplibre.org/maplibre-gl-js-docs/style-spec/layers/).
  	 * If no paint properties are specified, default values will be used.
  	 * @param {Object} [layer.layout] (optional) Layout properties for the layer.
  	 * Available layout properties vary by `layer.type`.
  	 * A full list of layout properties for each layer type is available in the [MapLibre Style Specification](https://maplibre.org/maplibre-gl-js-docs/style-spec/layers/).
  	 * If no layout properties are specified, default values will be used.
  	 * @param {number} [layer.maxzoom] (optional) The maximum zoom level for the layer.
  	 * At zoom levels equal to or greater than the maxzoom, the layer will be hidden.
  	 * The value can be any number between `0` and `24` (inclusive).
  	 * If no maxzoom is provided, the layer will be visible at all zoom levels for which there are tiles available.
  	 * @param {number} [layer.minzoom] (optional) The minimum zoom level for the layer.
  	 * At zoom levels less than the minzoom, the layer will be hidden.
  	 * The value can be any number between `0` and `24` (inclusive).
  	 * If no minzoom is provided, the layer will be visible at all zoom levels for which there are tiles available.
  	 * @param {Object} [layer.metadata] (optional) Arbitrary properties useful to track with the layer, but do not influence rendering.
  	 * @param {string} [layer.renderingMode] This is only applicable for layers with the type `custom`.
  	 * See {@link CustomLayerInterface} for more information.
  	 * @param {string} [beforeId] The ID of an existing layer to insert the new layer before,
  	 * resulting in the new layer appearing visually beneath the existing layer.
  	 * If this argument is not specified, the layer will be appended to the end of the layers array
  	 * and appear visually above all other layers.
  	 *
  	 * @returns {Map} `this`
  	 *
  	 * @example
  	 * // Add a circle layer with a vector source
  	 * map.addLayer({
  	 *   id: 'points-of-interest',
  	 *   source: {
  	 *     type: 'vector',
  	 *     url: 'https://demotiles.maplibre.org/tiles/tiles.json'
  	 *   },
  	 *   'source-layer': 'poi_label',
  	 *   type: 'circle',
  	 *   paint: {
  	 *     // MapLibre Style Specification paint properties
  	 *   },
  	 *   layout: {
  	 *     // MapLibre Style Specification layout properties
  	 *   }
  	 * });
  	 *
  	 * @example
  	 * // Define a source before using it to create a new layer
  	 * map.addSource('state-data', {
  	 *   type: 'geojson',
  	 *   data: 'path/to/data.geojson'
  	 * });
  	 *
  	 * map.addLayer({
  	 *   id: 'states',
  	 *   // References the GeoJSON source defined above
  	 *   // and does not require a `source-layer`
  	 *   source: 'state-data',
  	 *   type: 'symbol',
  	 *   layout: {
  	 *     // Set the label content to the
  	 *     // feature's `name` property
  	 *     text-field: ['get', 'name']
  	 *   }
  	 * });
  	 *
  	 * @example
  	 * // Add a new symbol layer before an existing layer
  	 * map.addLayer({
  	 *   id: 'states',
  	 *   // References a source that's already been defined
  	 *   source: 'state-data',
  	 *   type: 'symbol',
  	 *   layout: {
  	 *     // Set the label content to the
  	 *     // feature's `name` property
  	 *     text-field: ['get', 'name']
  	 *   }
  	 * // Add the layer before the existing `cities` layer
  	 * }, 'cities');
  	 *
  	 * @see [Create and style clusters](https://maplibre.org/maplibre-gl-js-docs/example/cluster/)
  	 * @see [Add a vector tile source](https://maplibre.org/maplibre-gl-js-docs/example/vector-source/)
  	 * @see [Add a WMS source](https://maplibre.org/maplibre-gl-js-docs/example/wms/)
  	 */
  def addLayer(layer: LayerSpecification & typings.maplibreGl.anon.Source): this.type = js.native
  def addLayer(layer: LayerSpecification & typings.maplibreGl.anon.Source, beforeId: String): this.type = js.native
  def addLayer(layer: CustomLayerInterface): this.type = js.native
  def addLayer(layer: CustomLayerInterface, beforeId: String): this.type = js.native
  
  /**
  	 * Adds a source to the map's style.
  	 *
  	 * @param {string} id The ID of the source to add. Must not conflict with existing sources.
  	 * @param {Object} source The source object, conforming to the
  	 * MapLibre Style Specification's [source definition](https://maplibre.org/maplibre-gl-js-docs/style-spec/#sources) or
  	 * {@link CanvasSourceOptions}.
  	 * @fires source.add
  	 * @returns {Map} `this`
  	 * @example
  	 * map.addSource('my-data', {
  	 *   type: 'vector',
  	 *   url: 'https://demotiles.maplibre.org/tiles/tiles.json'
  	 * });
  	 * @example
  	 * map.addSource('my-data', {
  	 *   "type": "geojson",
  	 *   "data": {
  	 *     "type": "Feature",
  	 *     "geometry": {
  	 *       "type": "Point",
  	 *       "coordinates": [-77.0323, 38.9131]
  	 *     },
  	 *     "properties": {
  	 *       "title": "Mapbox DC",
  	 *       "marker-symbol": "monument"
  	 *     }
  	 *   }
  	 * });
  	 * @see GeoJSON source: [Add live realtime data](https://maplibre.org/maplibre-gl-js-docs/example/live-geojson/)
  	 */
  def addSource(id: String, source: SourceSpecification): this.type = js.native
  
  /**
  	 * Adds a [custom source type](#Custom Sources), making it available for use with
  	 * {@link Map#addSource}.
  	 * @private
  	 * @param {string} name The name of the source type; source definition objects use this name in the `{type: ...}` field.
  	 * @param {Function} SourceType A {@link Source} constructor.
  	 * @param {Callback<void>} callback Called when the source type is ready or with an error argument if there is an error.
  	 */
  def addSourceType(name: String, SourceType: Any, callback: Callback[scala.Unit]): scala.Unit = js.native
  
  /**
  	 * Returns a Boolean indicating whether all tiles in the viewport from all sources on
  	 * the style are loaded.
  	 *
  	 * @returns {boolean} A Boolean indicating whether all tiles are loaded.
  	 * @example
  	 * var tilesLoaded = map.areTilesLoaded();
  	 */
  def areTilesLoaded(): Boolean = js.native
  
  /**
  	 * The map's {@link BoxZoomHandler}, which implements zooming using a drag gesture with the Shift key pressed.
  	 * Find more details and examples using `boxZoom` in the {@link BoxZoomHandler} section.
  	 */
  var boxZoom: BoxZoomHandler = js.native
  
  /**
  	 * The map's {@link DoubleClickZoomHandler}, which allows the user to zoom by double clicking.
  	 * Find more details and examples using `doubleClickZoom` in the {@link DoubleClickZoomHandler} section.
  	 */
  var doubleClickZoom: DoubleClickZoomHandler = js.native
  
  /**
  	 * The map's {@link DragPanHandler}, which implements dragging the map with a mouse or touch gesture.
  	 * Find more details and examples using `dragPan` in the {@link DragPanHandler} section.
  	 */
  var dragPan: DragPanHandler = js.native
  
  /**
  	 * The map's {@link DragRotateHandler}, which implements rotating the map while dragging with the right
  	 * mouse button or with the Control key pressed. Find more details and examples using `dragRotate`
  	 * in the {@link DragRotateHandler} section.
  	 */
  var dragRotate: DragRotateHandler = js.native
  
  /**
  	 * Returns the map's geographical bounds. When the bearing or pitch is non-zero, the visible region is not
  	 * an axis-aligned rectangle, and the result is the smallest bounds that encompasses the visible region.
  	 * @returns {LngLatBounds} The geographical bounds of the map as {@link LngLatBounds}.
  	 * @example
  	 * var bounds = map.getBounds();
  	 */
  def getBounds(): LngLatBounds = js.native
  
  /**
  	 * Returns the map's `<canvas>` element.
  	 *
  	 * @returns {HTMLCanvasElement} The map's `<canvas>` element.
  	 * @see [Measure distances](https://maplibre.org/maplibre-gl-js-docs/example/measure/)
  	 * @see [Display a popup on hover](https://maplibre.org/maplibre-gl-js-docs/example/popup-on-hover/)
  	 * @see [Center the map on a clicked symbol](https://maplibre.org/maplibre-gl-js-docs/example/center-on-symbol/)
  	 */
  def getCanvas(): HTMLCanvasElement = js.native
  
  /**
  	 * Returns the HTML element containing the map's `<canvas>` element.
  	 *
  	 * If you want to add non-GL overlays to the map, you should append them to this element.
  	 *
  	 * This is the element to which event bindings for map interactivity (such as panning and zooming) are
  	 * attached. It will receive bubbled events from child elements such as the `<canvas>`, but not from
  	 * map controls.
  	 *
  	 * @returns {HTMLElement} The container of the map's `<canvas>`.
  	 * @see [Create a draggable point](https://maplibre.org/maplibre-gl-js-docs/example/drag-a-point/)
  	 */
  def getCanvasContainer(): HTMLElement = js.native
  
  /**
  	 * Returns the map's containing HTML element.
  	 *
  	 * @returns {HTMLElement} The map's container.
  	 */
  def getContainer(): HTMLElement = js.native
  
  /**
  	 * Gets the `state` of a feature.
  	 * A feature's `state` is a set of user-defined key-value pairs that are assigned to a feature at runtime.
  	 * Features are identified by their `feature.id` attribute, which can be any number or string.
  	 *
  	 * _Note: To access the values in a feature's state object for the purposes of styling the feature, use the [`feature-state` expression](https://maplibre.org/maplibre-gl-js-docs/style-spec/expressions/#feature-state)._
  	 *
  	 * @param {Object} feature Feature identifier. Feature objects returned from
  	 * {@link Map#queryRenderedFeatures} or event handlers can be used as feature identifiers.
  	 * @param {string | number} feature.id Unique id of the feature.
  	 * @param {string} feature.source The id of the vector or GeoJSON source for the feature.
  	 * @param {string} [feature.sourceLayer] (optional) *For vector tile sources, `sourceLayer` is required.*
  	 *
  	 * @returns {Object} The state of the feature: a set of key-value pairs that was assigned to the feature at runtime.
  	 *
  	 * @example
  	 * // When the mouse moves over the `my-layer` layer,
  	 * // get the feature state for the feature under the mouse
  	 * map.on('mousemove', 'my-layer', function(e) {
  	 *   if (e.features.length > 0) {
  	 *     map.getFeatureState({
  	 *       source: 'my-source',
  	 *       sourceLayer: 'my-source-layer',
  	 *       id: e.features[0].id
  	 *     });
  	 *   }
  	 * });
  	 *
  	 */
  def getFeatureState(feature: FeatureIdentifier): Any = js.native
  
  /**
  	 * Returns the filter applied to the specified style layer.
  	 *
  	 * @param {string} layerId The ID of the style layer whose filter to get.
  	 * @returns {Array} The layer's filter.
  	 */
  def getFilter(layerId: String): scala.Unit | FilterSpecification = js.native
  
  /**
  	 * Returns the layer with the specified ID in the map's style.
  	 *
  	 * @param {string} id The ID of the layer to get.
  	 * @returns {StyleLayer} The layer with the specified ID, or `undefined`
  	 *   if the ID corresponds to no existing layers.
  	 *
  	 * @example
  	 * var stateDataLayer = map.getLayer('state-data');
  	 *
  	 * @see [Filter symbols by toggling a list](https://maplibre.org/maplibre-gl-js-docs/example/filter-markers/)
  	 * @see [Filter symbols by text input](https://maplibre.org/maplibre-gl-js-docs/example/filter-markers-by-input/)
  	 */
  def getLayer(id: String): StyleLayer = js.native
  
  /**
  	 * Returns the value of a layout property in the specified style layer.
  	 *
  	 * @param {string} layerId The ID of the layer to get the layout property from.
  	 * @param {string} name The name of the layout property to get.
  	 * @returns {*} The value of the specified layout property.
  	 */
  def getLayoutProperty(layerId: String, name: String): Any = js.native
  
  /**
  	 * Returns the value of the light object.
  	 *
  	 * @returns {Object} light Light properties of the style.
  	 */
  def getLight(): Any = js.native
  
  /**
  	 * Returns the maximum geographical bounds the map is constrained to, or `null` if none set.
  	 * @returns The map object.
  	 * @example
  	 * var maxBounds = map.getMaxBounds();
  	 */
  def getMaxBounds(): LngLatBounds | Null = js.native
  
  /**
  	 * Returns the map's maximum allowable pitch.
  	 *
  	 * @returns {number} maxPitch
  	 */
  def getMaxPitch(): Double = js.native
  
  /**
  	 * Returns the map's maximum allowable zoom level.
  	 *
  	 * @returns {number} maxZoom
  	 * @example
  	 * var maxZoom = map.getMaxZoom();
  	 */
  def getMaxZoom(): Double = js.native
  
  /**
  	 * Returns the map's minimum allowable pitch.
  	 *
  	 * @returns {number} minPitch
  	 */
  def getMinPitch(): Double = js.native
  
  /**
  	 * Returns the map's minimum allowable zoom level.
  	 *
  	 * @returns {number} minZoom
  	 * @example
  	 * var minZoom = map.getMinZoom();
  	 */
  def getMinZoom(): Double = js.native
  
  /**
  	 * Returns the value of a paint property in the specified style layer.
  	 *
  	 * @param {string} layerId The ID of the layer to get the paint property from.
  	 * @param {string} name The name of a paint property to get.
  	 * @returns {*} The value of the specified paint property.
  	 */
  def getPaintProperty(layerId: String, name: String): Any = js.native
  
  /**
  	 * Returns the map's pixel ratio.
  	 * @returns {number} The pixel ratio.
  	 */
  def getPixelRatio(): Double = js.native
  
  /**
  	 * Returns the state of `renderWorldCopies`. If `true`, multiple copies of the world will be rendered side by side beyond -180 and 180 degrees longitude. If set to `false`:
  	 * - When the map is zoomed out far enough that a single representation of the world does not fill the map's entire
  	 * container, there will be blank space beyond 180 and -180 degrees longitude.
  	 * - Features that cross 180 and -180 degrees longitude will be cut in two (with one portion on the right edge of the
  	 * map and the other on the left edge of the map) at every zoom level.
  	 * @returns {boolean} renderWorldCopies
  	 * @example
  	 * var worldCopiesRendered = map.getRenderWorldCopies();
  	 * @see [Render world copies](https://maplibre.org/maplibre-gl-js-docs/example/render-world-copies/)
  	 */
  def getRenderWorldCopies(): Boolean = js.native
  
  /**
  	 * Returns the source with the specified ID in the map's style.
  	 *
  	 * This method is often used to update a source using the instance members for the relevant
  	 * source type as defined in [Sources](#sources).
  	 * For example, setting the `data` for a GeoJSON source or updating the `url` and `coordinates`
  	 * of an image source.
  	 *
  	 * @param {string} id The ID of the source to get.
  	 * @returns {Source | undefined} The style source with the specified ID or `undefined` if the ID
  	 * corresponds to no existing sources.
  	 * The shape of the object varies by source type.
  	 * A list of options for each source type is available on the MapLibre Style Specification's
  	 * [Sources](https://maplibre.org/maplibre-gl-js-docs/style-spec/sources/) page.
  	 * @example
  	 * var sourceObject = map.getSource('points');
  	 * @see [Create a draggable point](https://maplibre.org/maplibre-gl-js-docs/example/drag-a-point/)
  	 * @see [Animate a point](https://maplibre.org/maplibre-gl-js-docs/example/animate-point-along-line/)
  	 * @see [Add live realtime data](https://maplibre.org/maplibre-gl-js-docs/example/live-geojson/)
  	 */
  def getSource(id: String): js.UndefOr[Source] = js.native
  
  /**
  	 * Returns the map's MapLibre style object, a JSON object which can be used to recreate the map's style.
  	 *
  	 * @returns {Object} The map's style JSON object.
  	 *
  	 * @example
  	 * var styleJson = map.getStyle();
  	 *
  	 */
  def getStyle(): StyleSpecification = js.native
  
  /**
  	 * Get the terrain-options if terrain is loaded
  	 * @returns {TerrainSpecification} the TerrainSpecification passed to setTerrain
  	 * @example
  	 * map.getTerrain(); // { source: 'terrain' };
  	 */
  def getTerrain(): TerrainSpecification = js.native
  
  var handlers: HandlerManager = js.native
  
  /**
  	 * Checks if a control exists on the map.
  	 *
  	 * @param {IControl} control The {@link IControl} to check.
  	 * @returns {boolean} True if map contains control.
  	 * @example
  	 * // Define a new navigation control.
  	 * var navigation = new maplibregl.NavigationControl();
  	 * // Add zoom and rotation controls to the map.
  	 * map.addControl(navigation);
  	 * // Check that the navigation control exists on the map.
  	 * map.hasControl(navigation);
  	 */
  def hasControl(control: IControl): Boolean = js.native
  
  /**
  	 * Check whether or not an image with a specific ID exists in the style. This checks both images
  	 * in the style's original sprite and any images
  	 * that have been added at runtime using {@link Map#addImage}.
  	 *
  	 * @param id The ID of the image.
  	 *
  	 * @returns {boolean} A Boolean indicating whether the image exists.
  	 * @example
  	 * // Check if an image with the ID 'cat' exists in
  	 * // the style's sprite.
  	 * var catIconExists = map.hasImage('cat');
  	 */
  def hasImage(id: String): Boolean = js.native
  
  /**
  	 * Returns true if the map is panning, zooming, rotating, or pitching due to a camera animation or user gesture.
  	 * @returns {boolean} True if the map is moving.
  	 * @example
  	 * var isMoving = map.isMoving();
  	 */
  def isMoving(): Boolean = js.native
  
  /**
  	 * Returns true if the map is rotating due to a camera animation or user gesture.
  	 * @returns {boolean} True if the map is rotating.
  	 * @example
  	 * map.isRotating();
  	 */
  def isRotating(): Boolean = js.native
  
  /**
  	 * Returns a Boolean indicating whether the source is loaded. Returns `true` if the source with
  	 * the given ID in the map's style has no outstanding network requests, otherwise `false`.
  	 *
  	 * @param {string} id The ID of the source to be checked.
  	 * @returns {boolean} A Boolean indicating whether the source is loaded.
  	 * @example
  	 * var sourceLoaded = map.isSourceLoaded('bathymetry-data');
  	 */
  def isSourceLoaded(id: String): Boolean = js.native
  
  /**
  	 * Returns a Boolean indicating whether the map's style is fully loaded.
  	 *
  	 * @returns {boolean} A Boolean indicating whether the style is fully loaded.
  	 *
  	 * @example
  	 * var styleLoadStatus = map.isStyleLoaded();
  	 */
  def isStyleLoaded(): Boolean | scala.Unit = js.native
  
  /**
  	 * Returns true if the map is zooming due to a camera animation or user gesture.
  	 * @returns {boolean} True if the map is zooming.
  	 * @example
  	 * var isZooming = map.isZooming();
  	 */
  def isZooming(): Boolean = js.native
  
  /**
  	 * The map's {@link KeyboardHandler}, which allows the user to zoom, rotate, and pan the map using keyboard
  	 * shortcuts. Find more details and examples using `keyboard` in the {@link KeyboardHandler} section.
  	 */
  var keyboard: KeyboardHandler = js.native
  
  /**
  	 * Returns an Array of strings containing the IDs of all images currently available in the map.
  	 * This includes both images from the style's original sprite
  	 * and any images that have been added at runtime using {@link Map#addImage}.
  	 *
  	 * @returns {Array<string>} An Array of strings containing the names of all sprites/images currently available in the map.
  	 *
  	 * @example
  	 * var allImages = map.listImages();
  	 *
  	 */
  def listImages(): js.Array[String] = js.native
  
  /**
  	 * Load an image from an external URL to be used with {@link Map#addImage}. External
  	 * domains must support [CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/Access_control_CORS).
  	 *
  	 * @param {string} url The URL of the image file. Image file must be in png, webp, or jpg format.
  	 * @param {Callback<HTMLImageElement | ImageBitmap>} callback Expecting `callback(error, data)`. Called when the image has loaded or with an error argument if there is an error.
  	 *
  	 * @example
  	 * // Load an image from an external URL.
  	 * map.loadImage('http://placekitten.com/50/50', function(error, image) {
  	 *   if (error) throw error;
  	 *   // Add the loaded image to the style's sprite with the ID 'kitten'.
  	 *   map.addImage('kitten', image);
  	 * });
  	 *
  	 * @see [Add an icon to the map](https://maplibre.org/maplibre-gl-js-docs/example/add-image/)
  	 */
  def loadImage(url: String, callback: GetImageCallback): scala.Unit = js.native
  
  /**
  	 * Returns a Boolean indicating whether the map is fully loaded.
  	 *
  	 * Returns `false` if the style is not yet fully loaded,
  	 * or if there has been a change to the sources or style that
  	 * has not yet fully loaded.
  	 *
  	 * @returns {boolean} A Boolean indicating whether the map is fully loaded.
  	 */
  def loaded(): Boolean = js.native
  
  /**
  	 * Moves a layer to a different z-position.
  	 *
  	 * @param {string} id The ID of the layer to move.
  	 * @param {string} [beforeId] The ID of an existing layer to insert the new layer before. When viewing the map, the `id` layer will appear beneath the `beforeId` layer. If `beforeId` is omitted, the layer will be appended to the end of the layers array and appear above all other layers on the map.
  	 * @returns {Map} `this`
  	 *
  	 * @example
  	 * // Move a layer with ID 'polygon' before the layer with ID 'country-label'. The `polygon` layer will appear beneath the `country-label` layer on the map.
  	 * map.moveLayer('polygon', 'country-label');
  	 */
  def moveLayer(id: String): this.type = js.native
  def moveLayer(id: String, beforeId: String): this.type = js.native
  
  def off(`type`: MapEvent, listener: Listener): this.type = js.native
  @JSName("off")
  def off_boxzoomcancel(`type`: boxzoomcancel, listener: js.Function1[/* ev */ MapLibreZoomEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_boxzoomend(`type`: boxzoomend, listener: js.Function1[/* ev */ MapLibreZoomEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_boxzoomstart(`type`: boxzoomstart, listener: js.Function1[/* ev */ MapLibreZoomEvent & js.Object, scala.Unit]): this.type = js.native
  /**
  	 * Removes an event listener previously added with `Map#on`.
  	 *
  	 * @method
  	 * @name off
  	 * @memberof Map
  	 * @instance
  	 * @param {string} type The event type previously used to install the listener.
  	 * @param {Function} listener The function previously installed as a listener.
  	 * @returns {Map} `this`
  	 */
  /**
  	 * Removes an event listener for layer-specific events previously added with `Map#on`.
  	 *
  	 * @param {string} type The event type previously used to install the listener.
  	 * @param {string} layer The layer ID or listener previously used to install the listener.
  	 * @param {Function} listener The function previously installed as a listener.
  	 * @returns {Map} `this`
  	 */
  @JSName("off")
  def off_click(
    `type`: click,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_click(`type`: click, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_contextmenu(
    `type`: contextmenu,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_contextmenu(`type`: contextmenu, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_data(`type`: data, listener: js.Function1[/* ev */ MapDataEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_dataabort(`type`: dataabort, listener: js.Function1[/* ev */ MapDataEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_dataloading(`type`: dataloading, listener: js.Function1[/* ev */ MapDataEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_dblclick(
    `type`: dblclick,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_dblclick(`type`: dblclick, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_drag(
    `type`: drag,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_dragend(
    `type`: dragend,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_dragstart(
    `type`: dragstart,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_idle(`type`: idle, listener: js.Function1[/* ev */ MapLibreEvent[scala.Unit] & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_load(`type`: load, listener: js.Function1[/* ev */ MapLibreEvent[scala.Unit] & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_mousedown(
    `type`: mousedown,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mousedown(`type`: mousedown, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_mouseenter(
    `type`: mouseenter,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseleave(
    `type`: mouseleave,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mousemove(
    `type`: mousemove,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mousemove(`type`: mousemove, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_mouseout(
    `type`: mouseout,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseout(`type`: mouseout, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_mouseover(
    `type`: mouseover,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseover(`type`: mouseover, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_mouseup(
    `type`: mouseup,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_mouseup(`type`: mouseup, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_move(
    `type`: move,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_moveend(
    `type`: moveend,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_movestart(
    `type`: movestart,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_pitch(
    `type`: pitch,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_pitchend(
    `type`: pitchend,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_pitchstart(
    `type`: pitchstart,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_remove(`type`: remove, listener: js.Function1[/* ev */ MapLibreEvent[scala.Unit] & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_render(`type`: render, listener: js.Function1[/* ev */ MapLibreEvent[scala.Unit] & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_resize(`type`: resize, listener: js.Function1[/* ev */ MapLibreEvent[scala.Unit] & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_rotate(
    `type`: rotate,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_rotateend(
    `type`: rotateend,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_rotatestart(
    `type`: rotatestart,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_sourcedata(`type`: sourcedata, listener: js.Function1[/* ev */ MapSourceDataEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_sourcedataabort(
    `type`: sourcedataabort,
    listener: js.Function1[/* ev */ MapSourceDataEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_sourcedataloading(
    `type`: sourcedataloading,
    listener: js.Function1[/* ev */ MapSourceDataEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_styledata(`type`: styledata, listener: js.Function1[/* ev */ MapStyleDataEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_styledataloading(
    `type`: styledataloading,
    listener: js.Function1[/* ev */ MapStyleDataEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_styleimagemissing(
    `type`: styleimagemissing,
    listener: js.Function1[/* ev */ MapStyleImageMissingEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_terrain(`type`: terrain, listener: js.Function1[/* ev */ MapTerrainEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_tiledataloading(`type`: tiledataloading, listener: js.Function1[/* ev */ MapDataEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_touchcancel(
    `type`: touchcancel,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchcancel(`type`: touchcancel, listener: js.Function1[/* ev */ MapTouchEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_touchend(
    `type`: touchend,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchend(`type`: touchend, listener: js.Function1[/* ev */ MapTouchEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_touchmove(`type`: touchmove, listener: js.Function1[/* ev */ MapTouchEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_touchstart(
    `type`: touchstart,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_touchstart(`type`: touchstart, listener: js.Function1[/* ev */ MapTouchEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_webglcontextlost(`type`: webglcontextlost, listener: js.Function1[/* ev */ MapContextEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_webglcontextrestored(
    `type`: webglcontextrestored,
    listener: js.Function1[/* ev */ MapContextEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_wheel(`type`: wheel, listener: js.Function1[/* ev */ MapWheelEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("off")
  def off_zoom(
    `type`: zoom,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_zoomend(
    `type`: zoomend,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_zoomstart(
    `type`: zoomstart,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  
  def on(`type`: MapEvent, listener: Listener): this.type = js.native
  @JSName("on")
  def on_boxzoomcancel(`type`: boxzoomcancel, listener: js.Function1[/* ev */ MapLibreZoomEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_boxzoomend(`type`: boxzoomend, listener: js.Function1[/* ev */ MapLibreZoomEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_boxzoomstart(`type`: boxzoomstart, listener: js.Function1[/* ev */ MapLibreZoomEvent & js.Object, scala.Unit]): this.type = js.native
  /**
  	 * Adds a listener for events of a specified type, optionally limited to features in a specified style layer.
  	 *
  	 * @param {string} type The event type to listen for. Events compatible with the optional `layerId` parameter are triggered
  	 * when the cursor enters a visible portion of the specified layer from outside that layer or outside the map canvas.
  	 *
  	 * | Event                                                     | Compatible with `layerId` |
  	 * |-----------------------------------------------------------|---------------------------|
  	 * | [`mousedown`](#map.event:mousedown)                       | yes                       |
  	 * | [`mouseup`](#map.event:mouseup)                           | yes                       |
  	 * | [`mouseover`](#map.event:mouseover)                       | yes                       |
  	 * | [`mouseout`](#map.event:mouseout)                         | yes                       |
  	 * | [`mousemove`](#map.event:mousemove)                       | yes                       |
  	 * | [`mouseenter`](#map.event:mouseenter)                     | yes (required)            |
  	 * | [`mouseleave`](#map.event:mouseleave)                     | yes (required)            |
  	 * | [`click`](#map.event:click)                               | yes                       |
  	 * | [`dblclick`](#map.event:dblclick)                         | yes                       |
  	 * | [`contextmenu`](#map.event:contextmenu)                   | yes                       |
  	 * | [`touchstart`](#map.event:touchstart)                     | yes                       |
  	 * | [`touchend`](#map.event:touchend)                         | yes                       |
  	 * | [`touchcancel`](#map.event:touchcancel)                   | yes                       |
  	 * | [`wheel`](#map.event:wheel)                               |                           |
  	 * | [`resize`](#map.event:resize)                             |                           |
  	 * | [`remove`](#map.event:remove)                             |                           |
  	 * | [`touchmove`](#map.event:touchmove)                       |                           |
  	 * | [`movestart`](#map.event:movestart)                       |                           |
  	 * | [`move`](#map.event:move)                                 |                           |
  	 * | [`moveend`](#map.event:moveend)                           |                           |
  	 * | [`dragstart`](#map.event:dragstart)                       |                           |
  	 * | [`drag`](#map.event:drag)                                 |                           |
  	 * | [`dragend`](#map.event:dragend)                           |                           |
  	 * | [`zoomstart`](#map.event:zoomstart)                       |                           |
  	 * | [`zoom`](#map.event:zoom)                                 |                           |
  	 * | [`zoomend`](#map.event:zoomend)                           |                           |
  	 * | [`rotatestart`](#map.event:rotatestart)                   |                           |
  	 * | [`rotate`](#map.event:rotate)                             |                           |
  	 * | [`rotateend`](#map.event:rotateend)                       |                           |
  	 * | [`pitchstart`](#map.event:pitchstart)                     |                           |
  	 * | [`pitch`](#map.event:pitch)                               |                           |
  	 * | [`pitchend`](#map.event:pitchend)                         |                           |
  	 * | [`boxzoomstart`](#map.event:boxzoomstart)                 |                           |
  	 * | [`boxzoomend`](#map.event:boxzoomend)                     |                           |
  	 * | [`boxzoomcancel`](#map.event:boxzoomcancel)               |                           |
  	 * | [`webglcontextlost`](#map.event:webglcontextlost)         |                           |
  	 * | [`webglcontextrestored`](#map.event:webglcontextrestored) |                           |
  	 * | [`load`](#map.event:load)                                 |                           |
  	 * | [`render`](#map.event:render)                             |                           |
  	 * | [`idle`](#map.event:idle)                                 |                           |
  	 * | [`error`](#map.event:error)                               |                           |
  	 * | [`data`](#map.event:data)                                 |                           |
  	 * | [`styledata`](#map.event:styledata)                       |                           |
  	 * | [`sourcedata`](#map.event:sourcedata)                     |                           |
  	 * | [`dataloading`](#map.event:dataloading)                   |                           |
  	 * | [`styledataloading`](#map.event:styledataloading)         |                           |
  	 * | [`sourcedataloading`](#map.event:sourcedataloading)       |                           |
  	 * | [`styleimagemissing`](#map.event:styleimagemissing)       |                           |
  	 * | [`dataabort`](#map.event:dataabort)                       |                           |
  	 * | [`sourcedataabort`](#map.event:sourcedataabort)           |                           |
  	 *
  	 * @param {string | Listener} layer The ID of a style layer or a listener if no ID is provided. Event will only be triggered if its location
  	 * is within a visible feature in this layer. The event will have a `features` property containing
  	 * an array of the matching features. If `layerIdOrListener` is not supplied, the event will not have a `features` property.
  	 * Please note that many event types are not compatible with the optional `layerIdOrListener` parameter.
  	 * @param {Function} listener The function to be called when the event is fired.
  	 * @returns {Map} `this`
  	 * @example
  	 * // Set an event listener that will fire
  	 * // when the map has finished loading
  	 * map.on('load', function() {
  	 *   // Once the map has finished loading,
  	 *   // add a new layer
  	 *   map.addLayer({
  	 *     id: 'points-of-interest',
  	 *     source: {
  	 *       type: 'vector',
  	 *       url: 'https://maplibre.org/maplibre-gl-js-docs/style-spec/'
  	 *     },
  	 *     'source-layer': 'poi_label',
  	 *     type: 'circle',
  	 *     paint: {
  	 *       // MapLibre Style Specification paint properties
  	 *     },
  	 *     layout: {
  	 *       // MapLibre Style Specification layout properties
  	 *     }
  	 *   });
  	 * });
  	 * @example
  	 * // Set an event listener that will fire
  	 * // when a feature on the countries layer of the map is clicked
  	 * map.on('click', 'countries', function(e) {
  	 *   new maplibregl.Popup()
  	 *     .setLngLat(e.lngLat)
  	 *     .setHTML(`Country name: ${e.features[0].properties.name}`)
  	 *     .addTo(map);
  	 * });
  	 * @see [Display popup on click](https://maplibre.org/maplibre-gl-js-docs/example/popup-on-click/)
  	 * @see [Center the map on a clicked symbol](https://maplibre.org/maplibre-gl-js-docs/example/center-on-symbol/)
  	 * @see [Create a hover effect](https://maplibre.org/maplibre-gl-js-docs/example/hover-styles/)
  	 * @see [Create a draggable marker](https://maplibre.org/maplibre-gl-js-docs/example/drag-a-point/)
  	 */
  @JSName("on")
  def on_click(
    `type`: click,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_click(`type`: click, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_contextmenu(
    `type`: contextmenu,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_contextmenu(`type`: contextmenu, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_data(`type`: data, listener: js.Function1[/* ev */ MapDataEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_dataabort(`type`: dataabort, listener: js.Function1[/* ev */ MapDataEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_dataloading(`type`: dataloading, listener: js.Function1[/* ev */ MapDataEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_dblclick(
    `type`: dblclick,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dblclick(`type`: dblclick, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_drag(
    `type`: drag,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_dragend(
    `type`: dragend,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_dragstart(
    `type`: dragstart,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_idle(`type`: idle, listener: js.Function1[/* ev */ MapLibreEvent[scala.Unit] & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_load(`type`: load, listener: js.Function1[/* ev */ MapLibreEvent[scala.Unit] & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_mousedown(
    `type`: mousedown,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mousedown(`type`: mousedown, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_mouseenter(
    `type`: mouseenter,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseleave(
    `type`: mouseleave,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mousemove(
    `type`: mousemove,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mousemove(`type`: mousemove, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_mouseout(
    `type`: mouseout,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseout(`type`: mouseout, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_mouseover(
    `type`: mouseover,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseover(`type`: mouseover, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_mouseup(
    `type`: mouseup,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_mouseup(`type`: mouseup, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_move(
    `type`: move,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_moveend(
    `type`: moveend,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_movestart(
    `type`: movestart,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_pitch(
    `type`: pitch,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_pitchend(
    `type`: pitchend,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_pitchstart(
    `type`: pitchstart,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_remove(`type`: remove, listener: js.Function1[/* ev */ MapLibreEvent[scala.Unit] & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_render(`type`: render, listener: js.Function1[/* ev */ MapLibreEvent[scala.Unit] & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_resize(`type`: resize, listener: js.Function1[/* ev */ MapLibreEvent[scala.Unit] & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_rotate(
    `type`: rotate,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_rotateend(
    `type`: rotateend,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_rotatestart(
    `type`: rotatestart,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_sourcedata(`type`: sourcedata, listener: js.Function1[/* ev */ MapSourceDataEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_sourcedataabort(
    `type`: sourcedataabort,
    listener: js.Function1[/* ev */ MapSourceDataEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_sourcedataloading(
    `type`: sourcedataloading,
    listener: js.Function1[/* ev */ MapSourceDataEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_styledata(`type`: styledata, listener: js.Function1[/* ev */ MapStyleDataEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_styledataloading(
    `type`: styledataloading,
    listener: js.Function1[/* ev */ MapStyleDataEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_styleimagemissing(
    `type`: styleimagemissing,
    listener: js.Function1[/* ev */ MapStyleImageMissingEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_terrain(`type`: terrain, listener: js.Function1[/* ev */ MapTerrainEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_tiledataloading(`type`: tiledataloading, listener: js.Function1[/* ev */ MapDataEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_touchcancel(
    `type`: touchcancel,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchcancel(`type`: touchcancel, listener: js.Function1[/* ev */ MapTouchEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_touchend(
    `type`: touchend,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchend(`type`: touchend, listener: js.Function1[/* ev */ MapTouchEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_touchmove(`type`: touchmove, listener: js.Function1[/* ev */ MapTouchEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_touchstart(
    `type`: touchstart,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_touchstart(`type`: touchstart, listener: js.Function1[/* ev */ MapTouchEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_webglcontextlost(`type`: webglcontextlost, listener: js.Function1[/* ev */ MapContextEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_webglcontextrestored(
    `type`: webglcontextrestored,
    listener: js.Function1[/* ev */ MapContextEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_wheel(`type`: wheel, listener: js.Function1[/* ev */ MapWheelEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_zoom(
    `type`: zoom,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_zoomend(
    `type`: zoomend,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_zoomstart(
    `type`: zoomstart,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  
  def once(`type`: MapEvent, listener: Listener): this.type = js.native
  @JSName("once")
  def once_boxzoomcancel(`type`: boxzoomcancel, listener: js.Function1[/* ev */ MapLibreZoomEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_boxzoomend(`type`: boxzoomend, listener: js.Function1[/* ev */ MapLibreZoomEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_boxzoomstart(`type`: boxzoomstart, listener: js.Function1[/* ev */ MapLibreZoomEvent & js.Object, scala.Unit]): this.type = js.native
  /**
  	 * Adds a listener that will be called only once to a specified event type.
  	 *
  	 * @method
  	 * @name once
  	 * @memberof Map
  	 * @instance
  	 * @param {string} type The event type to add a listener for.
  	 * @param {Function} listener The function to be called when the event is fired.
  	 *   The listener function is called with the data object passed to `fire`,
  	 *   extended with `target` and `type` properties.
  	 * @returns {Map} `this`
  	 */
  /**
  	 * Adds a listener that will be called only once to a specified event type occurring on features in a specified style layer.
  	 *
  	 * @param {string} type The event type to listen for; one of `'mousedown'`, `'mouseup'`, `'click'`, `'dblclick'`,
  	 * `'mousemove'`, `'mouseenter'`, `'mouseleave'`, `'mouseover'`, `'mouseout'`, `'contextmenu'`, `'touchstart'`,
  	 * `'touchend'`, or `'touchcancel'`. `mouseenter` and `mouseover` events are triggered when the cursor enters
  	 * a visible portion of the specified layer from outside that layer or outside the map canvas. `mouseleave`
  	 * and `mouseout` events are triggered when the cursor leaves a visible portion of the specified layer, or leaves
  	 * the map canvas.
  	 * @param {string} layer The ID of a style layer or a listener if no ID is provided. Only events whose location is within a visible
  	 * feature in this layer will trigger the listener. The event will have a `features` property containing
  	 * an array of the matching features.
  	 * @param {Function} listener The function to be called when the event is fired.
  	 * @returns {Map} `this`
  	 */
  @JSName("once")
  def once_click(
    `type`: click,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_click(`type`: click, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_contextmenu(
    `type`: contextmenu,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_contextmenu(`type`: contextmenu, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_data(`type`: data, listener: js.Function1[/* ev */ MapDataEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_dataabort(`type`: dataabort, listener: js.Function1[/* ev */ MapDataEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_dataloading(`type`: dataloading, listener: js.Function1[/* ev */ MapDataEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_dblclick(
    `type`: dblclick,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_dblclick(`type`: dblclick, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_drag(
    `type`: drag,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_dragend(
    `type`: dragend,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_dragstart(
    `type`: dragstart,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_idle(`type`: idle, listener: js.Function1[/* ev */ MapLibreEvent[scala.Unit] & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_load(`type`: load, listener: js.Function1[/* ev */ MapLibreEvent[scala.Unit] & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_mousedown(
    `type`: mousedown,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousedown(`type`: mousedown, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_mouseenter(
    `type`: mouseenter,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseleave(
    `type`: mouseleave,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousemove(
    `type`: mousemove,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mousemove(`type`: mousemove, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_mouseout(
    `type`: mouseout,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseout(`type`: mouseout, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_mouseover(
    `type`: mouseover,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseover(`type`: mouseover, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_mouseup(
    `type`: mouseup,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerMouseEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_mouseup(`type`: mouseup, listener: js.Function1[/* ev */ MapMouseEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_move(
    `type`: move,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_moveend(
    `type`: moveend,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_movestart(
    `type`: movestart,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_pitch(
    `type`: pitch,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_pitchend(
    `type`: pitchend,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_pitchstart(
    `type`: pitchstart,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_remove(`type`: remove, listener: js.Function1[/* ev */ MapLibreEvent[scala.Unit] & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_render(`type`: render, listener: js.Function1[/* ev */ MapLibreEvent[scala.Unit] & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_resize(`type`: resize, listener: js.Function1[/* ev */ MapLibreEvent[scala.Unit] & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_rotate(
    `type`: rotate,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_rotateend(
    `type`: rotateend,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_rotatestart(
    `type`: rotatestart,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_sourcedata(`type`: sourcedata, listener: js.Function1[/* ev */ MapSourceDataEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_sourcedataabort(
    `type`: sourcedataabort,
    listener: js.Function1[/* ev */ MapSourceDataEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_sourcedataloading(
    `type`: sourcedataloading,
    listener: js.Function1[/* ev */ MapSourceDataEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_styledata(`type`: styledata, listener: js.Function1[/* ev */ MapStyleDataEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_styledataloading(
    `type`: styledataloading,
    listener: js.Function1[/* ev */ MapStyleDataEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_styleimagemissing(
    `type`: styleimagemissing,
    listener: js.Function1[/* ev */ MapStyleImageMissingEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_terrain(`type`: terrain, listener: js.Function1[/* ev */ MapTerrainEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_tiledataloading(`type`: tiledataloading, listener: js.Function1[/* ev */ MapDataEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_touchcancel(
    `type`: touchcancel,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchcancel(`type`: touchcancel, listener: js.Function1[/* ev */ MapTouchEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_touchend(
    `type`: touchend,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchend(`type`: touchend, listener: js.Function1[/* ev */ MapTouchEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_touchmove(`type`: touchmove, listener: js.Function1[/* ev */ MapTouchEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_touchstart(
    `type`: touchstart,
    layer: String,
    listener: js.Function1[/* ev */ MapLayerTouchEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_touchstart(`type`: touchstart, listener: js.Function1[/* ev */ MapTouchEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_webglcontextlost(`type`: webglcontextlost, listener: js.Function1[/* ev */ MapContextEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_webglcontextrestored(
    `type`: webglcontextrestored,
    listener: js.Function1[/* ev */ MapContextEvent & js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_wheel(`type`: wheel, listener: js.Function1[/* ev */ MapWheelEvent & js.Object, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_zoom(
    `type`: zoom,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_zoomend(
    `type`: zoomend,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_zoomstart(
    `type`: zoomstart,
    listener: js.Function1[
      /* ev */ (MapLibreEvent[js.UndefOr[MouseEvent | TouchEvent | WheelEvent]]) & js.Object, 
      scala.Unit
    ]
  ): this.type = js.native
  
  var painter: Painter = js.native
  
  /**
  	 * Returns a [Point](https://github.com/mapbox/point-geometry) representing pixel coordinates, relative to the map's `container`,
  	 * that correspond to the specified geographical location.
  	 *
  	 * @param {LngLatLike} lnglat The geographical location to project.
  	 * @returns {Point} The [Point](https://github.com/mapbox/point-geometry) corresponding to `lnglat`, relative to the map's `container`.
  	 * @example
  	 * var coordinate = [-122.420679, 37.772537];
  	 * var point = map.project(coordinate);
  	 */
  def project(lnglat: LngLatLike): ^ = js.native
  
  /**
  	 * Returns an array of MapGeoJSONFeature objects
  	 * representing visible features that satisfy the query parameters.
  	 *
  	 * @param {PointLike|Array<PointLike>} [geometry] - The geometry of the query region:
  	 * either a single point or southwest and northeast points describing a bounding box.
  	 * Omitting this parameter (i.e. calling {@link Map#queryRenderedFeatures} with zero arguments,
  	 * or with only a `options` argument) is equivalent to passing a bounding box encompassing the entire
  	 * map viewport.
  	 * @param {Object} [options] Options object.
  	 * @param {Array<string>} [options.layers] An array of [style layer IDs](https://maplibre.org/maplibre-gl-js-docs/style-spec/#layer-id) for the query to inspect.
  	 *   Only features within these layers will be returned. If this parameter is undefined, all layers will be checked.
  	 * @param {Array} [options.filter] A [filter](https://maplibre.org/maplibre-gl-js-docs/style-spec/layers/#filter)
  	 *   to limit query results.
  	 * @param {boolean} [options.validate=true] Whether to check if the [options.filter] conforms to the MapLibre GL Style Specification. Disabling validation is a performance optimization that should only be used if you have previously validated the values you will be passing to this function.
  	 *
  	 * @returns {Array<MapGeoJSONFeature>} An array of MapGeoJSONFeature objects.
  	 *
  	 * The `properties` value of each returned feature object contains the properties of its source feature. For GeoJSON sources, only
  	 * string and numeric property values are supported (i.e. `null`, `Array`, and `Object` values are not supported).
  	 *
  	 * Each feature includes top-level `layer`, `source`, and `sourceLayer` properties. The `layer` property is an object
  	 * representing the style layer to  which the feature belongs. Layout and paint properties in this object contain values
  	 * which are fully evaluated for the given zoom level and feature.
  	 *
  	 * Only features that are currently rendered are included. Some features will **not** be included, like:
  	 *
  	 * - Features from layers whose `visibility` property is `"none"`.
  	 * - Features from layers whose zoom range excludes the current zoom level.
  	 * - Symbol features that have been hidden due to text or icon collision.
  	 *
  	 * Features from all other layers are included, including features that may have no visible
  	 * contribution to the rendered result; for example, because the layer's opacity or color alpha component is set to
  	 * 0.
  	 *
  	 * The topmost rendered feature appears first in the returned array, and subsequent features are sorted by
  	 * descending z-order. Features that are rendered multiple times (due to wrapping across the antimeridian at low
  	 * zoom levels) are returned only once (though subject to the following caveat).
  	 *
  	 * Because features come from tiled vector data or GeoJSON data that is converted to tiles internally, feature
  	 * geometries may be split or duplicated across tile boundaries and, as a result, features may appear multiple
  	 * times in query results. For example, suppose there is a highway running through the bounding rectangle of a query.
  	 * The results of the query will be those parts of the highway that lie within the map tiles covering the bounding
  	 * rectangle, even if the highway extends into other tiles, and the portion of the highway within each map tile
  	 * will be returned as a separate feature. Similarly, a point feature near a tile boundary may appear in multiple
  	 * tiles due to tile buffering.
  	 *
  	 * @example
  	 * // Find all features at a point
  	 * var features = map.queryRenderedFeatures(
  	 *   [20, 35],
  	 *   { layers: ['my-layer-name'] }
  	 * );
  	 *
  	 * @example
  	 * // Find all features within a static bounding box
  	 * var features = map.queryRenderedFeatures(
  	 *   [[10, 20], [30, 50]],
  	 *   { layers: ['my-layer-name'] }
  	 * );
  	 *
  	 * @example
  	 * // Find all features within a bounding box around a point
  	 * var width = 10;
  	 * var height = 20;
  	 * var features = map.queryRenderedFeatures([
  	 *   [point.x - width / 2, point.y - height / 2],
  	 *   [point.x + width / 2, point.y + height / 2]
  	 * ], { layers: ['my-layer-name'] });
  	 *
  	 * @example
  	 * // Query all rendered features from a single layer
  	 * var features = map.queryRenderedFeatures({ layers: ['my-layer-name'] });
  	 * @see [Get features under the mouse pointer](https://maplibre.org/maplibre-gl-js-docs/example/queryrenderedfeatures/)
  	 */
  def queryRenderedFeatures(): js.Array[MapGeoJSONFeature] = js.native
  def queryRenderedFeatures(geometry: js.Tuple2[PointLike, PointLike]): js.Array[MapGeoJSONFeature] = js.native
  def queryRenderedFeatures(geometry: js.Tuple2[PointLike, PointLike], options: Any): js.Array[MapGeoJSONFeature] = js.native
  def queryRenderedFeatures(geometry: scala.Unit, options: Any): js.Array[MapGeoJSONFeature] = js.native
  def queryRenderedFeatures(geometry: PointLike): js.Array[MapGeoJSONFeature] = js.native
  def queryRenderedFeatures(geometry: PointLike, options: Any): js.Array[MapGeoJSONFeature] = js.native
  
  /**
  	 * Returns an array of MapGeoJSONFeature objects
  	 * representing features within the specified vector tile or GeoJSON source that satisfy the query parameters.
  	 *
  	 * @param {string} sourceId The ID of the vector tile or GeoJSON source to query.
  	 * @param {Object} [parameters] Options object.
  	 * @param {string} [parameters.sourceLayer] The name of the source layer
  	 *   to query. *For vector tile sources, this parameter is required.* For GeoJSON sources, it is ignored.
  	 * @param {Array} [parameters.filter] A [filter](https://maplibre.org/maplibre-gl-js-docs/style-spec/layers/#filter)
  	 *   to limit query results.
  	 * @param {boolean} [parameters.validate=true] Whether to check if the [parameters.filter] conforms to the MapLibre GL Style Specification. Disabling validation is a performance optimization that should only be used if you have previously validated the values you will be passing to this function.
  	 *
  	 * @returns {Array<MapGeoJSONFeature>} An array of MapGeoJSONFeature objects.
  	 *
  	 * In contrast to {@link Map#queryRenderedFeatures}, this function returns all features matching the query parameters,
  	 * whether or not they are rendered by the current style (i.e. visible). The domain of the query includes all currently-loaded
  	 * vector tiles and GeoJSON source tiles: this function does not check tiles outside the currently
  	 * visible viewport.
  	 *
  	 * Because features come from tiled vector data or GeoJSON data that is converted to tiles internally, feature
  	 * geometries may be split or duplicated across tile boundaries and, as a result, features may appear multiple
  	 * times in query results. For example, suppose there is a highway running through the bounding rectangle of a query.
  	 * The results of the query will be those parts of the highway that lie within the map tiles covering the bounding
  	 * rectangle, even if the highway extends into other tiles, and the portion of the highway within each map tile
  	 * will be returned as a separate feature. Similarly, a point feature near a tile boundary may appear in multiple
  	 * tiles due to tile buffering.
  	 *
  	 * @example
  	 * // Find all features in one source layer in a vector source
  	 * var features = map.querySourceFeatures('your-source-id', {
  	 *   sourceLayer: 'your-source-layer'
  	 * });
  	 *
  	 */
  def querySourceFeatures(sourceId: String): js.Array[MapGeoJSONFeature] = js.native
  def querySourceFeatures(sourceId: String, parameters: Filter): js.Array[MapGeoJSONFeature] = js.native
  
  /**
  	 * Force a synchronous redraw of the map.
  	 * @example
  	 * map.redraw();
  	 * @returns {Map} `this`
  	 */
  def redraw(): Map = js.native
  
  /**
  	 * Clean up and release all internal resources associated with this map.
  	 *
  	 * This includes DOM elements, event bindings, web workers, and WebGL resources.
  	 *
  	 * Use this method when you are done using the map and wish to ensure that it no
  	 * longer consumes browser resources. Afterwards, you must not call any other
  	 * methods on the map.
  	 */
  def remove(): scala.Unit = js.native
  
  /**
  	 * Removes the control from the map.
  	 *
  	 * @param {IControl} control The {@link IControl} to remove.
  	 * @returns {Map} `this`
  	 * @example
  	 * // Define a new navigation control.
  	 * var navigation = new maplibregl.NavigationControl();
  	 * // Add zoom and rotation controls to the map.
  	 * map.addControl(navigation);
  	 * // Remove zoom and rotation controls from the map.
  	 * map.removeControl(navigation);
  	 */
  def removeControl(control: IControl): this.type = js.native
  
  /**
  	 * Removes the `state` of a feature, setting it back to the default behavior.
  	 * If only a `target.source` is specified, it will remove the state for all features from that source.
  	 * If `target.id` is also specified, it will remove all keys for that feature's state.
  	 * If `key` is also specified, it removes only that key from that feature's state.
  	 * Features are identified by their `feature.id` attribute, which can be any number or string.
  	 *
  	 * @param {Object} target Identifier of where to remove state. It can be a source, a feature, or a specific key of feature.
  	 * Feature objects returned from {@link Map#queryRenderedFeatures} or event handlers can be used as feature identifiers.
  	 * @param {string | number} target.id (optional) Unique id of the feature. Optional if key is not specified.
  	 * @param {string} target.source The id of the vector or GeoJSON source for the feature.
  	 * @param {string} [target.sourceLayer] (optional) *For vector tile sources, `sourceLayer` is required.*
  	 * @param {string} key (optional) The key in the feature state to reset.
  	 *
  	 * @example
  	 * // Reset the entire state object for all features
  	 * // in the `my-source` source
  	 * map.removeFeatureState({
  	 *   source: 'my-source'
  	 * });
  	 *
  	 * @example
  	 * // When the mouse leaves the `my-layer` layer,
  	 * // reset the entire state object for the
  	 * // feature under the mouse
  	 * map.on('mouseleave', 'my-layer', function(e) {
  	 *   map.removeFeatureState({
  	 *     source: 'my-source',
  	 *     sourceLayer: 'my-source-layer',
  	 *     id: e.features[0].id
  	 *   });
  	 * });
  	 *
  	 * @example
  	 * // When the mouse leaves the `my-layer` layer,
  	 * // reset only the `hover` key-value pair in the
  	 * // state for the feature under the mouse
  	 * map.on('mouseleave', 'my-layer', function(e) {
  	 *   map.removeFeatureState({
  	 *     source: 'my-source',
  	 *     sourceLayer: 'my-source-layer',
  	 *     id: e.features[0].id
  	 *   }, 'hover');
  	 * });
  	 *
  	 */
  def removeFeatureState(target: FeatureIdentifier): this.type = js.native
  def removeFeatureState(target: FeatureIdentifier, key: String): this.type = js.native
  
  /**
  	 * Remove an image from a style. This can be an image from the style's original
  	 * sprite or any images
  	 * that have been added at runtime using {@link Map#addImage}.
  	 *
  	 * @param id The ID of the image.
  	 *
  	 * @example
  	 * // If an image with the ID 'cat' exists in
  	 * // the style's sprite, remove it.
  	 * if (map.hasImage('cat')) map.removeImage('cat');
  	 */
  def removeImage(id: String): scala.Unit = js.native
  
  /**
  	 * Removes the layer with the given ID from the map's style.
  	 *
  	 * If no such layer exists, an `error` event is fired.
  	 *
  	 * @param {string} id id of the layer to remove
  	 * @fires error
  	 *
  	 * @example
  	 * // If a layer with ID 'state-data' exists, remove it.
  	 * if (map.getLayer('state-data')) map.removeLayer('state-data');
  	 */
  def removeLayer(id: String): this.type = js.native
  
  /**
  	 * Removes a source from the map's style.
  	 *
  	 * @param {string} id The ID of the source to remove.
  	 * @returns {Map} `this`
  	 * @example
  	 * map.removeSource('bathymetry-data');
  	 */
  def removeSource(id: String): Map = js.native
  
  /**
  	 * Gets and sets a Boolean indicating whether the map will
  	 * continuously repaint. This information is useful for analyzing performance.
  	 *
  	 * @name repaint
  	 * @type {boolean}
  	 * @instance
  	 * @memberof Map
  	 */
  def repaint: Boolean = js.native
  def repaint_=(value: Boolean): scala.Unit = js.native
  
  /**
  	 * Resizes the map according to the dimensions of its
  	 * `container` element.
  	 *
  	 * Checks if the map container size changed and updates the map if it has changed.
  	 * This method must be called after the map's `container` is resized programmatically
  	 * or when the map is shown after being initially hidden with CSS.
  	 *
  	 * @param eventData Additional properties to be passed to `movestart`, `move`, `resize`, and `moveend`
  	 *   events that get triggered as a result of resize. This can be useful for differentiating the
  	 *   source of an event (for example, user-initiated or programmatically-triggered events).
  	 * @returns {Map} `this`
  	 * @example
  	 * // Resize the map when the map container is shown
  	 * // after being initially hidden with CSS.
  	 * var mapDiv = document.getElementById('map');
  	 * if (mapDiv.style.visibility === true) map.resize();
  	 */
  def resize(): this.type = js.native
  def resize(eventData: Any): this.type = js.native
  
  /**
  	 * The map's {@link ScrollZoomHandler}, which implements zooming in and out with a scroll wheel or trackpad.
  	 * Find more details and examples using `scrollZoom` in the {@link ScrollZoomHandler} section.
  	 */
  var scrollZoom: ScrollZoomHandler = js.native
  
  /**
  	 * Sets the `state` of a feature.
  	 * A feature's `state` is a set of user-defined key-value pairs that are assigned to a feature at runtime.
  	 * When using this method, the `state` object is merged with any existing key-value pairs in the feature's state.
  	 * Features are identified by their `feature.id` attribute, which can be any number or string.
  	 *
  	 * This method can only be used with sources that have a `feature.id` attribute. The `feature.id` attribute can be defined in three ways:
  	 * - For vector or GeoJSON sources, including an `id` attribute in the original data file.
  	 * - For vector or GeoJSON sources, using the [`promoteId`](https://maplibre.org/maplibre-gl-js-docs/style-spec/sources/#vector-promoteId) option at the time the source is defined.
  	 * - For GeoJSON sources, using the [`generateId`](https://maplibre.org/maplibre-gl-js-docs/style-spec/sources/#geojson-generateId) option to auto-assign an `id` based on the feature's index in the source data. If you change feature data using `map.getSource('some id').setData(..)`, you may need to re-apply state taking into account updated `id` values.
  	 *
  	 * _Note: You can use the [`feature-state` expression](https://maplibre.org/maplibre-gl-js-docs/style-spec/expressions/#feature-state) to access the values in a feature's state object for the purposes of styling._
  	 *
  	 * @param {Object} feature Feature identifier. Feature objects returned from
  	 * {@link Map#queryRenderedFeatures} or event handlers can be used as feature identifiers.
  	 * @param {string | number} feature.id Unique id of the feature.
  	 * @param {string} feature.source The id of the vector or GeoJSON source for the feature.
  	 * @param {string} [feature.sourceLayer] (optional) *For vector tile sources, `sourceLayer` is required.*
  	 * @param {Object} state A set of key-value pairs. The values should be valid JSON types.
  	 *
  	 * @example
  	 * // When the mouse moves over the `my-layer` layer, update
  	 * // the feature state for the feature under the mouse
  	 * map.on('mousemove', 'my-layer', function(e) {
  	 *   if (e.features.length > 0) {
  	 *     map.setFeatureState({
  	 *       source: 'my-source',
  	 *       sourceLayer: 'my-source-layer',
  	 *       id: e.features[0].id,
  	 *     }, {
  	 *       hover: true
  	 *     });
  	 *   }
  	 * });
  	 *
  	 * @see [Create a hover effect](https://maplibre.org/maplibre-gl-js-docs/example/hover-styles/)
  	 */
  def setFeatureState(feature: FeatureIdentifier, state: Any): this.type = js.native
  
  /**
  	 * Sets the filter for the specified style layer.
  	 *
  	 * Filters control which features a style layer renders from its source.
  	 * Any feature for which the filter expression evaluates to `true` will be
  	 * rendered on the map. Those that are false will be hidden.
  	 *
  	 * Use `setFilter` to show a subset of your source data.
  	 *
  	 * To clear the filter, pass `null` or `undefined` as the second parameter.
  	 *
  	 * @param {string} layerId The ID of the layer to which the filter will be applied.
  	 * @param {Array | null | undefined} filter The filter, conforming to the MapLibre Style Specification's
  	 *   [filter definition](https://maplibre.org/maplibre-gl-js-docs/style-spec/layers/#filter).  If `null` or `undefined` is provided, the function removes any existing filter from the layer.
  	 * @param {Object} [options] Options object.
  	 * @param {boolean} [options.validate=true] Whether to check if the filter conforms to the MapLibre GL Style Specification. Disabling validation is a performance optimization that should only be used if you have previously validated the values you will be passing to this function.
  	 * @returns {Map} `this`
  	 *
  	 * @example
  	 * // display only features with the 'name' property 'USA'
  	 * map.setFilter('my-layer', ['==', ['get', 'name'], 'USA']);
  	 * @example
  	 * // display only features with five or more 'available-spots'
  	 * map.setFilter('bike-docks', ['>=', ['get', 'available-spots'], 5]);
  	 * @example
  	 * // remove the filter for the 'bike-docks' style layer
  	 * map.setFilter('bike-docks', null);
  	 *
  	 * @see [Create a timeline animation](https://maplibre.org/maplibre-gl-js-docs/example/timeline-animation/)
  	 */
  def setFilter(layerId: String): this.type = js.native
  def setFilter(layerId: String, filter: Null, options: StyleSetterOptions): this.type = js.native
  def setFilter(layerId: String, filter: scala.Unit, options: StyleSetterOptions): this.type = js.native
  def setFilter(layerId: String, filter: FilterSpecification): this.type = js.native
  def setFilter(layerId: String, filter: FilterSpecification, options: StyleSetterOptions): this.type = js.native
  
  /**
  	 * Sets the zoom extent for the specified style layer. The zoom extent includes the
  	 * [minimum zoom level](https://maplibre.org/maplibre-gl-js-docs/style-spec/#layer-minzoom)
  	 * and [maximum zoom level](https://maplibre.org/maplibre-gl-js-docs/style-spec/#layer-maxzoom))
  	 * at which the layer will be rendered.
  	 *
  	 * Note: For style layers using vector sources, style layers cannot be rendered at zoom levels lower than the
  	 * minimum zoom level of the _source layer_ because the data does not exist at those zoom levels. If the minimum
  	 * zoom level of the source layer is higher than the minimum zoom level defined in the style layer, the style
  	 * layer will not be rendered at all zoom levels in the zoom range.
  	 *
  	 * @param {string} layerId The ID of the layer to which the zoom extent will be applied.
  	 * @param {number} minzoom The minimum zoom to set (0-24).
  	 * @param {number} maxzoom The maximum zoom to set (0-24).
  	 * @returns {Map} `this`
  	 *
  	 * @example
  	 * map.setLayerZoomRange('my-layer', 2, 5);
  	 *
  	 */
  def setLayerZoomRange(layerId: String, minzoom: Double, maxzoom: Double): this.type = js.native
  
  /**
  	 * Sets the value of a layout property in the specified style layer.
  	 *
  	 * @param {string} layerId The ID of the layer to set the layout property in.
  	 * @param {string} name The name of the layout property to set.
  	 * @param {*} value The value of the layout property. Must be of a type appropriate for the property, as defined in the [MapLibre Style Specification](https://maplibre.org/maplibre-gl-js-docs/style-spec/).
  	 * @param {Object} [options] Options object.
  	 * @param {boolean} [options.validate=true] Whether to check if `value` conforms to the MapLibre GL Style Specification. Disabling validation is a performance optimization that should only be used if you have previously validated the values you will be passing to this function.
  	 * @returns {Map} `this`
  	 * @example
  	 * map.setLayoutProperty('my-layer', 'visibility', 'none');
  	 */
  def setLayoutProperty(layerId: String, name: String, value: Any): this.type = js.native
  def setLayoutProperty(layerId: String, name: String, value: Any, options: StyleSetterOptions): this.type = js.native
  
  /**
  	 * Sets the any combination of light values.
  	 *
  	 * @param light Light properties to set. Must conform to the [MapLibre Style Specification](https://maplibre.org/maplibre-gl-js-docs/style-spec/#light).
  	 * @param {Object} [options] Options object.
  	 * @param {boolean} [options.validate=true] Whether to check if the filter conforms to the MapLibre GL Style Specification. Disabling validation is a performance optimization that should only be used if you have previously validated the values you will be passing to this function.
  	 * @returns {Map} `this`
  	 * @example
  	 * var layerVisibility = map.getLayoutProperty('my-layer', 'visibility');
  	 */
  def setLight(light: LightSpecification): this.type = js.native
  def setLight(light: LightSpecification, options: StyleSetterOptions): this.type = js.native
  
  /**
  	 * Sets or clears the map's geographical bounds.
  	 *
  	 * Pan and zoom operations are constrained within these bounds.
  	 * If a pan or zoom is performed that would
  	 * display regions outside these bounds, the map will
  	 * instead display a position and zoom level
  	 * as close as possible to the operation's request while still
  	 * remaining within the bounds.
  	 *
  	 * @param {LngLatBoundsLike | null | undefined} bounds The maximum bounds to set. If `null` or `undefined` is provided, the function removes the map's maximum bounds.
  	 * @returns {Map} `this`
  	 * @example
  	 * // Define bounds that conform to the `LngLatBoundsLike` object.
  	 * var bounds = [
  	 *   [-74.04728, 40.68392], // [west, south]
  	 *   [-73.91058, 40.87764]  // [east, north]
  	 * ];
  	 * // Set the map's max bounds.
  	 * map.setMaxBounds(bounds);
  	 */
  def setMaxBounds(): this.type = js.native
  def setMaxBounds(bounds: LngLatBoundsLike): this.type = js.native
  
  /**
  	 * Sets or clears the map's maximum pitch.
  	 * If the map's current pitch is higher than the new maximum,
  	 * the map will pitch to the new maximum.
  	 *
  	 * @param {number | null | undefined} maxPitch The maximum pitch to set (0-85). Values greater than 60 degrees are experimental and may result in rendering issues. If you encounter any, please raise an issue with details in the MapLibre project.
  	 *   If `null` or `undefined` is provided, the function removes the current maximum pitch (sets it to 60).
  	 * @returns {Map} `this`
  	 */
  def setMaxPitch(): this.type = js.native
  def setMaxPitch(maxPitch: Double): this.type = js.native
  
  /**
  	 * Sets or clears the map's maximum zoom level.
  	 * If the map's current zoom level is higher than the new maximum,
  	 * the map will zoom to the new maximum.
  	 *
  	 * @param {number | null | undefined} maxZoom The maximum zoom level to set.
  	 *   If `null` or `undefined` is provided, the function removes the current maximum zoom (sets it to 22).
  	 * @returns {Map} `this`
  	 * @example
  	 * map.setMaxZoom(18.75);
  	 */
  def setMaxZoom(): this.type = js.native
  def setMaxZoom(maxZoom: Double): this.type = js.native
  
  /**
  	 * Sets or clears the map's minimum pitch.
  	 * If the map's current pitch is lower than the new minimum,
  	 * the map will pitch to the new minimum.
  	 *
  	 * @param {number | null | undefined} minPitch The minimum pitch to set (0-85). Values greater than 60 degrees are experimental and may result in rendering issues. If you encounter any, please raise an issue with details in the MapLibre project.
  	 *   If `null` or `undefined` is provided, the function removes the current minimum pitch (i.e. sets it to 0).
  	 * @returns {Map} `this`
  	 */
  def setMinPitch(): this.type = js.native
  def setMinPitch(minPitch: Double): this.type = js.native
  
  /**
  	 * Sets or clears the map's minimum zoom level.
  	 * If the map's current zoom level is lower than the new minimum,
  	 * the map will zoom to the new minimum.
  	 *
  	 * It is not always possible to zoom out and reach the set `minZoom`.
  	 * Other factors such as map height may restrict zooming. For example,
  	 * if the map is 512px tall it will not be possible to zoom below zoom 0
  	 * no matter what the `minZoom` is set to.
  	 *
  	 * @param {number | null | undefined} minZoom The minimum zoom level to set (-2 - 24).
  	 *   If `null` or `undefined` is provided, the function removes the current minimum zoom (i.e. sets it to -2).
  	 * @returns {Map} `this`
  	 * @example
  	 * map.setMinZoom(12.25);
  	 */
  def setMinZoom(): this.type = js.native
  def setMinZoom(minZoom: Double): this.type = js.native
  
  /**
  	 * Sets the value of a paint property in the specified style layer.
  	 *
  	 * @param {string} layerId The ID of the layer to set the paint property in.
  	 * @param {string} name The name of the paint property to set.
  	 * @param {*} value The value of the paint property to set.
  	 *   Must be of a type appropriate for the property, as defined in the [MapLibre Style Specification](https://maplibre.org/maplibre-gl-js-docs/style-spec/).
  	 * @param {Object} [options] Options object.
  	 * @param {boolean} [options.validate=true] Whether to check if `value` conforms to the MapLibre GL Style Specification. Disabling validation is a performance optimization that should only be used if you have previously validated the values you will be passing to this function.
  	 * @returns {Map} `this`
  	 * @example
  	 * map.setPaintProperty('my-layer', 'fill-color', '#faafee');
  	 * @see [Change a layer's color with buttons](https://maplibre.org/maplibre-gl-js-docs/example/color-switcher/)
  	 * @see [Create a draggable point](https://maplibre.org/maplibre-gl-js-docs/example/drag-a-point/)
  	 */
  def setPaintProperty(layerId: String, name: String, value: Any): this.type = js.native
  def setPaintProperty(layerId: String, name: String, value: Any, options: StyleSetterOptions): this.type = js.native
  
  /**
  	 * Sets the map's pixel ratio. This allows to override `devicePixelRatio`.
  	 * After this call, the canvas' `width` attribute will be `container.clientWidth * pixelRatio`
  	 * and its height attribute will be `container.clientHeight * pixelRatio`.
  	 * @param {number} pixelRatio The pixel ratio.
  	 */
  def setPixelRatio(pixelRatio: Double): scala.Unit = js.native
  
  /**
  	 * Sets the state of `renderWorldCopies`.
  	 *
  	 * @param {boolean} renderWorldCopies If `true`, multiple copies of the world will be rendered side by side beyond -180 and 180 degrees longitude. If set to `false`:
  	 * - When the map is zoomed out far enough that a single representation of the world does not fill the map's entire
  	 * container, there will be blank space beyond 180 and -180 degrees longitude.
  	 * - Features that cross 180 and -180 degrees longitude will be cut in two (with one portion on the right edge of the
  	 * map and the other on the left edge of the map) at every zoom level.
  	 *
  	 * `undefined` is treated as `true`, `null` is treated as `false`.
  	 * @returns {Map} `this`
  	 * @example
  	 * map.setRenderWorldCopies(true);
  	 * @see [Render world copies](https://maplibre.org/maplibre-gl-js-docs/example/render-world-copies/)
  	 */
  def setRenderWorldCopies(): this.type = js.native
  def setRenderWorldCopies(renderWorldCopies: Boolean): this.type = js.native
  
  /**
  	 * Updates the map's MapLibre style object with a new value.
  	 *
  	 * If a style is already set when this is used and options.diff is set to true, the map renderer will attempt to compare the given style
  	 * against the map's current state and perform only the changes necessary to make the map style match the desired state. Changes in sprites
  	 * (images used for icons and patterns) and glyphs (fonts for label text) **cannot** be diffed. If the sprites or fonts used in the current
  	 * style and the given style are different in any way, the map renderer will force a full update, removing the current style and building
  	 * the given one from scratch.
  	 *
  	 *
  	 * @param style A JSON object conforming to the schema described in the
  	 *   [MapLibre Style Specification](https://maplibre.org/maplibre-gl-js-docs/style-spec/), or a URL to such JSON.
  	 * @param {Object} [options] Options object.
  	 * @param {boolean} [options.diff=true] If false, force a 'full' update, removing the current style
  	 *   and building the given one instead of attempting a diff-based update.
  	 * @param {string} [options.localIdeographFontFamily='sans-serif'] Defines a CSS
  	 *   font-family for locally overriding generation of glyphs in the 'CJK Unified Ideographs', 'Hiragana', 'Katakana' and 'Hangul Syllables' ranges.
  	 *   In these ranges, font settings from the map's style will be ignored, except for font-weight keywords (light/regular/medium/bold).
  	 *   Set to `false`, to enable font settings from the map's style for these glyph ranges.
  	 *   Forces a full update.
  	 * @returns {Map} `this`
  	 *
  	 * @example
  	 * map.setStyle("https://demotiles.maplibre.org/style.json");
  	 *
  	 */
  def setStyle(): this.type = js.native
  def setStyle(style: String): this.type = js.native
  def setStyle(style: String, options: diffbooleanundefinedStyle): this.type = js.native
  def setStyle(style: Null, options: diffbooleanundefinedStyle): this.type = js.native
  def setStyle(style: StyleSpecification): this.type = js.native
  def setStyle(style: StyleSpecification, options: diffbooleanundefinedStyle): this.type = js.native
  
  /**
  	 * Loads a 3D terrain mesh, based on a "raster-dem" source.
  	 * @param {TerrainSpecification} [options] Options object.
  	 * @returns {Map} `this`
  	 * @example
  	 * map.setTerrain({ source: 'terrain' });
  	 */
  def setTerrain(options: TerrainSpecification): Map = js.native
  
  /**
  	 *  Updates the requestManager's transform request with a new function
  	 *
  	 * @param transformRequest A callback run before the Map makes a request for an external URL. The callback can be used to modify the url, set headers, or set the credentials property for cross-origin requests.
  	 *    Expected to return an object with a `url` property and optionally `headers` and `credentials` properties
  	 *
  	 * @returns {Map} `this`
  	 *
  	 *  @example
  	 *  map.setTransformRequest((url: string, resourceType: string) => {});
  	 */
  def setTransformRequest(transformRequest: RequestTransformFunction): this.type = js.native
  
  /**
  	 * Gets and sets a Boolean indicating whether the map will render boxes
  	 * around all symbols in the data source, revealing which symbols
  	 * were rendered or which were hidden due to collisions.
  	 * This information is useful for debugging.
  	 *
  	 * @name showCollisionBoxes
  	 * @type {boolean}
  	 * @instance
  	 * @memberof Map
  	 */
  def showCollisionBoxes: Boolean = js.native
  def showCollisionBoxes_=(value: Boolean): scala.Unit = js.native
  
  def showOverdrawInspector: Boolean = js.native
  def showOverdrawInspector_=(value: Boolean): scala.Unit = js.native
  
  /**
  	 * Gets and sets a Boolean indicating whether the map will visualize
  	 * the padding offsets.
  	 *
  	 * @name showPadding
  	 * @type {boolean}
  	 * @instance
  	 * @memberof Map
  	 */
  def showPadding: Boolean = js.native
  def showPadding_=(value: Boolean): scala.Unit = js.native
  
  /**
  	 * Gets and sets a Boolean indicating whether the map will render an outline
  	 * around each tile and the tile ID. These tile boundaries are useful for
  	 * debugging.
  	 *
  	 * The uncompressed file size of the first vector source is drawn in the top left
  	 * corner of each tile, next to the tile ID.
  	 *
  	 * @name showTileBoundaries
  	 * @type {boolean}
  	 * @instance
  	 * @memberof Map
  	 * @example
  	 * map.showTileBoundaries = true;
  	 */
  def showTileBoundaries: Boolean = js.native
  def showTileBoundaries_=(value: Boolean): scala.Unit = js.native
  
  var style: Style = js.native
  
  /**
  	 * The map's {@link TouchPitchHandler}, which allows the user to pitch the map with touch gestures.
  	 * Find more details and examples using `touchPitch` in the {@link TouchPitchHandler} section.
  	 */
  var touchPitch: TouchPitchHandler = js.native
  
  /**
  	 * The map's {@link TouchZoomRotateHandler}, which allows the user to zoom or rotate the map with touch gestures.
  	 * Find more details and examples using `touchZoomRotate` in the {@link TouchZoomRotateHandler} section.
  	 */
  var touchZoomRotate: TouchZoomRotateHandler = js.native
  
  /**
  	 * Trigger the rendering of a single frame. Use this method with custom layers to
  	 * repaint the map when the layer changes. Calling this multiple times before the
  	 * next frame is rendered will still result in only a single frame being rendered.
  	 * @example
  	 * map.triggerRepaint();
  	 * @see [Add a 3D model](https://maplibre.org/maplibre-gl-js-docs/example/add-3d-model/)
  	 * @see [Add an animated icon to the map](https://maplibre.org/maplibre-gl-js-docs/example/add-image-animated/)
  	 */
  def triggerRepaint(): scala.Unit = js.native
  
  /**
  	 * Returns a {@link LngLat} representing geographical coordinates that correspond
  	 * to the specified pixel coordinates.
  	 *
  	 * @param {PointLike} point The pixel coordinates to unproject.
  	 * @returns {LngLat} The {@link LngLat} corresponding to `point`.
  	 * @example
  	 * map.on('click', function(e) {
  	 *   // When the map is clicked, get the geographic coordinate.
  	 *   var coordinate = map.unproject(e.point);
  	 * });
  	 */
  def unproject(point: PointLike): LngLat = js.native
  
  def updateImage(id: String, image: Data): this.type = js.native
  def updateImage(id: String, image: StyleImageInterface): this.type = js.native
  /**
  	 * Update an existing image in a style. This image can be displayed on the map like any other icon in the style's
  	 * sprite using the image's ID with
  	 * [`icon-image`](https://maplibre.org/maplibre-gl-js-docs/style-spec/#layout-symbol-icon-image),
  	 * [`background-pattern`](https://maplibre.org/maplibre-gl-js-docs/style-spec/#paint-background-background-pattern),
  	 * [`fill-pattern`](https://maplibre.org/maplibre-gl-js-docs/style-spec/#paint-fill-fill-pattern),
  	 * or [`line-pattern`](https://maplibre.org/maplibre-gl-js-docs/style-spec/#paint-line-line-pattern).
  	 *
  	 * @param id The ID of the image.
  	 * @param image The image as an `HTMLImageElement`, `ImageData`, `ImageBitmap` or object with `width`, `height`, and `data`
  	 * properties with the same format as `ImageData`.
  	 *
  	 * @example
  	 * // If an image with the ID 'cat' already exists in the style's sprite,
  	 * // replace that image with a new image, 'other-cat-icon.png'.
  	 * if (map.hasImage('cat')) map.updateImage('cat', './other-cat-icon.png');
  	 */
  def updateImage(id: String, image: HTMLImageElement): this.type = js.native
  def updateImage(id: String, image: ImageBitmap): this.type = js.native
  def updateImage(id: String, image: ImageData): this.type = js.native
  
  /**
  	 * Returns the package version of the library
  	 * @returns {string} Package version of the library
  	 */
  def version: String = js.native
  
  def vertices: Boolean = js.native
  def vertices_=(value: Boolean): scala.Unit = js.native
}
