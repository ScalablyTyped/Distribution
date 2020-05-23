package typings.jsGraphAlgorithms.global.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.TopologicalSort")
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

