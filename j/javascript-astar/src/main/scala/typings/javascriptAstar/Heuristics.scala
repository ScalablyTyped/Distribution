package typings.javascriptAstar

import typings.javascriptAstar.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Heuristics extends js.Object {
  
  def diagonal(pos0: X, pos1: X): Double = js.native
  @JSName("diagonal")
  var diagonal_Original: Heuristic = js.native
  
  def manhattan(pos0: X, pos1: X): Double = js.native
  @JSName("manhattan")
  var manhattan_Original: Heuristic = js.native
}
