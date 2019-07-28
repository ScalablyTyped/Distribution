package typings.grasp.graspMod

import typings.estree.estreeMod.Node
import typings.grasp.Anon_Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grasp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val VERSION: String = js.native
  def apply(options: Anon_Args): Unit = js.native
  def replace(engine: QueryEngineType): GraspReplaceWithQueryEngine = js.native
  def replace(engine: QueryEngineType, selector: String): GraspReplaceWithSelector = js.native
  def replace(engine: QueryEngineType, selector: String, replacement: Replacement): js.Function1[/* input */ String, String] = js.native
  def replace(engine: QueryEngineType, selector: String, replacement: Replacement, input: String): String = js.native
  def search(engine: QueryEngineType): GraspSearchWithQueryEngine = js.native
  def search(engine: QueryEngineType, selector: String): js.Function1[/* input */ String, js.Array[Node]] = js.native
  // Both the search and replace functions are curryable, which leads to quite
  // a bit of noise. Using generic currying will discard variable name
  // information, so we hand-roll it here
  def search(engine: QueryEngineType, selector: String, input: String): js.Array[Node] = js.native
}

