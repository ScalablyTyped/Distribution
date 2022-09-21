package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridColumnFixing
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
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
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  
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
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  
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
object IgGridColumnFixing {
  
  inline def apply(): IgGridColumnFixing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridColumnFixing]
  }
  
  extension [Self <: IgGridColumnFixing](x: Self) {
    
    inline def setColumnFixed(value: (/* event */ Event, /* ui */ ColumnFixedEventUIParam) => Unit): Self = StObject.set(x, "columnFixed", js.Any.fromFunction2(value))
    
    inline def setColumnFixedUndefined: Self = StObject.set(x, "columnFixed", js.undefined)
    
    inline def setColumnFixing(value: (/* event */ Event, /* ui */ ColumnFixingEventUIParam) => Unit): Self = StObject.set(x, "columnFixing", js.Any.fromFunction2(value))
    
    inline def setColumnFixingRefused(value: (/* event */ Event, /* ui */ ColumnFixingRefusedEventUIParam) => Unit): Self = StObject.set(x, "columnFixingRefused", js.Any.fromFunction2(value))
    
    inline def setColumnFixingRefusedUndefined: Self = StObject.set(x, "columnFixingRefused", js.undefined)
    
    inline def setColumnFixingUndefined: Self = StObject.set(x, "columnFixing", js.undefined)
    
    inline def setColumnSettings(value: js.Array[IgGridColumnFixingColumnSetting]): Self = StObject.set(x, "columnSettings", value.asInstanceOf[js.Any])
    
    inline def setColumnSettingsUndefined: Self = StObject.set(x, "columnSettings", js.undefined)
    
    inline def setColumnSettingsVarargs(value: IgGridColumnFixingColumnSetting*): Self = StObject.set(x, "columnSettings", js.Array(value*))
    
    inline def setColumnUnfixed(value: (/* event */ Event, /* ui */ ColumnUnfixedEventUIParam) => Unit): Self = StObject.set(x, "columnUnfixed", js.Any.fromFunction2(value))
    
    inline def setColumnUnfixedUndefined: Self = StObject.set(x, "columnUnfixed", js.undefined)
    
    inline def setColumnUnfixing(value: (/* event */ Event, /* ui */ ColumnUnfixingEventUIParam) => Unit): Self = StObject.set(x, "columnUnfixing", js.Any.fromFunction2(value))
    
    inline def setColumnUnfixingRefused(value: (/* event */ Event, /* ui */ ColumnUnfixingRefusedEventUIParam) => Unit): Self = StObject.set(x, "columnUnfixingRefused", js.Any.fromFunction2(value))
    
    inline def setColumnUnfixingRefusedUndefined: Self = StObject.set(x, "columnUnfixingRefused", js.undefined)
    
    inline def setColumnUnfixingUndefined: Self = StObject.set(x, "columnUnfixing", js.undefined)
    
    inline def setFeatureChooserTextFixedColumn(value: String): Self = StObject.set(x, "featureChooserTextFixedColumn", value.asInstanceOf[js.Any])
    
    inline def setFeatureChooserTextFixedColumnUndefined: Self = StObject.set(x, "featureChooserTextFixedColumn", js.undefined)
    
    inline def setFeatureChooserTextUnfixedColumn(value: String): Self = StObject.set(x, "featureChooserTextUnfixedColumn", value.asInstanceOf[js.Any])
    
    inline def setFeatureChooserTextUnfixedColumnUndefined: Self = StObject.set(x, "featureChooserTextUnfixedColumn", js.undefined)
    
    inline def setFixNondataColumns(value: Boolean): Self = StObject.set(x, "fixNondataColumns", value.asInstanceOf[js.Any])
    
    inline def setFixNondataColumnsUndefined: Self = StObject.set(x, "fixNondataColumns", js.undefined)
    
    inline def setFixingDirection(value: String): Self = StObject.set(x, "fixingDirection", value.asInstanceOf[js.Any])
    
    inline def setFixingDirectionUndefined: Self = StObject.set(x, "fixingDirection", js.undefined)
    
    inline def setHeaderFixButtonText(value: String): Self = StObject.set(x, "headerFixButtonText", value.asInstanceOf[js.Any])
    
    inline def setHeaderFixButtonTextUndefined: Self = StObject.set(x, "headerFixButtonText", js.undefined)
    
    inline def setHeaderUnfixButtonText(value: String): Self = StObject.set(x, "headerUnfixButtonText", value.asInstanceOf[js.Any])
    
    inline def setHeaderUnfixButtonTextUndefined: Self = StObject.set(x, "headerUnfixButtonText", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: IgGridColumnFixingLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMinimalVisibleAreaWidth(value: String | Double): Self = StObject.set(x, "minimalVisibleAreaWidth", value.asInstanceOf[js.Any])
    
    inline def setMinimalVisibleAreaWidthUndefined: Self = StObject.set(x, "minimalVisibleAreaWidth", js.undefined)
    
    inline def setPopulateDataRowsAttributes(value: Boolean): Self = StObject.set(x, "populateDataRowsAttributes", value.asInstanceOf[js.Any])
    
    inline def setPopulateDataRowsAttributesUndefined: Self = StObject.set(x, "populateDataRowsAttributes", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setScrollDelta(value: Double): Self = StObject.set(x, "scrollDelta", value.asInstanceOf[js.Any])
    
    inline def setScrollDeltaUndefined: Self = StObject.set(x, "scrollDelta", js.undefined)
    
    inline def setShowFixButtons(value: Boolean): Self = StObject.set(x, "showFixButtons", value.asInstanceOf[js.Any])
    
    inline def setShowFixButtonsUndefined: Self = StObject.set(x, "showFixButtons", js.undefined)
    
    inline def setSyncRowHeights(value: Boolean): Self = StObject.set(x, "syncRowHeights", value.asInstanceOf[js.Any])
    
    inline def setSyncRowHeightsUndefined: Self = StObject.set(x, "syncRowHeights", js.undefined)
  }
}
