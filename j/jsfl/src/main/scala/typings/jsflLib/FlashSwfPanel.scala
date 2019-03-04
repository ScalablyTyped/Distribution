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
    val __obj = js.Dynamic.literal(call = call, name = name, path = path, setFocus = setFocus)
  
    __obj.asInstanceOf[FlashSwfPanel]
  }
}

