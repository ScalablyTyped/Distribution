package typings.jupyterlabMainmenu.runMod

import typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typings.jupyterlabMainmenu.runMod.IRunMenu.ICodeRunner
import typings.phosphorWidgets.mod.Widget
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

