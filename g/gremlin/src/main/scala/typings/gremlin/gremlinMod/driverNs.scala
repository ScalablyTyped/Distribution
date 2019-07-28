package typings.gremlin.gremlinMod

import typings.gremlin.gremlinMod.driverNs.Authenticator
import typings.gremlin.gremlinMod.driverNs.RemoteConnection
import typings.gremlin.gremlinMod.driverNs.RemoteTraversal
import typings.gremlin.gremlinMod.processNs.Bytecode
import typings.gremlin.gremlinMod.processNs.Traversal
import typings.gremlin.gremlinMod.processNs.TraversalSideEffects
import typings.gremlin.gremlinMod.processNs.TraversalStrategy
import typings.gremlin.gremlinMod.processNs.Traverser
import typings.std.MapConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "driver")
@js.native
object driverNs extends js.Object {
  @js.native
  class Authenticator () extends js.Object {
    def this(options: js.Any) = this()
    def evaluateChallenge(challenge: String): js.Any = js.native
  }
  
  @js.native
  class Client protected () extends js.Object {
    def this(url: String) = this()
    def this(url: String, options: js.Any) = this()
    def close(): js.Promise[Unit] = js.native
    def open(): js.Promise[Unit] = js.native
    def submit(message: String): js.Promise[_] = js.native
    def submit(message: String, bindings: js.Any): js.Promise[_] = js.native
    def submit(message: Bytecode): js.Promise[_] = js.native
    def submit(message: Bytecode, bindings: js.Any): js.Promise[_] = js.native
  }
  
  @js.native
  class DriverRemoteConnection protected () extends RemoteConnection {
    def this(url: String) = this()
    def this(url: String, options: js.Any) = this()
  }
  
  @js.native
  class PlainTextSaslAuthenticator protected () extends Authenticator {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, authzid: String) = this()
  }
  
  @js.native
  class RemoteConnection protected () extends js.Object {
    def this(url: String) = this()
    def close(): js.Promise[Unit] = js.native
    def open(): js.Promise[Unit] = js.native
    def submit(bytecode: Bytecode): js.Promise[_] = js.native
  }
  
  @js.native
  class RemoteStrategy protected () extends TraversalStrategy {
    def this(connection: RemoteConnection) = this()
    @JSName("apply")
    def apply(traversal: RemoteTraversal): js.Promise[_] = js.native
  }
  
  @js.native
  class RemoteTraversal () extends Traversal {
    def this(traversers: js.Array[Traverser]) = this()
    def this(traversers: js.Array[Traverser], sideEffects: TraversalSideEffects) = this()
  }
  
  @js.native
  class ResultSet protected () extends js.Object {
    def this(items: js.Array[_]) = this()
    def this(items: js.Array[_], attributes: MapConstructor) = this()
    def first(): js.Any = js.native
    def toArray(): js.Array[_] = js.native
  }
  
}

