package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.PivotDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotConfiguratorOptions extends js.Object {
  var dataSource: js.UndefOr[js.Any | PivotDataSource] = js.native
  var filterable: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var messages: js.UndefOr[PivotConfiguratorMessages] = js.native
  var name: js.UndefOr[String] = js.native
  var sortable: js.UndefOr[Boolean | PivotConfiguratorSortable] = js.native
}

object PivotConfiguratorOptions {
  @scala.inline
  def apply(): PivotConfiguratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotConfiguratorOptions]
  }
  @scala.inline
  implicit class PivotConfiguratorOptionsOps[Self <: PivotConfiguratorOptions] (val x: Self) extends AnyVal {
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
    def setDataSource(value: js.Any | PivotDataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setFilterable(value: Boolean): Self = this.set("filterable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterable: Self = this.set("filterable", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMessages(value: PivotConfiguratorMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSortable(value: Boolean | PivotConfiguratorSortable): Self = this.set("sortable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
  }
  
}

