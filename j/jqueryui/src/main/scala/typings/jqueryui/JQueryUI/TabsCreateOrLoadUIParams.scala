package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabsCreateOrLoadUIParams extends StObject {
  
  var panel: JQuery
  
  var tab: JQuery
}
object TabsCreateOrLoadUIParams {
  
  inline def apply(panel: JQuery, tab: JQuery): TabsCreateOrLoadUIParams = {
    val __obj = js.Dynamic.literal(panel = panel.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsCreateOrLoadUIParams]
  }
  
  extension [Self <: TabsCreateOrLoadUIParams](x: Self) {
    
    inline def setPanel(value: JQuery): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    inline def setTab(value: JQuery): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
