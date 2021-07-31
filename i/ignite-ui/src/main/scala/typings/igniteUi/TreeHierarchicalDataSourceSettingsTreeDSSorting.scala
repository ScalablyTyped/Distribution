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
/* optionName */ StringDictionary[js.Any] {
  
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
  
  @scala.inline
  def apply(): TreeHierarchicalDataSourceSettingsTreeDSSorting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeHierarchicalDataSourceSettingsTreeDSSorting]
  }
  
  @scala.inline
  implicit class TreeHierarchicalDataSourceSettingsTreeDSSortingMutableBuilder[Self <: TreeHierarchicalDataSourceSettingsTreeDSSorting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromLevel(value: Double): Self = StObject.set(x, "fromLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromLevelUndefined: Self = StObject.set(x, "fromLevel", js.undefined)
    
    @scala.inline
    def setToLevel(value: Double): Self = StObject.set(x, "toLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToLevelUndefined: Self = StObject.set(x, "toLevel", js.undefined)
  }
}
