package typings.jqueryui.JQueryUI

import typings.jquery.JQueryXHR
import typings.jqueryui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsBeforeLoadUIParams extends StObject {
  
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
  implicit class TabsBeforeLoadUIParamsMutableBuilder[Self <: TabsBeforeLoadUIParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAjaxSettings(value: js.Any): Self = StObject.set(x, "ajaxSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJqXHR(value: JQueryXHR): Self = StObject.set(x, "jqXHR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanel(value: JQuery): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab(value: JQuery): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
