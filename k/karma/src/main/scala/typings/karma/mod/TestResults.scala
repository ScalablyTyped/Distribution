package typings.karma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResults extends js.Object {
  var disconnected: Boolean = js.native
  var error: Boolean = js.native
  var exitCode: Double = js.native
  var failed: Double = js.native
  var success: Double = js.native
}

object TestResults {
  @scala.inline
  def apply(disconnected: Boolean, error: Boolean, exitCode: Double, failed: Double, success: Double): TestResults = {
    val __obj = js.Dynamic.literal(disconnected = disconnected.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResults]
  }
  @scala.inline
  implicit class TestResultsOps[Self <: TestResults] (val x: Self) extends AnyVal {
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
    def setDisconnected(value: Boolean): Self = this.set("disconnected", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setExitCode(value: Double): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailed(value: Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Double): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

