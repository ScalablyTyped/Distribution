package typings.jsGraphAlgorithms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-graph-algorithms", "TopologicalSort")
@js.native
class TopologicalSort protected ()
  extends typings.jsGraphAlgorithms.JsGraphs.TopologicalSort {
  def this(G: typings.jsGraphAlgorithms.JsGraphs.DiGraph) = this()
  /* CompleteClass */
  override var marked: js.Any = js.native
  /* CompleteClass */
  override var postOrder: js.Any = js.native
  /* CompleteClass */
  override def dfs(G: typings.jsGraphAlgorithms.JsGraphs.DiGraph, v: Double): Unit = js.native
  /* CompleteClass */
  override def order(): js.Array[Double] = js.native
}

