package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashComponentsPanel extends js.Object {
  def addItemToDocument(): js.Any
  def reload(): js.Any
}

object FlashComponentsPanel {
  @scala.inline
  def apply(addItemToDocument: () => js.Any, reload: () => js.Any): FlashComponentsPanel = {
    val __obj = js.Dynamic.literal(addItemToDocument = js.Any.fromFunction0(addItemToDocument), reload = js.Any.fromFunction0(reload))
  
    __obj.asInstanceOf[FlashComponentsPanel]
  }
}

