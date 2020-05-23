package typings.jsGraphAlgorithms.global.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.DepthFirstSearch")
@js.native
class DepthFirstSearch[T] protected ()
  extends typings.jsGraphAlgorithms.JsGraphs.DepthFirstSearch[T] {
  def this(G: typings.jsGraphAlgorithms.JsGraphs.Graph, s: Double) = this()
  /* CompleteClass */
  override var edgeTo: js.Any = js.native
  /* CompleteClass */
  override var marked: js.Any = js.native
  /* CompleteClass */
  override var s: js.Any = js.native
  /* CompleteClass */
  override def dfs(G: typings.jsGraphAlgorithms.JsGraphs.Graph, v: Double): Unit = js.native
  /* CompleteClass */
  override def hasPathTo(v: Double): Boolean = js.native
  /* CompleteClass */
  override def pathTo(v: Double): js.Array[Double] = js.native
}

