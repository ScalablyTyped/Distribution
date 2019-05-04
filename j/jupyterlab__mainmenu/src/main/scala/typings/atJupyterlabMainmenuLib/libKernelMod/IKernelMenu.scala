package typings
package atJupyterlabMainmenuLib.libKernelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKernelMenu
  extends atJupyterlabMainmenuLib.libLabmenuMod.IJupyterLabMenu {
  /**
    * A set storing IKernelUsers for the Kernel menu.
    */
  val kernelUsers: stdLib.Set[
    atJupyterlabMainmenuLib.libKernelMod.IKernelMenuNs.IKernelUser[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget]
  ] = js.native
}

