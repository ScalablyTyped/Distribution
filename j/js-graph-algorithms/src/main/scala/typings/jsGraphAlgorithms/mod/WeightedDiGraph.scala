package typings.jsGraphAlgorithms.mod

import typings.jsGraphAlgorithms.JsGraphs.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-graph-algorithms", "WeightedDiGraph")
@js.native
class WeightedDiGraph ()
  extends typings.jsGraphAlgorithms.JsGraphs.WeightedDiGraph {
  /* CompleteClass */
  override var V: Double = js.native
  /* CompleteClass */
  override var adjList: js.Array[js.Array[typings.jsGraphAlgorithms.JsGraphs.Edge]] = js.native
  /* CompleteClass */
  override var nodeInfo: js.Any = js.native
  /* CompleteClass */
  override def addEdge(e: typings.jsGraphAlgorithms.JsGraphs.Edge): Unit = js.native
  /* CompleteClass */
  override def adj(v: Double): js.Array[typings.jsGraphAlgorithms.JsGraphs.Edge] = js.native
  /* CompleteClass */
  override def edge(v: Double, w: Double): typings.jsGraphAlgorithms.JsGraphs.Edge | Null = js.native
  /* CompleteClass */
  override def node(v: Double): Node = js.native
  /* CompleteClass */
  override def toDiGraph(): typings.jsGraphAlgorithms.JsGraphs.DiGraph = js.native
}

