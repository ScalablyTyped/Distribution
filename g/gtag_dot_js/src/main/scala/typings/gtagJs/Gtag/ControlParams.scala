package typings.gtagJs.Gtag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlParams extends js.Object {
  var event_callback: js.UndefOr[js.Function0[Unit]] = js.native
  var event_timeout: js.UndefOr[Double] = js.native
  var groups: js.UndefOr[String | js.Array[String]] = js.native
  var send_to: js.UndefOr[String | js.Array[String]] = js.native
}

object ControlParams {
  @scala.inline
  def apply(): ControlParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlParams]
  }
  @scala.inline
  implicit class ControlParamsOps[Self <: ControlParams] (val x: Self) extends AnyVal {
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
    def setEvent_callback(value: () => Unit): Self = this.set("event_callback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteEvent_callback: Self = this.set("event_callback", js.undefined)
    @scala.inline
    def setEvent_timeout(value: Double): Self = this.set("event_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent_timeout: Self = this.set("event_timeout", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: String | js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setSend_toVarargs(value: String*): Self = this.set("send_to", js.Array(value :_*))
    @scala.inline
    def setSend_to(value: String | js.Array[String]): Self = this.set("send_to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSend_to: Self = this.set("send_to", js.undefined)
  }
  
}

