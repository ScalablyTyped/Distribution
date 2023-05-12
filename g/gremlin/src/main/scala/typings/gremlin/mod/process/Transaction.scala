package typings.gremlin.mod.process

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gremlin", "process.Transaction")
@js.native
open class Transaction[S /* <: GraphTraversalSource[GraphTraversal] */] protected () extends StObject {
  def this(_g: S) = this()
  
  def begin(): S = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  def commit(): js.Promise[Any] = js.native
  
  var isOpen: Boolean = js.native
  
  def rollback(): js.Promise[Unit] = js.native
}
