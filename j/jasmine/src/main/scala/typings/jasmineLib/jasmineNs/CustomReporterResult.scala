package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomReporterResult extends js.Object {
  var description: java.lang.String
  var failedExpectations: js.UndefOr[js.Array[FailedExpectation]] = js.undefined
  var fullName: java.lang.String
  var id: java.lang.String
  var passedExpectations: js.UndefOr[js.Array[PassedExpectation]] = js.undefined
  var pendingReason: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object CustomReporterResult {
  @scala.inline
  def apply(
    description: java.lang.String,
    fullName: java.lang.String,
    id: java.lang.String,
    failedExpectations: js.Array[FailedExpectation] = null,
    passedExpectations: js.Array[PassedExpectation] = null,
    pendingReason: java.lang.String = null,
    status: java.lang.String = null
  ): CustomReporterResult = {
    val __obj = js.Dynamic.literal(description = description, fullName = fullName, id = id)
    if (failedExpectations != null) __obj.updateDynamic("failedExpectations")(failedExpectations)
    if (passedExpectations != null) __obj.updateDynamic("passedExpectations")(passedExpectations)
    if (pendingReason != null) __obj.updateDynamic("pendingReason")(pendingReason)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[CustomReporterResult]
  }
}

