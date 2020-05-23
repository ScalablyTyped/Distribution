package typings.heredatalens.H.datalens.RasterLayer

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
  var x: Double
  /** Column relative to tile */
  var y: Double
}

object TilePoint {
  @scala.inline
  def apply(x: Double, y: Double, data: js.UndefOr[Row] = js.undefined): TilePoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TilePoint]
  }
}

