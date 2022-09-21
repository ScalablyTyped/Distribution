package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotViewPivotGridOptionsLevelSortDirection
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Specifies the unique name of the level, which will be sorted.
    */
  var levelUniqueName: js.UndefOr[String] = js.undefined
  
  /**
    * optional="true" Specifies the sort direction. If no direction is specified,the level is going to be sorted in the direction specified by the firstLevelSortDirection option.
    *
    */
  var sortDirection: js.UndefOr[Any] = js.undefined
}
object IgPivotViewPivotGridOptionsLevelSortDirection {
  
  inline def apply(): IgPivotViewPivotGridOptionsLevelSortDirection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewPivotGridOptionsLevelSortDirection]
  }
  
  extension [Self <: IgPivotViewPivotGridOptionsLevelSortDirection](x: Self) {
    
    inline def setLevelUniqueName(value: String): Self = StObject.set(x, "levelUniqueName", value.asInstanceOf[js.Any])
    
    inline def setLevelUniqueNameUndefined: Self = StObject.set(x, "levelUniqueName", js.undefined)
    
    inline def setSortDirection(value: Any): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
    
    inline def setSortDirectionUndefined: Self = StObject.set(x, "sortDirection", js.undefined)
  }
}
