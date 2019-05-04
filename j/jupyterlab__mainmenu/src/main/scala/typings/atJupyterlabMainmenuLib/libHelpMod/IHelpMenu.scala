package typings
package atJupyterlabMainmenuLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelpMenu
  extends atJupyterlabMainmenuLib.libLabmenuMod.IJupyterLabMenu {
  /**
    * A set of kernel users for the help menu.
    * This is used to populate additional help
    * links provided by the kernel of a widget.
    */
  val kernelUsers: stdLib.Set[
    atJupyterlabMainmenuLib.libHelpMod.IHelpMenuNs.IKernelUser[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget]
  ] = js.native
}

