package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AdminTemp is a prelimiary set of administration tasks. It&#39;s called
  * &quot;Temp&quot; because we do not yet know the best way to represent admin
  * tasks; it&#39;s possible that this will be entirely replaced in later
  * versions of this API. If this message proves to be sufficient, it will be
  * renamed in the alpha or beta release of this API.  This message (suitably
  * marshalled into a protobuf.Any) can be used as the inline_assignment field
  * in a lease; the lease assignment field should simply be `&quot;admin&quot;`
  * in these cases.  This message is heavily based on Swarming administration
  * tasks from the LUCI project
  * (http://github.com/luci/luci-py/appengine/swarming).
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp extends js.Object {
  /**
    * The argument to the admin action; see `Command` for semantics.
    */
  var arg: js.UndefOr[String] = js.native
  /**
    * The admin action; see `Command` for legal values.
    */
  var command: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2AdminTempOps[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp] (val x: Self) extends AnyVal {
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
    def setArg(value: String): Self = this.set("arg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArg: Self = this.set("arg", js.undefined)
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
  }
  
}

