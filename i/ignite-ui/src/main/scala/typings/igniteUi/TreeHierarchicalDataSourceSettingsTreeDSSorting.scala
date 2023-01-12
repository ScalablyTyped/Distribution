package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeHierarchicalDataSourceSettingsTreeDSSorting
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Specifies from which data bound level to be applied sorting - 0 is the first level
    */
  var fromLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies to which data bound level to be applied sorting - if -1 sorting should be applied to the last data bound level
    */
  var toLevel: js.UndefOr[Double] = js.undefined
}
object TreeHierarchicalDataSourceSettingsTreeDSSorting {
  
  inline def apply(): TreeHierarchicalDataSourceSettingsTreeDSSorting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeHierarchicalDataSourceSettingsTreeDSSorting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeHierarchicalDataSourceSettingsTreeDSSorting] (val x: Self) extends AnyVal {
    
    inline def setFromLevel(value: Double): Self = StObject.set(x, "fromLevel", value.asInstanceOf[js.Any])
    
    inline def setFromLevelUndefined: Self = StObject.set(x, "fromLevel", js.undefined)
    
    inline def setToLevel(value: Double): Self = StObject.set(x, "toLevel", value.asInstanceOf[js.Any])
    
    inline def setToLevelUndefined: Self = StObject.set(x, "toLevel", js.undefined)
  }
}
