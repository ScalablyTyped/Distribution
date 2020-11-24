package typings.gremlin.mod.process

import typings.gremlin.mod.Nullable
import typings.gremlin.mod.structure.Graph
import typings.std.AsyncIterableIterator
import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gremlin", "process.Traversal")
@js.native
class Traversal_ protected ()
  extends AsyncIterableIterator[js.Any] {
  def this(graph: Nullable[Graph], traversalStrategies: Nullable[TraversalStrategies], bytecode: Bytecode) = this()
  
  def getBytecode(): Bytecode = js.native
  
  def hasNext(): js.Promise[Boolean] = js.native
  
  def iterate(): js.Promise[Unit] = js.native
  
  def next(): js.Promise[IteratorResult[_, _]] = js.native
  
  def toList(): js.Promise[js.Array[Traverser]] = js.native
}
