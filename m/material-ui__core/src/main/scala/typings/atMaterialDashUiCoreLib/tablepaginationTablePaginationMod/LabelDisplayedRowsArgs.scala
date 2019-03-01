package typings
package atMaterialDashUiCoreLib.tablepaginationTablePaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelDisplayedRowsArgs extends js.Object {
  var count: scala.Double
  var from: scala.Double
  var page: scala.Double
  var to: scala.Double
}

object LabelDisplayedRowsArgs {
  @scala.inline
  def apply(count: scala.Double, from: scala.Double, page: scala.Double, to: scala.Double): LabelDisplayedRowsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("page")(page)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[LabelDisplayedRowsArgs]
  }
}

