package typings.guacamoleClient.mod

import typings.guacamoleClient.guacamoleClientStrings._empty
import typings.guacamoleClient.tunnelMod.Tunnel.TunnelState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client", "Tunnel")
@js.native
abstract class Tunnel ()
  extends typings.guacamoleClient.tunnelMod.Tunnel

/* static members */
@JSImport("guacamole-client", "Tunnel")
@js.native
object Tunnel extends js.Object {
  val INTERNAL_DATA_OPCODE: _empty = js.native
  val State: TunnelState = js.native
}

