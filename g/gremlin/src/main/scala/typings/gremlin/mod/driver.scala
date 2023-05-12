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
  open class Client protected () extends StObject {
    def this(url: String) = this()
    def this(url: String, options: Any) = this()
    
    def addListener(event: String, handler: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    var isOpen: Boolean = js.native
    
    def open(): js.Promise[Unit] = js.native
    
    def removeListener(event: String, handler: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    
    def stream(message: String): Any = js.native
    def stream(message: String, bindings: Any): Any = js.native
    def stream(message: String, bindings: Any, requestOptions: RequestOptions): Any = js.native
    def stream(message: String, bindings: Unit, requestOptions: RequestOptions): Any = js.native
    def stream(message: Bytecode): Any = js.native
    def stream(message: Bytecode, bindings: Any): Any = js.native
    def stream(message: Bytecode, bindings: Any, requestOptions: RequestOptions): Any = js.native
    def stream(message: Bytecode, bindings: Unit, requestOptions: RequestOptions): Any = js.native
    
    def submit(message: String): js.Promise[Any] = js.native
    def submit(message: String, bindings: Any): js.Promise[Any] = js.native
    def submit(message: String, bindings: Any, requestOptions: RequestOptions): js.Promise[Any] = js.native
    def submit(message: String, bindings: Unit, requestOptions: RequestOptions): js.Promise[Any] = js.native
    def submit(message: Bytecode): js.Promise[Any] = js.native
    def submit(message: Bytecode, bindings: Any): js.Promise[Any] = js.native
    def submit(message: Bytecode, bindings: Any, requestOptions: RequestOptions): js.Promise[Any] = js.native
    def submit(message: Bytecode, bindings: Unit, requestOptions: RequestOptions): js.Promise[Any] = js.native
  }
  
  @JSImport("gremlin", "driver.DriverRemoteConnection")
  @js.native
  open class DriverRemoteConnection protected () extends RemoteConnection {
    def this(url: String) = this()
    def this(url: String, options: Any) = this()
    
    def addListener(event: String, handler: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    def addListener(event: js.Symbol, handler: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    
    def commit(): js.Promise[Any] = js.native
    
    def createSession(): this.type = js.native
    
    var isOpen: Boolean = js.native
    
    var isSessionBound: Boolean = js.native
    
    def removeListener(event: String, handler: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    def removeListener(event: js.Symbol, handler: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    
    def rollback(): js.Promise[Any] = js.native
  }
  
  @JSImport("gremlin", "driver.RemoteConnection")
  @js.native
  open class RemoteConnection protected () extends StObject {
    def this(url: String) = this()
    def this(url: String, options: Any) = this()
    
    def close(): js.Promise[Unit] = js.native
    
    def open(): js.Promise[Unit] = js.native
    
    def submit(bytecode: Bytecode): js.Promise[Any] = js.native
  }
  
  @JSImport("gremlin", "driver.RemoteStrategy")
  @js.native
  open class RemoteStrategy protected () extends TraversalStrategy {
    def this(connection: RemoteConnection) = this()
    
    @JSName("apply")
    def apply(traversal: RemoteTraversal): js.Promise[Any] = js.native
  }
  
  @JSImport("gremlin", "driver.RemoteTraversal")
  @js.native
  open class RemoteTraversal () extends Traversal_ {
    def this(traversers: js.Array[Traverser]) = this()
    def this(traversers: js.Array[Traverser], sideEffects: TraversalSideEffects) = this()
    def this(traversers: Unit, sideEffects: TraversalSideEffects) = this()
  }
  
  @JSImport("gremlin", "driver.ResultSet")
  @js.native
  open class ResultSet protected () extends StObject {
    def this(items: js.Array[Any]) = this()
    def this(items: js.Array[Any], attributes: MapConstructor) = this()
    
    def first(): Any = js.native
    
    def toArray(): js.Array[Any] = js.native
  }
  
  object auth {
    
    @JSImport("gremlin", "driver.auth.Authenticator")
    @js.native
    open class Authenticator () extends StObject {
      def this(options: Any) = this()
      
      def evaluateChallenge(challenge: String): Any = js.native
    }
    
    @JSImport("gremlin", "driver.auth.PlainTextSaslAuthenticator")
    @js.native
    open class PlainTextSaslAuthenticator protected () extends Authenticator {
      def this(username: String, password: String) = this()
      def this(username: String, password: String, authzid: String) = this()
    }
  }
  
  trait RequestOptions extends StObject {
    
    var batchSize: Double
    
    var evaluationTimeout: Double
    
    var requestId: String
    
    var userAgent: String
  }
  object RequestOptions {
    
    inline def apply(batchSize: Double, evaluationTimeout: Double, requestId: String, userAgent: String): RequestOptions = {
      val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], evaluationTimeout = evaluationTimeout.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setEvaluationTimeout(value: Double): Self = StObject.set(x, "evaluationTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    }
  }
}
