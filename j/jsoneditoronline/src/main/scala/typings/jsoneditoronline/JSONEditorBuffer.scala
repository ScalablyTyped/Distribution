package typings.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEditorBuffer extends js.Object {
  var text: String = js.native
  def flush(): String = js.native
  def set(text: String): Unit = js.native
}

object JSONEditorBuffer {
  @scala.inline
  def apply(flush: () => String, set: String => Unit, text: String): JSONEditorBuffer = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), set = js.Any.fromFunction1(set), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEditorBuffer]
  }
  @scala.inline
  implicit class JSONEditorBufferOps[Self <: JSONEditorBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFlush(value: () => String): Self = this.set("flush", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: String => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

