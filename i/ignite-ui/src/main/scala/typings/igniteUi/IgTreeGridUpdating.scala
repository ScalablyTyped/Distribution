package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTreeGridUpdating
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * This option has been deprecated as of the 2017.2 Volume release.
    * Specifies the label of the add child button in touch environment. Use option [locale.addChildButtonLabel](ui.igtreegridupdating#options:locale.addChildButtonLabel).
    */
  var addChildButtonLabel: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been deprecated as of the 2017.2 Volume release.
    * Specifies the add child tooltip text. Use option [locale.enableAddChild](ui.igtreegridupdating#options:locale.enableAddChild).
    */
  var addChildTooltip: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the label for the button starting edit mode for row adding. If not set, $.ig.GridUpdating.locale.addRowLabel is used.
    * Use option [locale.addRowLabel](ui.iggridupdating#options:locale.addRowLabel).
    */
  var addRowLabel: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the title for the button starting edit mode for row adding. If not set, $.ig.GridUpdating.locale.addRowTooltip is used.
    * Use option [locale.addRowTooltip](ui.iggridupdating#options:locale.addRowTooltip).
    */
  var addRowTooltip: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the label for the Cancel editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.cancelLabel is used.
    * Use option [locale.cancelLabel](ui.iggridupdating#options:locale.cancelLabel).
    */
  var cancelLabel: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the title for the Cancel editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.cancelTooltip is used.
    * Use option [locale.cancelTooltip](ui.iggridupdating#options:locale.cancelTooltip).
    */
  var cancelTooltip: js.UndefOr[String] = js.undefined
  
  /**
    * A list of custom column options that specify editing and validation settings for a specific column.
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridUpdatingColumnSetting]] = js.undefined
  
  /**
    * Event fired before the dataDirtyException is thrown. This can be controlled by the [enableDataDirtyException](ui.iggridupdating#options:enableDataDirtyException) property. Any pending changes may be committed in the handler of this event in order to prevent dataDirtyException from being thrown.
    * Return false in order to prevent the exception.
    */
  var dataDirty: js.UndefOr[DataDirtyEvent] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the label for the delete button. If not set, $.ig.GridUpdating.locale.deleteRowLabel is used.
    * Use option [locale.deleteRowLabel](ui.iggridupdating#options:locale.deleteRowLabel).
    */
  var deleteRowLabel: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the title for the delete button. If not set, $.ig.GridUpdating.locale.deleteRowTooltip is used.
    * Use option [locale.deleteRowTooltip](ui.iggridupdating#options:locale.deleteRowTooltip).
    */
  var deleteRowTooltip: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog. For more information on how to utilize this property, please refer to the [Extending igGrid Modal Dialog](http://www.igniteui.com/help/extending-iggrid-modal-dialog) topic.
    *
    */
  var dialogWidget: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the label for the Done editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.doneLabel is used.
    * Use option [locale.doneLabel](ui.iggridupdating#options:locale.doneLabel).
    */
  var doneLabel: js.UndefOr[String] = js.undefined
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the title for the Done editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.doneTooltip is used.
    * Use option [locale.doneTooltip](ui.iggridupdating#options:locale.doneTooltip).
    */
  var doneTooltip: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired after cell editing ends (including when row editing closes editing for a cell).
    */
  var editCellEnded: js.UndefOr[EditCellEndedEvent] = js.undefined
  
  /**
    * Event fired before cell editing ends (including when row editing closes editing for a cell).
    * Return false in order to prevent the grid from exiting edit mode (only functions if [editMode](ui.iggridupdating#options:editMode) is 'cell').
    */
  var editCellEnding: js.UndefOr[EditCellEndingEvent] = js.undefined
  
  /**
    * Event fired after cell editing begins (including when row editing opens editing for a cell).
    */
  var editCellStarted: js.UndefOr[EditCellStartedEvent] = js.undefined
  
  /**
    * Event fired before cell editing begins (including when row editing opens editing for a cell).
    * Return false in order to cancel editing.
    */
  var editCellStarting: js.UndefOr[EditCellStartingEvent] = js.undefined
  
  /**
    * Specifies the edit mode.
    *
    *
    * Valid values:
    * "row" Editors are shown for all columns that are not read-only. The editor of the clicked cell receives initial focus. Done and Cancel buttons may be displayed based on the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) property.
    * "cell" An editor is shown for the cell entering edit mode. The Done and Cancel buttons are not supported for this mode.
    * "dialog" A popup dialog is used with seperate settings available through the [rowEditDialogOptions](ui.iggridupdating#options:rowEditDialogOptions) property.
    * "none" Editing through the UI is disabled.
    */
  var editMode: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired after row editing ends.
    */
  var editRowEnded: js.UndefOr[EditRowEndedEvent] = js.undefined
  
  /**
    * Event fired before row editing ends.
    * Return false in order to prevent the grid from exiting edit mode.
    */
  var editRowEnding: js.UndefOr[EditRowEndingEvent] = js.undefined
  
  /**
    * Event fired after row editing begins.
    */
  var editRowStarted: js.UndefOr[EditRowStartedEvent] = js.undefined
  
  /**
    * Event fired before row editing begins.
    * Return false in order to cancel editing.
    */
  var editRowStarting: js.UndefOr[EditRowStartingEvent] = js.undefined
  
  /**
    * Specifies whether to enable or disable adding children to rows.
    *
    */
  var enableAddChild: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if adding rows through the UI is enabled. When enabled an additional row is rendered at the bottom of the grid's header that works as a button. When the end-user clicks on it edit mode is initiated either through a dialog (when [editMode](ui.iggridupdating#options:editMode) is 'dialog') or mimicking the look and feel of 'row' [editMode](ui.iggridupdating#options:editMode) (when [editMode](ui.iggridupdating#options:editMode) is 'row' or 'cell').
    *
    */
  var enableAddRow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if an exception should be thrown when the grid's data view changes while there are pending transactions in the data source. The data view changes when the data source performs a sorting, filtering, groupby or paging operation and the exception thrown will prevent the operation from succeeding. All pending transactions must be committed before a data view operation is able to complete. Committing transactions can be done manually through the grid's [commit](ui.iggrid#methods:commit) function or automatically by setting [autoCommit](ui.iggrid#options:autoCommit) to 'true'.
    *
    */
  var enableDataDirtyException: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if deleting rows through the UI is enabled.
    *
    */
  var enableDeleteRow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables excel navigation style. When turned on, the arrow keys can be used for changing the currently edited cell similar to how Tab and Enter behave. When disabled, the arrow keys control the cursor inside editors.
    *
    */
  var excelNavigationMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Event fired before editing starts for adding a new row, when Updating generates an automatic primary key for it.
    */
  var generatePrimaryKeyValue: js.UndefOr[GeneratePrimaryKeyValueEvent] = js.undefined
  
  /**
    * Determines if pressing Enter to navigate away from the currently edited cell should move the focus horizontally or vertically (default).
    *
    */
  var horizontalMoveOnEnter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[IgTreeGridUpdatingLocale] = js.undefined
  
  /**
    * Event fired after adding a new row.
    */
  var rowAdded: js.UndefOr[RowAddedEvent] = js.undefined
  
  /**
    * Event fired before adding a new row.
    * Return false in order to cancel the adding of the new row to the data source.
    */
  var rowAdding: js.UndefOr[RowAddingEvent] = js.undefined
  
  /**
    * Event fired after a row is deleted.
    */
  var rowDeleted: js.UndefOr[RowDeletedEvent] = js.undefined
  
  /**
    * Event fired before deleting a row.
    * Return false in order to cancel the row's deletion.
    */
  var rowDeleting: js.UndefOr[RowDeletingEvent] = js.undefined
  
  /**
    * Event fired after the row edit dialog is closed.
    */
  var rowEditDialogAfterClose: js.UndefOr[RowEditDialogAfterCloseEvent] = js.undefined
  
  /**
    * Event fired after the row edit dialog is opened.
    */
  var rowEditDialogAfterOpen: js.UndefOr[RowEditDialogAfterOpenEvent] = js.undefined
  
  /**
    * Event fired before the row edit dialog is closed.
    */
  var rowEditDialogBeforeClose: js.UndefOr[RowEditDialogBeforeCloseEvent] = js.undefined
  
  /**
    * Event fired before the row edit dialog is opened.
    */
  var rowEditDialogBeforeOpen: js.UndefOr[RowEditDialogBeforeOpenEvent] = js.undefined
  
  /**
    * Event fired after the row edit dialog is rendered.
    */
  var rowEditDialogContentsRendered: js.UndefOr[RowEditDialogContentsRenderedEvent] = js.undefined
  
  /**
    * A list of options controlling the rendering behavior of the row edit dialog. If [editMode](ui.iggridupdating#options:editMode) is not 'dialog' these have no effect.
    *
    */
  var rowEditDialogOptions: js.UndefOr[IgGridUpdatingRowEditDialogOptions] = js.undefined
  
  /**
    * Sets a custom function to be called when the AJAX request to the URL specified by the [updateUrl](ui.iggrid#options:updateUrl) property fails. The function will be called with arguments representing the data returned by the server.
    *
    */
  var saveChangesErrorHandler: js.UndefOr[js.Function | String] = js.undefined
  
  /**
    * Sets a custom function to be called when the AJAX request to the URL specified by the [updateUrl](ui.iggrid#options:updateUrl) property succeeds. The function will be called with arguments representing the data returned by the server.
    *
    */
  var saveChangesSuccessHandler: js.UndefOr[js.Function | String] = js.undefined
  
  /**
    * Determines if the Done and Cancel buttons will be available as means to end edit mode for [editMode](ui.iggridupdating#options:editMode) 'row' and when adding a new row.
    *
    */
  var showDoneCancelButtons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how end-users are able to start edit mode. Possible values: "click", "dblclick", "F2", "enter" and their combinations separated by coma or in array. The keyboard triggers have effect only if the grid cells can receive focus (the grid's [tabIndex](ui.iggrid#options:tabIndex) property should not have a negative value) or Selection is enabled. If "dblclick" is included, then "click" has no effect.
    *
    */
  var startEditTriggers: js.UndefOr[String | js.Array[js.Any]] = js.undefined
  
  /**
    * On touch-enabled devices specifies the swipe distance for the delete button to appear.
    *
    */
  var swipeDistance: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Specifies if the value of each editable column in the grid should be validated. The validation is done based on the rules of their corresponding editors.
    *
    */
  var validation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls if navigation will wrap around the grid. The feature will never wrap around virtual grids.
    *
    */
  var wrapAround: js.UndefOr[Boolean] = js.undefined
}
object IgTreeGridUpdating {
  
  inline def apply(): IgTreeGridUpdating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridUpdating]
  }
  
  extension [Self <: IgTreeGridUpdating](x: Self) {
    
    inline def setAddChildButtonLabel(value: String): Self = StObject.set(x, "addChildButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setAddChildButtonLabelUndefined: Self = StObject.set(x, "addChildButtonLabel", js.undefined)
    
    inline def setAddChildTooltip(value: String): Self = StObject.set(x, "addChildTooltip", value.asInstanceOf[js.Any])
    
    inline def setAddChildTooltipUndefined: Self = StObject.set(x, "addChildTooltip", js.undefined)
    
    inline def setAddRowLabel(value: String): Self = StObject.set(x, "addRowLabel", value.asInstanceOf[js.Any])
    
    inline def setAddRowLabelUndefined: Self = StObject.set(x, "addRowLabel", js.undefined)
    
    inline def setAddRowTooltip(value: String): Self = StObject.set(x, "addRowTooltip", value.asInstanceOf[js.Any])
    
    inline def setAddRowTooltipUndefined: Self = StObject.set(x, "addRowTooltip", js.undefined)
    
    inline def setCancelLabel(value: String): Self = StObject.set(x, "cancelLabel", value.asInstanceOf[js.Any])
    
    inline def setCancelLabelUndefined: Self = StObject.set(x, "cancelLabel", js.undefined)
    
    inline def setCancelTooltip(value: String): Self = StObject.set(x, "cancelTooltip", value.asInstanceOf[js.Any])
    
    inline def setCancelTooltipUndefined: Self = StObject.set(x, "cancelTooltip", js.undefined)
    
    inline def setColumnSettings(value: js.Array[IgGridUpdatingColumnSetting]): Self = StObject.set(x, "columnSettings", value.asInstanceOf[js.Any])
    
    inline def setColumnSettingsUndefined: Self = StObject.set(x, "columnSettings", js.undefined)
    
    inline def setColumnSettingsVarargs(value: IgGridUpdatingColumnSetting*): Self = StObject.set(x, "columnSettings", js.Array(value :_*))
    
    inline def setDataDirty(value: (/* event */ Event, /* ui */ DataDirtyEventUIParam) => Unit): Self = StObject.set(x, "dataDirty", js.Any.fromFunction2(value))
    
    inline def setDataDirtyUndefined: Self = StObject.set(x, "dataDirty", js.undefined)
    
    inline def setDeleteRowLabel(value: String): Self = StObject.set(x, "deleteRowLabel", value.asInstanceOf[js.Any])
    
    inline def setDeleteRowLabelUndefined: Self = StObject.set(x, "deleteRowLabel", js.undefined)
    
    inline def setDeleteRowTooltip(value: String): Self = StObject.set(x, "deleteRowTooltip", value.asInstanceOf[js.Any])
    
    inline def setDeleteRowTooltipUndefined: Self = StObject.set(x, "deleteRowTooltip", js.undefined)
    
    inline def setDialogWidget(value: String): Self = StObject.set(x, "dialogWidget", value.asInstanceOf[js.Any])
    
    inline def setDialogWidgetUndefined: Self = StObject.set(x, "dialogWidget", js.undefined)
    
    inline def setDoneLabel(value: String): Self = StObject.set(x, "doneLabel", value.asInstanceOf[js.Any])
    
    inline def setDoneLabelUndefined: Self = StObject.set(x, "doneLabel", js.undefined)
    
    inline def setDoneTooltip(value: String): Self = StObject.set(x, "doneTooltip", value.asInstanceOf[js.Any])
    
    inline def setDoneTooltipUndefined: Self = StObject.set(x, "doneTooltip", js.undefined)
    
    inline def setEditCellEnded(value: (/* event */ Event, /* ui */ EditCellEndedEventUIParam) => Unit): Self = StObject.set(x, "editCellEnded", js.Any.fromFunction2(value))
    
    inline def setEditCellEndedUndefined: Self = StObject.set(x, "editCellEnded", js.undefined)
    
    inline def setEditCellEnding(value: (/* event */ Event, /* ui */ EditCellEndingEventUIParam) => Unit): Self = StObject.set(x, "editCellEnding", js.Any.fromFunction2(value))
    
    inline def setEditCellEndingUndefined: Self = StObject.set(x, "editCellEnding", js.undefined)
    
    inline def setEditCellStarted(value: (/* event */ Event, /* ui */ EditCellStartedEventUIParam) => Unit): Self = StObject.set(x, "editCellStarted", js.Any.fromFunction2(value))
    
    inline def setEditCellStartedUndefined: Self = StObject.set(x, "editCellStarted", js.undefined)
    
    inline def setEditCellStarting(value: (/* event */ Event, /* ui */ EditCellStartingEventUIParam) => Unit): Self = StObject.set(x, "editCellStarting", js.Any.fromFunction2(value))
    
    inline def setEditCellStartingUndefined: Self = StObject.set(x, "editCellStarting", js.undefined)
    
    inline def setEditMode(value: String): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
    
    inline def setEditModeUndefined: Self = StObject.set(x, "editMode", js.undefined)
    
    inline def setEditRowEnded(value: (/* event */ Event, /* ui */ EditRowEndedEventUIParam) => Unit): Self = StObject.set(x, "editRowEnded", js.Any.fromFunction2(value))
    
    inline def setEditRowEndedUndefined: Self = StObject.set(x, "editRowEnded", js.undefined)
    
    inline def setEditRowEnding(value: (/* event */ Event, /* ui */ EditRowEndingEventUIParam) => Unit): Self = StObject.set(x, "editRowEnding", js.Any.fromFunction2(value))
    
    inline def setEditRowEndingUndefined: Self = StObject.set(x, "editRowEnding", js.undefined)
    
    inline def setEditRowStarted(value: (/* event */ Event, /* ui */ EditRowStartedEventUIParam) => Unit): Self = StObject.set(x, "editRowStarted", js.Any.fromFunction2(value))
    
    inline def setEditRowStartedUndefined: Self = StObject.set(x, "editRowStarted", js.undefined)
    
    inline def setEditRowStarting(value: (/* event */ Event, /* ui */ EditRowStartingEventUIParam) => Unit): Self = StObject.set(x, "editRowStarting", js.Any.fromFunction2(value))
    
    inline def setEditRowStartingUndefined: Self = StObject.set(x, "editRowStarting", js.undefined)
    
    inline def setEnableAddChild(value: Boolean): Self = StObject.set(x, "enableAddChild", value.asInstanceOf[js.Any])
    
    inline def setEnableAddChildUndefined: Self = StObject.set(x, "enableAddChild", js.undefined)
    
    inline def setEnableAddRow(value: Boolean): Self = StObject.set(x, "enableAddRow", value.asInstanceOf[js.Any])
    
    inline def setEnableAddRowUndefined: Self = StObject.set(x, "enableAddRow", js.undefined)
    
    inline def setEnableDataDirtyException(value: Boolean): Self = StObject.set(x, "enableDataDirtyException", value.asInstanceOf[js.Any])
    
    inline def setEnableDataDirtyExceptionUndefined: Self = StObject.set(x, "enableDataDirtyException", js.undefined)
    
    inline def setEnableDeleteRow(value: Boolean): Self = StObject.set(x, "enableDeleteRow", value.asInstanceOf[js.Any])
    
    inline def setEnableDeleteRowUndefined: Self = StObject.set(x, "enableDeleteRow", js.undefined)
    
    inline def setExcelNavigationMode(value: Boolean): Self = StObject.set(x, "excelNavigationMode", value.asInstanceOf[js.Any])
    
    inline def setExcelNavigationModeUndefined: Self = StObject.set(x, "excelNavigationMode", js.undefined)
    
    inline def setGeneratePrimaryKeyValue(value: (/* event */ Event, /* ui */ GeneratePrimaryKeyValueEventUIParam) => Unit): Self = StObject.set(x, "generatePrimaryKeyValue", js.Any.fromFunction2(value))
    
    inline def setGeneratePrimaryKeyValueUndefined: Self = StObject.set(x, "generatePrimaryKeyValue", js.undefined)
    
    inline def setHorizontalMoveOnEnter(value: Boolean): Self = StObject.set(x, "horizontalMoveOnEnter", value.asInstanceOf[js.Any])
    
    inline def setHorizontalMoveOnEnterUndefined: Self = StObject.set(x, "horizontalMoveOnEnter", js.undefined)
    
    inline def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    inline def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    inline def setLocale(value: IgTreeGridUpdatingLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setRowAdded(value: (/* event */ Event, /* ui */ RowAddedEventUIParam) => Unit): Self = StObject.set(x, "rowAdded", js.Any.fromFunction2(value))
    
    inline def setRowAddedUndefined: Self = StObject.set(x, "rowAdded", js.undefined)
    
    inline def setRowAdding(value: (/* event */ Event, /* ui */ RowAddingEventUIParam) => Unit): Self = StObject.set(x, "rowAdding", js.Any.fromFunction2(value))
    
    inline def setRowAddingUndefined: Self = StObject.set(x, "rowAdding", js.undefined)
    
    inline def setRowDeleted(value: (/* event */ Event, /* ui */ RowDeletedEventUIParam) => Unit): Self = StObject.set(x, "rowDeleted", js.Any.fromFunction2(value))
    
    inline def setRowDeletedUndefined: Self = StObject.set(x, "rowDeleted", js.undefined)
    
    inline def setRowDeleting(value: (/* event */ Event, /* ui */ RowDeletingEventUIParam) => Unit): Self = StObject.set(x, "rowDeleting", js.Any.fromFunction2(value))
    
    inline def setRowDeletingUndefined: Self = StObject.set(x, "rowDeleting", js.undefined)
    
    inline def setRowEditDialogAfterClose(value: (/* event */ Event, /* ui */ RowEditDialogAfterCloseEventUIParam) => Unit): Self = StObject.set(x, "rowEditDialogAfterClose", js.Any.fromFunction2(value))
    
    inline def setRowEditDialogAfterCloseUndefined: Self = StObject.set(x, "rowEditDialogAfterClose", js.undefined)
    
    inline def setRowEditDialogAfterOpen(value: (/* event */ Event, /* ui */ RowEditDialogAfterOpenEventUIParam) => Unit): Self = StObject.set(x, "rowEditDialogAfterOpen", js.Any.fromFunction2(value))
    
    inline def setRowEditDialogAfterOpenUndefined: Self = StObject.set(x, "rowEditDialogAfterOpen", js.undefined)
    
    inline def setRowEditDialogBeforeClose(value: (/* event */ Event, /* ui */ RowEditDialogBeforeCloseEventUIParam) => Unit): Self = StObject.set(x, "rowEditDialogBeforeClose", js.Any.fromFunction2(value))
    
    inline def setRowEditDialogBeforeCloseUndefined: Self = StObject.set(x, "rowEditDialogBeforeClose", js.undefined)
    
    inline def setRowEditDialogBeforeOpen(value: (/* event */ Event, /* ui */ RowEditDialogBeforeOpenEventUIParam) => Unit): Self = StObject.set(x, "rowEditDialogBeforeOpen", js.Any.fromFunction2(value))
    
    inline def setRowEditDialogBeforeOpenUndefined: Self = StObject.set(x, "rowEditDialogBeforeOpen", js.undefined)
    
    inline def setRowEditDialogContentsRendered(value: (/* event */ Event, /* ui */ RowEditDialogContentsRenderedEventUIParam) => Unit): Self = StObject.set(x, "rowEditDialogContentsRendered", js.Any.fromFunction2(value))
    
    inline def setRowEditDialogContentsRenderedUndefined: Self = StObject.set(x, "rowEditDialogContentsRendered", js.undefined)
    
    inline def setRowEditDialogOptions(value: IgGridUpdatingRowEditDialogOptions): Self = StObject.set(x, "rowEditDialogOptions", value.asInstanceOf[js.Any])
    
    inline def setRowEditDialogOptionsUndefined: Self = StObject.set(x, "rowEditDialogOptions", js.undefined)
    
    inline def setSaveChangesErrorHandler(value: js.Function | String): Self = StObject.set(x, "saveChangesErrorHandler", value.asInstanceOf[js.Any])
    
    inline def setSaveChangesErrorHandlerUndefined: Self = StObject.set(x, "saveChangesErrorHandler", js.undefined)
    
    inline def setSaveChangesSuccessHandler(value: js.Function | String): Self = StObject.set(x, "saveChangesSuccessHandler", value.asInstanceOf[js.Any])
    
    inline def setSaveChangesSuccessHandlerUndefined: Self = StObject.set(x, "saveChangesSuccessHandler", js.undefined)
    
    inline def setShowDoneCancelButtons(value: Boolean): Self = StObject.set(x, "showDoneCancelButtons", value.asInstanceOf[js.Any])
    
    inline def setShowDoneCancelButtonsUndefined: Self = StObject.set(x, "showDoneCancelButtons", js.undefined)
    
    inline def setStartEditTriggers(value: String | js.Array[js.Any]): Self = StObject.set(x, "startEditTriggers", value.asInstanceOf[js.Any])
    
    inline def setStartEditTriggersUndefined: Self = StObject.set(x, "startEditTriggers", js.undefined)
    
    inline def setStartEditTriggersVarargs(value: js.Any*): Self = StObject.set(x, "startEditTriggers", js.Array(value :_*))
    
    inline def setSwipeDistance(value: String | Double): Self = StObject.set(x, "swipeDistance", value.asInstanceOf[js.Any])
    
    inline def setSwipeDistanceUndefined: Self = StObject.set(x, "swipeDistance", js.undefined)
    
    inline def setValidation(value: Boolean): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
    
    inline def setWrapAround(value: Boolean): Self = StObject.set(x, "wrapAround", value.asInstanceOf[js.Any])
    
    inline def setWrapAroundUndefined: Self = StObject.set(x, "wrapAround", js.undefined)
  }
}
