package typings.gremlin.gremlinMod.process

import typings.gremlin.Anon_Done
import typings.gremlin.gremlinMod.structure.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "process.Traversal")
@js.native
class Traversal protected () extends js.Object {
  def this(graph: Null, traversalStrategies: Null, bytecode: Bytecode) = this()
  def this(graph: Null, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
  def this(graph: Graph, traversalStrategies: Null, bytecode: Bytecode) = this()
  def this(graph: Graph, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
  // [asyncIteratorSymbol: symbol | SymbolConstructor](): Traversal; // How can I implement this?
  def getBytecode(): Bytecode = js.native
  def iterate(): js.Promise[Unit] = js.native
  def next(): js.Promise[Anon_Done] = js.native
  def toList(): js.Promise[js.Array[Traverser]] = js.native
}

@JSImport("gremlin", "process.traversal")
@js.native
object traversal extends js.Object {
  def apply(): AnonymousTraversalSource = js.native
}

