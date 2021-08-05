package typings.limeJs.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lime-js", "ClientChannelExtensions")
@js.native
class ClientChannelExtensions () extends StObject
object ClientChannelExtensions {
  
  @JSImport("lime-js", "ClientChannelExtensions")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def establishSession(
    clientChannel: ClientChannel,
    compression: String,
    encryption: String,
    identity: String,
    authentication: Authentication,
    instance: String,
    callback: js.Function2[/* error */ Error, /* session */ Session, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("establishSession")(clientChannel.asInstanceOf[js.Any], compression.asInstanceOf[js.Any], encryption.asInstanceOf[js.Any], identity.asInstanceOf[js.Any], authentication.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
