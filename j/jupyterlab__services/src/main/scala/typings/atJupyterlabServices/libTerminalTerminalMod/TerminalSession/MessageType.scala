package typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Valid message types for the terminal.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.stdout
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.disconnect
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.set_size
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.stdin
*/
trait MessageType extends js.Object

object MessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disconnect: typings.atJupyterlabServices.atJupyterlabServicesStrings.disconnect = this.cast("disconnect")
  @scala.inline
  def set_size: typings.atJupyterlabServices.atJupyterlabServicesStrings.set_size = this.cast("set_size")
  @scala.inline
  def stdin: typings.atJupyterlabServices.atJupyterlabServicesStrings.stdin = this.cast("stdin")
  @scala.inline
  def stdout: typings.atJupyterlabServices.atJupyterlabServicesStrings.stdout = this.cast("stdout")
}

