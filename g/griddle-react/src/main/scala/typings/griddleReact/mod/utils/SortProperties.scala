package typings.griddleReact.mod.utils

import typings.griddleReact.mod.GriddleSortKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortProperties extends js.Object {
  var columnId: String = js.native
  var sortProperty: GriddleSortKey = js.native
  def setSortColumn(sortProperties: js.Function1[/* key */ GriddleSortKey, Unit]): Unit = js.native
}

object SortProperties {
  @scala.inline
  def apply(
    columnId: String,
    setSortColumn: js.Function1[/* key */ GriddleSortKey, Unit] => Unit,
    sortProperty: GriddleSortKey
  ): SortProperties = {
    val __obj = js.Dynamic.literal(columnId = columnId.asInstanceOf[js.Any], setSortColumn = js.Any.fromFunction1(setSortColumn), sortProperty = sortProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortProperties]
  }
  @scala.inline
  implicit class SortPropertiesOps[Self <: SortProperties] (val x: Self) extends AnyVal {
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
    def setColumnId(value: String): Self = this.set("columnId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetSortColumn(value: js.Function1[/* key */ GriddleSortKey, Unit] => Unit): Self = this.set("setSortColumn", js.Any.fromFunction1(value))
    @scala.inline
    def setSortProperty(value: GriddleSortKey): Self = this.set("sortProperty", value.asInstanceOf[js.Any])
  }
  
}

