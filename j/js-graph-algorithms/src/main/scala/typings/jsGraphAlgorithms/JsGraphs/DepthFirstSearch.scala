package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepthFirstSearch[T] extends js.Object {
  var edgeTo: js.Any
  var marked: js.Any
  var s: js.Any
  def dfs(G: Graph, v: Double): Unit
  def hasPathTo(v: Double): Boolean
  def pathTo(v: Double): js.Array[Double]
}

object DepthFirstSearch {
  @scala.inline
  def apply[T](
    dfs: (Graph, Double) => Unit,
    edgeTo: js.Any,
    hasPathTo: Double => Boolean,
    marked: js.Any,
    pathTo: Double => js.Array[Double],
    s: js.Any
  ): DepthFirstSearch[T] = {
    val __obj = js.Dynamic.literal(dfs = js.Any.fromFunction2(dfs), edgeTo = edgeTo.asInstanceOf[js.Any], hasPathTo = js.Any.fromFunction1(hasPathTo), marked = marked.asInstanceOf[js.Any], pathTo = js.Any.fromFunction1(pathTo), s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthFirstSearch[T]]
  }
}

