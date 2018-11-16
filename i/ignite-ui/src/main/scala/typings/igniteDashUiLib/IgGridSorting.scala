package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgGridSorting
  extends /**
	 * Option for igGridSorting
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Enables/disables special styling for sorted columns. If false, sorted column cells will not have any special sort-related styling.
  	 *
  	 */
  var applySortedColumnCss: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Enables or disables the case sensitivity of the sorting. Works only for [local](ui.iggridsorting#options:type) sorting.
  	 *
  	 */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * A list of custom column settings that specify custom sorting settings for a specific column (whether sorting is enabled / disabled, default sort direction, first sort direction, etc.).
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[IgGridSortingColumnSetting]] = js.undefined
  /**
  	 * Event fired after the column has already been sorted and data - re-rendered.
  	 */
  var columnSorted: js.UndefOr[ColumnSortedEvent] = js.undefined
  /**
  	 * Event fired before sorting is invoked for a certain column.
  	 * Return false in order to cancel column sorting.
  	 */
  var columnSorting: js.UndefOr[ColumnSortingEvent] = js.undefined
  /**
  	 * Custom sort function(or name of the function as a string) accepting three parameters - the data to be sorted, an array of data source field definitions, and the direction to sort with (optional). The function should return the sorted data array.
  	 *
  	 */
  var customSortFunction: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog.
  	 *
  	 */
  var dialogWidget: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the text shown in the feature chooser item for sorting in ascending order (displayed only on touch environment).
  	 * Use option [locale.featureChooserSortAsc](ui.iggridsorting#options:locale.featureChooserSortAsc).
  	 */
  var featureChooserSortAsc: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the text shown in the feature chooser item for sorting in descending order (displayed only on touch environment).
  	 * Use option [locale.featureChooserSortDesc](ui.iggridsorting#options:locale.featureChooserSortDesc).
  	 */
  var featureChooserSortDesc: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the text of the feature chooser sorting button.
  	 * Use option [locale.featureChooserText](ui.iggridsorting#options:locale.featureChooserText).
  	 */
  var featureChooserText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies which direction to use on the first click / keydown, if the column is sorted for the first time.
  	 *
  	 *
  	 * Valid values:
  	 * "ascending" The first sort of the column data will be in ascending order.
  	 * "descending" The first sort of the column data will be in descending order.
  	 */
  var firstSortDirection: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
  	 *
  	 */
  var inherit: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[IgGridSortingLocale] = js.undefined
  /**
  	 * Specifies time of milliseconds for animation duration to show/hide modal dialog.
  	 *
  	 */
  var modalDialogAnimationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Event fired when button Apply in modal dialog is clicked
  	 */
  var modalDialogButtonApplyClick: js.UndefOr[ModalDialogButtonApplyClickEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies text of button which apply changes in modal dialog.
  	 * Use option [locale.modalDialogButtonApplyText](ui.iggridsorting#options:locale.modalDialogButtonApplyText).
  	 */
  var modalDialogButtonApplyText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies text of button which cancels the changes in the advanced sorting modal dialog.
  	 * Use option [locale.modalDialogButtonCancelText](ui.iggridsorting#options:locale.modalDialogButtonCancelText).
  	 */
  var modalDialogButtonCancelText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event fired when the button to reset sorting is clicked.
  	 */
  var modalDialogButtonResetClick: js.UndefOr[ModalDialogButtonResetClickEvent] = js.undefined
  /**
  	 * Event fired when button to unsort column is clicked in modal dialog
  	 */
  var modalDialogButtonUnsortClick: js.UndefOr[ModalDialogButtonUnsortClickEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for each ascending sorted column in multiple sorting dialog.
  	 * Use option [locale.modalDialogCaptionButtonAsc](ui.iggridsorting#options:locale.modalDialogCaptionButtonAsc).
  	 */
  var modalDialogCaptionButtonAsc: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for each descending sorted column in multiple sorting dialog.
  	 * Use option [locale.modalDialogCaptionButtonDesc](ui.iggridsorting#options:locale.modalDialogCaptionButtonDesc).
  	 */
  var modalDialogCaptionButtonDesc: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for unsort button in multiple sorting dialog.
  	 * Use option [locale.modalDialogCaptionButtonUnsort](ui.iggridsorting#options:locale.modalDialogCaptionButtonUnsort).
  	 */
  var modalDialogCaptionButtonUnsort: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption text for multiple sorting dialog.
  	 * Use option [locale.modalDialogCaptionText](ui.iggridsorting#options:locale.modalDialogCaptionText).
  	 */
  var modalDialogCaptionText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event fired after the modal dialog has been closed.
  	 */
  var modalDialogClosed: js.UndefOr[ModalDialogClosedEvent] = js.undefined
  /**
  	 * Event fired before the modal dialog is closed.
  	 */
  var modalDialogClosing: js.UndefOr[ModalDialogClosingEvent] = js.undefined
  /**
  	 * Event fired after the contents of the modal dialog are rendered.
  	 */
  var modalDialogContentsRendered: js.UndefOr[ModalDialogContentsRenderedEvent] = js.undefined
  /**
  	 * Event fired before the contents of the modal dialog are rendered.
  	 */
  var modalDialogContentsRendering: js.UndefOr[ModalDialogContentsRenderingEvent] = js.undefined
  /**
  	 * Specifies height of multiple sorting dialog.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget height can be set in pixels (px) and percentage (%).
  	 * "number" The widget height can be set in pixels as a number.
  	 */
  var modalDialogHeight: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Event fired every time the modal dialog changes its position.
  	 */
  var modalDialogMoving: js.UndefOr[ModalDialogMovingEvent] = js.undefined
  /**
  	 * Event fired after the modal dialog is already opened.
  	 */
  var modalDialogOpened: js.UndefOr[ModalDialogOpenedEvent] = js.undefined
  /**
  	 * Event fired before the modal dialog is opened.
  	 */
  var modalDialogOpening: js.UndefOr[ModalDialogOpeningEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies reset button text in multiple sorting dialog.
  	 * Use option [locale.modalDialogResetButton](ui.iggridsorting#options:locale.modalDialogResetButton).
  	 */
  var modalDialogResetButtonLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies sortby button text for each unsorted column in multiple sorting dialog.
  	 * Use option [locale.modalDialogSortByButtonText](ui.iggridsorting#options:locale.modalDialogSortByButtonText).
  	 */
  var modalDialogSortByButtonText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event fired when column(which is not sorted) is clicked to be sorted in modal dialog
  	 */
  var modalDialogSortClick: js.UndefOr[ModalDialogSortClickEvent] = js.undefined
  /**
  	 * Specifies whether sorting to be applied immediately when click sort/unsort columns when using the multiple sorting dialog. When it is false Apply button shows and sorting is applied when the button is clicked.
  	 *
  	 */
  var modalDialogSortOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Event fired when sorting of column is changed in modal dialog. Column should be sorted
  	 */
  var modalDialogSortingChanged: js.UndefOr[ModalDialogSortingChangedEvent] = js.undefined
  /**
  	 * Specifies width of multiple sorting dialog.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specifies the width in pixels as a string ("300px").
  	 * "number" Specifies the width in pixels as a number (300)
  	 */
  var modalDialogWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Defines single column sorting or multiple column sorting.
  	 *
  	 *
  	 * Valid values:
  	 * "single" Only a single column can be sorted. Previously sorted columns will not preserve their sorting upon sorting a new column.
  	 * "multi" If enabled, previous sorted state for columns won't be cleared
  	 */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Enables/disables sorting persistence when the grid is rebound.
  	 *
  	 */
  var persist: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * URL param name which specifies how sorting expressions will be encoded in the URL. Uses OData conventions. ex: ?sort(col1)=asc
  	 *
  	 */
  var sortUrlKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * URL param value for ascending type of sorting. Uses OData conventions. Example: ?sort(col1)=asc
  	 *
  	 */
  var sortUrlKeyAscValue: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * URL param value for descending type of sorting. Uses OData conventions. Example: ?sort(col1)=desc
  	 *
  	 */
  var sortUrlKeyDescValue: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Controls containment behavior of multiple sorting dialog.
  	 *
  	 * owner  The multi sorting dialog will be draggable only in the grid area
  	 * window  The multi sorting dialog will be draggable in the whole window area
  	 */
  var sortingDialogContainment: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Defines local or remote sorting operations.
  	 *
  	 *
  	 * Valid values:
  	 * "remote" Sorting is performed remotely as a server-side operation.
  	 * "local" Sorting is performed locally by the [$.ig.DataSource](ig.datasource) component.
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Custom unsorted column tooltip in [igTemplating](http://www.igniteui.com/help/igtemplating-overview) format.
  	 * Use option [locale.unsortedColumnTooltip](ui.iggridsorting#options:locale.unsortedColumnTooltip).
  	 */
  var unsortedColumnTooltip: js.UndefOr[java.lang.String] = js.undefined
}

