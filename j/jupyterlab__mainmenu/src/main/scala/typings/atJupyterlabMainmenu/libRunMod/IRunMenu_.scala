package typings.atJupyterlabMainmenu.libRunMod

import typings.atJupyterlabMainmenu.libLabmenuMod.IJupyterLabMenu
import typings.atJupyterlabMainmenu.libRunMod.IRunMenu.ICodeRunner
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("IRunMenu")
@js.native
trait IRunMenu_ extends IJupyterLabMenu {
  /**
    * A set storing ICodeRunner for the Run menu.
    *
    * ### Notes
    * The key for the set may be used in menu labels.
    */
  val codeRunners: Set[ICodeRunner[Widget]] = js.native
}

