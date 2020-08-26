package typings.jestTypes.circusMod

import typings.jestTypes.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResult extends js.Object {
  var duration: js.UndefOr[Double | Null] = js.native
  var errors: js.Array[FormattedError] = js.native
  var invocations: Double = js.native
  var location: js.UndefOr[Column | Null] = js.native
  var status: TestStatus = js.native
  var testPath: js.Array[TestName | BlockName] = js.native
}

object TestResult {
  @scala.inline
  def apply(
    errors: js.Array[FormattedError],
    invocations: Double,
    status: TestStatus,
    testPath: js.Array[TestName | BlockName]
  ): TestResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], invocations = invocations.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
  @scala.inline
  implicit class TestResultOps[Self <: TestResult] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: FormattedError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[FormattedError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvocations(value: Double): Self = this.set("invocations", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: TestStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestPathVarargs(value: (TestName | BlockName)*): Self = this.set("testPath", js.Array(value :_*))
    @scala.inline
    def setTestPath(value: js.Array[TestName | BlockName]): Self = this.set("testPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setDurationNull: Self = this.set("duration", null)
    @scala.inline
    def setLocation(value: Column): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setLocationNull: Self = this.set("location", null)
  }
  
}

