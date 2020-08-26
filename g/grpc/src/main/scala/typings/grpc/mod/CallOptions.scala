package typings.grpc.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallOptions
  extends /* field */ StringDictionary[js.Any] {
  /**
    * The credentials that should be used to make this particular call.
    */
  var credentials: js.UndefOr[CallCredentials] = js.native
  /**
    * The deadline for the entire call to complete.
    */
  var deadline: js.UndefOr[Deadline] = js.native
  /**
    * Server hostname to set on the call. Only meaningful if different from
    * the server address used to construct the client.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Parent call. Used in servers when making a call as part of the process
    * of handling a call. Used to propagate some information automatically,
    * as specified by propagate_flags.
    */
  var parent: js.UndefOr[Call] = js.native
  /**
    * Indicates which properties of a parent call should propagate to this
    * call. Bitwise combination of flags in `grpc.propagate`.
    */
  var propagate_flags: js.UndefOr[Double] = js.native
}

object CallOptions {
  @scala.inline
  def apply(): CallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallOptions]
  }
  @scala.inline
  implicit class CallOptionsOps[Self <: CallOptions] (val x: Self) extends AnyVal {
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
    def setCredentials(value: CallCredentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setDeadline(value: Deadline): Self = this.set("deadline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeadline: Self = this.set("deadline", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setParent(value: Call): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setPropagate_flags(value: Double): Self = this.set("propagate_flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropagate_flags: Self = this.set("propagate_flags", js.undefined)
  }
  
}

