package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccordionUIParams extends StObject {
  
  var newHeader: JQuery = js.native
  
  var newPanel: JQuery = js.native
  
  var oldHeader: JQuery = js.native
  
  var oldPanel: JQuery = js.native
}
object AccordionUIParams {
  
  @scala.inline
  def apply(newHeader: JQuery, newPanel: JQuery, oldHeader: JQuery, oldPanel: JQuery): AccordionUIParams = {
    val __obj = js.Dynamic.literal(newHeader = newHeader.asInstanceOf[js.Any], newPanel = newPanel.asInstanceOf[js.Any], oldHeader = oldHeader.asInstanceOf[js.Any], oldPanel = oldPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionUIParams]
  }
  
  @scala.inline
  implicit class AccordionUIParamsMutableBuilder[Self <: AccordionUIParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewHeader(value: JQuery): Self = StObject.set(x, "newHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPanel(value: JQuery): Self = StObject.set(x, "newPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldHeader(value: JQuery): Self = StObject.set(x, "oldHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldPanel(value: JQuery): Self = StObject.set(x, "oldPanel", value.asInstanceOf[js.Any])
  }
}
