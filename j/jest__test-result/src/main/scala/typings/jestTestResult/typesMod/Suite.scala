package typings.jestTestResult.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Suite extends js.Object {
  var suites: js.Array[Suite] = js.native
  var tests: js.Array[AssertionResult] = js.native
  var title: String = js.native
}

object Suite {
  @scala.inline
  def apply(suites: js.Array[Suite], tests: js.Array[AssertionResult], title: String): Suite = {
    val __obj = js.Dynamic.literal(suites = suites.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suite]
  }
  @scala.inline
  implicit class SuiteOps[Self <: Suite] (val x: Self) extends AnyVal {
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
    def setSuitesVarargs(value: Suite*): Self = this.set("suites", js.Array(value :_*))
    @scala.inline
    def setSuites(value: js.Array[Suite]): Self = this.set("suites", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestsVarargs(value: AssertionResult*): Self = this.set("tests", js.Array(value :_*))
    @scala.inline
    def setTests(value: js.Array[AssertionResult]): Self = this.set("tests", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

