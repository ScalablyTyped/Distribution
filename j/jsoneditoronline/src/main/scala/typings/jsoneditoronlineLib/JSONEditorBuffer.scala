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
  def apply(
    flush: js.Function0[java.lang.String],
    set: js.Function1[java.lang.String, scala.Unit],
    text: java.lang.String
  ): JSONEditorBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flush")(flush)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[JSONEditorBuffer]
  }
}

