package typings.gremlin.mod.process

import typings.gremlin.mod.Nullable
import typings.gremlin.mod.structure.Graph
import typings.std.AsyncIterableIterator
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gremlin", "process.Traversal")
@js.native
open class Traversal_ protected ()
  extends StObject
     with AsyncIterableIterator[Any] {
  def this(graph: Nullable[Graph], traversalStrategies: Nullable[TraversalStrategies], bytecode: Bytecode) = this()
  
  def getBytecode(): Bytecode = js.native
  
  def hasNext(): js.Promise[Boolean] = js.native
  
  def iterate(): js.Promise[Unit] = js.native
  
  def next(): js.Promise[IteratorResult[Any, Any]] = js.native
  
  def toList(): js.Promise[js.Array[Traverser]] = js.native
}
