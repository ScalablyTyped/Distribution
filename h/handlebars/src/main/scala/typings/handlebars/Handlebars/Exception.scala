package typings.handlebars.Handlebars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exception extends js.Object {
  var column: js.UndefOr[js.Any] = js.native
  var description: String = js.native
  var endColumn: js.UndefOr[js.Any] = js.native
  var endLineNumber: js.UndefOr[js.Any] = js.native
  var fileName: String = js.native
  var lineNumber: js.UndefOr[js.Any] = js.native
  var message: String = js.native
  var name: String = js.native
  var number: Double = js.native
  var stack: js.UndefOr[String] = js.native
}

object Exception {
  @scala.inline
  def apply(description: String, fileName: String, message: String, name: String, number: Double): Exception = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exception]
  }
  @scala.inline
  implicit class ExceptionOps[Self <: Exception] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumn(value: js.Any): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setEndColumn(value: js.Any): Self = this.set("endColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndColumn: Self = this.set("endColumn", js.undefined)
    @scala.inline
    def setEndLineNumber(value: js.Any): Self = this.set("endLineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndLineNumber: Self = this.set("endLineNumber", js.undefined)
    @scala.inline
    def setLineNumber(value: js.Any): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineNumber: Self = this.set("lineNumber", js.undefined)
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
  
}

