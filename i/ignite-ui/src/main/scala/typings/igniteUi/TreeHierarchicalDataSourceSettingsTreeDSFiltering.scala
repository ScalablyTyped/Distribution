package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeHierarchicalDataSourceSettingsTreeDSFiltering
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * If displayMode is showWithAncestorsAndDescendants, show all records that match filtering conditions and their child records, even if child records don't match filtering conditions. If displayMode is showWithAncestors show only those records that match filtering conditions and do not show child records(if any) that don't match filtering conditions
    */
  var displayMode: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies from which data bound level to be applied filtering - 0 is the first level
    */
  var fromLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * Filtering data source specific property - name of property in dataRecord object - indicates whether dataRow matches filtering conditions. It is used ONLY when filtering is applied.
    */
  var matchFiltering: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies to which data bound level to be applied filtering - if -1 filtering should be applied to the last data bound level
    */
  var toLevel: js.UndefOr[Double] = js.undefined
}
object TreeHierarchicalDataSourceSettingsTreeDSFiltering {
  
  inline def apply(): TreeHierarchicalDataSourceSettingsTreeDSFiltering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeHierarchicalDataSourceSettingsTreeDSFiltering]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeHierarchicalDataSourceSettingsTreeDSFiltering] (val x: Self) extends AnyVal {
    
    inline def setDisplayMode(value: Any): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    inline def setFromLevel(value: Double): Self = StObject.set(x, "fromLevel", value.asInstanceOf[js.Any])
    
    inline def setFromLevelUndefined: Self = StObject.set(x, "fromLevel", js.undefined)
    
    inline def setMatchFiltering(value: String): Self = StObject.set(x, "matchFiltering", value.asInstanceOf[js.Any])
    
    inline def setMatchFilteringUndefined: Self = StObject.set(x, "matchFiltering", js.undefined)
    
    inline def setToLevel(value: Double): Self = StObject.set(x, "toLevel", value.asInstanceOf[js.Any])
    
    inline def setToLevelUndefined: Self = StObject.set(x, "toLevel", js.undefined)
  }
}
