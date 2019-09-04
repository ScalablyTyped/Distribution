package typings.atJestTypes.buildCircusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunResult extends js.Object {
  var testResults: TestResults
  var unhandledErrors: js.Array[FormattedError]
}

object RunResult {
  @scala.inline
  def apply(testResults: TestResults, unhandledErrors: js.Array[FormattedError]): RunResult = {
    val __obj = js.Dynamic.literal(testResults = testResults, unhandledErrors = unhandledErrors)
  
    __obj.asInstanceOf[RunResult]
  }
}

