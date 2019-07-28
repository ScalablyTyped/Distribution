package typings.atMaterialDashUiCore.tablePaginationTablePaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelDisplayedRowsArgs extends js.Object {
  var count: Double
  var from: Double
  var page: Double
  var to: Double
}

object LabelDisplayedRowsArgs {
  @scala.inline
  def apply(count: Double, from: Double, page: Double, to: Double): LabelDisplayedRowsArgs = {
    val __obj = js.Dynamic.literal(count = count, from = from, page = page, to = to)
  
    __obj.asInstanceOf[LabelDisplayedRowsArgs]
  }
}

