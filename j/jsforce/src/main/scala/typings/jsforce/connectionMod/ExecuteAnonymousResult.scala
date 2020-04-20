package typings.jsforce.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteAnonymousResult extends js.Object {
  var column: Double
  var compileProblem: String
  var compiled: Boolean
  var exceptionMessage: String
  var exceptionStackTrace: String
  var line: Double
  var success: Boolean
}

object ExecuteAnonymousResult {
  @scala.inline
  def apply(
    column: Double,
    compileProblem: String,
    compiled: Boolean,
    exceptionMessage: String,
    exceptionStackTrace: String,
    line: Double,
    success: Boolean
  ): ExecuteAnonymousResult = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], compileProblem = compileProblem.asInstanceOf[js.Any], compiled = compiled.asInstanceOf[js.Any], exceptionMessage = exceptionMessage.asInstanceOf[js.Any], exceptionStackTrace = exceptionStackTrace.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteAnonymousResult]
  }
}

