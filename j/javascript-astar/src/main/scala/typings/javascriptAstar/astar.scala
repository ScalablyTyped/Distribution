package typings.javascriptAstar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("astar")
@js.native
object astar extends js.Object {
  var heuristics: Heuristics = js.native
  def search(graph: Graph, start: AnonX, end: AnonX): js.Array[GridNode] = js.native
  def search(graph: Graph, start: AnonX, end: AnonX, options: AnonClosest): js.Array[GridNode] = js.native
}

