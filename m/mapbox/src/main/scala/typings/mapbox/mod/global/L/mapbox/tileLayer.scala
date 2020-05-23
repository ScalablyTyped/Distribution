package typings.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(idOrTileJson: String): TileLayer_ = js.native
  def apply(idOrTileJson: String, options: TileLayerOptions): TileLayer_ = js.native
}

