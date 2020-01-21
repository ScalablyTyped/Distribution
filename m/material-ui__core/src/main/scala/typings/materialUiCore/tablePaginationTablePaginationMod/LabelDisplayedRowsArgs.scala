package typings.materialUiCore.tablePaginationTablePaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelDisplayedRowsArgs extends js.Object {
  var count: Double = js.native
  var from: Double = js.native
  var page: Double = js.native
  var to: Double = js.native
}

object LabelDisplayedRowsArgs {
  @scala.inline
  def apply(count: Double, from: Double, page: Double, to: Double): LabelDisplayedRowsArgs = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LabelDisplayedRowsArgs]
  }
}

