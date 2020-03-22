package typings.jupyterlabServices.terminalTerminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabServices.jupyterlabServicesStrings.stdout
  - typings.jupyterlabServices.jupyterlabServicesStrings.disconnect
  - typings.jupyterlabServices.jupyterlabServicesStrings.set_size
  - typings.jupyterlabServices.jupyterlabServicesStrings.stdin
*/
trait MessageType extends js.Object

object MessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disconnect: typings.jupyterlabServices.jupyterlabServicesStrings.disconnect = this.cast("disconnect")
  @scala.inline
  def set_size: typings.jupyterlabServices.jupyterlabServicesStrings.set_size = this.cast("set_size")
  @scala.inline
  def stdin: typings.jupyterlabServices.jupyterlabServicesStrings.stdin = this.cast("stdin")
  @scala.inline
  def stdout: typings.jupyterlabServices.jupyterlabServicesStrings.stdout = this.cast("stdout")
}

