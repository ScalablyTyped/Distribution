package typings.makeupExpander.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var autoCollapse: js.UndefOr[Boolean] = js.native
  
  var collapseOnClickOut: js.UndefOr[Boolean] = js.native
  
  var collapseOnFocusOut: js.UndefOr[Boolean] = js.native
  
  var collapseOnMouseOut: js.UndefOr[Boolean] = js.native
  
  var contentSelector: js.UndefOr[String] = js.native
  
  var expandOnClick: js.UndefOr[Boolean] = js.native
  
  var expandOnFocus: js.UndefOr[Boolean] = js.native
  
  var expandOnHover: js.UndefOr[Boolean] = js.native
  
  var expandedClass: js.UndefOr[String] = js.native
  
  var focusManagement: js.UndefOr[String | Null] = js.native
  
  var hostSelector: js.UndefOr[String] = js.native
  
  var simulateSpacebarClick: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAutoCollapse(value: Boolean): Self = this.set("autoCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCollapse: Self = this.set("autoCollapse", js.undefined)
    
    @scala.inline
    def setCollapseOnClickOut(value: Boolean): Self = this.set("collapseOnClickOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseOnClickOut: Self = this.set("collapseOnClickOut", js.undefined)
    
    @scala.inline
    def setCollapseOnFocusOut(value: Boolean): Self = this.set("collapseOnFocusOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseOnFocusOut: Self = this.set("collapseOnFocusOut", js.undefined)
    
    @scala.inline
    def setCollapseOnMouseOut(value: Boolean): Self = this.set("collapseOnMouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseOnMouseOut: Self = this.set("collapseOnMouseOut", js.undefined)
    
    @scala.inline
    def setContentSelector(value: String): Self = this.set("contentSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentSelector: Self = this.set("contentSelector", js.undefined)
    
    @scala.inline
    def setExpandOnClick(value: Boolean): Self = this.set("expandOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandOnClick: Self = this.set("expandOnClick", js.undefined)
    
    @scala.inline
    def setExpandOnFocus(value: Boolean): Self = this.set("expandOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandOnFocus: Self = this.set("expandOnFocus", js.undefined)
    
    @scala.inline
    def setExpandOnHover(value: Boolean): Self = this.set("expandOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandOnHover: Self = this.set("expandOnHover", js.undefined)
    
    @scala.inline
    def setExpandedClass(value: String): Self = this.set("expandedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandedClass: Self = this.set("expandedClass", js.undefined)
    
    @scala.inline
    def setFocusManagement(value: String): Self = this.set("focusManagement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusManagement: Self = this.set("focusManagement", js.undefined)
    
    @scala.inline
    def setFocusManagementNull: Self = this.set("focusManagement", null)
    
    @scala.inline
    def setHostSelector(value: String): Self = this.set("hostSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostSelector: Self = this.set("hostSelector", js.undefined)
    
    @scala.inline
    def setSimulateSpacebarClick(value: Boolean): Self = this.set("simulateSpacebarClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimulateSpacebarClick: Self = this.set("simulateSpacebarClick", js.undefined)
  }
}
