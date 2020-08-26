package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridColumnFilterable extends js.Object {
  var cell: js.UndefOr[GridColumnFilterableCell] = js.native
  var checkAll: js.UndefOr[Boolean] = js.native
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  var extra: js.UndefOr[Boolean] = js.native
  var ignoreCase: js.UndefOr[Boolean] = js.native
  var itemTemplate: js.UndefOr[js.Function] = js.native
  var multi: js.UndefOr[Boolean] = js.native
  var operators: js.UndefOr[js.Any] = js.native
  var search: js.UndefOr[Boolean] = js.native
  var ui: js.UndefOr[String | js.Function] = js.native
}

object GridColumnFilterable {
  @scala.inline
  def apply(): GridColumnFilterable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnFilterable]
  }
  @scala.inline
  implicit class GridColumnFilterableOps[Self <: GridColumnFilterable] (val x: Self) extends AnyVal {
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
    def setCell(value: GridColumnFilterableCell): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    @scala.inline
    def setCheckAll(value: Boolean): Self = this.set("checkAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckAll: Self = this.set("checkAll", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setExtra(value: Boolean): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
    @scala.inline
    def setItemTemplate(value: js.Function): Self = this.set("itemTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
    @scala.inline
    def setOperators(value: js.Any): Self = this.set("operators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperators: Self = this.set("operators", js.undefined)
    @scala.inline
    def setSearch(value: Boolean): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setUi(value: String | js.Function): Self = this.set("ui", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUi: Self = this.set("ui", js.undefined)
  }
  
}

