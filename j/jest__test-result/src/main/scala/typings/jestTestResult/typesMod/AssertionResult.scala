package typings.jestTestResult.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertionResult extends js.Object {
  var ancestorTitles: js.Array[String]
  var duration: js.UndefOr[Milliseconds | Null] = js.undefined
  var failureMessages: js.Array[String]
  var fullName: String
  var invocations: js.UndefOr[Double] = js.undefined
  var location: js.UndefOr[Callsite | Null] = js.undefined
  var numPassingAsserts: Double
  var status: Status
  var title: String
}

object AssertionResult {
  @scala.inline
  def apply(
    ancestorTitles: js.Array[String],
    failureMessages: js.Array[String],
    fullName: String,
    numPassingAsserts: Double,
    status: Status,
    title: String,
    duration: Int | Double = null,
    invocations: Int | Double = null,
    location: Callsite = null
  ): AssertionResult = {
    val __obj = js.Dynamic.literal(ancestorTitles = ancestorTitles.asInstanceOf[js.Any], failureMessages = failureMessages.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], numPassingAsserts = numPassingAsserts.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (invocations != null) __obj.updateDynamic("invocations")(invocations.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionResult]
  }
}

