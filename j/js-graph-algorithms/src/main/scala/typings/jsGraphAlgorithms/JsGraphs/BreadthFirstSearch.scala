package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadthFirstSearch extends js.Object {
  var V: js.Any
  var edgeTo: js.Any
  var marked: js.Any
  var s: js.Any
  def hasPathTo(v: Double): Boolean
  def pathTo(v: Double): js.Array[Double]
}

object BreadthFirstSearch {
  @scala.inline
  def apply(
    V: js.Any,
    edgeTo: js.Any,
    hasPathTo: Double => Boolean,
    marked: js.Any,
    pathTo: Double => js.Array[Double],
    s: js.Any
  ): BreadthFirstSearch = {
    val __obj = js.Dynamic.literal(V = V.asInstanceOf[js.Any], edgeTo = edgeTo.asInstanceOf[js.Any], hasPathTo = js.Any.fromFunction1(hasPathTo), marked = marked.asInstanceOf[js.Any], pathTo = js.Any.fromFunction1(pathTo), s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadthFirstSearch]
  }
}

