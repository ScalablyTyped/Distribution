package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBoxOptions extends js.Object {
  
  var add: js.UndefOr[js.Function1[/* e */ ListBoxAddEvent, Unit]] = js.native
  
  var autoBind: js.UndefOr[Boolean] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ ListBoxEvent, Unit]] = js.native
  
  var connectWith: js.UndefOr[String] = js.native
  
  var dataBound: js.UndefOr[js.Function1[/* e */ ListBoxEvent, Unit]] = js.native
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  
  var dataTextField: js.UndefOr[String] = js.native
  
  var dataValueField: js.UndefOr[String] = js.native
  
  var drag: js.UndefOr[js.Function1[/* e */ ListBoxDragEvent, Unit]] = js.native
  
  var dragend: js.UndefOr[js.Function1[/* e */ ListBoxDragendEvent, Unit]] = js.native
  
  var draggable: js.UndefOr[Boolean | ListBoxDraggable] = js.native
  
  var dragstart: js.UndefOr[js.Function1[/* e */ ListBoxDragstartEvent, Unit]] = js.native
  
  var drop: js.UndefOr[js.Function1[/* e */ ListBoxDropEvent, Unit]] = js.native
  
  var dropSources: js.UndefOr[js.Any] = js.native
  
  var messages: js.UndefOr[ListBoxMessages] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var navigatable: js.UndefOr[Boolean] = js.native
  
  var remove: js.UndefOr[js.Function1[/* e */ ListBoxRemoveEvent, Unit]] = js.native
  
  var reorder: js.UndefOr[js.Function1[/* e */ ListBoxReorderEvent, Unit]] = js.native
  
  var selectable: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var toolbar: js.UndefOr[ListBoxToolbar] = js.native
}
object ListBoxOptions {
  
  @scala.inline
  def apply(): ListBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxOptions]
  }
  
  @scala.inline
  implicit class ListBoxOptionsOps[Self <: ListBoxOptions] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: /* e */ ListBoxAddEvent => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = this.set("autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBind: Self = this.set("autoBind", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ ListBoxEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setConnectWith(value: String): Self = this.set("connectWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectWith: Self = this.set("connectWith", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ ListBoxEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDataTextField(value: String): Self = this.set("dataTextField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTextField: Self = this.set("dataTextField", js.undefined)
    
    @scala.inline
    def setDataValueField(value: String): Self = this.set("dataValueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataValueField: Self = this.set("dataValueField", js.undefined)
    
    @scala.inline
    def setDrag(value: /* e */ ListBoxDragEvent => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setDragend(value: /* e */ ListBoxDragendEvent => Unit): Self = this.set("dragend", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragend: Self = this.set("dragend", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean | ListBoxDraggable): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setDragstart(value: /* e */ ListBoxDragstartEvent => Unit): Self = this.set("dragstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragstart: Self = this.set("dragstart", js.undefined)
    
    @scala.inline
    def setDrop(value: /* e */ ListBoxDropEvent => Unit): Self = this.set("drop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    
    @scala.inline
    def setDropSources(value: js.Any): Self = this.set("dropSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropSources: Self = this.set("dropSources", js.undefined)
    
    @scala.inline
    def setMessages(value: ListBoxMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNavigatable(value: Boolean): Self = this.set("navigatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigatable: Self = this.set("navigatable", js.undefined)
    
    @scala.inline
    def setRemove(value: /* e */ ListBoxRemoveEvent => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setReorder(value: /* e */ ListBoxReorderEvent => Unit): Self = this.set("reorder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReorder: Self = this.set("reorder", js.undefined)
    
    @scala.inline
    def setSelectable(value: String): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setToolbar(value: ListBoxToolbar): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
  }
}
