package typings.leafletDashDraw.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarAction extends js.Object {
  var context: js.Object
  var text: String
  var title: String
  def callback(): Unit
}

object ToolbarAction {
  @scala.inline
  def apply(callback: () => Unit, context: js.Object, text: String, title: String): ToolbarAction = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), context = context.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ToolbarAction]
  }
}

