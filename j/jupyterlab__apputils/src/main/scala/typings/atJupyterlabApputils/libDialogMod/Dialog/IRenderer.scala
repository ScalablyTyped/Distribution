package typings.atJupyterlabApputils.libDialogMod.Dialog

import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A dialog renderer.
  */
trait IRenderer extends js.Object {
  /**
    * Create the body of the dialog.
    *
    * @param value - The input value for the body.
    *
    * @returns A widget for the body.
    */
  def createBody(body: Body[_]): Widget
  /**
    * Create a button node for the dialog.
    *
    * @param button - The button data.
    *
    * @returns A node for the button.
    */
  def createButtonNode(button: IButton): HTMLElement
  /**
    * Create the footer of the dialog.
    *
    * @param buttons - The button nodes to add to the footer.
    *
    * @returns A widget for the footer.
    */
  def createFooter(buttons: js.Array[HTMLElement]): Widget
  /**
    * Create the header of the dialog.
    *
    * @param title - The title of the dialog.
    *
    * @returns A widget for the dialog header.
    */
  def createHeader(title: Header): Widget
}

object IRenderer {
  @scala.inline
  def apply(
    createBody: Body[_] => Widget,
    createButtonNode: IButton => HTMLElement,
    createFooter: js.Array[HTMLElement] => Widget,
    createHeader: Header => Widget
  ): IRenderer = {
    val __obj = js.Dynamic.literal(createBody = js.Any.fromFunction1(createBody), createButtonNode = js.Any.fromFunction1(createButtonNode), createFooter = js.Any.fromFunction1(createFooter), createHeader = js.Any.fromFunction1(createHeader))
  
    __obj.asInstanceOf[IRenderer]
  }
}

