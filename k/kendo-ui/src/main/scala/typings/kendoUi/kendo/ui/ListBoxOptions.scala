package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBoxOptions extends StObject {
  
  var add: js.UndefOr[js.Function1[/* e */ ListBoxAddEvent, Unit]] = js.undefined
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ ListBoxEvent, Unit]] = js.undefined
  
  var connectWith: js.UndefOr[String] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ ListBoxEvent, Unit]] = js.undefined
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  
  var dataTextField: js.UndefOr[String] = js.undefined
  
  var dataValueField: js.UndefOr[String] = js.undefined
  
  var drag: js.UndefOr[js.Function1[/* e */ ListBoxDragEvent, Unit]] = js.undefined
  
  var dragend: js.UndefOr[js.Function1[/* e */ ListBoxDragendEvent, Unit]] = js.undefined
  
  var draggable: js.UndefOr[Boolean | ListBoxDraggable] = js.undefined
  
  var dragstart: js.UndefOr[js.Function1[/* e */ ListBoxDragstartEvent, Unit]] = js.undefined
  
  var drop: js.UndefOr[js.Function1[/* e */ ListBoxDropEvent, Unit]] = js.undefined
  
  var dropSources: js.UndefOr[js.Any] = js.undefined
  
  var messages: js.UndefOr[ListBoxMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var navigatable: js.UndefOr[Boolean] = js.undefined
  
  var remove: js.UndefOr[js.Function1[/* e */ ListBoxRemoveEvent, Unit]] = js.undefined
  
  var reorder: js.UndefOr[js.Function1[/* e */ ListBoxReorderEvent, Unit]] = js.undefined
  
  var selectable: js.UndefOr[String] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var toolbar: js.UndefOr[ListBoxToolbar] = js.undefined
}
object ListBoxOptions {
  
  inline def apply(): ListBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxOptions]
  }
  
  extension [Self <: ListBoxOptions](x: Self) {
    
    inline def setAdd(value: /* e */ ListBoxAddEvent => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    inline def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    inline def setChange(value: /* e */ ListBoxEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setConnectWith(value: String): Self = StObject.set(x, "connectWith", value.asInstanceOf[js.Any])
    
    inline def setConnectWithUndefined: Self = StObject.set(x, "connectWith", js.undefined)
    
    inline def setDataBound(value: /* e */ ListBoxEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataSource(value: js.Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataTextField(value: String): Self = StObject.set(x, "dataTextField", value.asInstanceOf[js.Any])
    
    inline def setDataTextFieldUndefined: Self = StObject.set(x, "dataTextField", js.undefined)
    
    inline def setDataValueField(value: String): Self = StObject.set(x, "dataValueField", value.asInstanceOf[js.Any])
    
    inline def setDataValueFieldUndefined: Self = StObject.set(x, "dataValueField", js.undefined)
    
    inline def setDrag(value: /* e */ ListBoxDragEvent => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setDragend(value: /* e */ ListBoxDragendEvent => Unit): Self = StObject.set(x, "dragend", js.Any.fromFunction1(value))
    
    inline def setDragendUndefined: Self = StObject.set(x, "dragend", js.undefined)
    
    inline def setDraggable(value: Boolean | ListBoxDraggable): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setDragstart(value: /* e */ ListBoxDragstartEvent => Unit): Self = StObject.set(x, "dragstart", js.Any.fromFunction1(value))
    
    inline def setDragstartUndefined: Self = StObject.set(x, "dragstart", js.undefined)
    
    inline def setDrop(value: /* e */ ListBoxDropEvent => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
    
    inline def setDropSources(value: js.Any): Self = StObject.set(x, "dropSources", value.asInstanceOf[js.Any])
    
    inline def setDropSourcesUndefined: Self = StObject.set(x, "dropSources", js.undefined)
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setMessages(value: ListBoxMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNavigatable(value: Boolean): Self = StObject.set(x, "navigatable", value.asInstanceOf[js.Any])
    
    inline def setNavigatableUndefined: Self = StObject.set(x, "navigatable", js.undefined)
    
    inline def setRemove(value: /* e */ ListBoxRemoveEvent => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setReorder(value: /* e */ ListBoxReorderEvent => Unit): Self = StObject.set(x, "reorder", js.Any.fromFunction1(value))
    
    inline def setReorderUndefined: Self = StObject.set(x, "reorder", js.undefined)
    
    inline def setSelectable(value: String): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setToolbar(value: ListBoxToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
  }
}
