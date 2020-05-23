package typings.heredatalens.H.datalens.HeatmapLayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Slice of data (eg Data Lens query data row) that represents a data point.
  * Each row is transformed into TilePoint and then rendered on a heat map. By default each row is an Object where property names correspond to data column names.
  * This representation can be changed with the dataToRows callback.
  */
trait Row extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var tx: js.UndefOr[Double] = js.undefined
  var ty: js.UndefOr[Double] = js.undefined
}

object Row {
  @scala.inline
  def apply(
    count: js.UndefOr[Double] = js.undefined,
    tx: js.UndefOr[Double] = js.undefined,
    ty: js.UndefOr[Double] = js.undefined
  ): Row = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tx)) __obj.updateDynamic("tx")(tx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ty)) __obj.updateDynamic("ty")(ty.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row]
  }
}

