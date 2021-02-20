package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuEvents extends StObject {
  
  var blur: js.UndefOr[MenuEvent] = js.native
  
  var create: js.UndefOr[MenuEvent] = js.native
  
  var focus: js.UndefOr[MenuEvent] = js.native
  
  var select: js.UndefOr[MenuEvent] = js.native
}
object MenuEvents {
  
  @scala.inline
  def apply(): MenuEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuEvents]
  }
  
  @scala.inline
  implicit class MenuEventsMutableBuilder[Self <: MenuEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlur(value: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setFocus(value: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setSelect(value: (/* event */ JQueryEventObject, /* ui */ MenuUIParams) => Unit): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
