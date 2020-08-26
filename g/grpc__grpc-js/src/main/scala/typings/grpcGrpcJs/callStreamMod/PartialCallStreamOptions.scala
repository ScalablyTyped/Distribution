package typings.grpcGrpcJs.callStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.CallStreamOptions> */
@js.native
trait PartialCallStreamOptions extends js.Object {
  var deadline: js.UndefOr[Deadline] = js.native
  var flags: js.UndefOr[Double] = js.native
  var host: js.UndefOr[String] = js.native
  var parentCall: js.UndefOr[Call | Null] = js.native
}

object PartialCallStreamOptions {
  @scala.inline
  def apply(): PartialCallStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCallStreamOptions]
  }
  @scala.inline
  implicit class PartialCallStreamOptionsOps[Self <: PartialCallStreamOptions] (val x: Self) extends AnyVal {
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
    def deleteDeadline: Self = this.set("deadline", js.undefined)
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setParentCall(value: Call): Self = this.set("parentCall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentCall: Self = this.set("parentCall", js.undefined)
    @scala.inline
    def setParentCallNull: Self = this.set("parentCall", null)
  }
  
}

