package typings.gremlin.mod.process

import typings.gremlin.AnonDone
import typings.gremlin.mod.structure.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "process.Traversal")
@js.native
class Traversal_ protected () extends js.Object {
  def this(graph: Null, traversalStrategies: Null, bytecode: Bytecode) = this()
  def this(graph: Null, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
  def this(graph: Graph, traversalStrategies: Null, bytecode: Bytecode) = this()
  def this(graph: Graph, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
  // [asyncIteratorSymbol: symbol | SymbolConstructor](): Traversal; // How can I implement this?
  def getBytecode(): Bytecode = js.native
  def iterate(): js.Promise[Unit] = js.native
  def next(): js.Promise[AnonDone] = js.native
  def toList(): js.Promise[js.Array[Traverser]] = js.native
}

