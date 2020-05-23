package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopologicalSort extends js.Object {
  var marked: js.Any
  var postOrder: js.Any
  def dfs(G: DiGraph, v: Double): Unit
  def order(): js.Array[Double]
}

object TopologicalSort {
  @scala.inline
  def apply(dfs: (DiGraph, Double) => Unit, marked: js.Any, order: () => js.Array[Double], postOrder: js.Any): TopologicalSort = {
    val __obj = js.Dynamic.literal(dfs = js.Any.fromFunction2(dfs), marked = marked.asInstanceOf[js.Any], order = js.Any.fromFunction0(order), postOrder = postOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopologicalSort]
  }
}

