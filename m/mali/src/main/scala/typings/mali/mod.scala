package typings.mali

import typings.grpcGrpcJs.buildSrcServerCallMod.ServerDuplexStream
import typings.grpcGrpcJs.buildSrcServerCallMod.ServerReadableStream
import typings.grpcGrpcJs.buildSrcServerCallMod.ServerUnaryCall
import typings.grpcGrpcJs.buildSrcServerCallMod.ServerWritableStream
import typings.grpcGrpcJs.mod.Metadata
import typings.grpcGrpcJs.mod.Server
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mali", JSImport.Namespace)
  @js.native
  open class ^[T] () extends Mali[T] {
    def this(path: Any) = this()
    def this(path: Any, name: String) = this()
    def this(path: Any, name: js.Array[String]) = this()
    def this(path: Unit, name: String) = this()
    def this(path: Unit, name: js.Array[String]) = this()
    def this(path: Any, name: String, options: Any) = this()
    def this(path: Any, name: js.Array[String], options: Any) = this()
    def this(path: Any, name: Unit, options: Any) = this()
    def this(path: Unit, name: String, options: Any) = this()
    def this(path: Unit, name: js.Array[String], options: Any) = this()
    def this(path: Unit, name: Unit, options: Any) = this()
    
    /* CompleteClass */
    var context: T = js.native
  }
  
  @JSImport("mali", "Request")
  @js.native
  open class Request protected () extends StObject {
    def this(call: Any, `type`: String) = this()
    
    var call: Any = js.native
    
    def get(field: String): Any = js.native
    
    def getMetadata(): Metadata = js.native
    
    var metadata: Any = js.native
    
    var req: GrpcRequest = js.native
    
    var `type`: String = js.native
  }
  
  @JSImport("mali", "Response")
  @js.native
  open class Response protected () extends StObject {
    def this(call: Any, `type`: String) = this()
    
    var call: Any = js.native
    
    def get(field: String): Any = js.native
    
    def getMetadata(): Metadata = js.native
    
    def getStatus(field: String): Any = js.native
    
    var metadata: Any = js.native
    
    var res: GrpcResponse = js.native
    
    def sendMetadata(): Unit = js.native
    def sendMetadata(md: Any): Unit = js.native
    
    def set(field: Any): Unit = js.native
    def set(field: Any, `val`: Any): Unit = js.native
    
    def setStatus(field: Any): Unit = js.native
    def setStatus(field: Any, `val`: Any): Unit = js.native
    
    var status: Any = js.native
    
    var `type`: String = js.native
  }
  
  trait App[T] extends StObject {
    
    var context: T
  }
  object App {
    
    inline def apply[T](context: T): App[T] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[App[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: App[?], T] (val x: Self & App[T]) extends AnyVal {
      
      inline def setContext(value: T): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Context[R] extends StObject {
    
    @JSName("package")
    var _package: String = js.native
    
    var app: App[R] = js.native
    
    var call: GrpcCall = js.native
    
    var fullName: String = js.native
    
    def get(field: String): Any = js.native
    
    def getStatus(field: String): Any = js.native
    
    var locals: js.Object = js.native
    
    var metadata: Any = js.native
    
    var name: String = js.native
    
    var req: GrpcRequest = js.native
    
    var request: Request = js.native
    
    var res: GrpcResponse = js.native
    
    var response: Response = js.native
    
    def sendMetadata(md: Any): Unit = js.native
    
    var service: String = js.native
    
    def set(field: Any): Unit = js.native
    def set(field: Any, `val`: Any): Unit = js.native
    
    def setStatus(field: Any): Unit = js.native
    def setStatus(field: Any, `val`: Any): Unit = js.native
    
    var `type`: String = js.native
  }
  
  type GrpcCall = (ServerUnaryCall[Any, Any]) | (ServerReadableStream[Any, Any]) | (ServerWritableStream[Any, Any]) | (ServerDuplexStream[Any, Any])
  
  type GrpcRequest = Any
  
  type GrpcResponse = Any
  
  @js.native
  trait Mali[T]
    extends EventEmitter
       with App[T] {
    
    def addService(path: Any): Unit = js.native
    def addService(path: Any, name: String): Unit = js.native
    def addService(path: Any, name: String, options: Any): Unit = js.native
    def addService(path: Any, name: js.Array[String]): Unit = js.native
    def addService(path: Any, name: js.Array[String], options: Any): Unit = js.native
    def addService(path: Any, name: Unit, options: Any): Unit = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    var env: String = js.native
    
    def inspect(): Any = js.native
    
    var name: String = js.native
    
    var ports: js.Array[Double] = js.native
    
    var silent: Boolean = js.native
    
    def start(port: String): js.Promise[Server] = js.native
    def start(port: String, creds: Any): js.Promise[Server] = js.native
    def start(port: String, creds: Any, options: Any): js.Promise[Server] = js.native
    def start(port: String, creds: Unit, options: Any): js.Promise[Server] = js.native
    def start(port: Double): js.Promise[Server] = js.native
    def start(port: Double, creds: Any): js.Promise[Server] = js.native
    def start(port: Double, creds: Any, options: Any): js.Promise[Server] = js.native
    def start(port: Double, creds: Unit, options: Any): js.Promise[Server] = js.native
    
    def toJSON(): Any = js.native
    
    def use(): Unit = js.native
    def use(service: Any): Unit = js.native
    def use(service: Any, name: Any): Unit = js.native
    def use(service: Any, name: Any, fns: Any): Unit = js.native
    def use(service: Any, name: Unit, fns: Any): Unit = js.native
    def use(service: Unit, name: Any): Unit = js.native
    def use(service: Unit, name: Any, fns: Any): Unit = js.native
    def use(service: Unit, name: Unit, fns: Any): Unit = js.native
  }
}
