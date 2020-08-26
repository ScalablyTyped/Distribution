package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttAssignments extends js.Object {
  var dataResourceIdField: js.UndefOr[String] = js.native
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  var dataTaskIdField: js.UndefOr[String] = js.native
  var dataValueField: js.UndefOr[String] = js.native
}

object GanttAssignments {
  @scala.inline
  def apply(): GanttAssignments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttAssignments]
  }
  @scala.inline
  implicit class GanttAssignmentsOps[Self <: GanttAssignments] (val x: Self) extends AnyVal {
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
    def setDataResourceIdField(value: String): Self = this.set("dataResourceIdField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataResourceIdField: Self = this.set("dataResourceIdField", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDataTaskIdField(value: String): Self = this.set("dataTaskIdField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTaskIdField: Self = this.set("dataTaskIdField", js.undefined)
    @scala.inline
    def setDataValueField(value: String): Self = this.set("dataValueField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataValueField: Self = this.set("dataValueField", js.undefined)
  }
  
}

