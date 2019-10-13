package typings.mapbox.mapboxMod._Global_.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileLayer
  extends typings.leaflet.leafletMod.TileLayer {
  /**
  			 * Returns this layer's TileJSON object which determines its tile source, zoom bounds and other metadata.
  			 */
  def getTileJSON(): js.Any = js.native
  /**
  			 * Set the image format of tiles in this layer. You can use lower-quality tiles in order to load maps faster
  			 */
  def setFormat(format: String): TileLayer = js.native
}

@JSGlobal("L.mapbox.tileLayer")
@js.native
object tileLayer extends js.Object {
  //////////////////////////////////////////////////////////////////////
  /////////////////////////////// LAYERS ///////////////////////////////
  //////////////////////////////////////////////////////////////////////
  // TileLayer
  //////////////////////////////////////////////////////////////////////
  /**
  		 * You can add a tiled layer to your map with L.mapbox.tileLayer(), a simple interface to layers from Mapbox and elsewhere.
  		 */
  def apply(idOrTileJson: String): TileLayer = js.native
  def apply(idOrTileJson: String, options: TileLayerOptions): TileLayer = js.native
}

