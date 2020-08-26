package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomReporterResult extends js.Object {
  var description: String = js.native
  var failedExpectations: js.UndefOr[js.Array[FailedExpectation]] = js.native
  var fullName: String = js.native
  var id: String = js.native
  var passedExpectations: js.UndefOr[js.Array[PassedExpectation]] = js.native
  var pendingReason: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
}

object CustomReporterResult {
  @scala.inline
  def apply(description: String, fullName: String, id: String): CustomReporterResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomReporterResult]
  }
  @scala.inline
  implicit class CustomReporterResultOps[Self <: CustomReporterResult] (val x: Self) extends AnyVal {
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
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailedExpectationsVarargs(value: FailedExpectation*): Self = this.set("failedExpectations", js.Array(value :_*))
    @scala.inline
    def setFailedExpectations(value: js.Array[FailedExpectation]): Self = this.set("failedExpectations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedExpectations: Self = this.set("failedExpectations", js.undefined)
    @scala.inline
    def setPassedExpectationsVarargs(value: PassedExpectation*): Self = this.set("passedExpectations", js.Array(value :_*))
    @scala.inline
    def setPassedExpectations(value: js.Array[PassedExpectation]): Self = this.set("passedExpectations", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassedExpectations: Self = this.set("passedExpectations", js.undefined)
    @scala.inline
    def setPendingReason(value: String): Self = this.set("pendingReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingReason: Self = this.set("pendingReason", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

