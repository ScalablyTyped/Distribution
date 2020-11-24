package typings.jupyterlabApputils.dialogMod.Dialog

import typings.luminoWidgets.mod.Widget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A dialog renderer.
  */
@js.native
trait IRenderer extends js.Object {
  
  /**
    * Create the body of the dialog.
    *
    * @param value - The input value for the body.
    *
    * @returns A widget for the body.
    */
  def createBody(body: Body[_]): Widget = js.native
  
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
    * @param buttons - The button nodes to add to the footer.
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
  
  @scala.inline
  implicit class IRendererOps[Self <: IRenderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateBody(value: Body[_] => Widget): Self = this.set("createBody", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateButtonNode(value: IButton => HTMLElement): Self = this.set("createButtonNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateFooter(value: js.Array[HTMLElement] => Widget): Self = this.set("createFooter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateHeader(value: Header => Widget): Self = this.set("createHeader", js.Any.fromFunction1(value))
  }
}
