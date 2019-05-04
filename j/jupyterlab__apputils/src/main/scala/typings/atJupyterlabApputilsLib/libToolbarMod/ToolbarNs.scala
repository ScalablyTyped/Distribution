package typings
package atJupyterlabApputilsLib.libToolbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/toolbar", "Toolbar")
@js.native
object ToolbarNs extends js.Object {
  /**
    * Create an interrupt toolbar item.
    */
  def createInterruptButton(session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession): atJupyterlabApputilsLib.libToolbarMod.ToolbarButton = js.native
  /**
    * Create a kernel name indicator item.
    *
    * #### Notes
    * It will display the `'display_name`' of the current kernel,
    * or `'No Kernel!'` if there is no kernel.
    * It can handle a change in context or kernel.
    */
  def createKernelNameItem(session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession): atJupyterlabApputilsLib.libToolbarMod.ToolbarButton = js.native
  /**
    * Create a kernel status indicator item.
    *
    * #### Notes
    * It show display a busy status if the kernel status is
    * not idle.
    * It will show the current status in the node title.
    * It can handle a change to the context or the kernel.
    */
  def createKernelStatusItem(session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession): atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget = js.native
  /**
    * Create a restart toolbar item.
    */
  def createRestartButton(session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession): atJupyterlabApputilsLib.libToolbarMod.ToolbarButton = js.native
  /**
    * Create a toolbar spacer item.
    *
    * #### Notes
    * It is a flex spacer that separates the left toolbar items
    * from the right toolbar items.
    */
  def createSpacerItem(): atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget = js.native
}

