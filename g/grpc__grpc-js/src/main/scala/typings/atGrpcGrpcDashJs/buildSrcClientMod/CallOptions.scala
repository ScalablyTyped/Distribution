package typings.atGrpcGrpcDashJs.buildSrcClientMod

import typings.atGrpcGrpcDashJs.buildSrcCallDashCredentialsMod.CallCredentials
import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.Deadline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallOptions extends js.Object {
  var credentials: js.UndefOr[CallCredentials] = js.undefined
  var deadline: js.UndefOr[Deadline] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var propagate_flags: js.UndefOr[Double] = js.undefined
}

object CallOptions {
  @scala.inline
  def apply(
    credentials: CallCredentials = null,
    deadline: Deadline = null,
    host: String = null,
    propagate_flags: Int | Double = null
  ): CallOptions = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (deadline != null) __obj.updateDynamic("deadline")(deadline.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (propagate_flags != null) __obj.updateDynamic("propagate_flags")(propagate_flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallOptions]
  }
}

