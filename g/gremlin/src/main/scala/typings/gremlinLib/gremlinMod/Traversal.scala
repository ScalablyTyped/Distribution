package typings
package gremlinLib.gremlinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "Traversal")
@js.native
class Traversal protected () extends js.Object {
  def this(graph: Graph, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
  def this(graph: Graph, traversalStrategies: scala.Null, bytecode: Bytecode) = this()
  def this(graph: scala.Null, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
  def this(graph: scala.Null, traversalStrategies: scala.Null, bytecode: Bytecode) = this()
  // [asyncIteratorSymbol: symbol | SymbolConstructor](): Traversal; // How can I implement this?
  def getBytecode(): Bytecode = js.native
  def iterate(): js.Promise[scala.Unit] = js.native
  def next(): js.Promise[gremlinLib.Anon_Done] = js.native
  def toList(): js.Promise[js.Array[Traverser]] = js.native
}

