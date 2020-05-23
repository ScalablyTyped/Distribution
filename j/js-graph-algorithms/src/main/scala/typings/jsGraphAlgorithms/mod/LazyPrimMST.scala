package typings.jsGraphAlgorithms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-graph-algorithms", "LazyPrimMST")
@js.native
class LazyPrimMST protected ()
  extends typings.jsGraphAlgorithms.JsGraphs.LazyPrimMST {
  def this(G: typings.jsGraphAlgorithms.JsGraphs.WeightedGraph) = this()
  /* CompleteClass */
  override var marked: js.Any = js.native
  /* CompleteClass */
  override var mst: js.Array[typings.jsGraphAlgorithms.JsGraphs.Edge] = js.native
  /* CompleteClass */
  override var pq: js.Any = js.native
  /* CompleteClass */
  override def visit(G: typings.jsGraphAlgorithms.JsGraphs.WeightedGraph, v: Double): Unit = js.native
}

