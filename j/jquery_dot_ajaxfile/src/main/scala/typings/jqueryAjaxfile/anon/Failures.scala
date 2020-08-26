package typings.jqueryAjaxfile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Failures extends js.Object {
  var failures: Double = js.native
  var passes: Double = js.native
  var pending: Double = js.native
  var suites: Double = js.native
  var tests: Double = js.native
}

object Failures {
  @scala.inline
  def apply(failures: Double, passes: Double, pending: Double, suites: Double, tests: Double): Failures = {
    val __obj = js.Dynamic.literal(failures = failures.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], suites = suites.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failures]
  }
  @scala.inline
  implicit class FailuresOps[Self <: Failures] (val x: Self) extends AnyVal {
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
    def setFailures(value: Double): Self = this.set("failures", value.asInstanceOf[js.Any])
    @scala.inline
    def setPasses(value: Double): Self = this.set("passes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPending(value: Double): Self = this.set("pending", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuites(value: Double): Self = this.set("suites", value.asInstanceOf[js.Any])
    @scala.inline
    def setTests(value: Double): Self = this.set("tests", value.asInstanceOf[js.Any])
  }
  
}

