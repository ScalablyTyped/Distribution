package typings.karma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResults extends js.Object {
  var disconnected: Boolean
  var error: Boolean
  var exitCode: Double
  var failed: Double
  var success: Double
}

object TestResults {
  @scala.inline
  def apply(disconnected: Boolean, error: Boolean, exitCode: Double, failed: Double, success: Double): TestResults = {
    val __obj = js.Dynamic.literal(disconnected = disconnected.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResults]
  }
}

