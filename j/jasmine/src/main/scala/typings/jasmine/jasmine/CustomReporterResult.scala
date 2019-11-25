package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomReporterResult extends js.Object {
  var description: String
  var failedExpectations: js.UndefOr[js.Array[FailedExpectation]] = js.undefined
  var fullName: String
  var id: String
  var passedExpectations: js.UndefOr[js.Array[PassedExpectation]] = js.undefined
  var pendingReason: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object CustomReporterResult {
  @scala.inline
  def apply(
    description: String,
    fullName: String,
    id: String,
    failedExpectations: js.Array[FailedExpectation] = null,
    passedExpectations: js.Array[PassedExpectation] = null,
    pendingReason: String = null,
    status: String = null
  ): CustomReporterResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (failedExpectations != null) __obj.updateDynamic("failedExpectations")(failedExpectations.asInstanceOf[js.Any])
    if (passedExpectations != null) __obj.updateDynamic("passedExpectations")(passedExpectations.asInstanceOf[js.Any])
    if (pendingReason != null) __obj.updateDynamic("pendingReason")(pendingReason.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomReporterResult]
  }
}

