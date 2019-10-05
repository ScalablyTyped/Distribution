package typings.atJupyterlabApputils.libToolbarMod

import typings.atJupyterlabApputils.libClientsessionMod.IClientSession
import typings.atPhosphorAlgorithm.libIterMod.IIterator
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/toolbar", "Toolbar")
@js.native
/**
  * Construct a new toolbar widget.
  */
class Toolbar[T /* <: Widget */] () extends Widget {
  var _insertRelative: js.Any = js.native
  /**
    * Add an item to the end of the toolbar.
    *
    * @param name - The name of the widget to add to the toolbar.
    *
    * @param widget - The widget to add to the toolbar.
    *
    * @param index - The optional name of the item to insert after.
    *
    * @returns Whether the item was added to toolbar.  Returns false if
    *   an item of the same name is already in the toolbar.
    *
    * #### Notes
    * The item can be removed from the toolbar by setting its parent to `null`.
    */
  def addItem(name: String, widget: T): Boolean = js.native
  /**
    * Handle the DOM events for the widget.
    *
    * @param event - The DOM event sent to the widget.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the dock panel's node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: Event): Unit = js.native
  /**
    * Insert an item into the toolbar at the after a target item.
    *
    * @param at - The target item to insert after.
    *
    * @param name - The name of the item.
    *
    * @param widget - The widget to add.
    *
    * @returns Whether the item was added to the toolbar. Returns false if
    *   an item of the same name is already in the toolbar.
    *
    * #### Notes
    * The index will be clamped to the bounds of the items.
    * The item can be removed from the toolbar by setting its parent to `null`.
    */
  def insertAfter(at: String, name: String, widget: T): Boolean = js.native
  /**
    * Insert an item into the toolbar at the before a target item.
    *
    * @param at - The target item to insert before.
    *
    * @param name - The name of the item.
    *
    * @param widget - The widget to add.
    *
    * @returns Whether the item was added to the toolbar. Returns false if
    *   an item of the same name is already in the toolbar.
    *
    * #### Notes
    * The index will be clamped to the bounds of the items.
    * The item can be removed from the toolbar by setting its parent to `null`.
    */
  def insertBefore(at: String, name: String, widget: T): Boolean = js.native
  /**
    * Insert an item into the toolbar at the specified index.
    *
    * @param index - The index at which to insert the item.
    *
    * @param name - The name of the item.
    *
    * @param widget - The widget to add.
    *
    * @returns Whether the item was added to the toolbar. Returns false if
    *   an item of the same name is already in the toolbar.
    *
    * #### Notes
    * The index will be clamped to the bounds of the items.
    * The item can be removed from the toolbar by setting its parent to `null`.
    */
  def insertItem(index: Double, name: String, widget: T): Boolean = js.native
  /**
    * Get an iterator over the ordered toolbar item names.
    *
    * @returns An iterator over the toolbar item names.
    */
  def names(): IIterator[String] = js.native
}

@JSImport("@jupyterlab/apputils/lib/toolbar", "Toolbar")
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

