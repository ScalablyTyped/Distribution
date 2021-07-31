package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridCellMerging
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var cellsMerged: js.UndefOr[CellsMergedEvent] = js.undefined
  
  /**
    * Event fired before a new merged cells group is created.
    */
  var cellsMerging: js.UndefOr[CellsMergingEvent] = js.undefined
  
  /**
    * A list of column settings that specifies hiding options on a per column basis.
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridCellMergingColumnSetting]] = js.undefined
  
  /**
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Defines when merging should be applied.
    *
    *
    * Valid values:
    * "sorting" Only sorted columns will have merging applied
    * "always" Merging will be applied to all columns always
    * "never" No merging will be applied
    */
  var mergeOn: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the whether the rows will be merged or not.
    *
    */
  var mergeRows: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Defines the rules merging is based on.
    *
    *
    * Valid values:
    * "duplicate" Duplicate values in the column will be merged together.
    * "null" Merging will be applied for each subsequent null value after a non-null value.
    */
  var mergeStrategy: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Defines the type of merging.
    *
    *
    * Valid values:
    * "visual" the grid cells will be merged only visually
    * "physical" the grid cell will be merged physically throughout rowspan
    */
  var mergeType: js.UndefOr[String] = js.undefined
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * Defines the rules merging is based on.
    *
    *
    * Valid values:
    * "duplicate" Duplicate values in the column will be merged together.
    * "null" Merging will be applied for each subsequent null value after a non-null value.
    */
  var rowMergeStrategy: js.UndefOr[String | js.Function] = js.undefined
}
object IgGridCellMerging {
  
  @scala.inline
  def apply(): IgGridCellMerging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridCellMerging]
  }
  
  @scala.inline
  implicit class IgGridCellMergingMutableBuilder[Self <: IgGridCellMerging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellsMerged(value: (/* event */ Event, /* ui */ CellsMergedEventUIParam) => Unit): Self = StObject.set(x, "cellsMerged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCellsMergedUndefined: Self = StObject.set(x, "cellsMerged", js.undefined)
    
    @scala.inline
    def setCellsMerging(value: (/* event */ Event, /* ui */ CellsMergingEventUIParam) => Unit): Self = StObject.set(x, "cellsMerging", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCellsMergingUndefined: Self = StObject.set(x, "cellsMerging", js.undefined)
    
    @scala.inline
    def setColumnSettings(value: js.Array[IgGridCellMergingColumnSetting]): Self = StObject.set(x, "columnSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSettingsUndefined: Self = StObject.set(x, "columnSettings", js.undefined)
    
    @scala.inline
    def setColumnSettingsVarargs(value: IgGridCellMergingColumnSetting*): Self = StObject.set(x, "columnSettings", js.Array(value :_*))
    
    @scala.inline
    def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMergeOn(value: String): Self = StObject.set(x, "mergeOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeOnUndefined: Self = StObject.set(x, "mergeOn", js.undefined)
    
    @scala.inline
    def setMergeRows(value: js.Any): Self = StObject.set(x, "mergeRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeRowsUndefined: Self = StObject.set(x, "mergeRows", js.undefined)
    
    @scala.inline
    def setMergeStrategy(value: String | js.Function): Self = StObject.set(x, "mergeStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeStrategyUndefined: Self = StObject.set(x, "mergeStrategy", js.undefined)
    
    @scala.inline
    def setMergeType(value: String): Self = StObject.set(x, "mergeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeTypeUndefined: Self = StObject.set(x, "mergeType", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setRowMergeStrategy(value: String | js.Function): Self = StObject.set(x, "rowMergeStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowMergeStrategyUndefined: Self = StObject.set(x, "rowMergeStrategy", js.undefined)
  }
}
