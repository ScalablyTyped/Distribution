package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dijkstra extends js.Object {
  var cost: js.Any
  var edgeTo: js.Any
  var marked: js.Any
  var pq: js.Any
  var s: js.Any
  def distanceTo(v: Double): Double
  def hasPathTo(v: Double): Boolean
  def pathTo(v: Double): js.Array[Edge]
  def relax(e: Edge): Unit
}

object Dijkstra {
  @scala.inline
  def apply(
    cost: js.Any,
    distanceTo: Double => Double,
    edgeTo: js.Any,
    hasPathTo: Double => Boolean,
    marked: js.Any,
    pathTo: Double => js.Array[Edge],
    pq: js.Any,
    relax: Edge => Unit,
    s: js.Any
  ): Dijkstra = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], distanceTo = js.Any.fromFunction1(distanceTo), edgeTo = edgeTo.asInstanceOf[js.Any], hasPathTo = js.Any.fromFunction1(hasPathTo), marked = marked.asInstanceOf[js.Any], pathTo = js.Any.fromFunction1(pathTo), pq = pq.asInstanceOf[js.Any], relax = js.Any.fromFunction1(relax), s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dijkstra]
  }
}

