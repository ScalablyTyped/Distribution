package typings.jsDashGraphDashAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.FlowEdge")
@js.native
class FlowEdge protected () extends js.Object {
  def this(v: Double, w: Double, capacity: Double) = this()
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

