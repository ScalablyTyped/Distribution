package typings.atJestTestDashResult.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormattedAssertionResult extends js.Object {
  var ancestorTitles: js.Array[String]
  var failureMessages: js.Array[String] | Null
  var fullName: String
  var location: js.UndefOr[Callsite | Null] = js.undefined
  var status: Status
  var title: String
}

object FormattedAssertionResult {
  @scala.inline
  def apply(
    ancestorTitles: js.Array[String],
    fullName: String,
    status: Status,
    title: String,
    failureMessages: js.Array[String] = null,
    location: Callsite = null
  ): FormattedAssertionResult = {
    val __obj = js.Dynamic.literal(ancestorTitles = ancestorTitles, fullName = fullName, status = status, title = title)
    if (failureMessages != null) __obj.updateDynamic("failureMessages")(failureMessages)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[FormattedAssertionResult]
  }
}

