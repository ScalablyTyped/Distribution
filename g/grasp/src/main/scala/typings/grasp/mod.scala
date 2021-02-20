package typings.grasp

import org.scalablytyped.runtime.StringDictionary
import typings.estree.mod.Node
import typings.grasp.anon.Args
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("grasp", JSImport.Namespace)
  @js.native
  def apply(options: Args): Unit = js.native
  
  @JSImport("grasp", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  @JSImport("grasp", "replace")
  @js.native
  def replace(engine: QueryEngineType): GraspReplaceWithQueryEngine = js.native
  @JSImport("grasp", "replace")
  @js.native
  def replace(engine: QueryEngineType, selector: String): GraspReplaceWithSelector = js.native
  @JSImport("grasp", "replace")
  @js.native
  def replace(engine: QueryEngineType, selector: String, replacement: Replacement): js.Function1[/* input */ String, String] = js.native
  @JSImport("grasp", "replace")
  @js.native
  def replace(engine: QueryEngineType, selector: String, replacement: Replacement, input: String): String = js.native
  
  @JSImport("grasp", "search")
  @js.native
  def search(engine: QueryEngineType): GraspSearchWithQueryEngine = js.native
  @JSImport("grasp", "search")
  @js.native
  def search(engine: QueryEngineType, selector: String): js.Function1[/* input */ String, js.Array[Node]] = js.native
  // Both the search and replace functions are curryable, which leads to quite
  // a bit of noise. Using generic currying will discard variable name
  // information, so we hand-roll it here
  @JSImport("grasp", "search")
  @js.native
  def search(engine: QueryEngineType, selector: String, input: String): js.Array[Node] = js.native
  
  type GraspReplaceWithQueryEngine = (js.Function1[/* selector */ String, GraspReplaceWithSelector]) with (js.Function2[
    /* selector */ String, 
    /* replacement */ Replacement, 
    js.Function1[/* input */ String, String]
  ]) with (js.Function3[/* selector */ String, /* replacement */ Replacement, /* input */ String, String])
  
  type GraspReplaceWithSelector = (js.Function1[/* replacement */ Replacement, js.Function1[/* input */ String, String]]) with (js.Function2[/* replacement */ Replacement, /* input */ String, String])
  
  type GraspSearchWithQueryEngine = (js.Function2[/* selector */ String, /* input */ String, js.Array[Node]]) with (js.Function1[/* selector */ String, js.Function1[/* input */ String, js.Array[Node]]])
  
  /* Rewritten from type alias, can be one of: 
    - typings.grasp.graspStrings.squery
    - typings.grasp.graspStrings.equery
  */
  trait QueryEngineType extends StObject
  object QueryEngineType {
    
    @scala.inline
    def equery: typings.grasp.graspStrings.equery = "equery".asInstanceOf[typings.grasp.graspStrings.equery]
    
    @scala.inline
    def squery: typings.grasp.graspStrings.squery = "squery".asInstanceOf[typings.grasp.graspStrings.squery]
  }
  
  type Replacement = String | (js.Function4[
    /* getRaw */ js.Function1[/* node */ Node, String], 
    /* node */ Node, 
    /* query */ js.Function1[/* q */ String, js.Array[Node]], 
    /* named */ StringDictionary[String | Node], 
    String
  ])
}
