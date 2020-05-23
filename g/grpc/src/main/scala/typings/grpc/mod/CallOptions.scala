package typings.grpc.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallOptions
  extends /* field */ StringDictionary[js.Any] {
  /**
    * The credentials that should be used to make this particular call.
    */
  var credentials: js.UndefOr[CallCredentials] = js.undefined
  /**
    * The deadline for the entire call to complete.
    */
  var deadline: js.UndefOr[Deadline] = js.undefined
  /**
    * Server hostname to set on the call. Only meaningful if different from
    * the server address used to construct the client.
    */
  var host: js.UndefOr[String] = js.undefined
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
  var propagate_flags: js.UndefOr[Double] = js.undefined
}

object CallOptions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    credentials: CallCredentials = null,
    deadline: Deadline = null,
    host: String = null,
    parent: Call = null,
    propagate_flags: js.UndefOr[Double] = js.undefined
  ): CallOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (deadline != null) __obj.updateDynamic("deadline")(deadline.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(propagate_flags)) __obj.updateDynamic("propagate_flags")(propagate_flags.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallOptions]
  }
}

