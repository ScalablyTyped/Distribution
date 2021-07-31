package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipEvents extends StObject {
  
  var close: js.UndefOr[TooltipEvent] = js.undefined
  
  var open: js.UndefOr[TooltipEvent] = js.undefined
}
object TooltipEvents {
  
  @scala.inline
  def apply(): TooltipEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipEvents]
  }
  
  @scala.inline
  implicit class TooltipEventsMutableBuilder[Self <: TooltipEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: (/* event */ JQueryEventObject, /* ui */ TooltipUIParams) => Unit): Self = StObject.set(x, "close", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setOpen(value: (/* event */ JQueryEventObject, /* ui */ TooltipUIParams) => Unit): Self = StObject.set(x, "open", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
