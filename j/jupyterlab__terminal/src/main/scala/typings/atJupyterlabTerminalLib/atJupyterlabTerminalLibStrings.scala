package typings
package atJupyterlabTerminalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atJupyterlabTerminalLibStrings {
  @js.native
  sealed trait dark
    extends atJupyterlabTerminalLib.libWidgetMod.TerminalNs.Theme
  
  @js.native
  sealed trait light
    extends atJupyterlabTerminalLib.libWidgetMod.TerminalNs.Theme
  
  @scala.inline
  def dark: dark = "dark".asInstanceOf[dark]
  @scala.inline
  def light: light = "light".asInstanceOf[light]
}

