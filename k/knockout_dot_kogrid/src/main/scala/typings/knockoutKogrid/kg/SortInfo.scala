package typings.knockoutKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortInfo extends js.Object {
  /** Which column to sort */
  var column: SortColumn = js.native
  /** Which direction to sort */
  var direction: Direction = js.native
}

object SortInfo {
  @scala.inline
  def apply(column: SortColumn, direction: Direction): SortInfo = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortInfo]
  }
  @scala.inline
  implicit class SortInfoOps[Self <: SortInfo] (val x: Self) extends AnyVal {
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
    def setColumn(value: SortColumn): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: Direction): Self = this.set("direction", value.asInstanceOf[js.Any])
  }
  
}

