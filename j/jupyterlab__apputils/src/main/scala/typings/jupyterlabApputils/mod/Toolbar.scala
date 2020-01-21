package typings.jupyterlabApputils.mod

import typings.jupyterlabApputils.clientsessionMod.IClientSession
import typings.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "Toolbar")
@js.native
/**
  * Construct a new toolbar widget.
  */
class Toolbar[T /* <: Widget */] ()
  extends typings.jupyterlabApputils.toolbarMod.Toolbar[T]

@JSImport("@jupyterlab/apputils", "Toolbar")
@js.native
object Toolbar extends js.Object {
  /**
    * Create an interrupt toolbar item.
    */
  def createInterruptButton(session: IClientSession): Widget = js.native
  /**
    * Create a kernel name indicator item.
    *
    * #### Notes
    * It will display the `'display_name`' of the current kernel,
    * or `'No Kernel!'` if there is no kernel.
    * It can handle a change in context or kernel.
    */
  def createKernelNameItem(session: IClientSession): Widget = js.native
  /**
    * Create a kernel status indicator item.
    *
    * #### Notes
    * It will show a busy status if the kernel status is busy.
    * It will show the current status in the node title.
    * It can handle a change to the context or the kernel.
    */
  def createKernelStatusItem(session: IClientSession): Widget = js.native
  /**
    * Create a restart toolbar item.
    */
  def createRestartButton(session: IClientSession): Widget = js.native
  /**
    * Create a toolbar spacer item.
    *
    * #### Notes
    * It is a flex spacer that separates the left toolbar items
    * from the right toolbar items.
    */
  def createSpacerItem(): Widget = js.native
}

