package typings.karma.karmaMod

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
    val __obj = js.Dynamic.literal(disconnected = disconnected, error = error, exitCode = exitCode, failed = failed, success = success)
  
    __obj.asInstanceOf[TestResults]
  }
}

