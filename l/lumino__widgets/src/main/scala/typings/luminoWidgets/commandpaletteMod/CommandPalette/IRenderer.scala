package typings.luminoWidgets.commandpaletteMod.CommandPalette

import typings.luminoVirtualdom.mod.VirtualElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A renderer for use with a command palette.
  */
trait IRenderer extends js.Object {
  /**
    * Render the empty results message for a command palette.
    *
    * @param data - The data to use for rendering the message.
    *
    * @returns A virtual element representing the message.
    */
  def renderEmptyMessage(data: IEmptyMessageRenderData): VirtualElement
  /**
    * Render the virtual element for a command palette header.
    *
    * @param data - The data to use for rendering the header.
    *
    * @returns A virtual element representing the header.
    */
  def renderHeader(data: IHeaderRenderData): VirtualElement
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
  def renderItem(data: IItemRenderData): VirtualElement
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
}

