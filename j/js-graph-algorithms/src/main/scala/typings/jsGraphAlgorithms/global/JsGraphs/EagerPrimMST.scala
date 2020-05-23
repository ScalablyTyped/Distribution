package typings.jsGraphAlgorithms.global.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.EagerPrimMST")
@js.native
class EagerPrimMST protected ()
  extends typings.jsGraphAlgorithms.JsGraphs.EagerPrimMST {
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

