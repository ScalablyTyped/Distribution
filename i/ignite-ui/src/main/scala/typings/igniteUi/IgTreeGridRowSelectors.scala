package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridRowSelectors
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets the type of checkboxes rendered in the row selector. Can be set only at initialization.
    *
    *
    * Valid values:
    * "biState" Checkboxes are rendered and support two states(checked and unchecked). Checkboxes do not cascade down or up in this mode.
    * "triState" Checkboxes are rendered and support three states(checked, partial and unchecked). Checkboxes cascade up and down in this mode.
    */
  var checkBoxMode: js.UndefOr[String] = js.undefined
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
  var deselectAllForPagingTemplate: js.UndefOr[String] = js.undefined
  /**
    * Determines whether the row selectors column should contain checkboxes
    *
    */
  var enableCheckBoxes: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines whether the row selectors column should contain row numbering
    *
    */
  var enableRowNumbering: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables/disables showing an overlay after clicking on the header checkbox, which allows selecting all records from all pages.
    *
    */
  var enableSelectAllForPaging: js.UndefOr[Boolean] = js.undefined
  /**
    * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[IgGridRowSelectorsLocale] = js.undefined
  /**
    * Determines whether the selection feature is required for the row selectors. If set to "false"
    * the widget will not check for Selection availability. If set to "true" an exception will be thrown if Selection is
    * not available.
    *
    */
  var requireSelection: js.UndefOr[Boolean] = js.undefined
  /**
    * The seed to be added to the default numbering
    *
    */
  var rowNumberingSeed: js.UndefOr[Double] = js.undefined
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
  var rowSelectorColumnWidth: js.UndefOr[String | Double] = js.undefined
  /**
    * Determines row numbering format.
    *
    *
    * Valid values:
    * "sequential" Defines numbering format to be the index of the visible records.
    * "hierarchical" Defines numbering format to be concatenation of the parent and children indexes.
    */
  var rowSelectorNumberingMode: js.UndefOr[String] = js.undefined
  /**
    * Custom template for "select all" overlay with paging
    * Element with attribute data-rs-select-all is used for sellecting all the records
    * Element with attribute data-rs-close-all is used for closing the overlay
    * The default template is "<div class='ui-widget-header ui-priority-secondary' tabindex='0'><div>You have selected ${checked} records. <a href='#' tabindex='0' data-rs-select-all>Select all ${totalRecordsCount} records</a><div style='float:right;'><span data-rs-close-all class='ui-icon-close ui-icon ui-button' tabindex='0'></div></span></div></div>"
    * There is also ${allCheckedRecords} parameter which is not used in the default template, but it represents the checked records from all pages.
    *
    */
  var selectAllForPagingTemplate: js.UndefOr[String] = js.undefined
  /**
    * Determines whether checkboxes will be shown only if row selectors are on focus/selected.
    *
    */
  var showCheckBoxesOnFocus: js.UndefOr[Boolean] = js.undefined
}

object IgTreeGridRowSelectors {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    checkBoxMode: String = null,
    checkBoxStateChanged: (/* event */ Event, /* ui */ CheckBoxStateChangedEventUIParam) => Unit = null,
    checkBoxStateChanging: (/* event */ Event, /* ui */ CheckBoxStateChangingEventUIParam) => Unit = null,
    deselectAllForPagingTemplate: String = null,
    enableCheckBoxes: js.UndefOr[Boolean] = js.undefined,
    enableRowNumbering: js.UndefOr[Boolean] = js.undefined,
    enableSelectAllForPaging: js.UndefOr[Boolean] = js.undefined,
    inherit: js.UndefOr[Boolean] = js.undefined,
    locale: IgGridRowSelectorsLocale = null,
    requireSelection: js.UndefOr[Boolean] = js.undefined,
    rowNumberingSeed: js.UndefOr[Double] = js.undefined,
    rowSelectorClicked: (/* event */ Event, /* ui */ RowSelectorClickedEventUIParam) => Unit = null,
    rowSelectorColumnWidth: String | Double = null,
    rowSelectorNumberingMode: String = null,
    selectAllForPagingTemplate: String = null,
    showCheckBoxesOnFocus: js.UndefOr[Boolean] = js.undefined
  ): IgTreeGridRowSelectors = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (checkBoxMode != null) __obj.updateDynamic("checkBoxMode")(checkBoxMode.asInstanceOf[js.Any])
    if (checkBoxStateChanged != null) __obj.updateDynamic("checkBoxStateChanged")(js.Any.fromFunction2(checkBoxStateChanged))
    if (checkBoxStateChanging != null) __obj.updateDynamic("checkBoxStateChanging")(js.Any.fromFunction2(checkBoxStateChanging))
    if (deselectAllForPagingTemplate != null) __obj.updateDynamic("deselectAllForPagingTemplate")(deselectAllForPagingTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCheckBoxes)) __obj.updateDynamic("enableCheckBoxes")(enableCheckBoxes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowNumbering)) __obj.updateDynamic("enableRowNumbering")(enableRowNumbering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSelectAllForPaging)) __obj.updateDynamic("enableSelectAllForPaging")(enableSelectAllForPaging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(requireSelection)) __obj.updateDynamic("requireSelection")(requireSelection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowNumberingSeed)) __obj.updateDynamic("rowNumberingSeed")(rowNumberingSeed.get.asInstanceOf[js.Any])
    if (rowSelectorClicked != null) __obj.updateDynamic("rowSelectorClicked")(js.Any.fromFunction2(rowSelectorClicked))
    if (rowSelectorColumnWidth != null) __obj.updateDynamic("rowSelectorColumnWidth")(rowSelectorColumnWidth.asInstanceOf[js.Any])
    if (rowSelectorNumberingMode != null) __obj.updateDynamic("rowSelectorNumberingMode")(rowSelectorNumberingMode.asInstanceOf[js.Any])
    if (selectAllForPagingTemplate != null) __obj.updateDynamic("selectAllForPagingTemplate")(selectAllForPagingTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(showCheckBoxesOnFocus)) __obj.updateDynamic("showCheckBoxesOnFocus")(showCheckBoxesOnFocus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTreeGridRowSelectors]
  }
}

