package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridCellMerging
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var cellsMerged: js.UndefOr[CellsMergedEvent] = js.native
  
  /**
    * Event fired before a new merged cells group is created.
    */
  var cellsMerging: js.UndefOr[CellsMergingEvent] = js.native
  
  /**
    * A list of column settings that specifies hiding options on a per column basis.
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridCellMergingColumnSetting]] = js.native
  
  /**
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  
  /**
    * Defines when merging should be applied.
    *
    *
    * Valid values:
    * "sorting" Only sorted columns will have merging applied
    * "always" Merging will be applied to all columns always
    * "never" No merging will be applied
    */
  var mergeOn: js.UndefOr[String] = js.native
  
  /**
    * Defines the whether the rows will be merged or not.
    *
    */
  var mergeRows: js.UndefOr[js.Any] = js.native
  
  /**
    * Defines the rules merging is based on.
    *
    *
    * Valid values:
    * "duplicate" Duplicate values in the column will be merged together.
    * "null" Merging will be applied for each subsequent null value after a non-null value.
    */
  var mergeStrategy: js.UndefOr[String | js.Function] = js.native
  
  /**
    * Defines the type of merging.
    *
    *
    * Valid values:
    * "visual" the grid cells will be merged only visually
    * "physical" the grid cell will be merged physically throughout rowspan
    */
  var mergeType: js.UndefOr[String] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Defines the rules merging is based on.
    *
    *
    * Valid values:
    * "duplicate" Duplicate values in the column will be merged together.
    * "null" Merging will be applied for each subsequent null value after a non-null value.
    */
  var rowMergeStrategy: js.UndefOr[String | js.Function] = js.native
}
object IgGridCellMerging {
  
  @scala.inline
  def apply(): IgGridCellMerging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridCellMerging]
  }
  
  @scala.inline
  implicit class IgGridCellMergingOps[Self <: IgGridCellMerging] (val x: Self) extends AnyVal {
    
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
    def setCellsMerged(value: (/* event */ Event, /* ui */ CellsMergedEventUIParam) => Unit): Self = this.set("cellsMerged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCellsMerged: Self = this.set("cellsMerged", js.undefined)
    
    @scala.inline
    def setCellsMerging(value: (/* event */ Event, /* ui */ CellsMergingEventUIParam) => Unit): Self = this.set("cellsMerging", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCellsMerging: Self = this.set("cellsMerging", js.undefined)
    
    @scala.inline
    def setColumnSettingsVarargs(value: IgGridCellMergingColumnSetting*): Self = this.set("columnSettings", js.Array(value :_*))
    
    @scala.inline
    def setColumnSettings(value: js.Array[IgGridCellMergingColumnSetting]): Self = this.set("columnSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnSettings: Self = this.set("columnSettings", js.undefined)
    
    @scala.inline
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInherit: Self = this.set("inherit", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMergeOn(value: String): Self = this.set("mergeOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeOn: Self = this.set("mergeOn", js.undefined)
    
    @scala.inline
    def setMergeRows(value: js.Any): Self = this.set("mergeRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeRows: Self = this.set("mergeRows", js.undefined)
    
    @scala.inline
    def setMergeStrategy(value: String | js.Function): Self = this.set("mergeStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeStrategy: Self = this.set("mergeStrategy", js.undefined)
    
    @scala.inline
    def setMergeType(value: String): Self = this.set("mergeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeType: Self = this.set("mergeType", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    
    @scala.inline
    def setRowMergeStrategy(value: String | js.Function): Self = this.set("rowMergeStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowMergeStrategy: Self = this.set("rowMergeStrategy", js.undefined)
  }
}
