package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashSwfPanel extends js.Object {
  var name: js.Any
  var path: js.Any
  def call(): js.Any
  def setFocus(): js.Any
}

object FlashSwfPanel {
  @scala.inline
  def apply(call: () => js.Any, name: js.Any, path: js.Any, setFocus: () => js.Any): FlashSwfPanel = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction0(call), name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], setFocus = js.Any.fromFunction0(setFocus))
    __obj.asInstanceOf[FlashSwfPanel]
  }
}

