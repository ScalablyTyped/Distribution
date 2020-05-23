package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LazyPrimMST extends js.Object {
  var marked: js.Any
  var mst: js.Array[Edge]
  var pq: js.Any
  def visit(G: WeightedGraph, v: Double): Unit
}

object LazyPrimMST {
  @scala.inline
  def apply(marked: js.Any, mst: js.Array[Edge], pq: js.Any, visit: (WeightedGraph, Double) => Unit): LazyPrimMST = {
    val __obj = js.Dynamic.literal(marked = marked.asInstanceOf[js.Any], mst = mst.asInstanceOf[js.Any], pq = pq.asInstanceOf[js.Any], visit = js.Any.fromFunction2(visit))
    __obj.asInstanceOf[LazyPrimMST]
  }
}

