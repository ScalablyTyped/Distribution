package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomReportExpectation extends js.Object {
  var matcherName: String = js.native
  var message: String = js.native
  var passed: Boolean = js.native
  var stack: String = js.native
}

object CustomReportExpectation {
  @scala.inline
  def apply(matcherName: String, message: String, passed: Boolean, stack: String): CustomReportExpectation = {
    val __obj = js.Dynamic.literal(matcherName = matcherName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomReportExpectation]
  }
  @scala.inline
  implicit class CustomReportExpectationOps[Self <: CustomReportExpectation] (val x: Self) extends AnyVal {
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
    def setMatcherName(value: String): Self = this.set("matcherName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassed(value: Boolean): Self = this.set("passed", value.asInstanceOf[js.Any])
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
  }
  
}

