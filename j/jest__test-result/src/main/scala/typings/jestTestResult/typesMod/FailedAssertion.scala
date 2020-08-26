package typings.jestTestResult.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedAssertion extends js.Object {
  var actual: js.UndefOr[js.Any] = js.native
  var error: js.UndefOr[js.Any] = js.native
  var expected: js.UndefOr[js.Any] = js.native
  var isNot: js.UndefOr[Boolean] = js.native
  var matcherName: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
  var pass: js.UndefOr[Boolean] = js.native
  var passed: js.UndefOr[Boolean] = js.native
  var stack: js.UndefOr[String] = js.native
}

object FailedAssertion {
  @scala.inline
  def apply(): FailedAssertion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedAssertion]
  }
  @scala.inline
  implicit class FailedAssertionOps[Self <: FailedAssertion] (val x: Self) extends AnyVal {
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
    def setActual(value: js.Any): Self = this.set("actual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActual: Self = this.set("actual", js.undefined)
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExpected(value: js.Any): Self = this.set("expected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpected: Self = this.set("expected", js.undefined)
    @scala.inline
    def setIsNot(value: Boolean): Self = this.set("isNot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNot: Self = this.set("isNot", js.undefined)
    @scala.inline
    def setMatcherName(value: String): Self = this.set("matcherName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatcherName: Self = this.set("matcherName", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setPass(value: Boolean): Self = this.set("pass", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePass: Self = this.set("pass", js.undefined)
    @scala.inline
    def setPassed(value: Boolean): Self = this.set("passed", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassed: Self = this.set("passed", js.undefined)
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
  
}

