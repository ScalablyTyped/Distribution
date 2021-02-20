package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridCellMergingColumnSetting
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Column index. This is a required property in every column setting if columnKey is not set.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.native
  
  /**
    * Column key. This is a required property in every column setting if columnIndex is not set.
    *
    */
  var columnKey: js.UndefOr[String] = js.native
  
  /**
    * Defines when merging should be applied.
    *
    *
    * Valid values:
    * "sorting" The column will only be merged when sorted
    * "always" The column will always be merged
    * "never" No merging will be applied
    */
  var mergeOn: js.UndefOr[String] = js.native
  
  /**
    * Defines the rules merging is based on.
    *
    *
    * Valid values:
    * "duplicate" Duplicate values in the column will be merged together.
    * "null" Merging will be applied for each subsequent null value after a non-null value.
    */
  var mergeStrategy: js.UndefOr[String | js.Function] = js.native
}
object IgGridCellMergingColumnSetting {
  
  @scala.inline
  def apply(): IgGridCellMergingColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridCellMergingColumnSetting]
  }
  
  @scala.inline
  implicit class IgGridCellMergingColumnSettingMutableBuilder[Self <: IgGridCellMergingColumnSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    @scala.inline
    def setMergeOn(value: String): Self = StObject.set(x, "mergeOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeOnUndefined: Self = StObject.set(x, "mergeOn", js.undefined)
    
    @scala.inline
    def setMergeStrategy(value: String | js.Function): Self = StObject.set(x, "mergeStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeStrategyUndefined: Self = StObject.set(x, "mergeStrategy", js.undefined)
  }
}
