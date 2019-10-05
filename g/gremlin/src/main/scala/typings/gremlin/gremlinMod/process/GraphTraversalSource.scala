package typings.gremlin.gremlinMod.process

import typings.gremlin.gremlinMod.driver.RemoteConnection
import typings.gremlin.gremlinMod.structure.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "process.GraphTraversalSource")
@js.native
class GraphTraversalSource protected () extends js.Object {
  def this(graph: Null, traversalStrategies: Null, bytecode: Bytecode) = this()
  def this(graph: Null, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
  def this(graph: Graph, traversalStrategies: Null, bytecode: Bytecode) = this()
  def this(graph: Graph, traversalStrategies: TraversalStrategies, bytecode: Bytecode) = this()
  def E(args: js.Any*): GraphTraversal = js.native
  def V(args: js.Any*): GraphTraversal = js.native
  def addE(args: js.Any*): GraphTraversal = js.native
  def addV(args: js.Any*): GraphTraversal = js.native
  def inject(args: js.Any*): GraphTraversal = js.native
  def io(args: js.Any*): GraphTraversal = js.native
  def withBulk(args: js.Any*): GraphTraversalSource = js.native
  def withPath(args: js.Any*): GraphTraversalSource = js.native
  def withRemote(remoteConnection: RemoteConnection): GraphTraversalSource = js.native
  def withSack(args: js.Any*): GraphTraversalSource = js.native
  def withSideEffect(args: js.Any*): GraphTraversalSource = js.native
  def withStrategies(args: js.Any*): GraphTraversalSource = js.native
  def with_(args: js.Any*): GraphTraversalSource = js.native
  def withoutStrategies(args: js.Any*): GraphTraversalSource = js.native
}

