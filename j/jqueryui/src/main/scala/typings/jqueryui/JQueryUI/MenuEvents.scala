package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuEvents extends StObject {
  
  var blur: js.UndefOr[MenuEvent] = js.undefined
  
  var create: js.UndefOr[MenuEvent] = js.undefined
  
  var focus: js.UndefOr[MenuEvent] = js.undefined
  
  var select: js.UndefOr[MenuEvent] = js.undefined
}
object MenuEvents {
  
  inline def apply(): MenuEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuEvents] (val x: Self) extends AnyVal {
    
    inline def setBlur(value: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
    
    inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    inline def setCreate(value: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setFocus(value: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setSelect(value: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Unit): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
