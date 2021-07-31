package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeHierarchicalDataSourceSettingsTreeDSPaging
  extends StObject
     with /**
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
  var contextRowMode: js.UndefOr[String] = js.undefined
  
  /**
    * Sets gets paging mode.
    *
    * Valid values:
    * "allLevels" includes all visible records in paging.
    */
  var mode: js.UndefOr[String] = js.undefined
}
object TreeHierarchicalDataSourceSettingsTreeDSPaging {
  
  @scala.inline
  def apply(): TreeHierarchicalDataSourceSettingsTreeDSPaging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeHierarchicalDataSourceSettingsTreeDSPaging]
  }
  
  @scala.inline
  implicit class TreeHierarchicalDataSourceSettingsTreeDSPagingMutableBuilder[Self <: TreeHierarchicalDataSourceSettingsTreeDSPaging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextRowMode(value: String): Self = StObject.set(x, "contextRowMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextRowModeUndefined: Self = StObject.set(x, "contextRowMode", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
