package typings.jsGraphAlgorithms.global.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.StronglyConnectedComponents")
@js.native
class StronglyConnectedComponents protected ()
  extends typings.jsGraphAlgorithms.JsGraphs.StronglyConnectedComponents {
  def this(G: typings.jsGraphAlgorithms.JsGraphs.DiGraph) = this()
  /* CompleteClass */
  override var count: js.Any = js.native
  /* CompleteClass */
  override var id: js.Any = js.native
  /* CompleteClass */
  override var marked: js.Any = js.native
  /* CompleteClass */
  override def componentCount(): Double = js.native
  /* CompleteClass */
  override def componentId(v: Double): Double = js.native
  /* CompleteClass */
  override def dfs(G: typings.jsGraphAlgorithms.JsGraphs.DiGraph, v: Double): Unit = js.native
}

