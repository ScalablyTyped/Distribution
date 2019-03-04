package typings
package heremapsLib.HNs.mapNs.layerNs.ITileLayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response object for a tile request. Contains total number of elements requested and an array of currently available Tiles
  * @property total {number} - the total number of requested tiles
  * @property tiles {Array<H.map.provider.Tile>} - the tiles which this provider can currently return synchronously
  */
trait Response extends js.Object {
  var tiles: js.Array[heremapsLib.HNs.mapNs.providerNs.Tile]
  var total: scala.Double
}

object Response {
  @scala.inline
  def apply(tiles: js.Array[heremapsLib.HNs.mapNs.providerNs.Tile], total: scala.Double): Response = {
    val __obj = js.Dynamic.literal(tiles = tiles, total = total)
  
    __obj.asInstanceOf[Response]
  }
}

