package typings
package graspLib.graspMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grasp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val VERSION: java.lang.String = js.native
  def apply(options: graspLib.Anon_Args): scala.Unit = js.native
  def replace(engine: QueryEngineType): GraspReplaceWithQueryEngine = js.native
  def replace(engine: QueryEngineType, selector: java.lang.String): GraspReplaceWithSelector = js.native
  def replace(engine: QueryEngineType, selector: java.lang.String, replacement: Replacement): js.Function1[/* input */ java.lang.String, java.lang.String] = js.native
  def replace(
    engine: QueryEngineType,
    selector: java.lang.String,
    replacement: Replacement,
    input: java.lang.String
  ): java.lang.String = js.native
  def search(engine: QueryEngineType): GraspSearchWithQueryEngine = js.native
  def search(engine: QueryEngineType, selector: java.lang.String): js.Function1[/* input */ java.lang.String, js.Array[estreeLib.estreeMod.Node]] = js.native
  // Both the search and replace functions are curryable, which leads to quite
  // a bit of noise. Using generic currying will discard variable name
  // information, so we hand-roll it here
  def search(engine: QueryEngineType, selector: java.lang.String, input: java.lang.String): js.Array[estreeLib.estreeMod.Node] = js.native
}

