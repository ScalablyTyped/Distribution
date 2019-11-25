package typings.grasp.graspMod

import typings.estree.estreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grasp", "search")
@js.native
object search extends js.Object {
  def apply(engine: QueryEngineType): GraspSearchWithQueryEngine = js.native
  def apply(engine: QueryEngineType, selector: String): js.Function1[/* input */ String, js.Array[Node]] = js.native
  // Both the search and replace functions are curryable, which leads to quite
  // a bit of noise. Using generic currying will discard variable name
  // information, so we hand-roll it here
  def apply(engine: QueryEngineType, selector: String, input: String): js.Array[Node] = js.native
}

