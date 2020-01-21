package typings.jupyterlabTerminal.tokensMod.ITerminal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type for the terminal theme.
  */
/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabTerminal.jupyterlabTerminalStrings.light
  - typings.jupyterlabTerminal.jupyterlabTerminalStrings.dark
  - typings.jupyterlabTerminal.jupyterlabTerminalStrings.inherit
*/
trait Theme extends js.Object

object Theme {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typings.jupyterlabTerminal.jupyterlabTerminalStrings.dark = this.cast("dark")
  @scala.inline
  def inherit: typings.jupyterlabTerminal.jupyterlabTerminalStrings.inherit = this.cast("inherit")
  @scala.inline
  def light: typings.jupyterlabTerminal.jupyterlabTerminalStrings.light = this.cast("light")
}

