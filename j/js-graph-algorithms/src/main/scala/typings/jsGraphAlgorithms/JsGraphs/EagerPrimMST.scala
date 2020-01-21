package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.EagerPrimMST")
@js.native
class EagerPrimMST protected () extends js.Object {
  def this(G: WeightedGraph) = this()
  var marked: js.Any = js.native
  var mst: js.Array[Edge] = js.native
  var pq: js.Any = js.native
  def visit(G: WeightedGraph, v: Double): Unit = js.native
}

