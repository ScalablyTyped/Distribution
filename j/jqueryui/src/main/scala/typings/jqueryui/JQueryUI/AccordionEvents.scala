package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccordionEvents extends js.Object {
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
  implicit class AccordionEventsOps[Self <: AccordionEvents] (val x: Self) extends AnyVal {
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
    def setActivate(value: (/* event */ JQueryEventObject, /* ui */ AccordionUIParams) => Unit): Self = this.set("activate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteActivate: Self = this.set("activate", js.undefined)
    @scala.inline
    def setBeforeActivate(value: (/* event */ JQueryEventObject, /* ui */ AccordionUIParams) => Unit): Self = this.set("beforeActivate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeActivate: Self = this.set("beforeActivate", js.undefined)
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, /* ui */ AccordionUIParams) => Unit): Self = this.set("create", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
  }
  
}

