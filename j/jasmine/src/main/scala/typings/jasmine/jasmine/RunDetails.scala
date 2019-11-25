package typings.jasmine.jasmine

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
    val __obj = js.Dynamic.literal(failedExpectations = failedExpectations.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RunDetails]
  }
}

