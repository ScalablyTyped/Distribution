package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListViewOptions extends js.Object {
  var altTemplate: js.UndefOr[js.Function] = js.native
  var autoBind: js.UndefOr[Boolean] = js.native
  var cancel: js.UndefOr[js.Function1[/* e */ ListViewCancelEvent, Unit]] = js.native
  var change: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.native
  var dataBinding: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.native
  var dataBound: js.UndefOr[js.Function1[/* e */ ListViewEvent, Unit]] = js.native
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  var edit: js.UndefOr[js.Function1[/* e */ ListViewEditEvent, Unit]] = js.native
  var editTemplate: js.UndefOr[js.Function] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var name: js.UndefOr[String] = js.native
  var navigatable: js.UndefOr[Boolean] = js.native
  var remove: js.UndefOr[js.Function1[/* e */ ListViewRemoveEvent, Unit]] = js.native
  var save: js.UndefOr[js.Function1[/* e */ ListViewSaveEvent, Unit]] = js.native
  var scrollable: js.UndefOr[Boolean | String] = js.native
  var selectable: js.UndefOr[Boolean | String] = js.native
  var template: js.UndefOr[js.Function] = js.native
}

object ListViewOptions {
  @scala.inline
  def apply(): ListViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewOptions]
  }
  @scala.inline
  implicit class ListViewOptionsOps[Self <: ListViewOptions] (val x: Self) extends AnyVal {
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
    def setAltTemplate(value: js.Function): Self = this.set("altTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltTemplate: Self = this.set("altTemplate", js.undefined)
    @scala.inline
    def setAutoBind(value: Boolean): Self = this.set("autoBind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoBind: Self = this.set("autoBind", js.undefined)
    @scala.inline
    def setCancel(value: /* e */ ListViewCancelEvent => Unit): Self = this.set("cancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setChange(value: /* e */ ListViewEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setDataBinding(value: /* e */ ListViewEvent => Unit): Self = this.set("dataBinding", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataBinding: Self = this.set("dataBinding", js.undefined)
    @scala.inline
    def setDataBound(value: /* e */ ListViewEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setEdit(value: /* e */ ListViewEditEvent => Unit): Self = this.set("edit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    @scala.inline
    def setEditTemplate(value: js.Function): Self = this.set("editTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditTemplate: Self = this.set("editTemplate", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNavigatable(value: Boolean): Self = this.set("navigatable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigatable: Self = this.set("navigatable", js.undefined)
    @scala.inline
    def setRemove(value: /* e */ ListViewRemoveEvent => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setSave(value: /* e */ ListViewSaveEvent => Unit): Self = this.set("save", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    @scala.inline
    def setScrollable(value: Boolean | String): Self = this.set("scrollable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollable: Self = this.set("scrollable", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean | String): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setTemplate(value: js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

