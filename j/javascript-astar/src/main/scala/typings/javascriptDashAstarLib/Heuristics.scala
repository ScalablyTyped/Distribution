package typings
package javascriptDashAstarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Heuristics extends js.Object {
  @JSName("diagonal")
  var diagonal_Original: Heuristic = js.native
  @JSName("manhattan")
  var manhattan_Original: Heuristic = js.native
  def diagonal(pos0: Anon_Y, pos1: Anon_Y): scala.Double = js.native
  def manhattan(pos0: Anon_Y, pos1: Anon_Y): scala.Double = js.native
}

