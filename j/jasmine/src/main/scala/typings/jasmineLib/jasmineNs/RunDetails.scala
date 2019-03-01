package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunDetails extends js.Object {
  var failedExpectations: js.Array[ExpectationResult]
  var order: Order
}

object RunDetails {
  @scala.inline
  def apply(failedExpectations: js.Array[ExpectationResult], order: Order): RunDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failedExpectations")(failedExpectations)
    __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[RunDetails]
  }
}

