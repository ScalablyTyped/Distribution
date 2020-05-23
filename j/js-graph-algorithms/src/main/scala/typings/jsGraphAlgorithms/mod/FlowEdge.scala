package typings.jsGraphAlgorithms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-graph-algorithms", "FlowEdge")
@js.native
class FlowEdge protected ()
  extends typings.jsGraphAlgorithms.JsGraphs.FlowEdge {
  def this(v: Double, w: Double, capacity: Double) = this()
  /* CompleteClass */
  override var capacity: js.Any = js.native
  /* CompleteClass */
  override var flow: js.Any = js.native
  /* CompleteClass */
  override var v: js.Any = js.native
  /* CompleteClass */
  override var w: js.Any = js.native
  /* CompleteClass */
  override def addResidualFlowTo(x: Double, deltaFlow: Double): Unit = js.native
  /* CompleteClass */
  override def from(): Double = js.native
  /* CompleteClass */
  override def other(x: Double): Double = js.native
  /* CompleteClass */
  override def residualCapacityTo(x: Double): Double = js.native
  /* CompleteClass */
  override def to(): Double = js.native
}

