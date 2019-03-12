package typings
package jsoneditoronlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorBuffer extends js.Object {
  var text: java.lang.String
  def flush(): java.lang.String
  def set(text: java.lang.String): scala.Unit
}

object JSONEditorBuffer {
  @scala.inline
  def apply(flush: () => java.lang.String, set: java.lang.String => scala.Unit, text: java.lang.String): JSONEditorBuffer = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), set = js.Any.fromFunction1(set), text = text)
  
    __obj.asInstanceOf[JSONEditorBuffer]
  }
}

