package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskBoardOptions extends StObject {
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var cardMenu: js.UndefOr[js.Array[TaskBoardCardMenuItem]] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ TaskBoardChangeEvent, Unit]] = js.undefined
  
  var columnSettings: js.UndefOr[TaskBoardColumnSettings] = js.undefined
  
  var columns: js.UndefOr[Any | DataSource] = js.undefined
  
  var columnsDataBinding: js.UndefOr[js.Function1[/* e */ TaskBoardColumnsDataBindingEvent, Unit]] = js.undefined
  
  var columnsDataBound: js.UndefOr[js.Function1[/* e */ TaskBoardColumnsDataBoundEvent, Unit]] = js.undefined
  
  var dataBinding: js.UndefOr[js.Function1[/* e */ TaskBoardDataBindingEvent, Unit]] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ TaskBoardDataBoundEvent, Unit]] = js.undefined
  
  var dataCategoryField: js.UndefOr[String] = js.undefined
  
  var dataDescriptionField: js.UndefOr[String] = js.undefined
  
  var dataOrderField: js.UndefOr[String] = js.undefined
  
  var dataSource: js.UndefOr[Any | DataSource] = js.undefined
  
  var dataStatusField: js.UndefOr[String] = js.undefined
  
  var dataTitleField: js.UndefOr[String] = js.undefined
  
  var deleteCard: js.UndefOr[js.Function1[/* e */ TaskBoardDeleteCardEvent, Unit]] = js.undefined
  
  var deleteColumn: js.UndefOr[js.Function1[/* e */ TaskBoardDeleteColumnEvent, Unit]] = js.undefined
  
  var editCard: js.UndefOr[js.Function1[/* e */ TaskBoardEditCardEvent, Unit]] = js.undefined
  
  var editColumn: js.UndefOr[js.Function1[/* e */ TaskBoardEditColumnEvent, Unit]] = js.undefined
  
  var editable: js.UndefOr[Boolean | TaskBoardEditable] = js.undefined
  
  var executeCommand: js.UndefOr[js.Function1[/* e */ TaskBoardExecuteCommandEvent, Unit]] = js.undefined
  
  var height: js.UndefOr[String | Double] = js.undefined
  
  var messages: js.UndefOr[TaskBoardMessages] = js.undefined
  
  var move: js.UndefOr[js.Function1[/* e */ TaskBoardMoveEvent, Unit]] = js.undefined
  
  var moveEnd: js.UndefOr[js.Function1[/* e */ TaskBoardMoveEndEvent, Unit]] = js.undefined
  
  var moveStart: js.UndefOr[js.Function1[/* e */ TaskBoardMoveStartEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var previewPane: js.UndefOr[Boolean | TaskBoardPreviewPane] = js.undefined
  
  var reorderable: js.UndefOr[Boolean] = js.undefined
  
  var resources: js.UndefOr[js.Array[TaskBoardResource]] = js.undefined
  
  var saveCard: js.UndefOr[js.Function1[/* e */ TaskBoardSaveCardEvent, Unit]] = js.undefined
  
  var saveColumn: js.UndefOr[js.Function1[/* e */ TaskBoardSaveColumnEvent, Unit]] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ TaskBoardSelectEvent, Unit]] = js.undefined
  
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var toolbar: js.UndefOr[Boolean | TaskBoardToolbar] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object TaskBoardOptions {
  
  inline def apply(): TaskBoardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskBoardOptions]
  }
  
  extension [Self <: TaskBoardOptions](x: Self) {
    
    inline def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    inline def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    inline def setCardMenu(value: js.Array[TaskBoardCardMenuItem]): Self = StObject.set(x, "cardMenu", value.asInstanceOf[js.Any])
    
    inline def setCardMenuUndefined: Self = StObject.set(x, "cardMenu", js.undefined)
    
    inline def setCardMenuVarargs(value: TaskBoardCardMenuItem*): Self = StObject.set(x, "cardMenu", js.Array(value*))
    
    inline def setChange(value: /* e */ TaskBoardChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setColumnSettings(value: TaskBoardColumnSettings): Self = StObject.set(x, "columnSettings", value.asInstanceOf[js.Any])
    
    inline def setColumnSettingsUndefined: Self = StObject.set(x, "columnSettings", js.undefined)
    
    inline def setColumns(value: Any | DataSource): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsDataBinding(value: /* e */ TaskBoardColumnsDataBindingEvent => Unit): Self = StObject.set(x, "columnsDataBinding", js.Any.fromFunction1(value))
    
    inline def setColumnsDataBindingUndefined: Self = StObject.set(x, "columnsDataBinding", js.undefined)
    
    inline def setColumnsDataBound(value: /* e */ TaskBoardColumnsDataBoundEvent => Unit): Self = StObject.set(x, "columnsDataBound", js.Any.fromFunction1(value))
    
    inline def setColumnsDataBoundUndefined: Self = StObject.set(x, "columnsDataBound", js.undefined)
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setDataBinding(value: /* e */ TaskBoardDataBindingEvent => Unit): Self = StObject.set(x, "dataBinding", js.Any.fromFunction1(value))
    
    inline def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    inline def setDataBound(value: /* e */ TaskBoardDataBoundEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataCategoryField(value: String): Self = StObject.set(x, "dataCategoryField", value.asInstanceOf[js.Any])
    
    inline def setDataCategoryFieldUndefined: Self = StObject.set(x, "dataCategoryField", js.undefined)
    
    inline def setDataDescriptionField(value: String): Self = StObject.set(x, "dataDescriptionField", value.asInstanceOf[js.Any])
    
    inline def setDataDescriptionFieldUndefined: Self = StObject.set(x, "dataDescriptionField", js.undefined)
    
    inline def setDataOrderField(value: String): Self = StObject.set(x, "dataOrderField", value.asInstanceOf[js.Any])
    
    inline def setDataOrderFieldUndefined: Self = StObject.set(x, "dataOrderField", js.undefined)
    
    inline def setDataSource(value: Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataStatusField(value: String): Self = StObject.set(x, "dataStatusField", value.asInstanceOf[js.Any])
    
    inline def setDataStatusFieldUndefined: Self = StObject.set(x, "dataStatusField", js.undefined)
    
    inline def setDataTitleField(value: String): Self = StObject.set(x, "dataTitleField", value.asInstanceOf[js.Any])
    
    inline def setDataTitleFieldUndefined: Self = StObject.set(x, "dataTitleField", js.undefined)
    
    inline def setDeleteCard(value: /* e */ TaskBoardDeleteCardEvent => Unit): Self = StObject.set(x, "deleteCard", js.Any.fromFunction1(value))
    
    inline def setDeleteCardUndefined: Self = StObject.set(x, "deleteCard", js.undefined)
    
    inline def setDeleteColumn(value: /* e */ TaskBoardDeleteColumnEvent => Unit): Self = StObject.set(x, "deleteColumn", js.Any.fromFunction1(value))
    
    inline def setDeleteColumnUndefined: Self = StObject.set(x, "deleteColumn", js.undefined)
    
    inline def setEditCard(value: /* e */ TaskBoardEditCardEvent => Unit): Self = StObject.set(x, "editCard", js.Any.fromFunction1(value))
    
    inline def setEditCardUndefined: Self = StObject.set(x, "editCard", js.undefined)
    
    inline def setEditColumn(value: /* e */ TaskBoardEditColumnEvent => Unit): Self = StObject.set(x, "editColumn", js.Any.fromFunction1(value))
    
    inline def setEditColumnUndefined: Self = StObject.set(x, "editColumn", js.undefined)
    
    inline def setEditable(value: Boolean | TaskBoardEditable): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setExecuteCommand(value: /* e */ TaskBoardExecuteCommandEvent => Unit): Self = StObject.set(x, "executeCommand", js.Any.fromFunction1(value))
    
    inline def setExecuteCommandUndefined: Self = StObject.set(x, "executeCommand", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMessages(value: TaskBoardMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMove(value: /* e */ TaskBoardMoveEvent => Unit): Self = StObject.set(x, "move", js.Any.fromFunction1(value))
    
    inline def setMoveEnd(value: /* e */ TaskBoardMoveEndEvent => Unit): Self = StObject.set(x, "moveEnd", js.Any.fromFunction1(value))
    
    inline def setMoveEndUndefined: Self = StObject.set(x, "moveEnd", js.undefined)
    
    inline def setMoveStart(value: /* e */ TaskBoardMoveStartEvent => Unit): Self = StObject.set(x, "moveStart", js.Any.fromFunction1(value))
    
    inline def setMoveStartUndefined: Self = StObject.set(x, "moveStart", js.undefined)
    
    inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPreviewPane(value: Boolean | TaskBoardPreviewPane): Self = StObject.set(x, "previewPane", value.asInstanceOf[js.Any])
    
    inline def setPreviewPaneUndefined: Self = StObject.set(x, "previewPane", js.undefined)
    
    inline def setReorderable(value: Boolean): Self = StObject.set(x, "reorderable", value.asInstanceOf[js.Any])
    
    inline def setReorderableUndefined: Self = StObject.set(x, "reorderable", js.undefined)
    
    inline def setResources(value: js.Array[TaskBoardResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: TaskBoardResource*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setSaveCard(value: /* e */ TaskBoardSaveCardEvent => Unit): Self = StObject.set(x, "saveCard", js.Any.fromFunction1(value))
    
    inline def setSaveCardUndefined: Self = StObject.set(x, "saveCard", js.undefined)
    
    inline def setSaveColumn(value: /* e */ TaskBoardSaveColumnEvent => Unit): Self = StObject.set(x, "saveColumn", js.Any.fromFunction1(value))
    
    inline def setSaveColumnUndefined: Self = StObject.set(x, "saveColumn", js.undefined)
    
    inline def setSelect(value: /* e */ TaskBoardSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setToolbar(value: Boolean | TaskBoardToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
