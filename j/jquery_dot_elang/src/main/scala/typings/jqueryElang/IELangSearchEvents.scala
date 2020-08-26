package typings.jqueryElang

import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IELangSearchEvents extends js.Object {
  var select: JQueryDeferred[_] = js.native
}

object IELangSearchEvents {
  @scala.inline
  def apply(select: JQueryDeferred[_]): IELangSearchEvents = {
    val __obj = js.Dynamic.literal(select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangSearchEvents]
  }
  @scala.inline
  implicit class IELangSearchEventsOps[Self <: IELangSearchEvents] (val x: Self) extends AnyVal {
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
    def setSelect(value: JQueryDeferred[_]): Self = this.set("select", value.asInstanceOf[js.Any])
  }
  
}

