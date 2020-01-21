package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

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
  def apply(arg: String = null, command: String = null): SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp = {
    val __obj = js.Dynamic.literal()
    if (arg != null) __obj.updateDynamic("arg")(arg.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2AdminTemp]
  }
}

