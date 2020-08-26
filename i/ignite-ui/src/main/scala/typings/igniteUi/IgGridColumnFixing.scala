package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridColumnFixing
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Event which is fired when column fixing operation is finished
    */
  var columnFixed: js.UndefOr[ColumnFixedEvent] = js.native
  /**
    * Event which is fired when column fixing operation is initiated.
    */
  var columnFixing: js.UndefOr[ColumnFixingEvent] = js.native
  /**
    * Event which is fired when column fixing operation has failed - e.g. sum of the width of the fixed columns container and width of the column to be fixed exceeds the grid width
    */
  var columnFixingRefused: js.UndefOr[ColumnFixingRefusedEvent] = js.native
  /**
    * List of column settings that specifies custom column fixing options on a per column basis.
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridColumnFixingColumnSetting]] = js.native
  /**
    * Event which is fired when column unfixing operation is done
    */
  var columnUnfixed: js.UndefOr[ColumnUnfixedEvent] = js.native
  /**
    * Event which is fired when column unfixing operation is initiated
    */
  var columnUnfixing: js.UndefOr[ColumnUnfixingEvent] = js.native
  /**
    * Event which is fired when column unfixing operation has failed - e.g.: there is only one fixed visible column(and tries to unfix it) and at least one fixed hidden column
    */
  var columnUnfixingRefused: js.UndefOr[ColumnUnfixingRefusedEvent] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    *                 Text of the feature chooser button for unfixing a currently fixed column. Use option [locale.featureChooserTextFixedColumn](ui.iggridcolumnfixing#options:locale.featureChooserTextFixedColumn).
    */
  var featureChooserTextFixedColumn: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    *                 Text of the feature chooser button for unfixing a currently fixed column. Use option [locale.featureChooserTextUnfixedColumn](ui.iggridcolumnfixing#options:locale.featureChooserTextUnfixedColumn).
    */
  var featureChooserTextUnfixedColumn: js.UndefOr[String] = js.native
  /**
    * Specify initial fixing of all non data columns. Non-data columns are columns in the grid rendered for specific features, like the row selectors feature. The column containing the row numbering is such a column. This option is applicable when [fixingDirection](ui.iggridcolumnfixing#options:fixingDirection) is set to left. For a full column fixing configuration summary please refer to [this topic](http://www.igniteui.com/help/iggrid-columnfixing-configuring#configuration-summary).
    *
    */
  var fixNondataColumns: js.UndefOr[Boolean] = js.native
  /**
    * Configures which side the fixed columns of the grid will be rendered on. Check [this topic](http://www.igniteui.com/help/iggrid-columnfixing-configuring#direction) out of more information.
    *
    *
    * Valid values:
    * "left" Fixed columns are rendered on the left side of the main grid.
    * "right" Fixed columns are rendered on the right side of the main grid.
    */
  var fixingDirection: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    *             Specifies the tooltip text on the column fixing header icon when column is not fixed. Use option [locale.headerFixButtonText](ui.iggridcolumnfixing#options:locale.headerFixButtonText).
    */
  var headerFixButtonText: js.UndefOr[String] = js.native
  /**
    * This option has been removed as of 2017.2 Volume release.
    *                 Specifies the tooltip text on the column fixing header icon when column is fixed. Use option [locale.headerUnfixButtonText](ui.iggridcolumnfixing#options:locale.headerUnfixButtonText).
    */
  var headerUnfixButtonText: js.UndefOr[String] = js.native
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  var locale: js.UndefOr[IgGridColumnFixingLocale] = js.native
  /**
    * Minimal visible area in pixels for the unfixed columns. If the end user tries to fix a column(or columns), which causes the width of the fixed columns to grow such that the width of visible area of unfixed columns is less than this option then fixing will be canceled. Check [this topic](http://www.igniteui.com/help/iggrid-columnfixing-configuring#non-fixable-min-width) out for more information.
    *
    *
    * Valid values:
    * "string" The width can be set in pixels (px) and percentage (%).
    * "number" The width can be set in pixels as a number.
    */
  var minimalVisibleAreaWidth: js.UndefOr[String | Double] = js.native
  /**
    * When true all the TR DOM attributes of the unfixed row will be copied to the fixed row. Note that when enabled this option negatively affects performance when fixing a column.
    */
  var populateDataRowsAttributes: js.UndefOr[Boolean] = js.native
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
    * Scroll delta in pixels when scrolling with the mouse wheel or the keyboard in the fixed columns area of the grid.
    *
    */
  var scrollDelta: js.UndefOr[Double] = js.native
  /**
    * Specifies whether to show the column fixing buttons in header cells/feature chooser.
    *
    */
  var showFixButtons: js.UndefOr[Boolean] = js.native
  /**
    * Enable row height sync for the fixed and unfixed portion of the grid. If you're observing row misalignment, please refer to [this article](http://www.igniteui.com/help/iggrid-known-issues#misalignment-ie9).
    *
    */
  var syncRowHeights: js.UndefOr[Boolean] = js.native
}

object IgGridColumnFixing {
  @scala.inline
  def apply(): IgGridColumnFixing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridColumnFixing]
  }
  @scala.inline
  implicit class IgGridColumnFixingOps[Self <: IgGridColumnFixing] (val x: Self) extends AnyVal {
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
    def setColumnFixed(value: (/* event */ Event, /* ui */ ColumnFixedEventUIParam) => Unit): Self = this.set("columnFixed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnFixed: Self = this.set("columnFixed", js.undefined)
    @scala.inline
    def setColumnFixing(value: (/* event */ Event, /* ui */ ColumnFixingEventUIParam) => Unit): Self = this.set("columnFixing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnFixing: Self = this.set("columnFixing", js.undefined)
    @scala.inline
    def setColumnFixingRefused(value: (/* event */ Event, /* ui */ ColumnFixingRefusedEventUIParam) => Unit): Self = this.set("columnFixingRefused", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnFixingRefused: Self = this.set("columnFixingRefused", js.undefined)
    @scala.inline
    def setColumnSettingsVarargs(value: IgGridColumnFixingColumnSetting*): Self = this.set("columnSettings", js.Array(value :_*))
    @scala.inline
    def setColumnSettings(value: js.Array[IgGridColumnFixingColumnSetting]): Self = this.set("columnSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSettings: Self = this.set("columnSettings", js.undefined)
    @scala.inline
    def setColumnUnfixed(value: (/* event */ Event, /* ui */ ColumnUnfixedEventUIParam) => Unit): Self = this.set("columnUnfixed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnUnfixed: Self = this.set("columnUnfixed", js.undefined)
    @scala.inline
    def setColumnUnfixing(value: (/* event */ Event, /* ui */ ColumnUnfixingEventUIParam) => Unit): Self = this.set("columnUnfixing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnUnfixing: Self = this.set("columnUnfixing", js.undefined)
    @scala.inline
    def setColumnUnfixingRefused(value: (/* event */ Event, /* ui */ ColumnUnfixingRefusedEventUIParam) => Unit): Self = this.set("columnUnfixingRefused", js.Any.fromFunction2(value))
    @scala.inline
    def deleteColumnUnfixingRefused: Self = this.set("columnUnfixingRefused", js.undefined)
    @scala.inline
    def setFeatureChooserTextFixedColumn(value: String): Self = this.set("featureChooserTextFixedColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureChooserTextFixedColumn: Self = this.set("featureChooserTextFixedColumn", js.undefined)
    @scala.inline
    def setFeatureChooserTextUnfixedColumn(value: String): Self = this.set("featureChooserTextUnfixedColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureChooserTextUnfixedColumn: Self = this.set("featureChooserTextUnfixedColumn", js.undefined)
    @scala.inline
    def setFixNondataColumns(value: Boolean): Self = this.set("fixNondataColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixNondataColumns: Self = this.set("fixNondataColumns", js.undefined)
    @scala.inline
    def setFixingDirection(value: String): Self = this.set("fixingDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixingDirection: Self = this.set("fixingDirection", js.undefined)
    @scala.inline
    def setHeaderFixButtonText(value: String): Self = this.set("headerFixButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderFixButtonText: Self = this.set("headerFixButtonText", js.undefined)
    @scala.inline
    def setHeaderUnfixButtonText(value: String): Self = this.set("headerUnfixButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderUnfixButtonText: Self = this.set("headerUnfixButtonText", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLocale(value: IgGridColumnFixingLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMinimalVisibleAreaWidth(value: String | Double): Self = this.set("minimalVisibleAreaWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimalVisibleAreaWidth: Self = this.set("minimalVisibleAreaWidth", js.undefined)
    @scala.inline
    def setPopulateDataRowsAttributes(value: Boolean): Self = this.set("populateDataRowsAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopulateDataRowsAttributes: Self = this.set("populateDataRowsAttributes", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setScrollDelta(value: Double): Self = this.set("scrollDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollDelta: Self = this.set("scrollDelta", js.undefined)
    @scala.inline
    def setShowFixButtons(value: Boolean): Self = this.set("showFixButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFixButtons: Self = this.set("showFixButtons", js.undefined)
    @scala.inline
    def setSyncRowHeights(value: Boolean): Self = this.set("syncRowHeights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncRowHeights: Self = this.set("syncRowHeights", js.undefined)
  }
  
}

