package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeHierarchicalDataSourceSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Configure tree datasource specific settings
    */
  var treeDS: js.UndefOr[TreeHierarchicalDataSourceSettingsTreeDS] = js.undefined
}
object TreeHierarchicalDataSourceSettings {
  
  inline def apply(): TreeHierarchicalDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeHierarchicalDataSourceSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeHierarchicalDataSourceSettings] (val x: Self) extends AnyVal {
    
    inline def setTreeDS(value: TreeHierarchicalDataSourceSettingsTreeDS): Self = StObject.set(x, "treeDS", value.asInstanceOf[js.Any])
    
    inline def setTreeDSUndefined: Self = StObject.set(x, "treeDS", js.undefined)
  }
}
