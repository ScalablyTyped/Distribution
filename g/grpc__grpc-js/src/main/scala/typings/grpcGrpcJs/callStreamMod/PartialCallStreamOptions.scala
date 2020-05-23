package typings.grpcGrpcJs.callStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.CallStreamOptions> */
trait PartialCallStreamOptions extends js.Object {
  var deadline: js.UndefOr[Deadline] = js.undefined
  var flags: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var parentCall: js.UndefOr[Call] = js.undefined
}

object PartialCallStreamOptions {
  @scala.inline
  def apply(
    deadline: Deadline = null,
    flags: js.UndefOr[Double] = js.undefined,
    host: String = null,
    parentCall: Call = null
  ): PartialCallStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (deadline != null) __obj.updateDynamic("deadline")(deadline.asInstanceOf[js.Any])
    if (!js.isUndefined(flags)) __obj.updateDynamic("flags")(flags.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (parentCall != null) __obj.updateDynamic("parentCall")(parentCall.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCallStreamOptions]
  }
}

