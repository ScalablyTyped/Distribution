package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccordionEvents extends StObject {
  
  var activate: js.UndefOr[AccordionEvent] = js.undefined
  
  var beforeActivate: js.UndefOr[AccordionEvent] = js.undefined
  
  var create: js.UndefOr[AccordionEvent] = js.undefined
}
object AccordionEvents {
  
  inline def apply(): AccordionEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccordionEvents]
  }
  
  extension [Self <: AccordionEvents](x: Self) {
    
    inline def setActivate(value: (/* event */ JQueryEventObject, /* ui */ AccordionUIParams) => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction2(value))
    
    inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    inline def setBeforeActivate(value: (/* event */ JQueryEventObject, /* ui */ AccordionUIParams) => Unit): Self = StObject.set(x, "beforeActivate", js.Any.fromFunction2(value))
    
    inline def setBeforeActivateUndefined: Self = StObject.set(x, "beforeActivate", js.undefined)
    
    inline def setCreate(value: (/* event */ JQueryEventObject, /* ui */ AccordionUIParams) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
  }
}
