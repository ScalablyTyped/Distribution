package typings.heremaps.H.map.layer.ITileLayer

import typings.heremaps.H.map.provider.Tile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response object for a tile request. Contains total number of elements requested and an array of currently available Tiles
  * @property total {number} - the total number of requested tiles
  * @property tiles {Array<H.map.provider.Tile>} - the tiles which this provider can currently return synchronously
  */
trait Response extends js.Object {
  var tiles: js.Array[Tile]
  var total: Double
}

object Response {
  @scala.inline
  def apply(tiles: js.Array[Tile], total: Double): Response = {
    val __obj = js.Dynamic.literal(tiles = tiles, total = total)
  
    __obj.asInstanceOf[Response]
  }
}

