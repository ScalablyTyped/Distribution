package typings.grpcGrpcJs.callStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallStreamOptions extends js.Object {
  var deadline: Deadline = js.native
  var flags: Double = js.native
  var host: String = js.native
  var parentCall: Call | Null = js.native
}

object CallStreamOptions {
  @scala.inline
  def apply(deadline: Deadline, flags: Double, host: String): CallStreamOptions = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallStreamOptions]
  }
  @scala.inline
  implicit class CallStreamOptionsOps[Self <: CallStreamOptions] (val x: Self) extends AnyVal {
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
    def setDeadline(value: Deadline): Self = this.set("deadline", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentCall(value: Call): Self = this.set("parentCall", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentCallNull: Self = this.set("parentCall", null)
  }
  
}

