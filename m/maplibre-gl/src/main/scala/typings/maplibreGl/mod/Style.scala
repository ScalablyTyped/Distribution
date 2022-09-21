package typings.maplibreGl.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.geojson.mod.GeoJSON
import typings.maplibreGl.anon.FeatureFeatureIndex
import typings.maplibreGl.anon.Filter
import typings.maplibreGl.anon.Icons
import typings.maplibreGl.anon.Stacks
import typings.maplibreGl.anon.Validate
import typings.maplibreGl.maplibreGlBooleans.`true`
import typings.maplibreGl.maplibreGlStrings.clear
import typings.maplibreGl.maplibreGlStrings.reload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "Style")
@js.native
open class Style protected () extends Evented {
  def this(map: Map) = this()
  def this(map: Map, options: StyleOptions) = this()
  
  def _afterImageUpdated(id: String): scala.Unit = js.native
  
  var _availableImages: js.Array[String] = js.native
  
  var _changed: Boolean = js.native
  
  var _changedImages: StringDictionary[`true`] = js.native
  
  def _checkLoaded(): scala.Unit = js.native
  
  def _clearSource(id: String): scala.Unit = js.native
  
  def _flattenAndSortRenderedFeatures(sourceResults: js.Array[StringDictionary[js.Array[FeatureFeatureIndex]]]): js.Array[Any] = js.native
  
  def _generateCollisionBoxes(): scala.Unit = js.native
  
  var _layerOrderChanged: Boolean = js.native
  
  var _layers: StringDictionary[StyleLayer] = js.native
  
  def _load(json: StyleSpecification, validate: Boolean): scala.Unit = js.native
  
  def _loadSprite(url: String): scala.Unit = js.native
  
  var _loaded: Boolean = js.native
  
  var _order: js.Array[String] = js.native
  
  def _releaseSymbolFadeTiles(): scala.Unit = js.native
  
  def _reloadSource(id: String): scala.Unit = js.native
  
  def _remove(): scala.Unit = js.native
  
  var _removedLayers: StringDictionary[StyleLayer] = js.native
  
  var _request: Cancelable = js.native
  
  def _resetUpdates(): scala.Unit = js.native
  
  def _rtlTextPluginCallback(a: Any): Any = js.native
  
  def _serializeLayers(ids: js.Array[String]): js.Array[LayerSpecification] = js.native
  
  var _serializedLayers: StringDictionary[Any] = js.native
  
  var _spriteRequest: Cancelable = js.native
  
  def _terrainDataCallback(e: Any): Any = js.native
  
  def _terrainfreezeElevationCallback(e: Any): Any = js.native
  
  def _updateLayer(layer: StyleLayer): scala.Unit = js.native
  
  def _updatePlacement(
    transform: Transform,
    showCollisionBoxes: Boolean,
    fadeDuration: Double,
    crossSourceCollisions: Boolean
  ): Boolean = js.native
  def _updatePlacement(
    transform: Transform,
    showCollisionBoxes: Boolean,
    fadeDuration: Double,
    crossSourceCollisions: Boolean,
    forceFullPlacement: Boolean
  ): Boolean = js.native
  
  def _updateSources(transform: Transform): scala.Unit = js.native
  
  def _updateTilesForChangedImages(): scala.Unit = js.native
  
  def _updateWorkerLayers(updatedIds: js.Array[String], removedIds: js.Array[String]): scala.Unit = js.native
  
  var _updatedLayers: StringDictionary[`true`] = js.native
  
  var _updatedPaintProps: StringDictionary[`true`] = js.native
  
  var _updatedSources: StringDictionary[clear | reload] = js.native
  
  def _validate(validate: Validator, key: String, value: Any, props: Any): Boolean = js.native
  def _validate(validate: Validator, key: String, value: Any, props: Any, options: Validate): Boolean = js.native
  
  def _validateLayer(layer: StyleLayer): scala.Unit = js.native
  
  def addImage(id: String, image: StyleImage): this.type = js.native
  
  def addLayer(layerObject: CustomLayerInterface): scala.Unit = js.native
  def addLayer(layerObject: CustomLayerInterface, before: String): scala.Unit = js.native
  def addLayer(layerObject: CustomLayerInterface, before: String, options: StyleSetterOptions): scala.Unit = js.native
  def addLayer(layerObject: CustomLayerInterface, before: scala.Unit, options: StyleSetterOptions): scala.Unit = js.native
  /**
  	 * Add a layer to the map style. The layer will be inserted before the layer with
  	 * ID `before`, or appended if `before` is omitted.
  	 * @param {Object | CustomLayerInterface} layerObject The style layer to add.
  	 * @param {string} [before] ID of an existing layer to insert before
  	 * @param {Object} options Style setter options.
  	 * @returns {Map} The {@link Map} object.
  	 */
  def addLayer(layerObject: LayerSpecification): scala.Unit = js.native
  def addLayer(layerObject: LayerSpecification, before: String): scala.Unit = js.native
  def addLayer(layerObject: LayerSpecification, before: String, options: StyleSetterOptions): scala.Unit = js.native
  def addLayer(layerObject: LayerSpecification, before: scala.Unit, options: StyleSetterOptions): scala.Unit = js.native
  
  def addSource(id: String, source: SourceSpecification): scala.Unit = js.native
  def addSource(id: String, source: SourceSpecification, options: StyleSetterOptions): scala.Unit = js.native
  
  def addSourceType(name: String, SourceType: SourceClass, callback: Callback[scala.Unit]): scala.Unit = js.native
  
  var crossTileSymbolIndex: CrossTileSymbolIndex = js.native
  
  var dispatcher: Dispatcher = js.native
  
  def getFeatureState(target: FeatureIdentifier): Any = js.native
  
  /**
  	 * Get a layer's filter object
  	 * @param {string} layer the layer to inspect
  	 * @returns {*} the layer's filter, if any
  	 */
  def getFilter(layer: String): scala.Unit | FilterSpecification = js.native
  
  def getGlyphs(mapId: String, params: Stacks, callback: Callback[StringDictionary[NumberDictionary[StyleGlyph]]]): scala.Unit = js.native
  
  def getImage(id: String): StyleImage = js.native
  
  def getImages(mapId: String, params: Icons, callback: Callback[StringDictionary[StyleImage]]): scala.Unit = js.native
  
  /**
  	 * Return the style layer object with the given `id`.
  	 *
  	 * @param {string} id - id of the desired layer
  	 * @returns {?Object} a layer, if one with the given `id` exists
  	 */
  def getLayer(id: String): StyleLayer = js.native
  
  /**
  	 * Get a layout property's value from a given layer
  	 * @param {string} layerId the layer to inspect
  	 * @param {string} name the name of the layout property
  	 * @returns {*} the property value
  	 */
  def getLayoutProperty(layerId: String, name: String): Any = js.native
  
  def getLight(): Any = js.native
  
  def getPaintProperty(layer: String, name: String): Any = js.native
  
  def getResource(mapId: String, params: RequestParameters, callback: ResponseCallback[Any]): Cancelable = js.native
  
  /**
  	 * Get a source by id.
  	 * @param {string} id id of the desired source
  	 * @returns {Source | undefined} source
  	 */
  def getSource(id: String): js.UndefOr[Source] = js.native
  
  def getTransition(): Any = js.native
  
  var glyphManager: GlyphManager = js.native
  
  /**
  	 * checks if a specific layer is present within the style.
  	 *
  	 * @param {string} id - id of the desired layer
  	 * @returns {boolean} a boolean specifying if the given layer is present
  	 */
  def hasLayer(id: String): Boolean = js.native
  
  def hasTransitions(): Boolean = js.native
  
  var imageManager: ImageManager = js.native
  
  var light: Light = js.native
  
  var lineAtlas: LineAtlas = js.native
  
  def listImages(): js.Array[String] = js.native
  
  def loadEmpty(): scala.Unit = js.native
  
  def loadJSON(json: StyleSpecification): scala.Unit = js.native
  def loadJSON(json: StyleSpecification, options: StyleSetterOptions): scala.Unit = js.native
  
  def loadURL(url: String): scala.Unit = js.native
  def loadURL(url: String, options: Validate): scala.Unit = js.native
  
  def loaded(): Boolean = js.native
  
  var map: Map = js.native
  
  /**
  	 * Moves a layer to a different z-position. The layer will be inserted before the layer with
  	 * ID `before`, or appended if `before` is omitted.
  	 * @param {string} id ID of the layer to move
  	 * @param {string} [before] ID of an existing layer to insert before
  	 */
  def moveLayer(id: String): scala.Unit = js.native
  def moveLayer(id: String, before: String): scala.Unit = js.native
  
  var pauseablePlacement: PauseablePlacement = js.native
  
  var placement: Placement = js.native
  
  def queryRenderedFeatures(queryGeometry: Any, params: Any, transform: Transform): js.Array[Any] = js.native
  
  def querySourceFeatures(sourceID: String): js.Array[Any] = js.native
  def querySourceFeatures(sourceID: String, params: Filter): js.Array[Any] = js.native
  
  def removeFeatureState(target: FeatureIdentifier): scala.Unit = js.native
  def removeFeatureState(target: FeatureIdentifier, key: String): scala.Unit = js.native
  
  def removeImage(id: String): this.type = js.native
  
  /**
  	 * Remove the layer with the given id from the style.
  	 *
  	 * If no such layer exists, an `error` event is fired.
  	 *
  	 * @param {string} id id of the layer to remove
  	 * @fires error
  	 */
  def removeLayer(id: String): scala.Unit = js.native
  
  /**
  	 * Remove a source from this stylesheet, given its id.
  	 * @param {string} id id of the source to remove
  	 * @throws {Error} if no source is found with the given ID
  	 * @returns {Map} The {@link Map} object.
  	 */
  def removeSource(id: String): this.type = js.native
  
  def serialize(): StyleSpecification = js.native
  
  def setFeatureState(target: FeatureIdentifier, state: Any): scala.Unit = js.native
  
  def setFilter(layerId: String): scala.Unit = js.native
  def setFilter(layerId: String, filter: Null, options: StyleSetterOptions): scala.Unit = js.native
  def setFilter(layerId: String, filter: scala.Unit, options: StyleSetterOptions): scala.Unit = js.native
  def setFilter(layerId: String, filter: FilterSpecification): scala.Unit = js.native
  def setFilter(layerId: String, filter: FilterSpecification, options: StyleSetterOptions): scala.Unit = js.native
  
  def setGeoJSONSourceData(id: String, data: String): scala.Unit = js.native
  /**
  	 * Set the data of a GeoJSON source, given its id.
  	 * @param {string} id id of the source
  	 * @param {GeoJSON|string} data GeoJSON source
  	 */
  def setGeoJSONSourceData(id: String, data: GeoJSON): scala.Unit = js.native
  
  def setLayerZoomRange(layerId: String): scala.Unit = js.native
  def setLayerZoomRange(layerId: String, minzoom: Double): scala.Unit = js.native
  def setLayerZoomRange(layerId: String, minzoom: Double, maxzoom: Double): scala.Unit = js.native
  def setLayerZoomRange(layerId: String, minzoom: Null, maxzoom: Double): scala.Unit = js.native
  def setLayerZoomRange(layerId: String, minzoom: scala.Unit, maxzoom: Double): scala.Unit = js.native
  
  def setLayoutProperty(layerId: String, name: String, value: Any): scala.Unit = js.native
  def setLayoutProperty(layerId: String, name: String, value: Any, options: StyleSetterOptions): scala.Unit = js.native
  
  def setLight(lightOptions: LightSpecification): scala.Unit = js.native
  def setLight(lightOptions: LightSpecification, options: StyleSetterOptions): scala.Unit = js.native
  
  def setPaintProperty(layerId: String, name: String, value: Any): scala.Unit = js.native
  def setPaintProperty(layerId: String, name: String, value: Any, options: StyleSetterOptions): scala.Unit = js.native
  
  /**
  	 * Update this style's state to match the given style JSON, performing only
  	 * the necessary mutations.
  	 *
  	 * May throw an Error ('Unimplemented: METHOD') if the mapbox-gl-style-spec
  	 * diff algorithm produces an operation that is not supported.
  	 *
  	 * @returns {boolean} true if any changes were made; false otherwise
  	 * @private
  	 */
  def setState(nextState: StyleSpecification): Boolean = js.native
  
  /**
  	 * Loads a 3D terrain mesh, based on a "raster-dem" source.
  	 * @param {TerrainSpecification} [options] Options object.
  	 */
  def setTerrain(): scala.Unit = js.native
  def setTerrain(options: TerrainSpecification): scala.Unit = js.native
  
  var sourceCaches: StringDictionary[SourceCache] = js.native
  
  var stylesheet: StyleSpecification = js.native
  
  var terrain: Terrain = js.native
  
  /**
  	 * Apply queued style updates in a batch and recalculate zoom-dependent paint properties.
  	 * @private
  	 */
  def update(parameters: EvaluationParameters): scala.Unit = js.native
  
  def updateImage(id: String, image: StyleImage): scala.Unit = js.native
  
  var z: Double = js.native
  
  var zoomHistory: ZoomHistory = js.native
}
/* static members */
object Style {
  
  @JSImport("maplibre-gl", "Style")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maplibre-gl", "Style.getSourceType")
  @js.native
  def getSourceType: js.Function1[/* name */ String, Any] = js.native
  inline def getSourceType(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSourceType")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getSourceType_=(x: js.Function1[/* name */ String, Any]): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getSourceType")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "Style.registerForPluginStateChange")
  @js.native
  def registerForPluginStateChange: js.Function1[/* callback */ PluginStateSyncCallback, PluginStateSyncCallback] = js.native
  inline def registerForPluginStateChange(callback: PluginStateSyncCallback): PluginStateSyncCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("registerForPluginStateChange")(callback.asInstanceOf[js.Any]).asInstanceOf[PluginStateSyncCallback]
  inline def registerForPluginStateChange_=(x: js.Function1[/* callback */ PluginStateSyncCallback, PluginStateSyncCallback]): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("registerForPluginStateChange")(x.asInstanceOf[js.Any])
  
  @JSImport("maplibre-gl", "Style.setSourceType")
  @js.native
  def setSourceType: js.Function2[/* name */ String, /* type */ Instantiable1[/* args */ Any, Source], scala.Unit] = js.native
  inline def setSourceType(name: String, `type`: Instantiable1[/* args */ Any, Source]): scala.Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSourceType")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  inline def setSourceType_=(x: js.Function2[/* name */ String, /* type */ Instantiable1[/* args */ Any, Source], scala.Unit]): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setSourceType")(x.asInstanceOf[js.Any])
}
