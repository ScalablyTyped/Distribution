package typings
package atJupyterlabApputilsLib.libToolbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/toolbar", "Toolbar")
@js.native
/**
  * Construct a new toolbar widget.
  */
class Toolbar[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */] ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
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
  def addItem(name: java.lang.String, widget: T): scala.Boolean = js.native
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
  def handleEvent(event: stdLib.Event): scala.Unit = js.native
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
  def insertItem(index: scala.Double, name: java.lang.String, widget: T): scala.Boolean = js.native
  /**
    * Get an iterator over the ordered toolbar item names.
    *
    * @returns An iterator over the toolbar item names.
    */
  def names(): atPhosphorAlgorithmLib.libIterMod.IIterator[java.lang.String] = js.native
}

