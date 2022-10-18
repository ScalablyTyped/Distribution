package typings.gremlin.mod

import typings.gremlin.mod.process.Bytecode
import typings.gremlin.mod.process.Traversal
import typings.gremlin.mod.process.TraversalStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driver {
  
  @js.native
  trait Client extends StObject {
    
    def close(): js.Promise[Unit] = js.native
    
    var isOpen: js.Promise[Boolean] = js.native
    
    def open(): js.Promise[Unit] = js.native
    
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
  
  @js.native
  trait DriverRemoteConnection
    extends StObject
       with RemoteConnection {
    
    def addListener(event: String, handler: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    def addListener(event: js.Symbol, handler: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    
    def commit(): js.Promise[Any] = js.native
    
    def createSession(): this.type = js.native
    
    var isOpen: js.Promise[Boolean] = js.native
    
    var isSessionBound: Boolean = js.native
    
    def removeListener(event: String, handler: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    def removeListener(event: js.Symbol, handler: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    
    def rollback(): js.Promise[Any] = js.native
  }
  
  trait RemoteConnection extends StObject {
    
    def close(): js.Promise[Unit]
    
    def open(): js.Promise[Unit]
    
    def submit(bytecode: Bytecode): js.Promise[Any]
  }
  object RemoteConnection {
    
    inline def apply(close: () => js.Promise[Unit], open: () => js.Promise[Unit], submit: Bytecode => js.Promise[Any]): RemoteConnection = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open), submit = js.Any.fromFunction1(submit))
      __obj.asInstanceOf[RemoteConnection]
    }
    
    extension [Self <: RemoteConnection](x: Self) {
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setOpen(value: () => js.Promise[Unit]): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      
      inline def setSubmit(value: Bytecode => js.Promise[Any]): Self = StObject.set(x, "submit", js.Any.fromFunction1(value))
    }
  }
  
  trait RemoteStrategy
    extends StObject
       with TraversalStrategy
  object RemoteStrategy {
    
    inline def apply(apply: Traversal => js.Promise[Traversal]): RemoteStrategy = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[RemoteStrategy]
    }
  }
  
  type RemoteTraversal = Traversal
  
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
    
    extension [Self <: RequestOptions](x: Self) {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setEvaluationTimeout(value: Double): Self = StObject.set(x, "evaluationTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResultSet extends StObject {
    
    def first(): Any
    
    def toArray(): js.Array[Any]
  }
  object ResultSet {
    
    inline def apply(first: () => Any, toArray: () => js.Array[Any]): ResultSet = {
      val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), toArray = js.Any.fromFunction0(toArray))
      __obj.asInstanceOf[ResultSet]
    }
    
    extension [Self <: ResultSet](x: Self) {
      
      inline def setFirst(value: () => Any): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      inline def setToArray(value: () => js.Array[Any]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
    }
  }
  
  object auth {
    
    trait Authenticator extends StObject {
      
      def evaluateChallenge(challenge: String): Any
    }
    object Authenticator {
      
      inline def apply(evaluateChallenge: String => Any): Authenticator = {
        val __obj = js.Dynamic.literal(evaluateChallenge = js.Any.fromFunction1(evaluateChallenge))
        __obj.asInstanceOf[Authenticator]
      }
      
      extension [Self <: Authenticator](x: Self) {
        
        inline def setEvaluateChallenge(value: String => Any): Self = StObject.set(x, "evaluateChallenge", js.Any.fromFunction1(value))
      }
    }
    
    trait PlainTextSaslAuthenticator
      extends StObject
         with Authenticator
    object PlainTextSaslAuthenticator {
      
      inline def apply(evaluateChallenge: String => Any): PlainTextSaslAuthenticator = {
        val __obj = js.Dynamic.literal(evaluateChallenge = js.Any.fromFunction1(evaluateChallenge))
        __obj.asInstanceOf[PlainTextSaslAuthenticator]
      }
    }
  }
}
