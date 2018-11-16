package typings
package graspLib.graspMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grasp", JSImport.Namespace)
@js.native
object graspModMembers extends js.Object {
  val VERSION: java.lang.String = js.native
  def apply(options: graspLib.Anon_TextFormat): scala.Unit = js.native
  def replace(engine: graspLib.graspMod.graspNs.QueryEngineType): graspLib.graspMod.graspNs.GraspReplaceWithQueryEngine = js.native
  def replace(engine: graspLib.graspMod.graspNs.QueryEngineType, selector: java.lang.String): graspLib.graspMod.graspNs.GraspReplaceWithSelector = js.native
  def replace(
    engine: graspLib.graspMod.graspNs.QueryEngineType,
    selector: java.lang.String,
    replacement: graspLib.graspMod.graspNs.Replacement
  ): js.Function1[/* input */ java.lang.String, java.lang.String] = js.native
  def replace(
    engine: graspLib.graspMod.graspNs.QueryEngineType,
    selector: java.lang.String,
    replacement: graspLib.graspMod.graspNs.Replacement,
    input: java.lang.String
  ): java.lang.String = js.native
  def search(engine: graspLib.graspMod.graspNs.QueryEngineType): graspLib.graspMod.graspNs.GraspSearchWithQueryEngine = js.native
  def search(engine: graspLib.graspMod.graspNs.QueryEngineType, selector: java.lang.String): js.Function1[/* input */ java.lang.String, js.Array[estreeLib.estreeMod.Node]] = js.native
  // Both the search and replace functions are curryable, which leads to quite
  // a bit of noise. Using generic currying will discard variable name
  // information, so we hand-roll it here
  def search(
    engine: graspLib.graspMod.graspNs.QueryEngineType,
    selector: java.lang.String,
    input: java.lang.String
  ): js.Array[estreeLib.estreeMod.Node] = js.native
}

