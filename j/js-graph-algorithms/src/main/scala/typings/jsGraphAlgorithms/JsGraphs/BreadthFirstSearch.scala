package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreadthFirstSearch extends js.Object {
  var V: js.Any = js.native
  var edgeTo: js.Any = js.native
  var marked: js.Any = js.native
  var s: js.Any = js.native
  def hasPathTo(v: Double): Boolean = js.native
  def pathTo(v: Double): js.Array[Double] = js.native
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
  @scala.inline
  implicit class BreadthFirstSearchOps[Self <: BreadthFirstSearch] (val x: Self) extends AnyVal {
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
    def setV(value: js.Any): Self = this.set("V", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdgeTo(value: js.Any): Self = this.set("edgeTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasPathTo(value: Double => Boolean): Self = this.set("hasPathTo", js.Any.fromFunction1(value))
    @scala.inline
    def setMarked(value: js.Any): Self = this.set("marked", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathTo(value: Double => js.Array[Double]): Self = this.set("pathTo", js.Any.fromFunction1(value))
    @scala.inline
    def setS(value: js.Any): Self = this.set("s", value.asInstanceOf[js.Any])
  }
  
}

