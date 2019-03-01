package typings
package jsflLib

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
  def apply(call: js.Function0[js.Any], name: js.Any, path: js.Any, setFocus: js.Function0[js.Any]): FlashSwfPanel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("call")(call)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("setFocus")(setFocus)
    __obj.asInstanceOf[FlashSwfPanel]
  }
}

