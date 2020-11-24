package typings.gremlin.mod.process

import typings.gremlin.mod.Newable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gremlin", "process.traversal")
@js.native
object traversal extends js.Object {
  
  def apply[S /* <: GraphTraversalSource[GraphTraversal] */](): AnonymousTraversalSource[S] = js.native
  def apply[S /* <: GraphTraversalSource[GraphTraversal] */](traversalSourceClass: Newable[S]): AnonymousTraversalSource[S] = js.native
}
