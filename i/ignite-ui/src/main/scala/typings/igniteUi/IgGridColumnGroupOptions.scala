package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridColumnGroupOptions
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
object IgGridColumnGroupOptions {
  
  @scala.inline
  def apply(): IgGridColumnGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridColumnGroupOptions]
  }
  
  @scala.inline
  implicit class IgGridColumnGroupOptionsMutableBuilder[Self <: IgGridColumnGroupOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowGroupCollapsing(value: Boolean): Self = StObject.set(x, "allowGroupCollapsing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowGroupCollapsingUndefined: Self = StObject.set(x, "allowGroupCollapsing", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    @scala.inline
    def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
  }
}
