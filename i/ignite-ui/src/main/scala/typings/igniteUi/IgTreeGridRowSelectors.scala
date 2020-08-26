package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var checkBoxMode: js.UndefOr[String] = js.native
  /**
    * Event fired after a row selector checkbox had changed state.
    */
  var checkBoxStateChanged: js.UndefOr[CheckBoxStateChangedEvent] = js.native
  /**
    * Event fired when a row selector checkbox is changing.
    */
  var checkBoxStateChanging: js.UndefOr[CheckBoxStateChangingEvent] = js.native
  /**
    * Custom template for "deselect all" overlay with paging
    * Element with attribute data-rs-deselect-all is used for sellecting all the records
    * Element with attribute data-rs-close-all is used for closing the overlay
    * The default template is "<div class='ui-widget-header ui-priority-secondary' tabindex='0'><div>You have deselected ${unchecked} records. <a href='#' tabindex='0' data-rs-deselect-all>Deselect all ${totalRecordsCount} records</a><div style='float:right;'><span data-rs-close-all class='ui-icon-close ui-icon ui-button' tabindex='0'></div></span></div></div>"
    * There is also ${allCheckedRecords} parameter which is not used in the default template, but it represents the checked records from all pages.
    *
    */
  var deselectAllForPagingTemplate: js.UndefOr[String] = js.native
  /**
    * Determines whether the row selectors column should contain checkboxes
    *
    */
  var enableCheckBoxes: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether the row selectors column should contain row numbering
    *
    */
  var enableRowNumbering: js.UndefOr[Boolean] = js.native
  /**
    * Enables/disables showing an overlay after clicking on the header checkbox, which allows selecting all records from all pages.
    *
    */
  var enableSelectAllForPaging: js.UndefOr[Boolean] = js.native
  /**
    * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[IgGridRowSelectorsLocale] = js.native
  /**
    * Determines whether the selection feature is required for the row selectors. If set to "false"
    * the widget will not check for Selection availability. If set to "true" an exception will be thrown if Selection is
    * not available.
    *
    */
  var requireSelection: js.UndefOr[Boolean] = js.native
  /**
    * The seed to be added to the default numbering
    *
    */
  var rowNumberingSeed: js.UndefOr[Double] = js.native
  /**
    * Event fired after a row selector is clicked.
    */
  var rowSelectorClicked: js.UndefOr[RowSelectorClickedEvent] = js.native
  /**
    * defines width of the row selector`s column in pixels or percentage.
    *
    *
    * Valid values:
    * "string" The row selector column width can be set in pixels (px) and percentage (%)
    * "number" The row selector width can be set as a number
    * "null" will let the feature decide the best width depending on enabled contents
    */
  var rowSelectorColumnWidth: js.UndefOr[String | Double] = js.native
  /**
    * Determines row numbering format.
    *
    *
    * Valid values:
    * "sequential" Defines numbering format to be the index of the visible records.
    * "hierarchical" Defines numbering format to be concatenation of the parent and children indexes.
    */
  var rowSelectorNumberingMode: js.UndefOr[String] = js.native
  /**
    * Custom template for "select all" overlay with paging
    * Element with attribute data-rs-select-all is used for sellecting all the records
    * Element with attribute data-rs-close-all is used for closing the overlay
    * The default template is "<div class='ui-widget-header ui-priority-secondary' tabindex='0'><div>You have selected ${checked} records. <a href='#' tabindex='0' data-rs-select-all>Select all ${totalRecordsCount} records</a><div style='float:right;'><span data-rs-close-all class='ui-icon-close ui-icon ui-button' tabindex='0'></div></span></div></div>"
    * There is also ${allCheckedRecords} parameter which is not used in the default template, but it represents the checked records from all pages.
    *
    */
  var selectAllForPagingTemplate: js.UndefOr[String] = js.native
  /**
    * Determines whether checkboxes will be shown only if row selectors are on focus/selected.
    *
    */
  var showCheckBoxesOnFocus: js.UndefOr[Boolean] = js.native
}

object IgTreeGridRowSelectors {
  @scala.inline
  def apply(): IgTreeGridRowSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridRowSelectors]
  }
  @scala.inline
  implicit class IgTreeGridRowSelectorsOps[Self <: IgTreeGridRowSelectors] (val x: Self) extends AnyVal {
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
    def setCheckBoxMode(value: String): Self = this.set("checkBoxMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckBoxMode: Self = this.set("checkBoxMode", js.undefined)
    @scala.inline
    def setCheckBoxStateChanged(value: (/* event */ Event, /* ui */ CheckBoxStateChangedEventUIParam) => Unit): Self = this.set("checkBoxStateChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCheckBoxStateChanged: Self = this.set("checkBoxStateChanged", js.undefined)
    @scala.inline
    def setCheckBoxStateChanging(value: (/* event */ Event, /* ui */ CheckBoxStateChangingEventUIParam) => Unit): Self = this.set("checkBoxStateChanging", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCheckBoxStateChanging: Self = this.set("checkBoxStateChanging", js.undefined)
    @scala.inline
    def setDeselectAllForPagingTemplate(value: String): Self = this.set("deselectAllForPagingTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeselectAllForPagingTemplate: Self = this.set("deselectAllForPagingTemplate", js.undefined)
    @scala.inline
    def setEnableCheckBoxes(value: Boolean): Self = this.set("enableCheckBoxes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableCheckBoxes: Self = this.set("enableCheckBoxes", js.undefined)
    @scala.inline
    def setEnableRowNumbering(value: Boolean): Self = this.set("enableRowNumbering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRowNumbering: Self = this.set("enableRowNumbering", js.undefined)
    @scala.inline
    def setEnableSelectAllForPaging(value: Boolean): Self = this.set("enableSelectAllForPaging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSelectAllForPaging: Self = this.set("enableSelectAllForPaging", js.undefined)
    @scala.inline
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInherit: Self = this.set("inherit", js.undefined)
    @scala.inline
    def setLocale(value: IgGridRowSelectorsLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setRequireSelection(value: Boolean): Self = this.set("requireSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireSelection: Self = this.set("requireSelection", js.undefined)
    @scala.inline
    def setRowNumberingSeed(value: Double): Self = this.set("rowNumberingSeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowNumberingSeed: Self = this.set("rowNumberingSeed", js.undefined)
    @scala.inline
    def setRowSelectorClicked(value: (/* event */ Event, /* ui */ RowSelectorClickedEventUIParam) => Unit): Self = this.set("rowSelectorClicked", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRowSelectorClicked: Self = this.set("rowSelectorClicked", js.undefined)
    @scala.inline
    def setRowSelectorColumnWidth(value: String | Double): Self = this.set("rowSelectorColumnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSelectorColumnWidth: Self = this.set("rowSelectorColumnWidth", js.undefined)
    @scala.inline
    def setRowSelectorNumberingMode(value: String): Self = this.set("rowSelectorNumberingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSelectorNumberingMode: Self = this.set("rowSelectorNumberingMode", js.undefined)
    @scala.inline
    def setSelectAllForPagingTemplate(value: String): Self = this.set("selectAllForPagingTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectAllForPagingTemplate: Self = this.set("selectAllForPagingTemplate", js.undefined)
    @scala.inline
    def setShowCheckBoxesOnFocus(value: Boolean): Self = this.set("showCheckBoxesOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCheckBoxesOnFocus: Self = this.set("showCheckBoxesOnFocus", js.undefined)
  }
  
}

