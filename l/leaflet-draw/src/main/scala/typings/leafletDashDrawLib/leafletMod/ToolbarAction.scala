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
  def apply(callback: () => scala.Unit, context: js.Object, text: java.lang.String, title: java.lang.String): ToolbarAction = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), context = context, text = text, title = title)
  
    __obj.asInstanceOf[ToolbarAction]
  }
}

