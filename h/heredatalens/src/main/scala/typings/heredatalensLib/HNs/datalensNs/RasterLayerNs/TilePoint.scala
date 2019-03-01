package typings
package heredatalensLib.HNs.datalensNs.RasterLayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the input data format for heat map rendering.
  * To collect data rows for each tile with respect to the buffer, each row must be represented as a point within the map tile.
  */
trait TilePoint extends js.Object {
  /** Reference to source data row */
  var data: js.UndefOr[Row] = js.undefined
  /** Row relative to tile */
  var x: scala.Double
  /** Column relative to tile */
  var y: scala.Double
}

object TilePoint {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double, data: js.UndefOr[Row] = js.undefined): TilePoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[TilePoint]
  }
}

