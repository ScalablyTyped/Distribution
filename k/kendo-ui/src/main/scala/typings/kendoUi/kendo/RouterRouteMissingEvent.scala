package typings.kendoUi.kendo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterRouteMissingEvent extends RouterEvent {
  var params: js.Any = js.native
}

object RouterRouteMissingEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    params: js.Any,
    preventDefault: js.Function,
    sender: Router,
    url: String
  ): RouterRouteMissingEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), params = params.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterRouteMissingEvent]
  }
  @scala.inline
  implicit class RouterRouteMissingEventOps[Self <: RouterRouteMissingEvent] (val x: Self) extends AnyVal {
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
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
  }
  
}

