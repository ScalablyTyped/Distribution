package typings.luminoWidgets.splitlayoutMod.SplitLayout

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A renderer for use with a split layout.
  */
trait IRenderer extends js.Object {
  /**
    * Create a new handle for use with a split layout.
    *
    * @returns A new handle element.
    */
  def createHandle(): HTMLDivElement
}

object IRenderer {
  @scala.inline
  def apply(createHandle: () => HTMLDivElement): IRenderer = {
    val __obj = js.Dynamic.literal(createHandle = js.Any.fromFunction0(createHandle))
  
    __obj.asInstanceOf[IRenderer]
  }
}

