package typings.guacamoleCommonJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-common-js", "Client")
@js.native
open class Client protected ()
  extends typings.guacamoleCommonJs.clientMod.Client {
  /**
    * @param tunnel The tunnel to use to send and receive Guacamole instructions.
    */
  def this(tunnel: typings.guacamoleCommonJs.tunnelMod.Tunnel) = this()
}
