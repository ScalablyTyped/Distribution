package typings.libraCore.anon

import typings.grpc.mod.Call
import typings.grpc.mod.CallCredentials
import typings.grpc.mod.Deadline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<grpc.grpc.CallOptions> */
trait PartialCallOptions extends js.Object {
  var credentials: js.UndefOr[CallCredentials] = js.undefined
  var deadline: js.UndefOr[Deadline] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[Call] = js.undefined
  var propagate_flags: js.UndefOr[Double] = js.undefined
}

object PartialCallOptions {
  @scala.inline
  def apply(
    credentials: CallCredentials = null,
    deadline: Deadline = null,
    host: String = null,
    parent: Call = null,
    propagate_flags: js.UndefOr[Double] = js.undefined
  ): PartialCallOptions = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (deadline != null) __obj.updateDynamic("deadline")(deadline.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(propagate_flags)) __obj.updateDynamic("propagate_flags")(propagate_flags.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCallOptions]
  }
}

