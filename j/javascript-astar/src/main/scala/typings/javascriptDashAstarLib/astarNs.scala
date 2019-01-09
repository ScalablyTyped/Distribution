package typings
package javascriptDashAstarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("astar")
@js.native
object astarNs extends js.Object {
  var heuristics: javascriptDashAstarLib.Heuristics = js.native
  def search(
    graph: javascriptDashAstarLib.Graph,
    start: javascriptDashAstarLib.Anon_X,
    end: javascriptDashAstarLib.Anon_X
  ): js.Array[javascriptDashAstarLib.GridNode] = js.native
  def search(
    graph: javascriptDashAstarLib.Graph,
    start: javascriptDashAstarLib.Anon_X,
    end: javascriptDashAstarLib.Anon_X,
    options: javascriptDashAstarLib.Anon_Closest
  ): js.Array[javascriptDashAstarLib.GridNode] = js.native
}

