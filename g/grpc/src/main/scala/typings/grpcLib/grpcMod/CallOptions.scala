package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallOptions
  extends /**
  * Additional custom call options. These can be used to pass additional
  * data per-call to client interceptors
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * The credentials that should be used to make this particular call.
    */
  var credentials: CallCredentials
  /**
    * The deadline for the entire call to complete.
    */
  var deadline: js.UndefOr[Deadline] = js.undefined
  /**
    * Server hostname to set on the call. Only meaningful if different from
    * the server address used to construct the client.
    */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Parent call. Used in servers when making a call as part of the process
    * of handling a call. Used to propagate some information automatically,
    * as specified by propagate_flags.
    */
  var parent: js.UndefOr[Call] = js.undefined
  /**
    * Indicates which properties of a parent call should propagate to this
    * call. Bitwise combination of flags in `grpc.propagate`.
    */
  var propagate_flags: scala.Double
}

object CallOptions {
  @scala.inline
  def apply(
    credentials: CallCredentials,
    propagate_flags: scala.Double,
    StringDictionary: /**
    * Additional custom call options. These can be used to pass additional
    * data per-call to client interceptors
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    deadline: Deadline = null,
    host: java.lang.String = null,
    parent: Call = null
  ): CallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("credentials")(credentials)
    __obj.updateDynamic("propagate_flags")(propagate_flags)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (deadline != null) __obj.updateDynamic("deadline")(deadline.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallOptions]
  }
}

