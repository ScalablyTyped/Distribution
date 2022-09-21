package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.`raster-dem`
import typings.maplibreGl.maplibreGlStrings.raster
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "RasterTileSource")
@js.native
open class RasterTileSource protected ()
  extends Evented
     with Source {
  def this(id: String, options: RasterDEMSourceSpecification, dispatcher: Dispatcher, eventedParent: Evented) = this()
  def this(id: String, options: RasterSourceSpecification, dispatcher: Dispatcher, eventedParent: Evented) = this()
  
  var _loaded: Boolean = js.native
  
  var _options: RasterSourceSpecification | RasterDEMSourceSpecification = js.native
  
  var _tileJSONRequest: Cancelable = js.native
  
  @JSName("abortTile")
  def abortTile_MRasterTileSource(tile: Tile, callback: Callback[scala.Unit]): scala.Unit = js.native
  
  var bounds: js.Tuple4[Double, Double, Double, Double] = js.native
  
  var dispatcher: Dispatcher = js.native
  
  /* InferMemberOverrides */
  override def fire(event: Event): this.type & Any = js.native
  
  @JSName("hasTile")
  def hasTile_MRasterTileSource(tileID: OverscaledTileID): Boolean = js.native
  
  /* CompleteClass */
  override def hasTransition(): Boolean = js.native
  
  /* CompleteClass */
  var id: String = js.native
  
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
  def onAdd_MRasterTileSource(map: Map): scala.Unit = js.native
  
  @JSName("onRemove")
  def onRemove_MRasterTileSource(): scala.Unit = js.native
  
  @JSName("roundZoom")
  var roundZoom_RasterTileSource: Boolean = js.native
  
  var scheme: String = js.native
  
  /**
  	 * @returns A plain (stringifiable) JS object representing the current state of the source.
  	 * Creating a source using the returned object as the `options` should result in a Source that is
  	 * equivalent to this one.
  	 * @private
  	 */
  /* CompleteClass */
  override def serialize(): Any = js.native
  
  var tileBounds: TileBounds = js.native
  
  /* CompleteClass */
  var tileSize: Double = js.native
  
  var tiles: js.Array[String] = js.native
  
  /* CompleteClass */
  override val `type`: String = js.native
  @JSName("type")
  var type_RasterTileSource: raster | `raster-dem` = js.native
  
  @JSName("unloadTile")
  def unloadTile_MRasterTileSource(tile: Tile, callback: Callback[scala.Unit]): scala.Unit = js.native
  
  var url: String = js.native
}
