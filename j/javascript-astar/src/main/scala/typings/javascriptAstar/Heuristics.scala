package typings.javascriptAstar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Heuristics extends js.Object {
  @JSName("diagonal")
  var diagonal_Original: Heuristic = js.native
  @JSName("manhattan")
  var manhattan_Original: Heuristic = js.native
  def diagonal(pos0: AnonX, pos1: AnonX): Double = js.native
  def manhattan(pos0: AnonX, pos1: AnonX): Double = js.native
}

