package typings.javascriptDashAstar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("astar")
@js.native
object astarNs extends js.Object {
  var heuristics: Heuristics = js.native
  def search(graph: Graph, start: Anon_X, end: Anon_X): js.Array[GridNode] = js.native
  def search(graph: Graph, start: Anon_X, end: Anon_X, options: Anon_Closest): js.Array[GridNode] = js.native
}

