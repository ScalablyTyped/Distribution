package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutocompleteEvents extends js.Object {
  
  var change: js.UndefOr[AutocompleteEvent] = js.native
  
  var close: js.UndefOr[AutocompleteEvent] = js.native
  
  var create: js.UndefOr[AutocompleteEvent] = js.native
  
  var focus: js.UndefOr[AutocompleteEvent] = js.native
  
  var open: js.UndefOr[AutocompleteEvent] = js.native
  
  var response: js.UndefOr[AutocompleteEvent] = js.native
  
  var search: js.UndefOr[AutocompleteEvent] = js.native
  
  var select: js.UndefOr[AutocompleteEvent] = js.native
}
object AutocompleteEvents {
  
  @scala.inline
  def apply(): AutocompleteEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteEvents]
  }
  
  @scala.inline
  implicit class AutocompleteEventsOps[Self <: AutocompleteEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChange(value: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit): Self = this.set("change", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setClose(value: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit): Self = this.set("close", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit): Self = this.set("create", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setFocus(value: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit): Self = this.set("focus", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setOpen(value: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit): Self = this.set("open", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setResponse(value: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit): Self = this.set("response", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    
    @scala.inline
    def setSearch(value: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit): Self = this.set("search", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    
    @scala.inline
    def setSelect(value: (/* event */ JQueryEventObject, /* ui */ AutocompleteUIParams) => Unit): Self = this.set("select", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
  }
}
