package typings.limeDashJs.limeDashJsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lime-js", "ClientChannelExtensions")
@js.native
class ClientChannelExtensions () extends js.Object

/* static members */
@JSImport("lime-js", "ClientChannelExtensions")
@js.native
object ClientChannelExtensions extends js.Object {
  def establishSession(
    clientChannel: ClientChannel,
    compression: String,
    encryption: String,
    identity: String,
    authentication: Authentication,
    instance: String,
    callback: js.Function2[/* error */ Error, /* session */ Session, _]
  ): Unit = js.native
}

