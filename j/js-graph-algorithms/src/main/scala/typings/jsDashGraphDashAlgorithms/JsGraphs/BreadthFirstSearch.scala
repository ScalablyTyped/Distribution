package typings.jsDashGraphDashAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.BreadthFirstSearch")
@js.native
class BreadthFirstSearch protected () extends js.Object {
  def this(G: Graph, s: Double) = this()
  var V: js.Any = js.native
  var edgeTo: js.Any = js.native
  var marked: js.Any = js.native
  var s: js.Any = js.native
  def hasPathTo(v: Double): Boolean = js.native
  def pathTo(v: Double): js.Array[Double] = js.native
}

