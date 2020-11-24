package typings.jqueryui.JQueryUI

import typings.jquery.JQueryXHR
import typings.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsBeforeLoadUIParams extends js.Object {
  
  var ajaxSettings: js.Any = js.native
  
  var jqXHR: JQueryXHR = js.native
  
  var panel: JQuery = js.native
  
  var tab: JQuery = js.native
}
object TabsBeforeLoadUIParams {
  
  @scala.inline
  def apply(ajaxSettings: js.Any, jqXHR: JQueryXHR, panel: JQuery, tab: JQuery): TabsBeforeLoadUIParams = {
    val __obj = js.Dynamic.literal(ajaxSettings = ajaxSettings.asInstanceOf[js.Any], jqXHR = jqXHR.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsBeforeLoadUIParams]
  }
  
  @scala.inline
  implicit class TabsBeforeLoadUIParamsOps[Self <: TabsBeforeLoadUIParams] (val x: Self) extends AnyVal {
    
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
    def setAjaxSettings(value: js.Any): Self = this.set("ajaxSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJqXHR(value: JQueryXHR): Self = this.set("jqXHR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanel(value: JQuery): Self = this.set("panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab(value: JQuery): Self = this.set("tab", value.asInstanceOf[js.Any])
  }
}
