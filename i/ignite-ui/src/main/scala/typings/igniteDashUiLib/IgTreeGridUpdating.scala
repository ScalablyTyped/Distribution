package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridUpdating
  extends /**
	 * Option for igTreeGridUpdating
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * This option has been deprecated as of the 2017.2 Volume release.
  	 * Specifies the label of the add child button in touch environment. Use option [locale.addChildButtonLabel](ui.igtreegridupdating#options:locale.addChildButtonLabel).
  	 */
  var addChildButtonLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been deprecated as of the 2017.2 Volume release.
  	 * Specifies the add child tooltip text. Use option [locale.enableAddChild](ui.igtreegridupdating#options:locale.enableAddChild).
  	 */
  var addChildTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the label for the button starting edit mode for row adding. If not set, $.ig.GridUpdating.locale.addRowLabel is used.
  	 * Use option [locale.addRowLabel](ui.iggridupdating#options:locale.addRowLabel).
  	 */
  var addRowLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the title for the button starting edit mode for row adding. If not set, $.ig.GridUpdating.locale.addRowTooltip is used.
  	 * Use option [locale.addRowTooltip](ui.iggridupdating#options:locale.addRowTooltip).
  	 */
  var addRowTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the label for the Cancel editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.cancelLabel is used.
  	 * Use option [locale.cancelLabel](ui.iggridupdating#options:locale.cancelLabel).
  	 */
  var cancelLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the title for the Cancel editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.cancelTooltip is used.
  	 * Use option [locale.cancelTooltip](ui.iggridupdating#options:locale.cancelTooltip).
  	 */
  var cancelTooltip: js.UndefOr[java.lang.String] = js.undefined
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
  var deleteRowLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the title for the delete button. If not set, $.ig.GridUpdating.locale.deleteRowTooltip is used.
  	 * Use option [locale.deleteRowTooltip](ui.iggridupdating#options:locale.deleteRowTooltip).
  	 */
  var deleteRowTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog. For more information on how to utilize this property, please refer to the [Extending igGrid Modal Dialog](http://www.igniteui.com/help/extending-iggrid-modal-dialog) topic.
  	 *
  	 */
  var dialogWidget: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the label for the Done editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.doneLabel is used.
  	 * Use option [locale.doneLabel](ui.iggridupdating#options:locale.doneLabel).
  	 */
  var doneLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the title for the Done editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.doneTooltip is used.
  	 * Use option [locale.doneTooltip](ui.iggridupdating#options:locale.doneTooltip).
  	 */
  var doneTooltip: js.UndefOr[java.lang.String] = js.undefined
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
  var editMode: js.UndefOr[java.lang.String] = js.undefined
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
  var enableAddChild: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Specifies if adding rows through the UI is enabled. When enabled an additional row is rendered at the bottom of the grid's header that works as a button. When the end-user clicks on it edit mode is initiated either through a dialog (when [editMode](ui.iggridupdating#options:editMode) is 'dialog') or mimicking the look and feel of 'row' [editMode](ui.iggridupdating#options:editMode) (when [editMode](ui.iggridupdating#options:editMode) is 'row' or 'cell').
  	 *
  	 */
  var enableAddRow: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Specifies if an exception should be thrown when the grid's data view changes while there are pending transactions in the data source. The data view changes when the data source performs a sorting, filtering, groupby or paging operation and the exception thrown will prevent the operation from succeeding. All pending transactions must be committed before a data view operation is able to complete. Committing transactions can be done manually through the grid's [commit](ui.iggrid#methods:commit) function or automatically by setting [autoCommit](ui.iggrid#options:autoCommit) to 'true'.
  	 *
  	 */
  var enableDataDirtyException: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Specifies if deleting rows through the UI is enabled.
  	 *
  	 */
  var enableDeleteRow: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Enables excel navigation style. When turned on, the arrow keys can be used for changing the currently edited cell similar to how Tab and Enter behave. When disabled, the arrow keys control the cursor inside editors.
  	 *
  	 */
  var excelNavigationMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Event fired before editing starts for adding a new row, when Updating generates an automatic primary key for it.
  	 */
  var generatePrimaryKeyValue: js.UndefOr[GeneratePrimaryKeyValueEvent] = js.undefined
  /**
  	 * Determines if pressing Enter to navigate away from the currently edited cell should move the focus horizontally or vertically (default).
  	 *
  	 */
  var horizontalMoveOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
  	 */
  var inherit: js.UndefOr[scala.Boolean] = js.undefined
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
  var saveChangesErrorHandler: js.UndefOr[js.Function | java.lang.String] = js.undefined
  /**
  	 * Sets a custom function to be called when the AJAX request to the URL specified by the [updateUrl](ui.iggrid#options:updateUrl) property succeeds. The function will be called with arguments representing the data returned by the server.
  	 *
  	 */
  var saveChangesSuccessHandler: js.UndefOr[js.Function | java.lang.String] = js.undefined
  /**
  	 * Determines if the Done and Cancel buttons will be available as means to end edit mode for [editMode](ui.iggridupdating#options:editMode) 'row' and when adding a new row.
  	 *
  	 */
  var showDoneCancelButtons: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Specifies how end-users are able to start edit mode. Possible values: "click", "dblclick", "F2", "enter" and their combinations separated by coma or in array. The keyboard triggers have effect only if the grid cells can receive focus (the grid's [tabIndex](ui.iggrid#options:tabIndex) property should not have a negative value) or Selection is enabled. If "dblclick" is included, then "click" has no effect.
  	 *
  	 */
  var startEditTriggers: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
  /**
  	 * On touch-enabled devices specifies the swipe distance for the delete button to appear.
  	 *
  	 */
  var swipeDistance: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Specifies if the value of each editable column in the grid should be validated. The validation is done based on the rules of their corresponding editors.
  	 *
  	 */
  var validation: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Controls if navigation will wrap around the grid. The feature will never wrap around virtual grids.
  	 *
  	 */
  var wrapAround: js.UndefOr[scala.Boolean] = js.undefined
}

object IgTreeGridUpdating {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igTreeGridUpdating
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    addChildButtonLabel: java.lang.String = null,
    addChildTooltip: java.lang.String = null,
    addRowLabel: java.lang.String = null,
    addRowTooltip: java.lang.String = null,
    cancelLabel: java.lang.String = null,
    cancelTooltip: java.lang.String = null,
    columnSettings: js.Array[IgGridUpdatingColumnSetting] = null,
    dataDirty: DataDirtyEvent = null,
    deleteRowLabel: java.lang.String = null,
    deleteRowTooltip: java.lang.String = null,
    dialogWidget: java.lang.String = null,
    doneLabel: java.lang.String = null,
    doneTooltip: java.lang.String = null,
    editCellEnded: EditCellEndedEvent = null,
    editCellEnding: EditCellEndingEvent = null,
    editCellStarted: EditCellStartedEvent = null,
    editCellStarting: EditCellStartingEvent = null,
    editMode: java.lang.String = null,
    editRowEnded: EditRowEndedEvent = null,
    editRowEnding: EditRowEndingEvent = null,
    editRowStarted: EditRowStartedEvent = null,
    editRowStarting: EditRowStartingEvent = null,
    enableAddChild: js.UndefOr[scala.Boolean] = js.undefined,
    enableAddRow: js.UndefOr[scala.Boolean] = js.undefined,
    enableDataDirtyException: js.UndefOr[scala.Boolean] = js.undefined,
    enableDeleteRow: js.UndefOr[scala.Boolean] = js.undefined,
    excelNavigationMode: js.UndefOr[scala.Boolean] = js.undefined,
    generatePrimaryKeyValue: GeneratePrimaryKeyValueEvent = null,
    horizontalMoveOnEnter: js.UndefOr[scala.Boolean] = js.undefined,
    inherit: js.UndefOr[scala.Boolean] = js.undefined,
    locale: IgTreeGridUpdatingLocale = null,
    rowAdded: RowAddedEvent = null,
    rowAdding: RowAddingEvent = null,
    rowDeleted: RowDeletedEvent = null,
    rowDeleting: RowDeletingEvent = null,
    rowEditDialogAfterClose: RowEditDialogAfterCloseEvent = null,
    rowEditDialogAfterOpen: RowEditDialogAfterOpenEvent = null,
    rowEditDialogBeforeClose: RowEditDialogBeforeCloseEvent = null,
    rowEditDialogBeforeOpen: RowEditDialogBeforeOpenEvent = null,
    rowEditDialogContentsRendered: RowEditDialogContentsRenderedEvent = null,
    rowEditDialogOptions: IgGridUpdatingRowEditDialogOptions = null,
    saveChangesErrorHandler: js.Function | java.lang.String = null,
    saveChangesSuccessHandler: js.Function | java.lang.String = null,
    showDoneCancelButtons: js.UndefOr[scala.Boolean] = js.undefined,
    startEditTriggers: java.lang.String | js.Array[_] = null,
    swipeDistance: java.lang.String | scala.Double = null,
    validation: js.UndefOr[scala.Boolean] = js.undefined,
    wrapAround: js.UndefOr[scala.Boolean] = js.undefined
  ): IgTreeGridUpdating = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (addChildButtonLabel != null) __obj.updateDynamic("addChildButtonLabel")(addChildButtonLabel)
    if (addChildTooltip != null) __obj.updateDynamic("addChildTooltip")(addChildTooltip)
    if (addRowLabel != null) __obj.updateDynamic("addRowLabel")(addRowLabel)
    if (addRowTooltip != null) __obj.updateDynamic("addRowTooltip")(addRowTooltip)
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel)
    if (cancelTooltip != null) __obj.updateDynamic("cancelTooltip")(cancelTooltip)
    if (columnSettings != null) __obj.updateDynamic("columnSettings")(columnSettings)
    if (dataDirty != null) __obj.updateDynamic("dataDirty")(dataDirty)
    if (deleteRowLabel != null) __obj.updateDynamic("deleteRowLabel")(deleteRowLabel)
    if (deleteRowTooltip != null) __obj.updateDynamic("deleteRowTooltip")(deleteRowTooltip)
    if (dialogWidget != null) __obj.updateDynamic("dialogWidget")(dialogWidget)
    if (doneLabel != null) __obj.updateDynamic("doneLabel")(doneLabel)
    if (doneTooltip != null) __obj.updateDynamic("doneTooltip")(doneTooltip)
    if (editCellEnded != null) __obj.updateDynamic("editCellEnded")(editCellEnded)
    if (editCellEnding != null) __obj.updateDynamic("editCellEnding")(editCellEnding)
    if (editCellStarted != null) __obj.updateDynamic("editCellStarted")(editCellStarted)
    if (editCellStarting != null) __obj.updateDynamic("editCellStarting")(editCellStarting)
    if (editMode != null) __obj.updateDynamic("editMode")(editMode)
    if (editRowEnded != null) __obj.updateDynamic("editRowEnded")(editRowEnded)
    if (editRowEnding != null) __obj.updateDynamic("editRowEnding")(editRowEnding)
    if (editRowStarted != null) __obj.updateDynamic("editRowStarted")(editRowStarted)
    if (editRowStarting != null) __obj.updateDynamic("editRowStarting")(editRowStarting)
    if (!js.isUndefined(enableAddChild)) __obj.updateDynamic("enableAddChild")(enableAddChild)
    if (!js.isUndefined(enableAddRow)) __obj.updateDynamic("enableAddRow")(enableAddRow)
    if (!js.isUndefined(enableDataDirtyException)) __obj.updateDynamic("enableDataDirtyException")(enableDataDirtyException)
    if (!js.isUndefined(enableDeleteRow)) __obj.updateDynamic("enableDeleteRow")(enableDeleteRow)
    if (!js.isUndefined(excelNavigationMode)) __obj.updateDynamic("excelNavigationMode")(excelNavigationMode)
    if (generatePrimaryKeyValue != null) __obj.updateDynamic("generatePrimaryKeyValue")(generatePrimaryKeyValue)
    if (!js.isUndefined(horizontalMoveOnEnter)) __obj.updateDynamic("horizontalMoveOnEnter")(horizontalMoveOnEnter)
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (rowAdded != null) __obj.updateDynamic("rowAdded")(rowAdded)
    if (rowAdding != null) __obj.updateDynamic("rowAdding")(rowAdding)
    if (rowDeleted != null) __obj.updateDynamic("rowDeleted")(rowDeleted)
    if (rowDeleting != null) __obj.updateDynamic("rowDeleting")(rowDeleting)
    if (rowEditDialogAfterClose != null) __obj.updateDynamic("rowEditDialogAfterClose")(rowEditDialogAfterClose)
    if (rowEditDialogAfterOpen != null) __obj.updateDynamic("rowEditDialogAfterOpen")(rowEditDialogAfterOpen)
    if (rowEditDialogBeforeClose != null) __obj.updateDynamic("rowEditDialogBeforeClose")(rowEditDialogBeforeClose)
    if (rowEditDialogBeforeOpen != null) __obj.updateDynamic("rowEditDialogBeforeOpen")(rowEditDialogBeforeOpen)
    if (rowEditDialogContentsRendered != null) __obj.updateDynamic("rowEditDialogContentsRendered")(rowEditDialogContentsRendered)
    if (rowEditDialogOptions != null) __obj.updateDynamic("rowEditDialogOptions")(rowEditDialogOptions)
    if (saveChangesErrorHandler != null) __obj.updateDynamic("saveChangesErrorHandler")(saveChangesErrorHandler.asInstanceOf[js.Any])
    if (saveChangesSuccessHandler != null) __obj.updateDynamic("saveChangesSuccessHandler")(saveChangesSuccessHandler.asInstanceOf[js.Any])
    if (!js.isUndefined(showDoneCancelButtons)) __obj.updateDynamic("showDoneCancelButtons")(showDoneCancelButtons)
    if (startEditTriggers != null) __obj.updateDynamic("startEditTriggers")(startEditTriggers.asInstanceOf[js.Any])
    if (swipeDistance != null) __obj.updateDynamic("swipeDistance")(swipeDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(validation)) __obj.updateDynamic("validation")(validation)
    if (!js.isUndefined(wrapAround)) __obj.updateDynamic("wrapAround")(wrapAround)
    __obj.asInstanceOf[IgTreeGridUpdating]
  }
}

