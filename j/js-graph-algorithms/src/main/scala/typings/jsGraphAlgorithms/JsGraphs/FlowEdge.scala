package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowEdge extends js.Object {
  var capacity: js.Any
  var flow: js.Any
  var label: js.UndefOr[String] = js.undefined
  var v: js.Any
  var w: js.Any
  def addResidualFlowTo(x: Double, deltaFlow: Double): Unit
  def from(): Double
  def other(x: Double): Double
  def residualCapacityTo(x: Double): Double
  def to(): Double
}

object FlowEdge {
  @scala.inline
  def apply(
    addResidualFlowTo: (Double, Double) => Unit,
    capacity: js.Any,
    flow: js.Any,
    from: () => Double,
    other: Double => Double,
    residualCapacityTo: Double => Double,
    to: () => Double,
    v: js.Any,
    w: js.Any,
    label: String = null
  ): FlowEdge = {
    val __obj = js.Dynamic.literal(addResidualFlowTo = js.Any.fromFunction2(addResidualFlowTo), capacity = capacity.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], from = js.Any.fromFunction0(from), other = js.Any.fromFunction1(other), residualCapacityTo = js.Any.fromFunction1(residualCapacityTo), to = js.Any.fromFunction0(to), v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowEdge]
  }
}

