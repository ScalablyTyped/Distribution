package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
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
  implicit class TreeHierarchicalDataSourceSettingsOps[Self <: TreeHierarchicalDataSourceSettings] (val x: Self) extends AnyVal {
    
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
    def setTreeDS(value: TreeHierarchicalDataSourceSettingsTreeDS): Self = this.set("treeDS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreeDS: Self = this.set("treeDS", js.undefined)
  }
}
