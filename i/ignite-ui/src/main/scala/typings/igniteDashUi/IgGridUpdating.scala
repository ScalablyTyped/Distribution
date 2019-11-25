package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridUpdating
  extends /**
	 * Option for igGridUpdating
	 */
/* optionName */ StringDictionary[js.Any] {
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
  	 * Enables/disables feature inheritance for the child layouts in igHierarchicalGrid.
  	 */
  var inherit: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[IgGridUpdatingLocale] = js.undefined
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
  var startEditTriggers: js.UndefOr[String | js.Array[_]] = js.undefined
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

object IgGridUpdating {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igGridUpdating
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    addRowLabel: String = null,
    addRowTooltip: String = null,
    cancelLabel: String = null,
    cancelTooltip: String = null,
    columnSettings: js.Array[IgGridUpdatingColumnSetting] = null,
    dataDirty: (/* event */ Event, /* ui */ DataDirtyEventUIParam) => Unit = null,
    deleteRowLabel: String = null,
    deleteRowTooltip: String = null,
    dialogWidget: String = null,
    doneLabel: String = null,
    doneTooltip: String = null,
    editCellEnded: (/* event */ Event, /* ui */ EditCellEndedEventUIParam) => Unit = null,
    editCellEnding: (/* event */ Event, /* ui */ EditCellEndingEventUIParam) => Unit = null,
    editCellStarted: (/* event */ Event, /* ui */ EditCellStartedEventUIParam) => Unit = null,
    editCellStarting: (/* event */ Event, /* ui */ EditCellStartingEventUIParam) => Unit = null,
    editMode: String = null,
    editRowEnded: (/* event */ Event, /* ui */ EditRowEndedEventUIParam) => Unit = null,
    editRowEnding: (/* event */ Event, /* ui */ EditRowEndingEventUIParam) => Unit = null,
    editRowStarted: (/* event */ Event, /* ui */ EditRowStartedEventUIParam) => Unit = null,
    editRowStarting: (/* event */ Event, /* ui */ EditRowStartingEventUIParam) => Unit = null,
    enableAddRow: js.UndefOr[Boolean] = js.undefined,
    enableDataDirtyException: js.UndefOr[Boolean] = js.undefined,
    enableDeleteRow: js.UndefOr[Boolean] = js.undefined,
    excelNavigationMode: js.UndefOr[Boolean] = js.undefined,
    generatePrimaryKeyValue: (/* event */ Event, /* ui */ GeneratePrimaryKeyValueEventUIParam) => Unit = null,
    horizontalMoveOnEnter: js.UndefOr[Boolean] = js.undefined,
    inherit: js.UndefOr[Boolean] = js.undefined,
    locale: IgGridUpdatingLocale = null,
    rowAdded: (/* event */ Event, /* ui */ RowAddedEventUIParam) => Unit = null,
    rowAdding: (/* event */ Event, /* ui */ RowAddingEventUIParam) => Unit = null,
    rowDeleted: (/* event */ Event, /* ui */ RowDeletedEventUIParam) => Unit = null,
    rowDeleting: (/* event */ Event, /* ui */ RowDeletingEventUIParam) => Unit = null,
    rowEditDialogAfterClose: (/* event */ Event, /* ui */ RowEditDialogAfterCloseEventUIParam) => Unit = null,
    rowEditDialogAfterOpen: (/* event */ Event, /* ui */ RowEditDialogAfterOpenEventUIParam) => Unit = null,
    rowEditDialogBeforeClose: (/* event */ Event, /* ui */ RowEditDialogBeforeCloseEventUIParam) => Unit = null,
    rowEditDialogBeforeOpen: (/* event */ Event, /* ui */ RowEditDialogBeforeOpenEventUIParam) => Unit = null,
    rowEditDialogContentsRendered: (/* event */ Event, /* ui */ RowEditDialogContentsRenderedEventUIParam) => Unit = null,
    rowEditDialogOptions: IgGridUpdatingRowEditDialogOptions = null,
    saveChangesErrorHandler: js.Function | String = null,
    saveChangesSuccessHandler: js.Function | String = null,
    showDoneCancelButtons: js.UndefOr[Boolean] = js.undefined,
    startEditTriggers: String | js.Array[_] = null,
    swipeDistance: String | Double = null,
    validation: js.UndefOr[Boolean] = js.undefined,
    wrapAround: js.UndefOr[Boolean] = js.undefined
  ): IgGridUpdating = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (addRowLabel != null) __obj.updateDynamic("addRowLabel")(addRowLabel.asInstanceOf[js.Any])
    if (addRowTooltip != null) __obj.updateDynamic("addRowTooltip")(addRowTooltip.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (cancelTooltip != null) __obj.updateDynamic("cancelTooltip")(cancelTooltip.asInstanceOf[js.Any])
    if (columnSettings != null) __obj.updateDynamic("columnSettings")(columnSettings.asInstanceOf[js.Any])
    if (dataDirty != null) __obj.updateDynamic("dataDirty")(js.Any.fromFunction2(dataDirty))
    if (deleteRowLabel != null) __obj.updateDynamic("deleteRowLabel")(deleteRowLabel.asInstanceOf[js.Any])
    if (deleteRowTooltip != null) __obj.updateDynamic("deleteRowTooltip")(deleteRowTooltip.asInstanceOf[js.Any])
    if (dialogWidget != null) __obj.updateDynamic("dialogWidget")(dialogWidget.asInstanceOf[js.Any])
    if (doneLabel != null) __obj.updateDynamic("doneLabel")(doneLabel.asInstanceOf[js.Any])
    if (doneTooltip != null) __obj.updateDynamic("doneTooltip")(doneTooltip.asInstanceOf[js.Any])
    if (editCellEnded != null) __obj.updateDynamic("editCellEnded")(js.Any.fromFunction2(editCellEnded))
    if (editCellEnding != null) __obj.updateDynamic("editCellEnding")(js.Any.fromFunction2(editCellEnding))
    if (editCellStarted != null) __obj.updateDynamic("editCellStarted")(js.Any.fromFunction2(editCellStarted))
    if (editCellStarting != null) __obj.updateDynamic("editCellStarting")(js.Any.fromFunction2(editCellStarting))
    if (editMode != null) __obj.updateDynamic("editMode")(editMode.asInstanceOf[js.Any])
    if (editRowEnded != null) __obj.updateDynamic("editRowEnded")(js.Any.fromFunction2(editRowEnded))
    if (editRowEnding != null) __obj.updateDynamic("editRowEnding")(js.Any.fromFunction2(editRowEnding))
    if (editRowStarted != null) __obj.updateDynamic("editRowStarted")(js.Any.fromFunction2(editRowStarted))
    if (editRowStarting != null) __obj.updateDynamic("editRowStarting")(js.Any.fromFunction2(editRowStarting))
    if (!js.isUndefined(enableAddRow)) __obj.updateDynamic("enableAddRow")(enableAddRow.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDataDirtyException)) __obj.updateDynamic("enableDataDirtyException")(enableDataDirtyException.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDeleteRow)) __obj.updateDynamic("enableDeleteRow")(enableDeleteRow.asInstanceOf[js.Any])
    if (!js.isUndefined(excelNavigationMode)) __obj.updateDynamic("excelNavigationMode")(excelNavigationMode.asInstanceOf[js.Any])
    if (generatePrimaryKeyValue != null) __obj.updateDynamic("generatePrimaryKeyValue")(js.Any.fromFunction2(generatePrimaryKeyValue))
    if (!js.isUndefined(horizontalMoveOnEnter)) __obj.updateDynamic("horizontalMoveOnEnter")(horizontalMoveOnEnter.asInstanceOf[js.Any])
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (rowAdded != null) __obj.updateDynamic("rowAdded")(js.Any.fromFunction2(rowAdded))
    if (rowAdding != null) __obj.updateDynamic("rowAdding")(js.Any.fromFunction2(rowAdding))
    if (rowDeleted != null) __obj.updateDynamic("rowDeleted")(js.Any.fromFunction2(rowDeleted))
    if (rowDeleting != null) __obj.updateDynamic("rowDeleting")(js.Any.fromFunction2(rowDeleting))
    if (rowEditDialogAfterClose != null) __obj.updateDynamic("rowEditDialogAfterClose")(js.Any.fromFunction2(rowEditDialogAfterClose))
    if (rowEditDialogAfterOpen != null) __obj.updateDynamic("rowEditDialogAfterOpen")(js.Any.fromFunction2(rowEditDialogAfterOpen))
    if (rowEditDialogBeforeClose != null) __obj.updateDynamic("rowEditDialogBeforeClose")(js.Any.fromFunction2(rowEditDialogBeforeClose))
    if (rowEditDialogBeforeOpen != null) __obj.updateDynamic("rowEditDialogBeforeOpen")(js.Any.fromFunction2(rowEditDialogBeforeOpen))
    if (rowEditDialogContentsRendered != null) __obj.updateDynamic("rowEditDialogContentsRendered")(js.Any.fromFunction2(rowEditDialogContentsRendered))
    if (rowEditDialogOptions != null) __obj.updateDynamic("rowEditDialogOptions")(rowEditDialogOptions.asInstanceOf[js.Any])
    if (saveChangesErrorHandler != null) __obj.updateDynamic("saveChangesErrorHandler")(saveChangesErrorHandler.asInstanceOf[js.Any])
    if (saveChangesSuccessHandler != null) __obj.updateDynamic("saveChangesSuccessHandler")(saveChangesSuccessHandler.asInstanceOf[js.Any])
    if (!js.isUndefined(showDoneCancelButtons)) __obj.updateDynamic("showDoneCancelButtons")(showDoneCancelButtons.asInstanceOf[js.Any])
    if (startEditTriggers != null) __obj.updateDynamic("startEditTriggers")(startEditTriggers.asInstanceOf[js.Any])
    if (swipeDistance != null) __obj.updateDynamic("swipeDistance")(swipeDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(validation)) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapAround)) __obj.updateDynamic("wrapAround")(wrapAround.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridUpdating]
  }
}

