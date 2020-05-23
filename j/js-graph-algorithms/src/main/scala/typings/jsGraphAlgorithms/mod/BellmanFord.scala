package typings.jsGraphAlgorithms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-graph-algorithms", "BellmanFord")
@js.native
class BellmanFord protected ()
  extends typings.jsGraphAlgorithms.JsGraphs.BellmanFord {
  def this(G: typings.jsGraphAlgorithms.JsGraphs.WeightedGraph, s: Double) = this()
  /* CompleteClass */
  override var cost: js.Any = js.native
  /* CompleteClass */
  override var edgeTo: js.Any = js.native
  /* CompleteClass */
  override var marked: js.Any = js.native
  /* CompleteClass */
  override var s: js.Any = js.native
  /* CompleteClass */
  override def distanceTo(v: Double): Double = js.native
  /* CompleteClass */
  override def hasPathTo(v: Double): Boolean = js.native
  /* CompleteClass */
  override def pathTo(v: Double): js.Array[typings.jsGraphAlgorithms.JsGraphs.Edge] = js.native
  /* CompleteClass */
  override def relax(e: typings.jsGraphAlgorithms.JsGraphs.Edge): Unit = js.native
}

