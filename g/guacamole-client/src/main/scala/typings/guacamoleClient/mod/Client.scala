package typings.guacamoleClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "Client")
@js.native
open class Client protected ()
  extends typings.guacamoleClient.clientMod.Client {
  /**
    * @param tunnel The tunnel to use to send and receive Guacamole instructions.
    */
  def this(tunnel: typings.guacamoleClient.tunnelMod.Tunnel) = this()
}
