package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgHierarchicalGridColumnGroupOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Sets whether expansion indicators are visible in the group header.
    *
    */
  var allowGroupCollapsing: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets whether the group is expanded or collapsed. Applied only if the allowGroupCollapsing is set to true.
    *
    */
  var expanded: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets when should the group be hidden. Applied only if the allowGroupCollapsing is set to true.
    *
    *
    * Valid values:
    * "never" never hide the group
    * "always" always hide the group
    * "parentcollapsed" hide the group when its parent group is collapsed
    * "parentexpanded" hide the group when its parent group is expanded
    */
  var hidden: js.UndefOr[String] = js.native
}
object IgHierarchicalGridColumnGroupOptions {
  
  @scala.inline
  def apply(): IgHierarchicalGridColumnGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgHierarchicalGridColumnGroupOptions]
  }
  
  @scala.inline
  implicit class IgHierarchicalGridColumnGroupOptionsOps[Self <: IgHierarchicalGridColumnGroupOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowGroupCollapsing(value: Boolean): Self = this.set("allowGroupCollapsing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowGroupCollapsing: Self = this.set("allowGroupCollapsing", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
  }
}
