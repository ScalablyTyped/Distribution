package typings.luminoWidgets.splitlayoutMod.SplitLayout

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A renderer for use with a split layout.
  */
@js.native
trait IRenderer extends js.Object {
  /**
    * Create a new handle for use with a split layout.
    *
    * @returns A new handle element.
    */
  def createHandle(): HTMLDivElement = js.native
}

object IRenderer {
  @scala.inline
  def apply(createHandle: () => HTMLDivElement): IRenderer = {
    val __obj = js.Dynamic.literal(createHandle = js.Any.fromFunction0(createHandle))
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
    def setCreateHandle(value: () => HTMLDivElement): Self = this.set("createHandle", js.Any.fromFunction0(value))
  }
  
}

