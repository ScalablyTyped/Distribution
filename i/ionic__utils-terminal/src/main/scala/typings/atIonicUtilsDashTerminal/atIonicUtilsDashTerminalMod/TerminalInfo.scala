package typings.atIonicUtilsDashTerminal.atIonicUtilsDashTerminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminalInfo extends js.Object {
  /**
    * Whether this is in CI or not.
    */
  val ci: Boolean
  /**
    * Path to the user's shell program.
    */
  val shell: String
  /**
    * Whether the terminal is an interactive TTY or not.
    */
  val tty: Boolean
  /**
    * Whether this is a Windows shell or not.
    */
  val windows: Boolean
}

object TerminalInfo {
  @scala.inline
  def apply(ci: Boolean, shell: String, tty: Boolean, windows: Boolean): TerminalInfo = {
    val __obj = js.Dynamic.literal(ci = ci, shell = shell, tty = tty, windows = windows)
  
    __obj.asInstanceOf[TerminalInfo]
  }
}

