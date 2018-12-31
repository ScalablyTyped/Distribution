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

