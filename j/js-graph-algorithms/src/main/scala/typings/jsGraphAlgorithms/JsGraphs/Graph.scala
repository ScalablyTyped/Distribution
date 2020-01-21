package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.Graph")
@js.native
class Graph protected () extends js.Object {
  def this(V: Double) = this()
  var V: Double = js.native
  var adjList: js.Any = js.native
  var edges: js.Any = js.native
  var nodeInfo: js.Any = js.native
  def addEdge(v: Double, w: Double): Unit = js.native
  def adj(v: Double): js.Array[Double] = js.native
  def edge(v: Double, w: Double): Edge | Null = js.native
  def node(v: Double): Node = js.native
}

