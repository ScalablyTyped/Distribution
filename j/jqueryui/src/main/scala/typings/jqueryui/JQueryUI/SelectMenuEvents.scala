package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectMenuEvents extends StObject {
  
  var change: js.UndefOr[SelectMenuEvent] = js.undefined
  
  var close: js.UndefOr[SelectMenuEvent] = js.undefined
  
  var create: js.UndefOr[SelectMenuEvent] = js.undefined
  
  var focus: js.UndefOr[SelectMenuEvent] = js.undefined
  
  var open: js.UndefOr[SelectMenuEvent] = js.undefined
  
  var select: js.UndefOr[SelectMenuEvent] = js.undefined
}
object SelectMenuEvents {
  
  inline def apply(): SelectMenuEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectMenuEvents]
  }
  
  extension [Self <: SelectMenuEvents](x: Self) {
    
    inline def setChange(value: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setClose(value: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit): Self = StObject.set(x, "close", js.Any.fromFunction2(value))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setCreate(value: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setFocus(value: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setOpen(value: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit): Self = StObject.set(x, "open", js.Any.fromFunction2(value))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setSelect(value: (/* event */ JQueryEventObject, /* ui */ SelectMenuUIParams) => Unit): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
