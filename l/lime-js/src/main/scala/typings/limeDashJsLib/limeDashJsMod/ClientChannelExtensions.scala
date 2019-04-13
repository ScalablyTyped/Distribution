package typings
package limeDashJsLib.limeDashJsMod

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
    clientChannel: limeDashJsLib.limeDashJsMod.ClientChannel,
    compression: java.lang.String,
    encryption: java.lang.String,
    identity: java.lang.String,
    authentication: limeDashJsLib.limeDashJsMod.Authentication,
    instance: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error, /* session */ limeDashJsLib.limeDashJsMod.Session, _]
  ): scala.Unit = js.native
}

