package typings.jupyterlabMainmenu.helpMod

import typings.jupyterlabMainmenu.helpMod.IHelpMenu.IKernelUser
import typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typings.phosphorWidgets.mod.Widget
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelpMenu_ extends IJupyterLabMenu {
  /**
    * A set of kernel users for the help menu.
    * This is used to populate additional help
    * links provided by the kernel of a widget.
    */
  val kernelUsers: Set[IKernelUser[Widget]] = js.native
}

