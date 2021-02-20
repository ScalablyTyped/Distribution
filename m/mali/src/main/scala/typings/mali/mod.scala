package typings.mali

import typings.grpc.mod.Metadata
import typings.grpc.mod.Server
import typings.grpc.mod.ServerDuplexStream
import typings.grpc.mod.ServerReadableStream
import typings.grpc.mod.ServerUnaryCall
import typings.grpc.mod.ServerWriteableStream
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mali", JSImport.Namespace)
  @js.native
  class ^ () extends Mali {
    def this(path: js.Any) = this()
    def this(path: js.UndefOr[scala.Nothing], name: String) = this()
    def this(path: js.UndefOr[scala.Nothing], name: js.Array[String]) = this()
    def this(path: js.Any, name: String) = this()
    def this(path: js.Any, name: js.Array[String]) = this()
    def this(path: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], options: js.Any) = this()
    def this(path: js.UndefOr[scala.Nothing], name: String, options: js.Any) = this()
    def this(path: js.UndefOr[scala.Nothing], name: js.Array[String], options: js.Any) = this()
    def this(path: js.Any, name: js.UndefOr[scala.Nothing], options: js.Any) = this()
    def this(path: js.Any, name: String, options: js.Any) = this()
    def this(path: js.Any, name: js.Array[String], options: js.Any) = this()
  }
  
  @JSImport("mali", "Request")
  @js.native
  class Request protected () extends StObject {
    def this(call: js.Any, `type`: String) = this()
    
    var call: js.Any = js.native
    
    def get(field: String): js.Any = js.native
    
    def getMetadata(): Metadata = js.native
    
    var metadata: js.Any = js.native
    
    var req: GrpcRequest = js.native
    
    var `type`: String = js.native
  }
  
  @JSImport("mali", "Response")
  @js.native
  class Response protected () extends StObject {
    def this(call: js.Any, `type`: String) = this()
    
    var call: js.Any = js.native
    
    def get(field: String): js.Any = js.native
    
    def getMetadata(): Metadata = js.native
    
    def getStatus(field: String): js.Any = js.native
    
    var metadata: js.Any = js.native
    
    var res: GrpcResponse = js.native
    
    def sendMetadata(): Unit = js.native
    def sendMetadata(md: js.Any): Unit = js.native
    
    def set(field: js.Any): Unit = js.native
    def set(field: js.Any, `val`: js.Any): Unit = js.native
    
    def setStatus(field: js.Any): Unit = js.native
    def setStatus(field: js.Any, `val`: js.Any): Unit = js.native
    
    var status: js.Any = js.native
    
    var `type`: String = js.native
  }
  
  @js.native
  trait Context extends StObject {
    
    @JSName("package")
    var _package: String = js.native
    
    var app: Mali = js.native
    
    var call: GrpcCall = js.native
    
    var fullName: String = js.native
    
    def get(field: String): js.Any = js.native
    
    def getStatus(field: String): js.Any = js.native
    
    var locals: js.Object = js.native
    
    var metadata: js.Any = js.native
    
    var name: String = js.native
    
    var req: GrpcRequest = js.native
    
    var request: Request = js.native
    
    var res: GrpcResponse = js.native
    
    var response: Response = js.native
    
    def sendMetadata(md: js.Any): Unit = js.native
    
    var service: String = js.native
    
    def set(field: js.Any): Unit = js.native
    def set(field: js.Any, `val`: js.Any): Unit = js.native
    
    def setStatus(field: js.Any): Unit = js.native
    def setStatus(field: js.Any, `val`: js.Any): Unit = js.native
    
    var `type`: String = js.native
  }
  
  type GrpcCall = ServerUnaryCall[js.Any] | ServerReadableStream[js.Any] | (ServerWriteableStream[js.Any, js.Any]) | (ServerDuplexStream[js.Any, js.Any])
  
  type GrpcRequest = js.Any
  
  type GrpcResponse = js.Any
  
  @js.native
  trait Mali extends EventEmitter {
    
    def addService(path: js.Any, name: String): Unit = js.native
    def addService(path: js.Any, name: String, options: js.Any): Unit = js.native
    def addService(path: js.Any, name: js.Array[String]): Unit = js.native
    def addService(path: js.Any, name: js.Array[String], options: js.Any): Unit = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    var context: js.Object = js.native
    
    var env: String = js.native
    
    def inspect(): js.Any = js.native
    
    var name: String = js.native
    
    var ports: js.Array[Double] = js.native
    
    var silent: Boolean = js.native
    
    def start(port: String): Server = js.native
    def start(port: String, creds: js.UndefOr[scala.Nothing], options: js.Any): Server = js.native
    def start(port: String, creds: js.Any): Server = js.native
    def start(port: String, creds: js.Any, options: js.Any): Server = js.native
    def start(port: Double): Server = js.native
    def start(port: Double, creds: js.UndefOr[scala.Nothing], options: js.Any): Server = js.native
    def start(port: Double, creds: js.Any): Server = js.native
    def start(port: Double, creds: js.Any, options: js.Any): Server = js.native
    
    def toJSON(): js.Any = js.native
    
    def use(): Unit = js.native
    def use(service: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], fns: js.Any): Unit = js.native
    def use(service: js.UndefOr[scala.Nothing], name: js.Any): Unit = js.native
    def use(service: js.UndefOr[scala.Nothing], name: js.Any, fns: js.Any): Unit = js.native
    def use(service: js.Any): Unit = js.native
    def use(service: js.Any, name: js.UndefOr[scala.Nothing], fns: js.Any): Unit = js.native
    def use(service: js.Any, name: js.Any): Unit = js.native
    def use(service: js.Any, name: js.Any, fns: js.Any): Unit = js.native
  }
}
