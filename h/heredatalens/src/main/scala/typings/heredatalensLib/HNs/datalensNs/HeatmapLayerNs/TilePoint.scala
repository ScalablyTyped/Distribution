package typings
package heredatalensLib.HNs.datalensNs.HeatmapLayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the input data format for heat map rendering.
  * For heat map rendering, each row of data must be represented as a point within the map tile.
  */
trait TilePoint extends js.Object {
  /** Number of contributors to the value at the point (eg number of rows in a bucket) */
  var count: scala.Double
  /** Reference to source data row */
  var data: js.UndefOr[Row] = js.undefined
  /** Value at the point (eg aggregated bucket value) */
  var value: scala.Double
  /** Row relative to tile */
  var x: scala.Double
  /** Column relative to tile */
  var y: scala.Double
}

object TilePoint {
  @scala.inline
  def apply(count: scala.Double, value: scala.Double, x: scala.Double, y: scala.Double, data: Row = null): TilePoint = {
    val __obj = js.Dynamic.literal(count = count, value = value, x = x, y = y)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[TilePoint]
  }
}

