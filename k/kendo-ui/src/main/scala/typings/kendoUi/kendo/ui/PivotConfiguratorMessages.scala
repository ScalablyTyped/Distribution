package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotConfiguratorMessages extends js.Object {
  var columns: js.UndefOr[String] = js.native
  var columnsLabel: js.UndefOr[String] = js.native
  var fieldMenu: js.UndefOr[PivotConfiguratorMessagesFieldMenu] = js.native
  var fieldsLabel: js.UndefOr[String] = js.native
  var measures: js.UndefOr[String] = js.native
  var measuresLabel: js.UndefOr[String] = js.native
  var rows: js.UndefOr[String] = js.native
  var rowsLabel: js.UndefOr[String] = js.native
}

object PivotConfiguratorMessages {
  @scala.inline
  def apply(): PivotConfiguratorMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotConfiguratorMessages]
  }
  @scala.inline
  implicit class PivotConfiguratorMessagesOps[Self <: PivotConfiguratorMessages] (val x: Self) extends AnyVal {
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
    def setColumns(value: String): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setColumnsLabel(value: String): Self = this.set("columnsLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnsLabel: Self = this.set("columnsLabel", js.undefined)
    @scala.inline
    def setFieldMenu(value: PivotConfiguratorMessagesFieldMenu): Self = this.set("fieldMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldMenu: Self = this.set("fieldMenu", js.undefined)
    @scala.inline
    def setFieldsLabel(value: String): Self = this.set("fieldsLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldsLabel: Self = this.set("fieldsLabel", js.undefined)
    @scala.inline
    def setMeasures(value: String): Self = this.set("measures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasures: Self = this.set("measures", js.undefined)
    @scala.inline
    def setMeasuresLabel(value: String): Self = this.set("measuresLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasuresLabel: Self = this.set("measuresLabel", js.undefined)
    @scala.inline
    def setRows(value: String): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setRowsLabel(value: String): Self = this.set("rowsLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowsLabel: Self = this.set("rowsLabel", js.undefined)
  }
  
}

