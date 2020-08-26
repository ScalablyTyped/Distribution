package typings.handsontable.mod.Handsontable.plugins.UndoRedoAction

import typings.handsontable.handsontableStrings.remove_col
import typings.handsontable.mod.Handsontable.plugins.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveCol extends js.Object {
  var actionType: remove_col = js.native
  var amount: Double = js.native
  var columnPositions: js.Array[Double] = js.native
  var data: js.Array[js.Array[CellValue]] = js.native
  var headers: js.Array[String] = js.native
  var index: Double = js.native
  var indexes: js.Array[Double] = js.native
}

object RemoveCol {
  @scala.inline
  def apply(
    actionType: remove_col,
    amount: Double,
    columnPositions: js.Array[Double],
    data: js.Array[js.Array[CellValue]],
    headers: js.Array[String],
    index: Double,
    indexes: js.Array[Double]
  ): RemoveCol = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], columnPositions = columnPositions.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveCol]
  }
  @scala.inline
  implicit class RemoveColOps[Self <: RemoveCol] (val x: Self) extends AnyVal {
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
    def setActionType(value: remove_col): Self = this.set("actionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnPositionsVarargs(value: Double*): Self = this.set("columnPositions", js.Array(value :_*))
    @scala.inline
    def setColumnPositions(value: js.Array[Double]): Self = this.set("columnPositions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: js.Array[CellValue]*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Array[CellValue]]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadersVarargs(value: String*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexesVarargs(value: Double*): Self = this.set("indexes", js.Array(value :_*))
    @scala.inline
    def setIndexes(value: js.Array[Double]): Self = this.set("indexes", value.asInstanceOf[js.Any])
  }
  
}

