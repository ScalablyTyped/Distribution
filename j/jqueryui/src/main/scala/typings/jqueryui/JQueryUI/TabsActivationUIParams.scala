package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsActivationUIParams extends StObject {
  
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
  implicit class TabsActivationUIParamsMutableBuilder[Self <: TabsActivationUIParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewPanel(value: JQuery): Self = StObject.set(x, "newPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTab(value: JQuery): Self = StObject.set(x, "newTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldPanel(value: JQuery): Self = StObject.set(x, "oldPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldTab(value: JQuery): Self = StObject.set(x, "oldTab", value.asInstanceOf[js.Any])
  }
}
