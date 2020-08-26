package typings.jestSnapshot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Name extends js.Object {
  var actual: String = js.native
  var expected: String | Null = js.native
  var name: String = js.native
  var pass: Boolean = js.native
  def message(): String = js.native
  def report(): String = js.native
}

object Name {
  @scala.inline
  def apply(actual: String, message: () => String, name: String, pass: Boolean, report: () => String): Name = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], message = js.Any.fromFunction0(message), name = name.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], report = js.Any.fromFunction0(report))
    __obj.asInstanceOf[Name]
  }
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
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
    def setActual(value: String): Self = this.set("actual", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: () => String): Self = this.set("message", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPass(value: Boolean): Self = this.set("pass", value.asInstanceOf[js.Any])
    @scala.inline
    def setReport(value: () => String): Self = this.set("report", js.Any.fromFunction0(value))
    @scala.inline
    def setExpected(value: String): Self = this.set("expected", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpectedNull: Self = this.set("expected", null)
  }
  
}

