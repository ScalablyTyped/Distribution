package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutocompleteEvents extends StObject {
  
  var change: js.UndefOr[AutocompleteEvent] = js.undefined
  
  var close: js.UndefOr[AutocompleteEvent] = js.undefined
  
  var create: js.UndefOr[AutocompleteEvent] = js.undefined
  
  var focus: js.UndefOr[AutocompleteEvent] = js.undefined
  
  var open: js.UndefOr[AutocompleteEvent] = js.undefined
  
  var response: js.UndefOr[AutocompleteEvent] = js.undefined
  
  var search: js.UndefOr[AutocompleteEvent] = js.undefined
  
  var select: js.UndefOr[AutocompleteEvent] = js.undefined
}
object AutocompleteEvents {
  
  @scala.inline
  def apply(): AutocompleteEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteEvents]
  }
  
  @scala.inline
  implicit class AutocompleteEventsMutableBuilder[Self <: AutocompleteEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setClose(value: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit): Self = StObject.set(x, "close", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setFocus(value: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setOpen(value: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit): Self = StObject.set(x, "open", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setResponse(value: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit): Self = StObject.set(x, "response", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setSearch(value: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit): Self = StObject.set(x, "search", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setSelect(value: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
