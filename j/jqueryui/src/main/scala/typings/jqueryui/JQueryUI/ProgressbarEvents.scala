package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressbarEvents extends js.Object {
  var change: js.UndefOr[ProgressbarEvent] = js.native
  var complete: js.UndefOr[ProgressbarEvent] = js.native
  var create: js.UndefOr[ProgressbarEvent] = js.native
}

object ProgressbarEvents {
  @scala.inline
  def apply(): ProgressbarEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressbarEvents]
  }
  @scala.inline
  implicit class ProgressbarEventsOps[Self <: ProgressbarEvents] (val x: Self) extends AnyVal {
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
    def setChange(value: (/* event */ JQueryEventObject, /* ui */ ProgressbarUIParams) => Unit): Self = this.set("change", js.Any.fromFunction2(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setComplete(value: (/* event */ JQueryEventObject, /* ui */ ProgressbarUIParams) => Unit): Self = this.set("complete", js.Any.fromFunction2(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, /* ui */ ProgressbarUIParams) => Unit): Self = this.set("create", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
  }
  
}

