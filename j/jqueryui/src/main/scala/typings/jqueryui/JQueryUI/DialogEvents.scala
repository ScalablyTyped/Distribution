package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogEvents extends StObject {
  
  var beforeClose: js.UndefOr[DialogEvent] = js.undefined
  
  var close: js.UndefOr[DialogEvent] = js.undefined
  
  var create: js.UndefOr[DialogEvent] = js.undefined
  
  var drag: js.UndefOr[DialogEvent] = js.undefined
  
  var dragStart: js.UndefOr[DialogEvent] = js.undefined
  
  var dragStop: js.UndefOr[DialogEvent] = js.undefined
  
  var focus: js.UndefOr[DialogEvent] = js.undefined
  
  var open: js.UndefOr[DialogEvent] = js.undefined
  
  var resize: js.UndefOr[DialogEvent] = js.undefined
  
  var resizeStart: js.UndefOr[DialogEvent] = js.undefined
  
  var resizeStop: js.UndefOr[DialogEvent] = js.undefined
}
object DialogEvents {
  
  inline def apply(): DialogEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogEvents] (val x: Self) extends AnyVal {
    
    inline def setBeforeClose(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction2(value))
    
    inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
    
    inline def setClose(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = StObject.set(x, "close", js.Any.fromFunction2(value))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setCreate(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDrag(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction2(value))
    
    inline def setDragStart(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction2(value))
    
    inline def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
    
    inline def setDragStop(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = StObject.set(x, "dragStop", js.Any.fromFunction2(value))
    
    inline def setDragStopUndefined: Self = StObject.set(x, "dragStop", js.undefined)
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setFocus(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setOpen(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = StObject.set(x, "open", js.Any.fromFunction2(value))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setResize(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction2(value))
    
    inline def setResizeStart(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = StObject.set(x, "resizeStart", js.Any.fromFunction2(value))
    
    inline def setResizeStartUndefined: Self = StObject.set(x, "resizeStart", js.undefined)
    
    inline def setResizeStop(value: (/* event */ JQueryEventObject, /* ui */ DialogUIParams) => Unit): Self = StObject.set(x, "resizeStop", js.Any.fromFunction2(value))
    
    inline def setResizeStopUndefined: Self = StObject.set(x, "resizeStop", js.undefined)
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
  }
}
