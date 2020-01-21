package typings.jupyterlabApputils.dialogMod.Dialog

import typings.phosphorWidgets.mod.Widget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of a dialog renderer.
  */
@JSImport("@jupyterlab/apputils/lib/dialog", "Dialog.Renderer")
@js.native
class Renderer () extends js.Object {
  /**
    * Create the body of the dialog.
    *
    * @param value - The input value for the body.
    *
    * @returns A widget for the body.
    */
  def createBody(value: Body[_]): Widget = js.native
  /**
    * Create a button node for the dialog.
    *
    * @param button - The button data.
    *
    * @returns A node for the button.
    */
  def createButtonNode(button: IButton): HTMLElement = js.native
  /**
    * Create the footer of the dialog.
    *
    * @param buttonNodes - The buttons nodes to add to the footer.
    *
    * @returns A widget for the footer.
    */
  def createFooter(buttons: js.Array[HTMLElement]): Widget = js.native
  /**
    * Create the header of the dialog.
    *
    * @param title - The title of the dialog.
    *
    * @returns A widget for the dialog header.
    */
  def createHeader(title: Header): Widget = js.native
  /**
    * Create the class name for the button icon.
    *
    * @param data - The data to use for the class name.
    *
    * @returns The full class name for the item icon.
    */
  def createIconClass(data: IButton): String = js.native
  /**
    * Create the class name for the button.
    *
    * @param data - The data to use for the class name.
    *
    * @returns The full class name for the button.
    */
  def createItemClass(data: IButton): String = js.native
  /**
    * Render an icon element for a dialog item.
    *
    * @param data - The data to use for rendering the icon.
    *
    * @returns An HTML element representing the icon.
    */
  def renderIcon(data: IButton): HTMLElement = js.native
  /**
    * Render the label element for a button.
    *
    * @param data - The data to use for rendering the label.
    *
    * @returns An HTML element representing the item label.
    */
  def renderLabel(data: IButton): HTMLElement = js.native
}

