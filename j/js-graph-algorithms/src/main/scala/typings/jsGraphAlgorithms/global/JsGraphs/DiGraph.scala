package typings.jsGraphAlgorithms.global.JsGraphs

import typings.jsGraphAlgorithms.JsGraphs.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.DiGraph")
@js.native
class DiGraph protected ()
  extends typings.jsGraphAlgorithms.JsGraphs.DiGraph {
  def this(V: Double) = this()
  /* CompleteClass */
  override var V: Double = js.native
  /* CompleteClass */
  override var adjList: js.Any = js.native
  /* CompleteClass */
  override var edges: js.Any = js.native
  /* CompleteClass */
  override var nodeInfo: js.Any = js.native
  /* CompleteClass */
  override def addEdge(v: Double, w: Double): Unit = js.native
  /* CompleteClass */
  override def adj(v: Double): js.Array[Double] = js.native
  /* CompleteClass */
  override def edge(v: Double, w: Double): typings.jsGraphAlgorithms.JsGraphs.Edge | Null = js.native
  /* CompleteClass */
  override def node(v: Double): Node = js.native
  /* CompleteClass */
  override def reverse(): typings.jsGraphAlgorithms.JsGraphs.DiGraph = js.native
}

