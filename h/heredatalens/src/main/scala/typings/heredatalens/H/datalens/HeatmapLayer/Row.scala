package typings.heredatalens.H.datalens.HeatmapLayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Slice of data (eg Data Lens query data row) that represents a data point.
  * Each row is transformed into TilePoint and then rendered on a heat map. By default each row is an Object where property names correspond to data column names.
  * This representation can be changed with the dataToRows callback.
  */
@js.native
trait Row extends js.Object {
  var count: js.UndefOr[Double] = js.native
  var tx: js.UndefOr[Double] = js.native
  var ty: js.UndefOr[Double] = js.native
}

object Row {
  @scala.inline
  def apply(): Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Row]
  }
  @scala.inline
  implicit class RowOps[Self <: Row] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setTx(value: Double): Self = this.set("tx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTx: Self = this.set("tx", js.undefined)
    @scala.inline
    def setTy(value: Double): Self = this.set("ty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTy: Self = this.set("ty", js.undefined)
  }
  
}

