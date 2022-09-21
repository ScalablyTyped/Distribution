package typings.maplibreGl.mod

import typings.geojson.mod.GeoJSON
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.maplibreGl.maplibreGlStrings.geojson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "GeoJSONSource")
@js.native
open class GeoJSONSource protected ()
  extends Evented
     with Source {
  /**
  	 * @private
  	 */
  def this(id: String, options: GeoJSONSourceOptions, dispatcher: Dispatcher, eventedParent: Evented) = this()
  
  var _collectResourceTiming: Boolean = js.native
  
  var _data: GeoJSON | String = js.native
  
  var _options: Any = js.native
  
  var _pendingLoads: Double = js.native
  
  var _removed: Boolean = js.native
  
  def _updateWorkerData(sourceDataType: MapSourceDataType): scala.Unit = js.native
  
  @JSName("abortTile")
  def abortTile_MGeoJSONSource(tile: Tile): scala.Unit = js.native
  
  var actor: Actor = js.native
  
  @JSName("attribution")
  var attribution_GeoJSONSource: String = js.native
  
  /* InferMemberOverrides */
  override def fire(event: Event): this.type & Any = js.native
  
  /**
  	 * For clustered sources, fetches the children of the given cluster on the next zoom level (as an array of GeoJSON features).
  	 *
  	 * @param clusterId The value of the cluster's `cluster_id` property.
  	 * @param callback A callback to be called when the features are retrieved (`(error, features) => { ... }`).
  	 * @returns {GeoJSONSource} this
  	 */
  def getClusterChildren(
    clusterId: Double,
    callback: Callback[js.Array[typings.geojson.mod.Feature[Geometry, GeoJsonProperties]]]
  ): this.type = js.native
  
  /**
  	 * For clustered sources, fetches the zoom at which the given cluster expands.
  	 *
  	 * @param clusterId The value of the cluster's `cluster_id` property.
  	 * @param callback A callback to be called when the zoom value is retrieved (`(error, zoom) => { ... }`).
  	 * @returns {GeoJSONSource} this
  	 */
  def getClusterExpansionZoom(clusterId: Double, callback: Callback[Double]): this.type = js.native
  
  /**
  	 * For clustered sources, fetches the original points that belong to the cluster (as an array of GeoJSON features).
  	 *
  	 * @param clusterId The value of the cluster's `cluster_id` property.
  	 * @param limit The maximum number of features to return.
  	 * @param offset The number of features to skip (e.g. for pagination).
  	 * @param callback A callback to be called when the features are retrieved (`(error, features) => { ... }`).
  	 * @returns {GeoJSONSource} this
  	 * @example
  	 * // Retrieve cluster leaves on click
  	 * map.on('click', 'clusters', function(e) {
  	 *   var features = map.queryRenderedFeatures(e.point, {
  	 *     layers: ['clusters']
  	 *   });
  	 *
  	 *   var clusterId = features[0].properties.cluster_id;
  	 *   var pointCount = features[0].properties.point_count;
  	 *   var clusterSource = map.getSource('clusters');
  	 *
  	 *   clusterSource.getClusterLeaves(clusterId, pointCount, 0, function(error, features) {
  	 *     // Print cluster leaves in the console
  	 *     console.log('Cluster leaves:', error, features);
  	 *   })
  	 * });
  	 */
  def getClusterLeaves(
    clusterId: Double,
    limit: Double,
    offset: Double,
    callback: Callback[js.Array[typings.geojson.mod.Feature[Geometry, GeoJsonProperties]]]
  ): this.type = js.native
  
  /* CompleteClass */
  override def hasTransition(): Boolean = js.native
  
  /* CompleteClass */
  var id: String = js.native
  
  @JSName("isTileClipped")
  var isTileClipped_GeoJSONSource: Boolean = js.native
  
  def load(): scala.Unit = js.native
  
  /* CompleteClass */
  override def loadTile(tile: Tile, callback: Callback[scala.Unit]): scala.Unit = js.native
  
  /* CompleteClass */
  override def loaded(): Boolean = js.native
  
  var map: Map = js.native
  
  /* CompleteClass */
  var maxzoom: Double = js.native
  
  /* CompleteClass */
  var minzoom: Double = js.native
  
  @JSName("onAdd")
  def onAdd_MGeoJSONSource(map: Map): scala.Unit = js.native
  
  @JSName("onRemove")
  def onRemove_MGeoJSONSource(): scala.Unit = js.native
  
  var promoteId: PromoteIdSpecification = js.native
  
  @JSName("reparseOverscaled")
  var reparseOverscaled_GeoJSONSource: Boolean = js.native
  
  /**
  	 * @returns A plain (stringifiable) JS object representing the current state of the source.
  	 * Creating a source using the returned object as the `options` should result in a Source that is
  	 * equivalent to this one.
  	 * @private
  	 */
  /* CompleteClass */
  override def serialize(): Any = js.native
  
  def setData(data: String): this.type = js.native
  /**
  	 * Sets the GeoJSON data and re-renders the map.
  	 *
  	 * @param {Object|string} data A GeoJSON data object or a URL to one. The latter is preferable in the case of large GeoJSON files.
  	 * @returns {GeoJSONSource} this
  	 */
  def setData(data: GeoJSON): this.type = js.native
  
  /* CompleteClass */
  var tileSize: Double = js.native
  
  /* CompleteClass */
  override val `type`: String = js.native
  @JSName("type")
  var type_GeoJSONSource: geojson = js.native
  
  @JSName("unloadTile")
  def unloadTile_MGeoJSONSource(tile: Tile): scala.Unit = js.native
  
  var workerOptions: Any = js.native
}
