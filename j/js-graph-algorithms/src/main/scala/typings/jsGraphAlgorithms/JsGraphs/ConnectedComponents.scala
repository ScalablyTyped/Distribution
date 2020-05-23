package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectedComponents extends js.Object {
  var count: js.Any
  var id: js.Any
  var marked: js.Any
  def componentCount(): Double
  def componentId(v: Double): Double
  def dfs(G: Graph, v: Double): Unit
}

object ConnectedComponents {
  @scala.inline
  def apply(
    componentCount: () => Double,
    componentId: Double => Double,
    count: js.Any,
    dfs: (Graph, Double) => Unit,
    id: js.Any,
    marked: js.Any
  ): ConnectedComponents = {
    val __obj = js.Dynamic.literal(componentCount = js.Any.fromFunction0(componentCount), componentId = js.Any.fromFunction1(componentId), count = count.asInstanceOf[js.Any], dfs = js.Any.fromFunction2(dfs), id = id.asInstanceOf[js.Any], marked = marked.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectedComponents]
  }
}

