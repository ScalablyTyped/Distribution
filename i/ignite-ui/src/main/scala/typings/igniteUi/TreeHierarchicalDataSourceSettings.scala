package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeHierarchicalDataSourceSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Configure tree datasource specific settings
    */
  var treeDS: js.UndefOr[TreeHierarchicalDataSourceSettingsTreeDS] = js.native
}
object TreeHierarchicalDataSourceSettings {
  
  @scala.inline
  def apply(): TreeHierarchicalDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeHierarchicalDataSourceSettings]
  }
  
  @scala.inline
  implicit class TreeHierarchicalDataSourceSettingsMutableBuilder[Self <: TreeHierarchicalDataSourceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTreeDS(value: TreeHierarchicalDataSourceSettingsTreeDS): Self = StObject.set(x, "treeDS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeDSUndefined: Self = StObject.set(x, "treeDS", js.undefined)
  }
}
