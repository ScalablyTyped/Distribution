package typings.gremlin.mod.process

import typings.gremlin.mod.Newable
import typings.gremlin.mod.Nullable
import typings.gremlin.mod.driver.RemoteConnection
import typings.gremlin.mod.structure.Graph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gremlin", "process.GraphTraversalSource")
@js.native
open class GraphTraversalSource[T /* <: GraphTraversal */] protected () extends StObject {
  def this(graph: Nullable[Graph], traversalStrategies: Nullable[TraversalStrategies]) = this()
  def this(graph: Nullable[Graph], traversalStrategies: Nullable[TraversalStrategies], bytecode: Bytecode) = this()
  def this(
    graph: Nullable[Graph],
    traversalStrategies: Nullable[TraversalStrategies],
    bytecode: Unit,
    graphTraversalSourceClass: Newable[GraphTraversalSource[GraphTraversal]]
  ) = this()
  def this(
    graph: Nullable[Graph],
    traversalStrategies: Nullable[TraversalStrategies],
    bytecode: Bytecode,
    graphTraversalSourceClass: Newable[GraphTraversalSource[GraphTraversal]]
  ) = this()
  def this(
    graph: Nullable[Graph],
    traversalStrategies: Nullable[TraversalStrategies],
    bytecode: Unit,
    graphTraversalSourceClass: Unit,
    graphTraversalClass: Newable[T]
  ) = this()
  def this(
    graph: Nullable[Graph],
    traversalStrategies: Nullable[TraversalStrategies],
    bytecode: Unit,
    graphTraversalSourceClass: Newable[GraphTraversalSource[GraphTraversal]],
    graphTraversalClass: Newable[T]
  ) = this()
  def this(
    graph: Nullable[Graph],
    traversalStrategies: Nullable[TraversalStrategies],
    bytecode: Bytecode,
    graphTraversalSourceClass: Unit,
    graphTraversalClass: Newable[T]
  ) = this()
  def this(
    graph: Nullable[Graph],
    traversalStrategies: Nullable[TraversalStrategies],
    bytecode: Bytecode,
    graphTraversalSourceClass: Newable[GraphTraversalSource[GraphTraversal]],
    graphTraversalClass: Newable[T]
  ) = this()
  
  def E(args: Any*): T = js.native
  
  def V(args: Any*): T = js.native
  
  def addE(args: Any*): T = js.native
  
  def addV(args: Any*): T = js.native
  
  def inject(args: Any*): T = js.native
  
  def io(args: Any*): T = js.native
  
  def mergeE(args: Any*): T = js.native
  
  def mergeV(args: Any*): T = js.native
  
  def tx(): Transaction[this.type] = js.native
  
  def withBulk(args: Any*): this.type = js.native
  
  def withPath(args: Any*): this.type = js.native
  
  def withRemote(remoteConnection: RemoteConnection): this.type = js.native
  
  def withSack(args: Any*): this.type = js.native
  
  def withSideEffect(args: Any*): this.type = js.native
  
  def withStrategies(args: Any*): this.type = js.native
  
  def with_(args: Any*): this.type = js.native
  
  def withoutStrategies(args: Any*): this.type = js.native
}
