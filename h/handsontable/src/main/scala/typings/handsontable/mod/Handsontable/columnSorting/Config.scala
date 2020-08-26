package typings.handsontable.mod.Handsontable.columnSorting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var column: Double = js.native
  var sortOrder: SortOrderType = js.native
}

object Config {
  @scala.inline
  def apply(column: Double, sortOrder: SortOrderType): Config = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortOrder(value: SortOrderType): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
  }
  
}

