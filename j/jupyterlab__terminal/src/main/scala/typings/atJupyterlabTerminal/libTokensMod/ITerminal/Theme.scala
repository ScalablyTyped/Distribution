package typings.atJupyterlabTerminal.libTokensMod.ITerminal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type for the terminal theme.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabTerminal.atJupyterlabTerminalStrings.light
  - typings.atJupyterlabTerminal.atJupyterlabTerminalStrings.dark
  - typings.atJupyterlabTerminal.atJupyterlabTerminalStrings.inherit
*/
trait Theme extends js.Object

object Theme {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typings.atJupyterlabTerminal.atJupyterlabTerminalStrings.dark = this.cast("dark")
  @scala.inline
  def inherit: typings.atJupyterlabTerminal.atJupyterlabTerminalStrings.inherit = this.cast("inherit")
  @scala.inline
  def light: typings.atJupyterlabTerminal.atJupyterlabTerminalStrings.light = this.cast("light")
}

