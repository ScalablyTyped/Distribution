package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.StronglyConnectedComponents")
@js.native
class StronglyConnectedComponents protected () extends js.Object {
  def this(G: DiGraph) = this()
  var count: js.Any = js.native
  var id: js.Any = js.native
  var marked: js.Any = js.native
  def componentCount(): Double = js.native
  def componentId(v: Double): Double = js.native
  def dfs(G: DiGraph, v: Double): Unit = js.native
}

