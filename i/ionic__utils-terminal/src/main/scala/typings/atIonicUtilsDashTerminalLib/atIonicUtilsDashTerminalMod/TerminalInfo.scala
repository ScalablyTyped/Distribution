package typings
package atIonicUtilsDashTerminalLib.atIonicUtilsDashTerminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminalInfo extends js.Object {
  /**
    * Whether this is in CI or not.
    */
  val ci: scala.Boolean
  /**
    * Whether the terminal is an interactive TTY or not.
    */
  val tty: scala.Boolean
  /**
    * Whether this is a Windows shell or not.
    */
  val windows: scala.Boolean
}

object TerminalInfo {
  @scala.inline
  def apply(ci: scala.Boolean, tty: scala.Boolean, windows: scala.Boolean): TerminalInfo = {
    val __obj = js.Dynamic.literal(ci = ci, tty = tty, windows = windows)
  
    __obj.asInstanceOf[TerminalInfo]
  }
}

