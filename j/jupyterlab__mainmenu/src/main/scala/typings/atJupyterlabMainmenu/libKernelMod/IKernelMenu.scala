package typings.atJupyterlabMainmenu.libKernelMod

import typings.atJupyterlabMainmenu.libKernelMod.IKernelMenuNs.IKernelUser
import typings.atJupyterlabMainmenu.libLabmenuMod.IJupyterLabMenu
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKernelMenu extends IJupyterLabMenu {
  /**
    * A set storing IKernelUsers for the Kernel menu.
    */
  val kernelUsers: Set[IKernelUser[Widget]] = js.native
}

