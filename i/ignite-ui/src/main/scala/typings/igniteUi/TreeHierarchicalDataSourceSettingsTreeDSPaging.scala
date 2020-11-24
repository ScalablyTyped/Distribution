package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeHierarchicalDataSourceSettingsTreeDSPaging
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * When data flows to the next page there are a couple of different modes that can help communicate the context of a leaf level row. When mode option is 'rootLevelOnly' then the context row always shows the value of the contextRowRootText option.
    *
    *
    * Valid values:
    * "none" Does not render the contextual row
    * "parent" Renders a read-only representation of the immediate parent row
    * "breadcrumb" Renders a read-only breadcrumb trail representing the full path through all ancestors
    */
  var contextRowMode: js.UndefOr[String] = js.native
  
  /**
    * Sets gets paging mode.
    *
    * Valid values:
    * "allLevels" includes all visible records in paging.
    */
  var mode: js.UndefOr[String] = js.native
}
object TreeHierarchicalDataSourceSettingsTreeDSPaging {
  
  @scala.inline
  def apply(): TreeHierarchicalDataSourceSettingsTreeDSPaging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeHierarchicalDataSourceSettingsTreeDSPaging]
  }
  
  @scala.inline
  implicit class TreeHierarchicalDataSourceSettingsTreeDSPagingOps[Self <: TreeHierarchicalDataSourceSettingsTreeDSPaging] (val x: Self) extends AnyVal {
    
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
    def setContextRowMode(value: String): Self = this.set("contextRowMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextRowMode: Self = this.set("contextRowMode", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
