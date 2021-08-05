package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridCellMergingColumnSetting
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Column index. This is a required property in every column setting if columnKey is not set.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Column key. This is a required property in every column setting if columnIndex is not set.
    *
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * Defines when merging should be applied.
    *
    *
    * Valid values:
    * "sorting" The column will only be merged when sorted
    * "always" The column will always be merged
    * "never" No merging will be applied
    */
  var mergeOn: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the rules merging is based on.
    *
    *
    * Valid values:
    * "duplicate" Duplicate values in the column will be merged together.
    * "null" Merging will be applied for each subsequent null value after a non-null value.
    */
  var mergeStrategy: js.UndefOr[String | js.Function] = js.undefined
}
object IgGridCellMergingColumnSetting {
  
  inline def apply(): IgGridCellMergingColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridCellMergingColumnSetting]
  }
  
  extension [Self <: IgGridCellMergingColumnSetting](x: Self) {
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    inline def setMergeOn(value: String): Self = StObject.set(x, "mergeOn", value.asInstanceOf[js.Any])
    
    inline def setMergeOnUndefined: Self = StObject.set(x, "mergeOn", js.undefined)
    
    inline def setMergeStrategy(value: String | js.Function): Self = StObject.set(x, "mergeStrategy", value.asInstanceOf[js.Any])
    
    inline def setMergeStrategyUndefined: Self = StObject.set(x, "mergeStrategy", js.undefined)
  }
}
