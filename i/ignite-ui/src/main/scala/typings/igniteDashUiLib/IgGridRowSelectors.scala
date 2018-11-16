package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgGridRowSelectors
  extends /**
	 * Option for igGridRowSelectors
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Event fired after a row selector checkbox had changed state.
  	 */
  var checkBoxStateChanged: js.UndefOr[CheckBoxStateChangedEvent] = js.undefined
  /**
  	 * Event fired when a row selector checkbox is changing.
  	 */
  var checkBoxStateChanging: js.UndefOr[CheckBoxStateChangingEvent] = js.undefined
  /**
  	 * Custom template for "deselect all" overlay with paging
  	 * Element with attribute data-rs-deselect-all is used for sellecting all the records
  	 * Element with attribute data-rs-close-all is used for closing the overlay
  	 * The default template is "<div class='ui-widget-header ui-priority-secondary' tabindex='0'><div>You have deselected ${unchecked} records. <a href='#' tabindex='0' data-rs-deselect-all>Deselect all ${totalRecordsCount} records</a><div style='float:right;'><span data-rs-close-all class='ui-icon-close ui-icon ui-button' tabindex='0'></div></span></div></div>"
  	 * There is also ${allCheckedRecords} parameter which is not used in the default template, but it represents the checked records from all pages.
  	 *
  	 */
  var deselectAllForPagingTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Determines whether the row selectors column should contain checkboxes
  	 *
  	 */
  var enableCheckBoxes: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Determines whether the row selectors column should contain row numbering
  	 *
  	 */
  var enableRowNumbering: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Enables/disables showing an overlay after clicking on the header checkbox, which allows selecting all records from all pages.
  	 *
  	 */
  var enableSelectAllForPaging: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
  	 */
  var inherit: js.UndefOr[scala.Boolean] = js.undefined
  var locale: js.UndefOr[IgGridRowSelectorsLocale] = js.undefined
  /**
  	 * Determines whether the selection feature is required for the row selectors. If set to "false"
  	 * the widget will not check for Selection availability. If set to "true" an exception will be thrown if Selection is
  	 * not available.
  	 *
  	 */
  var requireSelection: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The seed to be added to the default numbering
  	 *
  	 */
  var rowNumberingSeed: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Event fired after a row selector is clicked.
  	 */
  var rowSelectorClicked: js.UndefOr[RowSelectorClickedEvent] = js.undefined
  /**
  	 * defines width of the row selector`s column in pixels or percentage.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The row selector column width can be set in pixels (px) and percentage (%)
  	 * "number" The row selector width can be set as a number
  	 * "null" will let the feature decide the best width depending on enabled contents
  	 */
  var rowSelectorColumnWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Custom template for "select all" overlay with paging
  	 * Element with attribute data-rs-select-all is used for sellecting all the records
  	 * Element with attribute data-rs-close-all is used for closing the overlay
  	 * The default template is "<div class='ui-widget-header ui-priority-secondary' tabindex='0'><div>You have selected ${checked} records. <a href='#' tabindex='0' data-rs-select-all>Select all ${totalRecordsCount} records</a><div style='float:right;'><span data-rs-close-all class='ui-icon-close ui-icon ui-button' tabindex='0'></div></span></div></div>"
  	 * There is also ${allCheckedRecords} parameter which is not used in the default template, but it represents the checked records from all pages.
  	 *
  	 */
  var selectAllForPagingTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Determines whether checkboxes will be shown only if row selectors are on focus/selected.
  	 *
  	 */
  var showCheckBoxesOnFocus: js.UndefOr[scala.Boolean] = js.undefined
}

