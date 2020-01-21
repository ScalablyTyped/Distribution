package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.BellmanFord")
@js.native
class BellmanFord protected () extends js.Object {
  def this(G: WeightedGraph, s: Double) = this()
  var cost: js.Any = js.native
  var edgeTo: js.Any = js.native
  var marked: js.Any = js.native
  var s: js.Any = js.native
  def distanceTo(v: Double): Double = js.native
  def hasPathTo(v: Double): Boolean = js.native
  def pathTo(v: Double): js.Array[Edge] = js.native
  def relax(e: Edge): Unit = js.native
}

