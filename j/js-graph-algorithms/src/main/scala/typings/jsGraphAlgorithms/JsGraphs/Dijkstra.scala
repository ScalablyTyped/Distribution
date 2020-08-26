package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dijkstra extends js.Object {
  var cost: js.Any = js.native
  var edgeTo: js.Any = js.native
  var marked: js.Any = js.native
  var pq: js.Any = js.native
  var s: js.Any = js.native
  def distanceTo(v: Double): Double = js.native
  def hasPathTo(v: Double): Boolean = js.native
  def pathTo(v: Double): js.Array[Edge] = js.native
  def relax(e: Edge): Unit = js.native
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
  @scala.inline
  implicit class DijkstraOps[Self <: Dijkstra] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCost(value: js.Any): Self = this.set("cost", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistanceTo(value: Double => Double): Self = this.set("distanceTo", js.Any.fromFunction1(value))
    @scala.inline
    def setEdgeTo(value: js.Any): Self = this.set("edgeTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasPathTo(value: Double => Boolean): Self = this.set("hasPathTo", js.Any.fromFunction1(value))
    @scala.inline
    def setMarked(value: js.Any): Self = this.set("marked", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathTo(value: Double => js.Array[Edge]): Self = this.set("pathTo", js.Any.fromFunction1(value))
    @scala.inline
    def setPq(value: js.Any): Self = this.set("pq", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelax(value: Edge => Unit): Self = this.set("relax", js.Any.fromFunction1(value))
    @scala.inline
    def setS(value: js.Any): Self = this.set("s", value.asInstanceOf[js.Any])
  }
  
}

