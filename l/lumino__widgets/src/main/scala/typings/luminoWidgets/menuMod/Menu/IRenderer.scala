package typings.luminoWidgets.menuMod.Menu

import typings.luminoVirtualdom.mod.VirtualElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A renderer for use with a menu.
  */
@js.native
trait IRenderer extends js.Object {
  /**
    * Render the virtual element for a menu item.
    *
    * @param data - The data to use for rendering the item.
    *
    * @returns A virtual element representing the item.
    */
  def renderItem(data: IRenderData): VirtualElement = js.native
}

object IRenderer {
  @scala.inline
  def apply(renderItem: IRenderData => VirtualElement): IRenderer = {
    val __obj = js.Dynamic.literal(renderItem = js.Any.fromFunction1(renderItem))
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
    def setRenderItem(value: IRenderData => VirtualElement): Self = this.set("renderItem", js.Any.fromFunction1(value))
  }
  
}

