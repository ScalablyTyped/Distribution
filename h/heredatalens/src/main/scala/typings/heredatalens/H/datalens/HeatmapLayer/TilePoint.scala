package typings.heredatalens.H.datalens.HeatmapLayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the input data format for heat map rendering.
  * For heat map rendering, each row of data must be represented as a point within the map tile.
  */
trait TilePoint extends js.Object {
  /** Number of contributors to the value at the point (eg number of rows in a bucket) */
  var count: Double
  /** Reference to source data row */
  var data: js.UndefOr[Row] = js.undefined
  /** Value at the point (eg aggregated bucket value) */
  var value: Double
  /** Row relative to tile */
  var x: Double
  /** Column relative to tile */
  var y: Double
}

object TilePoint {
  @scala.inline
  def apply(count: Double, value: Double, x: Double, y: Double, data: Row = null): TilePoint = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TilePoint]
  }
}

