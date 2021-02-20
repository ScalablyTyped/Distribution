package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccordionEvents extends StObject {
  
  var activate: js.UndefOr[AccordionEvent] = js.native
  
  var beforeActivate: js.UndefOr[AccordionEvent] = js.native
  
  var create: js.UndefOr[AccordionEvent] = js.native
}
object AccordionEvents {
  
  @scala.inline
  def apply(): AccordionEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccordionEvents]
  }
  
  @scala.inline
  implicit class AccordionEventsMutableBuilder[Self <: AccordionEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: (/* event */ JQueryEventObject, /* ui */ AccordionUIParams) => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    @scala.inline
    def setBeforeActivate(value: (/* event */ JQueryEventObject, /* ui */ AccordionUIParams) => Unit): Self = StObject.set(x, "beforeActivate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeActivateUndefined: Self = StObject.set(x, "beforeActivate", js.undefined)
    
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, /* ui */ AccordionUIParams) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
  }
}
