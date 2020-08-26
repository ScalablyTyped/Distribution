package typings.luminoWidgets.commandpaletteMod.CommandPalette

import typings.luminoVirtualdom.mod.VirtualElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A renderer for use with a command palette.
  */
@js.native
trait IRenderer extends js.Object {
  /**
    * Render the empty results message for a command palette.
    *
    * @param data - The data to use for rendering the message.
    *
    * @returns A virtual element representing the message.
    */
  def renderEmptyMessage(data: IEmptyMessageRenderData): VirtualElement = js.native
  /**
    * Render the virtual element for a command palette header.
    *
    * @param data - The data to use for rendering the header.
    *
    * @returns A virtual element representing the header.
    */
  def renderHeader(data: IHeaderRenderData): VirtualElement = js.native
  /**
    * Render the virtual element for a command palette item.
    *
    * @param data - The data to use for rendering the item.
    *
    * @returns A virtual element representing the item.
    *
    * #### Notes
    * The command palette will not render invisible items.
    */
  def renderItem(data: IItemRenderData): VirtualElement = js.native
}

object IRenderer {
  @scala.inline
  def apply(
    renderEmptyMessage: IEmptyMessageRenderData => VirtualElement,
    renderHeader: IHeaderRenderData => VirtualElement,
    renderItem: IItemRenderData => VirtualElement
  ): IRenderer = {
    val __obj = js.Dynamic.literal(renderEmptyMessage = js.Any.fromFunction1(renderEmptyMessage), renderHeader = js.Any.fromFunction1(renderHeader), renderItem = js.Any.fromFunction1(renderItem))
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
    def setRenderEmptyMessage(value: IEmptyMessageRenderData => VirtualElement): Self = this.set("renderEmptyMessage", js.Any.fromFunction1(value))
    @scala.inline
    def setRenderHeader(value: IHeaderRenderData => VirtualElement): Self = this.set("renderHeader", js.Any.fromFunction1(value))
    @scala.inline
    def setRenderItem(value: IItemRenderData => VirtualElement): Self = this.set("renderItem", js.Any.fromFunction1(value))
  }
  
}

