package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "VectorTileSource")
@js.native
open class VectorTileSource protected ()
  extends Evented
     with Source {
  def this(
    id: String,
    options: typings.maplibreGl.anon.VectorSourceSpecification,
    dispatcher: Dispatcher,
    eventedParent: Evented
  ) = this()
  
  var _collectResourceTiming: Boolean = js.native
  
  var _loaded: Boolean = js.native
  
  var _options: VectorSourceSpecification = js.native
  
  var _tileJSONRequest: Cancelable = js.native
  
  @JSName("abortTile")
  def abortTile_MVectorTileSource(tile: Tile): scala.Unit = js.native
  
  var bounds: js.Tuple4[Double, Double, Double, Double] = js.native
  
  var dispatcher: Dispatcher = js.native
  
  /* InferMemberOverrides */
  override def fire(event: Event): this.type & Any = js.native
  
  @JSName("hasTile")
  def hasTile_MVectorTileSource(tileID: OverscaledTileID): Boolean = js.native
  
  /* CompleteClass */
  override def hasTransition(): Boolean = js.native
  
  /* CompleteClass */
  var id: String = js.native
  
  @JSName("isTileClipped")
  var isTileClipped_VectorTileSource: Boolean = js.native
  
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
  def onAdd_MVectorTileSource(map: Map): scala.Unit = js.native
  
  @JSName("onRemove")
  def onRemove_MVectorTileSource(): scala.Unit = js.native
  
  var promoteId: PromoteIdSpecification = js.native
  
  @JSName("reparseOverscaled")
  var reparseOverscaled_VectorTileSource: Boolean = js.native
  
  var scheme: String = js.native
  
  /**
  	 * @returns A plain (stringifiable) JS object representing the current state of the source.
  	 * Creating a source using the returned object as the `options` should result in a Source that is
  	 * equivalent to this one.
  	 * @private
  	 */
  /* CompleteClass */
  override def serialize(): Any = js.native
  
  def setSourceProperty(callback: js.Function): scala.Unit = js.native
  
  /**
  	 * Sets the source `tiles` property and re-renders the map.
  	 *
  	 * @param {string[]} tiles An array of one or more tile source URLs, as in the TileJSON spec.
  	 * @returns {VectorTileSource} this
  	 */
  def setTiles(tiles: js.Array[String]): this.type = js.native
  
  /**
  	 * Sets the source `url` property and re-renders the map.
  	 *
  	 * @param {string} url A URL to a TileJSON resource. Supported protocols are `http:` and `https:`.
  	 * @returns {VectorTileSource} this
  	 */
  def setUrl(url: String): this.type = js.native
  
  var tileBounds: TileBounds = js.native
  
  /* CompleteClass */
  var tileSize: Double = js.native
  
  var tiles: js.Array[String] = js.native
  
  /* CompleteClass */
  override val `type`: String = js.native
  @JSName("type")
  var type_VectorTileSource: vector = js.native
  
  @JSName("unloadTile")
  def unloadTile_MVectorTileSource(tile: Tile): scala.Unit = js.native
  
  var url: String = js.native
}
