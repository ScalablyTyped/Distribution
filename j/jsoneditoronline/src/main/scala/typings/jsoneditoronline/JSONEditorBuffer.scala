package typings.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorBuffer extends js.Object {
  var text: String
  def flush(): String
  def set(text: String): Unit
}

object JSONEditorBuffer {
  @scala.inline
  def apply(flush: () => String, set: String => Unit, text: String): JSONEditorBuffer = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), set = js.Any.fromFunction1(set), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEditorBuffer]
  }
}

