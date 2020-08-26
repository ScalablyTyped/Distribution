package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpinnerEvents extends js.Object {
  var change: js.UndefOr[SpinnerEvent[js.Object]] = js.native
  var create: js.UndefOr[SpinnerEvent[js.Object]] = js.native
  var spin: js.UndefOr[SpinnerEvent[SpinnerUIParam]] = js.native
  var start: js.UndefOr[SpinnerEvent[js.Object]] = js.native
  var stop: js.UndefOr[SpinnerEvent[js.Object]] = js.native
}

object SpinnerEvents {
  @scala.inline
  def apply(): SpinnerEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinnerEvents]
  }
  @scala.inline
  implicit class SpinnerEventsOps[Self <: SpinnerEvents] (val x: Self) extends AnyVal {
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
    def setChange(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = this.set("change", js.Any.fromFunction2(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = this.set("create", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setSpin(value: (/* event */ JQueryEventObject, SpinnerUIParam) => Unit): Self = this.set("spin", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSpin: Self = this.set("spin", js.undefined)
    @scala.inline
    def setStart(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = this.set("start", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStop(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = this.set("stop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
  }
  
}

