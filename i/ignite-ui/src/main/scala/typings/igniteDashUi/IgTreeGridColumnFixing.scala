package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridColumnFixing
  extends /**
	 * Option for igTreeGridColumnFixing
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Event which is fired when column fixing operation is finished
  	 */
  var columnFixed: js.UndefOr[ColumnFixedEvent] = js.undefined
  /**
  	 * Event which is fired when column fixing operation is initiated.
  	 */
  var columnFixing: js.UndefOr[ColumnFixingEvent] = js.undefined
  /**
  	 * Event which is fired when column fixing operation has failed - e.g. sum of the width of the fixed columns container and width of the column to be fixed exceeds the grid width
  	 */
  var columnFixingRefused: js.UndefOr[ColumnFixingRefusedEvent] = js.undefined
  /**
  	 * List of column settings that specifies custom column fixing options on a per column basis.
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[IgGridColumnFixingColumnSetting]] = js.undefined
  /**
  	 * Event which is fired when column unfixing operation is done
  	 */
  var columnUnfixed: js.UndefOr[ColumnUnfixedEvent] = js.undefined
  /**
  	 * Event which is fired when column unfixing operation is initiated
  	 */
  var columnUnfixing: js.UndefOr[ColumnUnfixingEvent] = js.undefined
  /**
  	 * Event which is fired when column unfixing operation has failed - e.g.: there is only one fixed visible column(and tries to unfix it) and at least one fixed hidden column
  	 */
  var columnUnfixingRefused: js.UndefOr[ColumnUnfixingRefusedEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 *                 Text of the feature chooser button for unfixing a currently fixed column. Use option [locale.featureChooserTextFixedColumn](ui.iggridcolumnfixing#options:locale.featureChooserTextFixedColumn).
  	 */
  var featureChooserTextFixedColumn: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 *                 Text of the feature chooser button for unfixing a currently fixed column. Use option [locale.featureChooserTextUnfixedColumn](ui.iggridcolumnfixing#options:locale.featureChooserTextUnfixedColumn).
  	 */
  var featureChooserTextUnfixedColumn: js.UndefOr[String] = js.undefined
  /**
  	 * Specify initial fixing of all non data columns. Non-data columns are columns in the grid rendered for specific features, like the row selectors feature. The column containing the row numbering is such a column. This option is applicable when [fixingDirection](ui.iggridcolumnfixing#options:fixingDirection) is set to left. For a full column fixing configuration summary please refer to [this topic](http://www.igniteui.com/help/iggrid-columnfixing-configuring#configuration-summary).
  	 *
  	 */
  var fixNondataColumns: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Configures which side the fixed columns of the grid will be rendered on. Check [this topic](http://www.igniteui.com/help/iggrid-columnfixing-configuring#direction) out of more information.
  	 *
  	 *
  	 * Valid values:
  	 * "left" Fixed columns are rendered on the left side of the main grid.
  	 * "right" Fixed columns are rendered on the right side of the main grid.
  	 */
  var fixingDirection: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 *             Specifies the tooltip text on the column fixing header icon when column is not fixed. Use option [locale.headerFixButtonText](ui.iggridcolumnfixing#options:locale.headerFixButtonText).
  	 */
  var headerFixButtonText: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 *                 Specifies the tooltip text on the column fixing header icon when column is fixed. Use option [locale.headerUnfixButtonText](ui.iggridcolumnfixing#options:locale.headerUnfixButtonText).
  	 */
  var headerUnfixButtonText: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[IgGridColumnFixingLocale] = js.undefined
  /**
  	 * Minimal visible area in pixels for the unfixed columns. If the end user tries to fix a column(or columns), which causes the width of the fixed columns to grow such that the width of visible area of unfixed columns is less than this option then fixing will be canceled. Check [this topic](http://www.igniteui.com/help/iggrid-columnfixing-configuring#non-fixable-min-width) out for more information.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The width can be set in pixels (px) and percentage (%).
  	 * "number" The width can be set in pixels as a number.
  	 */
  var minimalVisibleAreaWidth: js.UndefOr[String | Double] = js.undefined
  /**
  	 * When true all the TR DOM attributes of the unfixed row will be copied to the fixed row. Note that when enabled this option negatively affects performance when fixing a column.
  	 */
  var populateDataRowsAttributes: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Scroll delta in pixels when scrolling with the mouse wheel or the keyboard in the fixed columns area of the grid.
  	 *
  	 */
  var scrollDelta: js.UndefOr[Double] = js.undefined
  /**
  	 * Specifies whether to show the column fixing buttons in header cells/feature chooser.
  	 *
  	 */
  var showFixButtons: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Enable row height sync for the fixed and unfixed portion of the grid. If you're observing row misalignment, please refer to [this article](http://www.igniteui.com/help/iggrid-known-issues#misalignment-ie9).
  	 *
  	 */
  var syncRowHeights: js.UndefOr[Boolean] = js.undefined
}

object IgTreeGridColumnFixing {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igTreeGridColumnFixing
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    columnFixed: (/* event */ Event, /* ui */ ColumnFixedEventUIParam) => Unit = null,
    columnFixing: (/* event */ Event, /* ui */ ColumnFixingEventUIParam) => Unit = null,
    columnFixingRefused: (/* event */ Event, /* ui */ ColumnFixingRefusedEventUIParam) => Unit = null,
    columnSettings: js.Array[IgGridColumnFixingColumnSetting] = null,
    columnUnfixed: (/* event */ Event, /* ui */ ColumnUnfixedEventUIParam) => Unit = null,
    columnUnfixing: (/* event */ Event, /* ui */ ColumnUnfixingEventUIParam) => Unit = null,
    columnUnfixingRefused: (/* event */ Event, /* ui */ ColumnUnfixingRefusedEventUIParam) => Unit = null,
    featureChooserTextFixedColumn: String = null,
    featureChooserTextUnfixedColumn: String = null,
    fixNondataColumns: js.UndefOr[Boolean] = js.undefined,
    fixingDirection: String = null,
    headerFixButtonText: String = null,
    headerUnfixButtonText: String = null,
    locale: IgGridColumnFixingLocale = null,
    minimalVisibleAreaWidth: String | Double = null,
    populateDataRowsAttributes: js.UndefOr[Boolean] = js.undefined,
    scrollDelta: Int | Double = null,
    showFixButtons: js.UndefOr[Boolean] = js.undefined,
    syncRowHeights: js.UndefOr[Boolean] = js.undefined
  ): IgTreeGridColumnFixing = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (columnFixed != null) __obj.updateDynamic("columnFixed")(js.Any.fromFunction2(columnFixed))
    if (columnFixing != null) __obj.updateDynamic("columnFixing")(js.Any.fromFunction2(columnFixing))
    if (columnFixingRefused != null) __obj.updateDynamic("columnFixingRefused")(js.Any.fromFunction2(columnFixingRefused))
    if (columnSettings != null) __obj.updateDynamic("columnSettings")(columnSettings)
    if (columnUnfixed != null) __obj.updateDynamic("columnUnfixed")(js.Any.fromFunction2(columnUnfixed))
    if (columnUnfixing != null) __obj.updateDynamic("columnUnfixing")(js.Any.fromFunction2(columnUnfixing))
    if (columnUnfixingRefused != null) __obj.updateDynamic("columnUnfixingRefused")(js.Any.fromFunction2(columnUnfixingRefused))
    if (featureChooserTextFixedColumn != null) __obj.updateDynamic("featureChooserTextFixedColumn")(featureChooserTextFixedColumn)
    if (featureChooserTextUnfixedColumn != null) __obj.updateDynamic("featureChooserTextUnfixedColumn")(featureChooserTextUnfixedColumn)
    if (!js.isUndefined(fixNondataColumns)) __obj.updateDynamic("fixNondataColumns")(fixNondataColumns)
    if (fixingDirection != null) __obj.updateDynamic("fixingDirection")(fixingDirection)
    if (headerFixButtonText != null) __obj.updateDynamic("headerFixButtonText")(headerFixButtonText)
    if (headerUnfixButtonText != null) __obj.updateDynamic("headerUnfixButtonText")(headerUnfixButtonText)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (minimalVisibleAreaWidth != null) __obj.updateDynamic("minimalVisibleAreaWidth")(minimalVisibleAreaWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(populateDataRowsAttributes)) __obj.updateDynamic("populateDataRowsAttributes")(populateDataRowsAttributes)
    if (scrollDelta != null) __obj.updateDynamic("scrollDelta")(scrollDelta.asInstanceOf[js.Any])
    if (!js.isUndefined(showFixButtons)) __obj.updateDynamic("showFixButtons")(showFixButtons)
    if (!js.isUndefined(syncRowHeights)) __obj.updateDynamic("syncRowHeights")(syncRowHeights)
    __obj.asInstanceOf[IgTreeGridColumnFixing]
  }
}

