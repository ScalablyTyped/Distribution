package typings.grasp

import org.scalablytyped.runtime.StringDictionary
import typings.estree.estreeMod.Node
import typings.grasp.graspMod.GraspReplaceWithQueryEngine
import typings.grasp.graspMod.GraspReplaceWithSelector
import typings.grasp.graspMod.GraspSearchWithQueryEngine
import typings.grasp.graspMod.QueryEngineType
import typings.grasp.graspMod.Replacement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grasp", JSImport.Namespace)
@js.native
object graspMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.grasp.graspStrings.squery
    - typings.grasp.graspStrings.equery
  */
  trait QueryEngineType extends js.Object
  
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
  type GraspReplaceWithQueryEngine = (js.Function1[/* selector */ String, GraspReplaceWithSelector]) with (js.Function2[
    /* selector */ String, 
    /* replacement */ Replacement, 
    js.Function1[/* input */ String, String]
  ]) with (js.Function3[/* selector */ String, /* replacement */ Replacement, /* input */ String, String])
  type GraspReplaceWithSelector = (js.Function1[/* replacement */ Replacement, js.Function1[/* input */ String, String]]) with (js.Function2[/* replacement */ Replacement, /* input */ String, String])
  type GraspSearchWithQueryEngine = (js.Function2[/* selector */ String, /* input */ String, js.Array[Node]]) with (js.Function1[/* selector */ String, js.Function1[/* input */ String, js.Array[Node]]])
  type Replacement = String | (js.Function4[
    /* getRaw */ js.Function1[/* node */ Node, String], 
    /* node */ Node, 
    /* query */ js.Function1[/* q */ String, js.Array[Node]], 
    /* named */ StringDictionary[String | Node], 
    String
  ])
}

