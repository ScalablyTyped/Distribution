package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.ConnectedComponents")
@js.native
class ConnectedComponents protected () extends js.Object {
  def this(G: Graph) = this()
  var count: js.Any = js.native
  var id: js.Any = js.native
  var marked: js.Any = js.native
  def componentCount(): Double = js.native
  def componentId(v: Double): Double = js.native
  def dfs(G: Graph, v: Double): Unit = js.native
}

