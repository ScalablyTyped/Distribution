package typings.grasp

import org.scalablytyped.runtime.StringDictionary
import typings.estree.mod.Node
import typings.grasp.anon.Args
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Args): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("grasp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("grasp", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  inline def replace(engine: QueryEngineType): GraspReplaceWithQueryEngine = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(engine.asInstanceOf[js.Any]).asInstanceOf[GraspReplaceWithQueryEngine]
  inline def replace(engine: QueryEngineType, selector: String): GraspReplaceWithSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(engine.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[GraspReplaceWithSelector]
  inline def replace(engine: QueryEngineType, selector: String, replacement: Replacement): js.Function1[/* input */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(engine.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* input */ String, String]]
  inline def replace(engine: QueryEngineType, selector: String, replacement: Replacement, input: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(engine.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def search(engine: QueryEngineType): GraspSearchWithQueryEngine = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(engine.asInstanceOf[js.Any]).asInstanceOf[GraspSearchWithQueryEngine]
  inline def search(engine: QueryEngineType, selector: String): js.Function1[/* input */ String, js.Array[Node]] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(engine.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* input */ String, js.Array[Node]]]
  // Both the search and replace functions are curryable, which leads to quite
  // a bit of noise. Using generic currying will discard variable name
  // information, so we hand-roll it here
  inline def search(engine: QueryEngineType, selector: String, input: String): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(engine.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  
  type GraspReplaceWithQueryEngine = (js.Function1[/* selector */ String, GraspReplaceWithSelector]) & (js.Function2[
    /* selector */ String, 
    /* replacement */ Replacement, 
    js.Function1[/* input */ String, String]
  ]) & (js.Function3[/* selector */ String, /* replacement */ Replacement, /* input */ String, String])
  
  type GraspReplaceWithSelector = (js.Function1[/* replacement */ Replacement, js.Function1[/* input */ String, String]]) & (js.Function2[/* replacement */ Replacement, /* input */ String, String])
  
  type GraspSearchWithQueryEngine = (js.Function2[/* selector */ String, /* input */ String, js.Array[Node]]) & (js.Function1[/* selector */ String, js.Function1[/* input */ String, js.Array[Node]]])
  
  /* Rewritten from type alias, can be one of: 
    - typings.grasp.graspStrings.squery
    - typings.grasp.graspStrings.equery
  */
  trait QueryEngineType extends StObject
  object QueryEngineType {
    
    inline def equery: typings.grasp.graspStrings.equery = "equery".asInstanceOf[typings.grasp.graspStrings.equery]
    
    inline def squery: typings.grasp.graspStrings.squery = "squery".asInstanceOf[typings.grasp.graspStrings.squery]
  }
  
  type Replacement = String | (js.Function4[
    /* getRaw */ js.Function1[/* node */ Node, String], 
    /* node */ Node, 
    /* query */ js.Function1[/* q */ String, js.Array[Node]], 
    /* named */ StringDictionary[String | Node], 
    String
  ])
}
