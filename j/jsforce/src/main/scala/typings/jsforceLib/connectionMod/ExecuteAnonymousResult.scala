package typings
package jsforceLib.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteAnonymousResult extends js.Object {
  var column: scala.Double
  var compileProblem: java.lang.String
  var compiled: scala.Boolean
  var exceptionMessage: java.lang.String
  var exceptionStackTrace: java.lang.String
  var line: scala.Double
  var success: scala.Boolean
}

object ExecuteAnonymousResult {
  @scala.inline
  def apply(
    column: scala.Double,
    compileProblem: java.lang.String,
    compiled: scala.Boolean,
    exceptionMessage: java.lang.String,
    exceptionStackTrace: java.lang.String,
    line: scala.Double,
    success: scala.Boolean
  ): ExecuteAnonymousResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("compileProblem")(compileProblem)
    __obj.updateDynamic("compiled")(compiled)
    __obj.updateDynamic("exceptionMessage")(exceptionMessage)
    __obj.updateDynamic("exceptionStackTrace")(exceptionStackTrace)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[ExecuteAnonymousResult]
  }
}

