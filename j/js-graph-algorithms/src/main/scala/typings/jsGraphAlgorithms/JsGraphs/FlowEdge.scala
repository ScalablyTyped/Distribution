package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowEdge extends js.Object {
  var capacity: js.Any = js.native
  var flow: js.Any = js.native
  var label: js.UndefOr[String] = js.native
  var v: js.Any = js.native
  var w: js.Any = js.native
  def addResidualFlowTo(x: Double, deltaFlow: Double): Unit = js.native
  def from(): Double = js.native
  def other(x: Double): Double = js.native
  def residualCapacityTo(x: Double): Double = js.native
  def to(): Double = js.native
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
    w: js.Any
  ): FlowEdge = {
    val __obj = js.Dynamic.literal(addResidualFlowTo = js.Any.fromFunction2(addResidualFlowTo), capacity = capacity.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], from = js.Any.fromFunction0(from), other = js.Any.fromFunction1(other), residualCapacityTo = js.Any.fromFunction1(residualCapacityTo), to = js.Any.fromFunction0(to), v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowEdge]
  }
  @scala.inline
  implicit class FlowEdgeOps[Self <: FlowEdge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddResidualFlowTo(value: (Double, Double) => Unit): Self = this.set("addResidualFlowTo", js.Any.fromFunction2(value))
    @scala.inline
    def setCapacity(value: js.Any): Self = this.set("capacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlow(value: js.Any): Self = this.set("flow", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: () => Double): Self = this.set("from", js.Any.fromFunction0(value))
    @scala.inline
    def setOther(value: Double => Double): Self = this.set("other", js.Any.fromFunction1(value))
    @scala.inline
    def setResidualCapacityTo(value: Double => Double): Self = this.set("residualCapacityTo", js.Any.fromFunction1(value))
    @scala.inline
    def setTo(value: () => Double): Self = this.set("to", js.Any.fromFunction0(value))
    @scala.inline
    def setV(value: js.Any): Self = this.set("v", value.asInstanceOf[js.Any])
    @scala.inline
    def setW(value: js.Any): Self = this.set("w", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
  
}

