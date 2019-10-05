package typings.jest.jestMod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertionResult extends js.Object {
  var ancestorTitles: js.Array[String]
  var duration: js.UndefOr[Maybe[Milliseconds]] = js.undefined
  var failureMessages: js.Array[String]
  var fullName: String
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
    duration: Maybe[Milliseconds] = null
  ): AssertionResult = {
    val __obj = js.Dynamic.literal(ancestorTitles = ancestorTitles, failureMessages = failureMessages, fullName = fullName, numPassingAsserts = numPassingAsserts, status = status, title = title)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionResult]
  }
}

