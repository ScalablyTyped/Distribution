package typings
package heredatalensLib.HNs.datalensNs.HeatmapLayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Slice of data (eg Data Lens query data row) that represents a data point.
  * Each row is transformed into TilePoint and then rendered on a heat map. By default each row is an Object where property names correspond to data column names.
  * This representation can be changed with the dataToRows callback.
  */
trait Row extends js.Object {
  var count: js.UndefOr[scala.Double] = js.undefined
  var tx: js.UndefOr[scala.Double] = js.undefined
  var ty: js.UndefOr[scala.Double] = js.undefined
}

object Row {
  @scala.inline
  def apply(
    count: scala.Int | scala.Double = null,
    tx: scala.Int | scala.Double = null,
    ty: scala.Int | scala.Double = null
  ): Row = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (tx != null) __obj.updateDynamic("tx")(tx.asInstanceOf[js.Any])
    if (ty != null) __obj.updateDynamic("ty")(ty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row]
  }
}

