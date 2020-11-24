package typings.jqueryMmenu.JQueryMmenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassnamesConfigurations extends js.Object {
  
  /**
    * The classname on a LI that should be displayed as a divider.
    * Default: "Divider"
    */
  var divider: js.UndefOr[String] = js.native
  
  /**
    * The classname on a submenu (a nested UL) that should be displayed as a default list.
    * Default: "Inset"
    */
  var inset: js.UndefOr[String] = js.native
  
  /**
    * The classname on an element (for example a DIV) that should be considered to be a panel.
    * Only applies if the "isMenu" option is set to false.
    * Default: "Panel"
    */
  var panel: js.UndefOr[String] = js.native
  
  /**
    * The classname on the LI that should be displayed as selected.
    * Default: "Selected"
    */
  var selected: js.UndefOr[String] = js.native
  
  /**
    * The classname on a submenu (a nested UL) that should expand below
    * their parent instead of slide in from the right.
    * Default: "vertical"
    */
  var vertical: js.UndefOr[String] = js.native
}
object ClassnamesConfigurations {
  
  @scala.inline
  def apply(): ClassnamesConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassnamesConfigurations]
  }
  
  @scala.inline
  implicit class ClassnamesConfigurationsOps[Self <: ClassnamesConfigurations] (val x: Self) extends AnyVal {
    
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
    def setDivider(value: String): Self = this.set("divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivider: Self = this.set("divider", js.undefined)
    
    @scala.inline
    def setInset(value: String): Self = this.set("inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
    
    @scala.inline
    def setPanel(value: String): Self = this.set("panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanel: Self = this.set("panel", js.undefined)
    
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setVertical(value: String): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
