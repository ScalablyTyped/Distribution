package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabsActivationUIParams extends StObject {
  
  var newPanel: JQuery
  
  var newTab: JQuery
  
  var oldPanel: JQuery
  
  var oldTab: JQuery
}
object TabsActivationUIParams {
  
  inline def apply(newPanel: JQuery, newTab: JQuery, oldPanel: JQuery, oldTab: JQuery): TabsActivationUIParams = {
    val __obj = js.Dynamic.literal(newPanel = newPanel.asInstanceOf[js.Any], newTab = newTab.asInstanceOf[js.Any], oldPanel = oldPanel.asInstanceOf[js.Any], oldTab = oldTab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsActivationUIParams]
  }
  
  extension [Self <: TabsActivationUIParams](x: Self) {
    
    inline def setNewPanel(value: JQuery): Self = StObject.set(x, "newPanel", value.asInstanceOf[js.Any])
    
    inline def setNewTab(value: JQuery): Self = StObject.set(x, "newTab", value.asInstanceOf[js.Any])
    
    inline def setOldPanel(value: JQuery): Self = StObject.set(x, "oldPanel", value.asInstanceOf[js.Any])
    
    inline def setOldTab(value: JQuery): Self = StObject.set(x, "oldTab", value.asInstanceOf[js.Any])
  }
}
