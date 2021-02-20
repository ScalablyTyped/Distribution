package typings.limeJs.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lime-js", "ClientChannelExtensions")
@js.native
class ClientChannelExtensions () extends StObject
object ClientChannelExtensions {
  
  /* static member */
  @JSImport("lime-js", "ClientChannelExtensions.establishSession")
  @js.native
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
