package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTreeGridUpdating
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * This option has been deprecated as of the 2017.2 Volume release.
    * Specifies the label of the add child button in touch environment. Use option [locale.addChildButtonLabel](ui.igtreegridupdating#options:locale.addChildButtonLabel).
    */
  var addChildButtonLabel: js.UndefOr[String] = js.native
  /**
    * This option has been deprecated as of the 2017.2 Volume release.
    * Specifies the add child tooltip text. Use option [locale.enableAddChild](ui.igtreegridupdating#options:locale.enableAddChild).
    */
  var addChildTooltip: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the label for the button starting edit mode for row adding. If not set, $.ig.GridUpdating.locale.addRowLabel is used.
    * Use option [locale.addRowLabel](ui.iggridupdating#options:locale.addRowLabel).
    */
  var addRowLabel: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the title for the button starting edit mode for row adding. If not set, $.ig.GridUpdating.locale.addRowTooltip is used.
    * Use option [locale.addRowTooltip](ui.iggridupdating#options:locale.addRowTooltip).
    */
  var addRowTooltip: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the label for the Cancel editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.cancelLabel is used.
    * Use option [locale.cancelLabel](ui.iggridupdating#options:locale.cancelLabel).
    */
  var cancelLabel: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the title for the Cancel editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.cancelTooltip is used.
    * Use option [locale.cancelTooltip](ui.iggridupdating#options:locale.cancelTooltip).
    */
  var cancelTooltip: js.UndefOr[String] = js.native
  /**
    * A list of custom column options that specify editing and validation settings for a specific column.
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridUpdatingColumnSetting]] = js.native
  /**
    * Event fired before the dataDirtyException is thrown. This can be controlled by the [enableDataDirtyException](ui.iggridupdating#options:enableDataDirtyException) property. Any pending changes may be committed in the handler of this event in order to prevent dataDirtyException from being thrown.
    * Return false in order to prevent the exception.
    */
  var dataDirty: js.UndefOr[DataDirtyEvent] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the label for the delete button. If not set, $.ig.GridUpdating.locale.deleteRowLabel is used.
    * Use option [locale.deleteRowLabel](ui.iggridupdating#options:locale.deleteRowLabel).
    */
  var deleteRowLabel: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the title for the delete button. If not set, $.ig.GridUpdating.locale.deleteRowTooltip is used.
    * Use option [locale.deleteRowTooltip](ui.iggridupdating#options:locale.deleteRowTooltip).
    */
  var deleteRowTooltip: js.UndefOr[String] = js.native
  /**
    * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog. For more information on how to utilize this property, please refer to the [Extending igGrid Modal Dialog](http://www.igniteui.com/help/extending-iggrid-modal-dialog) topic.
    *
    */
  var dialogWidget: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the label for the Done editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.doneLabel is used.
    * Use option [locale.doneLabel](ui.iggridupdating#options:locale.doneLabel).
    */
  var doneLabel: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the title for the Done editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.doneTooltip is used.
    * Use option [locale.doneTooltip](ui.iggridupdating#options:locale.doneTooltip).
    */
  var doneTooltip: js.UndefOr[String] = js.native
  /**
    * Event fired after cell editing ends (including when row editing closes editing for a cell).
    */
  var editCellEnded: js.UndefOr[EditCellEndedEvent] = js.native
  /**
    * Event fired before cell editing ends (including when row editing closes editing for a cell).
    * Return false in order to prevent the grid from exiting edit mode (only functions if [editMode](ui.iggridupdating#options:editMode) is 'cell').
    */
  var editCellEnding: js.UndefOr[EditCellEndingEvent] = js.native
  /**
    * Event fired after cell editing begins (including when row editing opens editing for a cell).
    */
  var editCellStarted: js.UndefOr[EditCellStartedEvent] = js.native
  /**
    * Event fired before cell editing begins (including when row editing opens editing for a cell).
    * Return false in order to cancel editing.
    */
  var editCellStarting: js.UndefOr[EditCellStartingEvent] = js.native
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
  var editMode: js.UndefOr[String] = js.native
  /**
    * Event fired after row editing ends.
    */
  var editRowEnded: js.UndefOr[EditRowEndedEvent] = js.native
  /**
    * Event fired before row editing ends.
    * Return false in order to prevent the grid from exiting edit mode.
    */
  var editRowEnding: js.UndefOr[EditRowEndingEvent] = js.native
  /**
    * Event fired after row editing begins.
    */
  var editRowStarted: js.UndefOr[EditRowStartedEvent] = js.native
  /**
    * Event fired before row editing begins.
    * Return false in order to cancel editing.
    */
  var editRowStarting: js.UndefOr[EditRowStartingEvent] = js.native
  /**
    * Specifies whether to enable or disable adding children to rows.
    *
    */
  var enableAddChild: js.UndefOr[Boolean] = js.native
  /**
    * Specifies if adding rows through the UI is enabled. When enabled an additional row is rendered at the bottom of the grid's header that works as a button. When the end-user clicks on it edit mode is initiated either through a dialog (when [editMode](ui.iggridupdating#options:editMode) is 'dialog') or mimicking the look and feel of 'row' [editMode](ui.iggridupdating#options:editMode) (when [editMode](ui.iggridupdating#options:editMode) is 'row' or 'cell').
    *
    */
  var enableAddRow: js.UndefOr[Boolean] = js.native
  /**
    * Specifies if an exception should be thrown when the grid's data view changes while there are pending transactions in the data source. The data view changes when the data source performs a sorting, filtering, groupby or paging operation and the exception thrown will prevent the operation from succeeding. All pending transactions must be committed before a data view operation is able to complete. Committing transactions can be done manually through the grid's [commit](ui.iggrid#methods:commit) function or automatically by setting [autoCommit](ui.iggrid#options:autoCommit) to 'true'.
    *
    */
  var enableDataDirtyException: js.UndefOr[Boolean] = js.native
  /**
    * Specifies if deleting rows through the UI is enabled.
    *
    */
  var enableDeleteRow: js.UndefOr[Boolean] = js.native
  /**
    * Enables excel navigation style. When turned on, the arrow keys can be used for changing the currently edited cell similar to how Tab and Enter behave. When disabled, the arrow keys control the cursor inside editors.
    *
    */
  var excelNavigationMode: js.UndefOr[Boolean] = js.native
  /**
    * Event fired before editing starts for adding a new row, when Updating generates an automatic primary key for it.
    */
  var generatePrimaryKeyValue: js.UndefOr[GeneratePrimaryKeyValueEvent] = js.native
  /**
    * Determines if pressing Enter to navigate away from the currently edited cell should move the focus horizontally or vertically (default).
    *
    */
  var horizontalMoveOnEnter: js.UndefOr[Boolean] = js.native
  /**
    * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[IgTreeGridUpdatingLocale] = js.native
  /**
    * Event fired after adding a new row.
    */
  var rowAdded: js.UndefOr[RowAddedEvent] = js.native
  /**
    * Event fired before adding a new row.
    * Return false in order to cancel the adding of the new row to the data source.
    */
  var rowAdding: js.UndefOr[RowAddingEvent] = js.native
  /**
    * Event fired after a row is deleted.
    */
  var rowDeleted: js.UndefOr[RowDeletedEvent] = js.native
  /**
    * Event fired before deleting a row.
    * Return false in order to cancel the row's deletion.
    */
  var rowDeleting: js.UndefOr[RowDeletingEvent] = js.native
  /**
    * Event fired after the row edit dialog is closed.
    */
  var rowEditDialogAfterClose: js.UndefOr[RowEditDialogAfterCloseEvent] = js.native
  /**
    * Event fired after the row edit dialog is opened.
    */
  var rowEditDialogAfterOpen: js.UndefOr[RowEditDialogAfterOpenEvent] = js.native
  /**
    * Event fired before the row edit dialog is closed.
    */
  var rowEditDialogBeforeClose: js.UndefOr[RowEditDialogBeforeCloseEvent] = js.native
  /**
    * Event fired before the row edit dialog is opened.
    */
  var rowEditDialogBeforeOpen: js.UndefOr[RowEditDialogBeforeOpenEvent] = js.native
  /**
    * Event fired after the row edit dialog is rendered.
    */
  var rowEditDialogContentsRendered: js.UndefOr[RowEditDialogContentsRenderedEvent] = js.native
  /**
    * A list of options controlling the rendering behavior of the row edit dialog. If [editMode](ui.iggridupdating#options:editMode) is not 'dialog' these have no effect.
    *
    */
  var rowEditDialogOptions: js.UndefOr[IgGridUpdatingRowEditDialogOptions] = js.native
  /**
    * Sets a custom function to be called when the AJAX request to the URL specified by the [updateUrl](ui.iggrid#options:updateUrl) property fails. The function will be called with arguments representing the data returned by the server.
    *
    */
  var saveChangesErrorHandler: js.UndefOr[js.Function | String] = js.native
  /**
    * Sets a custom function to be called when the AJAX request to the URL specified by the [updateUrl](ui.iggrid#options:updateUrl) property succeeds. The function will be called with arguments representing the data returned by the server.
    *
    */
  var saveChangesSuccessHandler: js.UndefOr[js.Function | String] = js.native
  /**
    * Determines if the Done and Cancel buttons will be available as means to end edit mode for [editMode](ui.iggridupdating#options:editMode) 'row' and when adding a new row.
    *
    */
  var showDoneCancelButtons: js.UndefOr[Boolean] = js.native
  /**
    * Specifies how end-users are able to start edit mode. Possible values: "click", "dblclick", "F2", "enter" and their combinations separated by coma or in array. The keyboard triggers have effect only if the grid cells can receive focus (the grid's [tabIndex](ui.iggrid#options:tabIndex) property should not have a negative value) or Selection is enabled. If "dblclick" is included, then "click" has no effect.
    *
    */
  var startEditTriggers: js.UndefOr[String | js.Array[_]] = js.native
  /**
    * On touch-enabled devices specifies the swipe distance for the delete button to appear.
    *
    */
  var swipeDistance: js.UndefOr[String | Double] = js.native
  /**
    * Specifies if the value of each editable column in the grid should be validated. The validation is done based on the rules of their corresponding editors.
    *
    */
  var validation: js.UndefOr[Boolean] = js.native
  /**
    * Controls if navigation will wrap around the grid. The feature will never wrap around virtual grids.
    *
    */
  var wrapAround: js.UndefOr[Boolean] = js.native
}

object IgTreeGridUpdating {
  @scala.inline
  def apply(): IgTreeGridUpdating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridUpdating]
  }
  @scala.inline
  implicit class IgTreeGridUpdatingOps[Self <: IgTreeGridUpdating] (val x: Self) extends AnyVal {
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
    def setAddChildButtonLabel(value: String): Self = this.set("addChildButtonLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddChildButtonLabel: Self = this.set("addChildButtonLabel", js.undefined)
    @scala.inline
    def setAddChildTooltip(value: String): Self = this.set("addChildTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddChildTooltip: Self = this.set("addChildTooltip", js.undefined)
    @scala.inline
    def setAddRowLabel(value: String): Self = this.set("addRowLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddRowLabel: Self = this.set("addRowLabel", js.undefined)
    @scala.inline
    def setAddRowTooltip(value: String): Self = this.set("addRowTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddRowTooltip: Self = this.set("addRowTooltip", js.undefined)
    @scala.inline
    def setCancelLabel(value: String): Self = this.set("cancelLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelLabel: Self = this.set("cancelLabel", js.undefined)
    @scala.inline
    def setCancelTooltip(value: String): Self = this.set("cancelTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelTooltip: Self = this.set("cancelTooltip", js.undefined)
    @scala.inline
    def setColumnSettingsVarargs(value: IgGridUpdatingColumnSetting*): Self = this.set("columnSettings", js.Array(value :_*))
    @scala.inline
    def setColumnSettings(value: js.Array[IgGridUpdatingColumnSetting]): Self = this.set("columnSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSettings: Self = this.set("columnSettings", js.undefined)
    @scala.inline
    def setDataDirty(value: (/* event */ Event, /* ui */ DataDirtyEventUIParam) => Unit): Self = this.set("dataDirty", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDataDirty: Self = this.set("dataDirty", js.undefined)
    @scala.inline
    def setDeleteRowLabel(value: String): Self = this.set("deleteRowLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteRowLabel: Self = this.set("deleteRowLabel", js.undefined)
    @scala.inline
    def setDeleteRowTooltip(value: String): Self = this.set("deleteRowTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteRowTooltip: Self = this.set("deleteRowTooltip", js.undefined)
    @scala.inline
    def setDialogWidget(value: String): Self = this.set("dialogWidget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogWidget: Self = this.set("dialogWidget", js.undefined)
    @scala.inline
    def setDoneLabel(value: String): Self = this.set("doneLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoneLabel: Self = this.set("doneLabel", js.undefined)
    @scala.inline
    def setDoneTooltip(value: String): Self = this.set("doneTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoneTooltip: Self = this.set("doneTooltip", js.undefined)
    @scala.inline
    def setEditCellEnded(value: (/* event */ Event, /* ui */ EditCellEndedEventUIParam) => Unit): Self = this.set("editCellEnded", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEditCellEnded: Self = this.set("editCellEnded", js.undefined)
    @scala.inline
    def setEditCellEnding(value: (/* event */ Event, /* ui */ EditCellEndingEventUIParam) => Unit): Self = this.set("editCellEnding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEditCellEnding: Self = this.set("editCellEnding", js.undefined)
    @scala.inline
    def setEditCellStarted(value: (/* event */ Event, /* ui */ EditCellStartedEventUIParam) => Unit): Self = this.set("editCellStarted", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEditCellStarted: Self = this.set("editCellStarted", js.undefined)
    @scala.inline
    def setEditCellStarting(value: (/* event */ Event, /* ui */ EditCellStartingEventUIParam) => Unit): Self = this.set("editCellStarting", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEditCellStarting: Self = this.set("editCellStarting", js.undefined)
    @scala.inline
    def setEditMode(value: String): Self = this.set("editMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditMode: Self = this.set("editMode", js.undefined)
    @scala.inline
    def setEditRowEnded(value: (/* event */ Event, /* ui */ EditRowEndedEventUIParam) => Unit): Self = this.set("editRowEnded", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEditRowEnded: Self = this.set("editRowEnded", js.undefined)
    @scala.inline
    def setEditRowEnding(value: (/* event */ Event, /* ui */ EditRowEndingEventUIParam) => Unit): Self = this.set("editRowEnding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEditRowEnding: Self = this.set("editRowEnding", js.undefined)
    @scala.inline
    def setEditRowStarted(value: (/* event */ Event, /* ui */ EditRowStartedEventUIParam) => Unit): Self = this.set("editRowStarted", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEditRowStarted: Self = this.set("editRowStarted", js.undefined)
    @scala.inline
    def setEditRowStarting(value: (/* event */ Event, /* ui */ EditRowStartingEventUIParam) => Unit): Self = this.set("editRowStarting", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEditRowStarting: Self = this.set("editRowStarting", js.undefined)
    @scala.inline
    def setEnableAddChild(value: Boolean): Self = this.set("enableAddChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAddChild: Self = this.set("enableAddChild", js.undefined)
    @scala.inline
    def setEnableAddRow(value: Boolean): Self = this.set("enableAddRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAddRow: Self = this.set("enableAddRow", js.undefined)
    @scala.inline
    def setEnableDataDirtyException(value: Boolean): Self = this.set("enableDataDirtyException", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDataDirtyException: Self = this.set("enableDataDirtyException", js.undefined)
    @scala.inline
    def setEnableDeleteRow(value: Boolean): Self = this.set("enableDeleteRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDeleteRow: Self = this.set("enableDeleteRow", js.undefined)
    @scala.inline
    def setExcelNavigationMode(value: Boolean): Self = this.set("excelNavigationMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcelNavigationMode: Self = this.set("excelNavigationMode", js.undefined)
    @scala.inline
    def setGeneratePrimaryKeyValue(value: (/* event */ Event, /* ui */ GeneratePrimaryKeyValueEventUIParam) => Unit): Self = this.set("generatePrimaryKeyValue", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGeneratePrimaryKeyValue: Self = this.set("generatePrimaryKeyValue", js.undefined)
    @scala.inline
    def setHorizontalMoveOnEnter(value: Boolean): Self = this.set("horizontalMoveOnEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalMoveOnEnter: Self = this.set("horizontalMoveOnEnter", js.undefined)
    @scala.inline
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInherit: Self = this.set("inherit", js.undefined)
    @scala.inline
    def setLocale(value: IgTreeGridUpdatingLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setRowAdded(value: (/* event */ Event, /* ui */ RowAddedEventUIParam) => Unit): Self = this.set("rowAdded", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowAdded: Self = this.set("rowAdded", js.undefined)
    @scala.inline
    def setRowAdding(value: (/* event */ Event, /* ui */ RowAddingEventUIParam) => Unit): Self = this.set("rowAdding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowAdding: Self = this.set("rowAdding", js.undefined)
    @scala.inline
    def setRowDeleted(value: (/* event */ Event, /* ui */ RowDeletedEventUIParam) => Unit): Self = this.set("rowDeleted", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowDeleted: Self = this.set("rowDeleted", js.undefined)
    @scala.inline
    def setRowDeleting(value: (/* event */ Event, /* ui */ RowDeletingEventUIParam) => Unit): Self = this.set("rowDeleting", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowDeleting: Self = this.set("rowDeleting", js.undefined)
    @scala.inline
    def setRowEditDialogAfterClose(value: (/* event */ Event, /* ui */ RowEditDialogAfterCloseEventUIParam) => Unit): Self = this.set("rowEditDialogAfterClose", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowEditDialogAfterClose: Self = this.set("rowEditDialogAfterClose", js.undefined)
    @scala.inline
    def setRowEditDialogAfterOpen(value: (/* event */ Event, /* ui */ RowEditDialogAfterOpenEventUIParam) => Unit): Self = this.set("rowEditDialogAfterOpen", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowEditDialogAfterOpen: Self = this.set("rowEditDialogAfterOpen", js.undefined)
    @scala.inline
    def setRowEditDialogBeforeClose(value: (/* event */ Event, /* ui */ RowEditDialogBeforeCloseEventUIParam) => Unit): Self = this.set("rowEditDialogBeforeClose", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowEditDialogBeforeClose: Self = this.set("rowEditDialogBeforeClose", js.undefined)
    @scala.inline
    def setRowEditDialogBeforeOpen(value: (/* event */ Event, /* ui */ RowEditDialogBeforeOpenEventUIParam) => Unit): Self = this.set("rowEditDialogBeforeOpen", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowEditDialogBeforeOpen: Self = this.set("rowEditDialogBeforeOpen", js.undefined)
    @scala.inline
    def setRowEditDialogContentsRendered(value: (/* event */ Event, /* ui */ RowEditDialogContentsRenderedEventUIParam) => Unit): Self = this.set("rowEditDialogContentsRendered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowEditDialogContentsRendered: Self = this.set("rowEditDialogContentsRendered", js.undefined)
    @scala.inline
    def setRowEditDialogOptions(value: IgGridUpdatingRowEditDialogOptions): Self = this.set("rowEditDialogOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowEditDialogOptions: Self = this.set("rowEditDialogOptions", js.undefined)
    @scala.inline
    def setSaveChangesErrorHandler(value: js.Function | String): Self = this.set("saveChangesErrorHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveChangesErrorHandler: Self = this.set("saveChangesErrorHandler", js.undefined)
    @scala.inline
    def setSaveChangesSuccessHandler(value: js.Function | String): Self = this.set("saveChangesSuccessHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveChangesSuccessHandler: Self = this.set("saveChangesSuccessHandler", js.undefined)
    @scala.inline
    def setShowDoneCancelButtons(value: Boolean): Self = this.set("showDoneCancelButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDoneCancelButtons: Self = this.set("showDoneCancelButtons", js.undefined)
    @scala.inline
    def setStartEditTriggersVarargs(value: js.Any*): Self = this.set("startEditTriggers", js.Array(value :_*))
    @scala.inline
    def setStartEditTriggers(value: String | js.Array[_]): Self = this.set("startEditTriggers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartEditTriggers: Self = this.set("startEditTriggers", js.undefined)
    @scala.inline
    def setSwipeDistance(value: String | Double): Self = this.set("swipeDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeDistance: Self = this.set("swipeDistance", js.undefined)
    @scala.inline
    def setValidation(value: Boolean): Self = this.set("validation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidation: Self = this.set("validation", js.undefined)
    @scala.inline
    def setWrapAround(value: Boolean): Self = this.set("wrapAround", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapAround: Self = this.set("wrapAround", js.undefined)
  }
  
}

