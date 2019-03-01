package typings
package leafletDashDrawLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarAction extends js.Object {
  var context: js.Object
  var text: java.lang.String
  var title: java.lang.String
  def callback(): scala.Unit
}

object ToolbarAction {
  @scala.inline
  def apply(
    callback: js.Function0[scala.Unit],
    context: js.Object,
    text: java.lang.String,
    title: java.lang.String
  ): ToolbarAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callback")(callback)
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ToolbarAction]
  }
}

