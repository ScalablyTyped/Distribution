package typings
package karmaLib.karmaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResults extends js.Object {
  var disconnected: scala.Boolean
  var error: scala.Boolean
  var exitCode: scala.Double
  var failed: scala.Double
  var success: scala.Double
}

object TestResults {
  @scala.inline
  def apply(
    disconnected: scala.Boolean,
    error: scala.Boolean,
    exitCode: scala.Double,
    failed: scala.Double,
    success: scala.Double
  ): TestResults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disconnected")(disconnected)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("exitCode")(exitCode)
    __obj.updateDynamic("failed")(failed)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[TestResults]
  }
}

