package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsActivationUIParams extends js.Object {
  
  var newPanel: JQuery = js.native
  
  var newTab: JQuery = js.native
  
  var oldPanel: JQuery = js.native
  
  var oldTab: JQuery = js.native
}
object TabsActivationUIParams {
  
  @scala.inline
  def apply(newPanel: JQuery, newTab: JQuery, oldPanel: JQuery, oldTab: JQuery): TabsActivationUIParams = {
    val __obj = js.Dynamic.literal(newPanel = newPanel.asInstanceOf[js.Any], newTab = newTab.asInstanceOf[js.Any], oldPanel = oldPanel.asInstanceOf[js.Any], oldTab = oldTab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsActivationUIParams]
  }
  
  @scala.inline
  implicit class TabsActivationUIParamsOps[Self <: TabsActivationUIParams] (val x: Self) extends AnyVal {
    
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
    def setNewPanel(value: JQuery): Self = this.set("newPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTab(value: JQuery): Self = this.set("newTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldPanel(value: JQuery): Self = this.set("oldPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldTab(value: JQuery): Self = this.set("oldTab", value.asInstanceOf[js.Any])
  }
}
