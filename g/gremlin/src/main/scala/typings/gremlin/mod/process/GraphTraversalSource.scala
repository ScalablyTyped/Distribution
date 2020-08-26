package typings.gremlin.mod.process

import typings.gremlin.mod.Newable
import typings.gremlin.mod.Nullable
import typings.gremlin.mod.driver.RemoteConnection
import typings.gremlin.mod.structure.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "process.GraphTraversalSource")
@js.native
class GraphTraversalSource[T /* <: GraphTraversal */] protected () extends js.Object {
  def this(graph: Nullable[Graph], traversalStrategies: Nullable[TraversalStrategies]) = this()
  def this(graph: Nullable[Graph], traversalStrategies: Nullable[TraversalStrategies], bytecode: Bytecode) = this()
  def this(
    graph: Nullable[Graph],
    traversalStrategies: Nullable[TraversalStrategies],
    bytecode: js.UndefOr[scala.Nothing],
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
    bytecode: js.UndefOr[scala.Nothing],
    graphTraversalSourceClass: js.UndefOr[scala.Nothing],
    graphTraversalClass: Newable[T]
  ) = this()
  def this(
    graph: Nullable[Graph],
    traversalStrategies: Nullable[TraversalStrategies],
    bytecode: js.UndefOr[scala.Nothing],
    graphTraversalSourceClass: Newable[GraphTraversalSource[GraphTraversal]],
    graphTraversalClass: Newable[T]
  ) = this()
  def this(
    graph: Nullable[Graph],
    traversalStrategies: Nullable[TraversalStrategies],
    bytecode: Bytecode,
    graphTraversalSourceClass: js.UndefOr[scala.Nothing],
    graphTraversalClass: Newable[T]
  ) = this()
  def this(
    graph: Nullable[Graph],
    traversalStrategies: Nullable[TraversalStrategies],
    bytecode: Bytecode,
    graphTraversalSourceClass: Newable[GraphTraversalSource[GraphTraversal]],
    graphTraversalClass: Newable[T]
  ) = this()
  def E(args: js.Any*): T = js.native
  def V(args: js.Any*): T = js.native
  def addE(args: js.Any*): T = js.native
  def addV(args: js.Any*): T = js.native
  def inject(args: js.Any*): T = js.native
  def io(args: js.Any*): T = js.native
  def withBulk(args: js.Any*): this.type = js.native
  def withPath(args: js.Any*): this.type = js.native
  def withRemote(remoteConnection: RemoteConnection): this.type = js.native
  def withSack(args: js.Any*): this.type = js.native
  def withSideEffect(args: js.Any*): this.type = js.native
  def withStrategies(args: js.Any*): this.type = js.native
  def with_(args: js.Any*): this.type = js.native
  def withoutStrategies(args: js.Any*): this.type = js.native
}

