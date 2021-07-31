package typings.gremlin.mod

import typings.gremlin.mod.process.Bytecode
import typings.gremlin.mod.process.TraversalSideEffects
import typings.gremlin.mod.process.TraversalStrategy
import typings.gremlin.mod.process.Traversal_
import typings.gremlin.mod.process.Traverser
import typings.std.MapConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driver {
  
  @JSImport("gremlin", "driver.Client")
  @js.native
  class Client protected () extends StObject {
    def this(url: String) = this()
    def this(url: String, options: js.Any) = this()
    
    def close(): js.Promise[Unit] = js.native
    
    def open(): js.Promise[Unit] = js.native
    
    def submit(message: String): js.Promise[js.Any] = js.native
    def submit(message: String, bindings: js.Any): js.Promise[js.Any] = js.native
    def submit(message: Bytecode): js.Promise[js.Any] = js.native
    def submit(message: Bytecode, bindings: js.Any): js.Promise[js.Any] = js.native
  }
  
  @JSImport("gremlin", "driver.DriverRemoteConnection")
  @js.native
  class DriverRemoteConnection protected () extends RemoteConnection {
    def this(url: String) = this()
    def this(url: String, options: js.Any) = this()
    
    def addListener(event: String, handler: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    def addListener(event: js.Symbol, handler: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    
    def removeListener(event: String, handler: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    def removeListener(event: js.Symbol, handler: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  }
  
  @JSImport("gremlin", "driver.RemoteConnection")
  @js.native
  class RemoteConnection protected () extends StObject {
    def this(url: String) = this()
    
    def close(): js.Promise[Unit] = js.native
    
    def open(): js.Promise[Unit] = js.native
    
    def submit(bytecode: Bytecode): js.Promise[js.Any] = js.native
  }
  
  @JSImport("gremlin", "driver.RemoteStrategy")
  @js.native
  class RemoteStrategy protected () extends TraversalStrategy {
    def this(connection: RemoteConnection) = this()
    
    @JSName("apply")
    def apply(traversal: RemoteTraversal): js.Promise[js.Any] = js.native
  }
  
  @JSImport("gremlin", "driver.RemoteTraversal")
  @js.native
  class RemoteTraversal () extends Traversal_ {
    def this(traversers: js.Array[Traverser]) = this()
    def this(traversers: js.Array[Traverser], sideEffects: TraversalSideEffects) = this()
    def this(traversers: Unit, sideEffects: TraversalSideEffects) = this()
  }
  
  @JSImport("gremlin", "driver.ResultSet")
  @js.native
  class ResultSet protected () extends StObject {
    def this(items: js.Array[js.Any]) = this()
    def this(items: js.Array[js.Any], attributes: MapConstructor) = this()
    
    def first(): js.Any = js.native
    
    def toArray(): js.Array[js.Any] = js.native
  }
  
  object auth {
    
    @JSImport("gremlin", "driver.auth.Authenticator")
    @js.native
    class Authenticator () extends StObject {
      def this(options: js.Any) = this()
      
      def evaluateChallenge(challenge: String): js.Any = js.native
    }
    
    @JSImport("gremlin", "driver.auth.PlainTextSaslAuthenticator")
    @js.native
    class PlainTextSaslAuthenticator protected () extends Authenticator {
      def this(username: String, password: String) = this()
      def this(username: String, password: String, authzid: String) = this()
    }
  }
}
