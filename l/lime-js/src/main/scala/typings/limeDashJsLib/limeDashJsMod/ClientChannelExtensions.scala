package typings
package limeDashJsLib.limeDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lime-js", "ClientChannelExtensions")
@js.native
class ClientChannelExtensions ()
  extends limeDashJsLib.limeDashJsMod.LimeNs.ClientChannelExtensions

@JSImport("lime-js", "ClientChannelExtensions")
@js.native
object ClientChannelExtensions extends js.Object {
  def establishSession(
    clientChannel: limeDashJsLib.limeDashJsMod.LimeNs.ClientChannel,
    compression: java.lang.String,
    encryption: java.lang.String,
    identity: java.lang.String,
    authentication: limeDashJsLib.limeDashJsMod.LimeNs.Authentication,
    instance: java.lang.String,
    callback: js.Function2[
      /* error */ stdLib.Error, 
      /* session */ limeDashJsLib.limeDashJsMod.LimeNs.Session, 
      _
    ]
  ): scala.Unit = js.native
}

