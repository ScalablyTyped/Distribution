package typings.lobibox.LobiboxModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressEvents extends js.Object {
  var progressComplete: js.UndefOr[js.Function1[/* lobibox */ LobiboxStatic, Unit]] = js.native
  var progressUpdated: js.UndefOr[js.Function1[/* lobibox */ LobiboxStatic, Unit]] = js.native
}

object ProgressEvents {
  @scala.inline
  def apply(): ProgressEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressEvents]
  }
  @scala.inline
  implicit class ProgressEventsOps[Self <: ProgressEvents] (val x: Self) extends AnyVal {
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
    def setProgressComplete(value: /* lobibox */ LobiboxStatic => Unit): Self = this.set("progressComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProgressComplete: Self = this.set("progressComplete", js.undefined)
    @scala.inline
    def setProgressUpdated(value: /* lobibox */ LobiboxStatic => Unit): Self = this.set("progressUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProgressUpdated: Self = this.set("progressUpdated", js.undefined)
  }
  
}

