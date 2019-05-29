package typings
package gremlinLib.gremlinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "driver")
@js.native
object driverNs extends js.Object {
  @js.native
  class Authenticator () extends js.Object {
    def this(options: js.Any) = this()
    def evaluateChallenge(challenge: java.lang.String): js.Any = js.native
  }
  
  @js.native
  class Client protected () extends js.Object {
    def this(url: java.lang.String) = this()
    def this(url: java.lang.String, options: js.Any) = this()
    def close(): js.Promise[scala.Unit] = js.native
    def open(): js.Promise[scala.Unit] = js.native
    def submit(message: gremlinLib.gremlinMod.processNs.Bytecode): js.Promise[_] = js.native
    def submit(message: gremlinLib.gremlinMod.processNs.Bytecode, bindings: js.Any): js.Promise[_] = js.native
    def submit(message: java.lang.String): js.Promise[_] = js.native
    def submit(message: java.lang.String, bindings: js.Any): js.Promise[_] = js.native
  }
  
  @js.native
  class DriverRemoteConnection protected () extends RemoteConnection {
    def this(url: java.lang.String) = this()
    def this(url: java.lang.String, options: js.Any) = this()
  }
  
  @js.native
  class PlainTextSaslAuthenticator protected () extends Authenticator {
    def this(username: java.lang.String, password: java.lang.String) = this()
    def this(username: java.lang.String, password: java.lang.String, authzid: java.lang.String) = this()
  }
  
  @js.native
  class RemoteConnection protected () extends js.Object {
    def this(url: java.lang.String) = this()
    def close(): js.Promise[scala.Unit] = js.native
    def open(): js.Promise[scala.Unit] = js.native
    def submit(bytecode: gremlinLib.gremlinMod.processNs.Bytecode): js.Promise[_] = js.native
  }
  
  @js.native
  class RemoteStrategy protected ()
    extends gremlinLib.gremlinMod.processNs.TraversalStrategy {
    def this(connection: RemoteConnection) = this()
    @JSName("apply")
    def apply(traversal: RemoteTraversal): js.Promise[_] = js.native
  }
  
  @js.native
  class RemoteTraversal ()
    extends gremlinLib.gremlinMod.processNs.Traversal {
    def this(traversers: js.Array[gremlinLib.gremlinMod.processNs.Traverser]) = this()
    def this(traversers: js.Array[gremlinLib.gremlinMod.processNs.Traverser], sideEffects: gremlinLib.gremlinMod.processNs.TraversalSideEffects) = this()
  }
  
  @js.native
  class ResultSet protected () extends js.Object {
    def this(items: js.Array[_]) = this()
    def this(items: js.Array[_], attributes: stdLib.MapConstructor) = this()
    def first(): js.Any = js.native
    def toArray(): js.Array[_] = js.native
  }
  
}

