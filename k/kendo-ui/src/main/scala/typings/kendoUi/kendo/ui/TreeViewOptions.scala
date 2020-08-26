package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.HierarchicalDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeViewOptions extends js.Object {
  var animation: js.UndefOr[Boolean | TreeViewAnimation] = js.native
  var autoBind: js.UndefOr[Boolean] = js.native
  var autoScroll: js.UndefOr[Boolean] = js.native
  var change: js.UndefOr[js.Function1[/* e */ TreeViewEvent, Unit]] = js.native
  var check: js.UndefOr[js.Function1[/* e */ TreeViewCheckEvent, Unit]] = js.native
  var checkboxes: js.UndefOr[Boolean | TreeViewCheckboxes] = js.native
  var collapse: js.UndefOr[js.Function1[/* e */ TreeViewCollapseEvent, Unit]] = js.native
  var dataBound: js.UndefOr[js.Function1[/* e */ TreeViewDataBoundEvent, Unit]] = js.native
  var dataImageUrlField: js.UndefOr[String] = js.native
  var dataSource: js.UndefOr[js.Any | HierarchicalDataSource] = js.native
  var dataSpriteCssClassField: js.UndefOr[String] = js.native
  var dataTextField: js.UndefOr[String | js.Any] = js.native
  var dataUrlField: js.UndefOr[String] = js.native
  var drag: js.UndefOr[js.Function1[/* e */ TreeViewDragEvent, Unit]] = js.native
  var dragAndDrop: js.UndefOr[Boolean] = js.native
  var dragend: js.UndefOr[js.Function1[/* e */ TreeViewDragendEvent, Unit]] = js.native
  var dragstart: js.UndefOr[js.Function1[/* e */ TreeViewDragstartEvent, Unit]] = js.native
  var drop: js.UndefOr[js.Function1[/* e */ TreeViewDropEvent, Unit]] = js.native
  var expand: js.UndefOr[js.Function1[/* e */ TreeViewExpandEvent, Unit]] = js.native
  var loadOnDemand: js.UndefOr[Boolean] = js.native
  var messages: js.UndefOr[TreeViewMessages] = js.native
  var name: js.UndefOr[String] = js.native
  var navigate: js.UndefOr[js.Function1[/* e */ TreeViewNavigateEvent, Unit]] = js.native
  var select: js.UndefOr[js.Function1[/* e */ TreeViewSelectEvent, Unit]] = js.native
  var template: js.UndefOr[String | js.Function] = js.native
}

object TreeViewOptions {
  @scala.inline
  def apply(): TreeViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeViewOptions]
  }
  @scala.inline
  implicit class TreeViewOptionsOps[Self <: TreeViewOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: Boolean | TreeViewAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAutoBind(value: Boolean): Self = this.set("autoBind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoBind: Self = this.set("autoBind", js.undefined)
    @scala.inline
    def setAutoScroll(value: Boolean): Self = this.set("autoScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScroll: Self = this.set("autoScroll", js.undefined)
    @scala.inline
    def setChange(value: /* e */ TreeViewEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setCheck(value: /* e */ TreeViewCheckEvent => Unit): Self = this.set("check", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    @scala.inline
    def setCheckboxes(value: Boolean | TreeViewCheckboxes): Self = this.set("checkboxes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckboxes: Self = this.set("checkboxes", js.undefined)
    @scala.inline
    def setCollapse(value: /* e */ TreeViewCollapseEvent => Unit): Self = this.set("collapse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    @scala.inline
    def setDataBound(value: /* e */ TreeViewDataBoundEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    @scala.inline
    def setDataImageUrlField(value: String): Self = this.set("dataImageUrlField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataImageUrlField: Self = this.set("dataImageUrlField", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any | HierarchicalDataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDataSpriteCssClassField(value: String): Self = this.set("dataSpriteCssClassField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSpriteCssClassField: Self = this.set("dataSpriteCssClassField", js.undefined)
    @scala.inline
    def setDataTextField(value: String | js.Any): Self = this.set("dataTextField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTextField: Self = this.set("dataTextField", js.undefined)
    @scala.inline
    def setDataUrlField(value: String): Self = this.set("dataUrlField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataUrlField: Self = this.set("dataUrlField", js.undefined)
    @scala.inline
    def setDrag(value: /* e */ TreeViewDragEvent => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    @scala.inline
    def setDragAndDrop(value: Boolean): Self = this.set("dragAndDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragAndDrop: Self = this.set("dragAndDrop", js.undefined)
    @scala.inline
    def setDragend(value: /* e */ TreeViewDragendEvent => Unit): Self = this.set("dragend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragend: Self = this.set("dragend", js.undefined)
    @scala.inline
    def setDragstart(value: /* e */ TreeViewDragstartEvent => Unit): Self = this.set("dragstart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragstart: Self = this.set("dragstart", js.undefined)
    @scala.inline
    def setDrop(value: /* e */ TreeViewDropEvent => Unit): Self = this.set("drop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    @scala.inline
    def setExpand(value: /* e */ TreeViewExpandEvent => Unit): Self = this.set("expand", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    @scala.inline
    def setLoadOnDemand(value: Boolean): Self = this.set("loadOnDemand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadOnDemand: Self = this.set("loadOnDemand", js.undefined)
    @scala.inline
    def setMessages(value: TreeViewMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNavigate(value: /* e */ TreeViewNavigateEvent => Unit): Self = this.set("navigate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNavigate: Self = this.set("navigate", js.undefined)
    @scala.inline
    def setSelect(value: /* e */ TreeViewSelectEvent => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setTemplate(value: String | js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

