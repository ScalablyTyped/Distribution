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
    start: javascriptDashAstarLib.Anon_Y,
    end: javascriptDashAstarLib.Anon_Y
  ): js.Array[javascriptDashAstarLib.GridNode] = js.native
  def search(
    graph: javascriptDashAstarLib.Graph,
    start: javascriptDashAstarLib.Anon_Y,
    end: javascriptDashAstarLib.Anon_Y,
    options: javascriptDashAstarLib.Anon_Heuristic
  ): js.Array[javascriptDashAstarLib.GridNode] = js.native
}

