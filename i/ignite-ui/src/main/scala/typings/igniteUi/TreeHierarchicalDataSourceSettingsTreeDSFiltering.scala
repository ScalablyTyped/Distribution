package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeHierarchicalDataSourceSettingsTreeDSFiltering
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * If displayMode is showWithAncestorsAndDescendants, show all records that match filtering conditions and their child records, even if child records don't match filtering conditions. If displayMode is showWithAncestors show only those records that match filtering conditions and do not show child records(if any) that don't match filtering conditions
    */
  var displayMode: js.UndefOr[js.Any] = js.native
  
  /**
    * Specifies from which data bound level to be applied filtering - 0 is the first level
    */
  var fromLevel: js.UndefOr[Double] = js.native
  
  /**
    * Filtering data source specific property - name of property in dataRecord object - indicates whether dataRow matches filtering conditions. It is used ONLY when filtering is applied.
    */
  var matchFiltering: js.UndefOr[String] = js.native
  
  /**
    * Specifies to which data bound level to be applied filtering - if -1 filtering should be applied to the last data bound level
    */
  var toLevel: js.UndefOr[Double] = js.native
}
object TreeHierarchicalDataSourceSettingsTreeDSFiltering {
  
  @scala.inline
  def apply(): TreeHierarchicalDataSourceSettingsTreeDSFiltering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeHierarchicalDataSourceSettingsTreeDSFiltering]
  }
  
  @scala.inline
  implicit class TreeHierarchicalDataSourceSettingsTreeDSFilteringOps[Self <: TreeHierarchicalDataSourceSettingsTreeDSFiltering] (val x: Self) extends AnyVal {
    
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
    def setDisplayMode(value: js.Any): Self = this.set("displayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayMode: Self = this.set("displayMode", js.undefined)
    
    @scala.inline
    def setFromLevel(value: Double): Self = this.set("fromLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromLevel: Self = this.set("fromLevel", js.undefined)
    
    @scala.inline
    def setMatchFiltering(value: String): Self = this.set("matchFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchFiltering: Self = this.set("matchFiltering", js.undefined)
    
    @scala.inline
    def setToLevel(value: Double): Self = this.set("toLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToLevel: Self = this.set("toLevel", js.undefined)
  }
}
