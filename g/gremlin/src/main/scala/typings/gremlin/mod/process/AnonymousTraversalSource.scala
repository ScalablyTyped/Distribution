package typings.gremlin.mod.process

import typings.gremlin.mod.Newable
import typings.gremlin.mod.driver.RemoteConnection
import typings.gremlin.mod.structure.Graph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gremlin", "process.AnonymousTraversalSource")
@js.native
open class AnonymousTraversalSource[S /* <: GraphTraversalSource[GraphTraversal] */] () extends StObject {
  
  def withGraph(graph: Graph): S = js.native
  
  def withRemote(remoteConnection: RemoteConnection): S = js.native
}
object AnonymousTraversalSource {
  
  @JSImport("gremlin", "process.AnonymousTraversalSource")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def traversal[S /* <: GraphTraversalSource[GraphTraversal] */](): AnonymousTraversalSource[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("traversal")().asInstanceOf[AnonymousTraversalSource[S]]
  inline def traversal[S /* <: GraphTraversalSource[GraphTraversal] */](traversalSourceClass: Newable[S]): AnonymousTraversalSource[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("traversal")(traversalSourceClass.asInstanceOf[js.Any]).asInstanceOf[AnonymousTraversalSource[S]]
}
