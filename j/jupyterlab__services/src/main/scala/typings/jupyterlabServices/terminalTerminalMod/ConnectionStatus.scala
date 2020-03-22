package typings.jupyterlabServices.terminalTerminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabServices.jupyterlabServicesStrings.connected
  - typings.jupyterlabServices.jupyterlabServicesStrings.connecting
  - typings.jupyterlabServices.jupyterlabServicesStrings.disconnected
*/
trait ConnectionStatus extends js.Object

object ConnectionStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typings.jupyterlabServices.jupyterlabServicesStrings.connected = this.cast("connected")
  @scala.inline
  def connecting: typings.jupyterlabServices.jupyterlabServicesStrings.connecting = this.cast("connecting")
  @scala.inline
  def disconnected: typings.jupyterlabServices.jupyterlabServicesStrings.disconnected = this.cast("disconnected")
}

