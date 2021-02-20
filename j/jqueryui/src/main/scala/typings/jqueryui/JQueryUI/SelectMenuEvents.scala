package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectMenuEvents extends StObject {
  
  var change: js.UndefOr[SelectMenuEvent] = js.native
  
  var close: js.UndefOr[SelectMenuEvent] = js.native
  
  var create: js.UndefOr[SelectMenuEvent] = js.native
  
  var focus: js.UndefOr[SelectMenuEvent] = js.native
  
  var open: js.UndefOr[SelectMenuEvent] = js.native
  
  var select: js.UndefOr[SelectMenuEvent] = js.native
}
object SelectMenuEvents {
  
  @scala.inline
  def apply(): SelectMenuEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectMenuEvents]
  }
  
  @scala.inline
  implicit class SelectMenuEventsMutableBuilder[Self <: SelectMenuEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setClose(value: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit): Self = StObject.set(x, "close", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setFocus(value: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setOpen(value: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit): Self = StObject.set(x, "open", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setSelect(value: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
