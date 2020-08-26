package typings.jsdom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualConsoleSendToOptions extends js.Object {
  var omitJSDOMErrors: Boolean = js.native
}

object VirtualConsoleSendToOptions {
  @scala.inline
  def apply(omitJSDOMErrors: Boolean): VirtualConsoleSendToOptions = {
    val __obj = js.Dynamic.literal(omitJSDOMErrors = omitJSDOMErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualConsoleSendToOptions]
  }
  @scala.inline
  implicit class VirtualConsoleSendToOptionsOps[Self <: VirtualConsoleSendToOptions] (val x: Self) extends AnyVal {
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
    def setOmitJSDOMErrors(value: Boolean): Self = this.set("omitJSDOMErrors", value.asInstanceOf[js.Any])
  }
  
}

