package typings.ionicCliFramework

import typings.ionicCliFramework.ionicCliFrameworkStrings.`rpc-request`
import typings.ionicCliFramework.ionicCliFrameworkStrings.`rpc-response`
import typings.node.childProcessMod.ChildProcess
import typings.node.processMod.global.NodeJS.Process
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipcMod {
  
  @JSImport("@ionic/cli-framework/utils/ipc", "RPCHost")
  @js.native
  open class RPCHost protected () extends StObject {
    def this(modulePath: String, args: js.Array[String]) = this()
    
    val args: js.Array[String] = js.native
    
    def call[R /* <: RPCResponse[Any, js.Object] */](
      procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any,
      args: /* import warning: importer.ImportType#apply Failed type conversion: R['request']['args'] */ js.Any
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: R['data'] */ js.Any
      ] = js.native
    
    def end(): Unit = js.native
    
    val modulePath: String = js.native
    
    def register[R /* <: RPCResponse[Any, js.Object] */](
      procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any,
      fn: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: R['request']['args'] */ /* args */ js.Any, 
          js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: R['data'] */ js.Any
          ]
        ]
    ): Unit = js.native
    
    /* protected */ var rpc: RPCProcess = js.native
    
    def start(): Unit = js.native
  }
  
  @JSImport("@ionic/cli-framework/utils/ipc", "RPCProcess")
  @js.native
  open class RPCProcess () extends StObject {
    def this(hasNameTimeout: RPCProcessOptions) = this()
    
    def call[R /* <: RPCResponse[Any, js.Object] */](
      procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any,
      args: /* import warning: importer.ImportType#apply Failed type conversion: R['request']['args'] */ js.Any
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: R['data'] */ js.Any
      ] = js.native
    
    def end(): Unit = js.native
    
    val name: String = js.native
    
    /* protected */ var proc: js.UndefOr[ChildProcess] = js.native
    
    def register[R /* <: RPCResponse[Any, js.Object] */](
      procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any,
      fn: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: R['request']['args'] */ /* args */ js.Any, 
          js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: R['data'] */ js.Any
          ]
        ]
    ): Unit = js.native
    
    /* protected */ var responseProcedures: Map[String, js.Function1[/* args */ js.Array[Any], js.Promise[Any]]] = js.native
    
    def start(proc: ChildProcess): Unit = js.native
    def start(proc: Process): Unit = js.native
    
    val timeout: Double = js.native
  }
  
  type RPC[P /* <: String */, A /* <: js.Array[Any] */, D /* <: js.Object */] = RPCResponse[RPCRequest[P, A], D]
  
  trait RPCProcessOptions extends StObject {
    
    val name: js.UndefOr[String] = js.undefined
    
    val timeout: js.UndefOr[Double] = js.undefined
  }
  object RPCProcessOptions {
    
    inline def apply(): RPCProcessOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RPCProcessOptions]
    }
    
    extension [Self <: RPCProcessOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait RPCRequest[P /* <: String */, A /* <: js.Array[Any] */] extends StObject {
    
    var args: A
    
    var id: String
    
    var procedure: P
    
    var `type`: `rpc-request`
  }
  object RPCRequest {
    
    inline def apply[P /* <: String */, A /* <: js.Array[Any] */](args: A, id: String, procedure: P): RPCRequest[P, A] = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("rpc-request")
      __obj.asInstanceOf[RPCRequest[P, A]]
    }
    
    extension [Self <: RPCRequest[?, ?], P /* <: String */, A /* <: js.Array[Any] */](x: Self & (RPCRequest[P, A])) {
      
      inline def setArgs(value: A): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setProcedure(value: P): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
      
      inline def setType(value: `rpc-request`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RPCResponse[R /* <: RPCRequest[Any, Any] */, D /* <: js.Object */] extends StObject {
    
    var data: D
    
    var err: js.UndefOr[Any] = js.undefined
    
    var id: String
    
    var procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any
    
    var request: R
    
    var `type`: `rpc-response`
  }
  object RPCResponse {
    
    inline def apply[R /* <: RPCRequest[Any, Any] */, D /* <: js.Object */](
      data: D,
      id: String,
      procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any,
      request: R
    ): RPCResponse[R, D] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("rpc-response")
      __obj.asInstanceOf[RPCResponse[R, D]]
    }
    
    extension [Self <: RPCResponse[?, ?], R /* <: RPCRequest[Any, Any] */, D /* <: js.Object */](x: Self & (RPCResponse[R, D])) {
      
      inline def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setErr(value: Any): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setProcedure(
        value: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any
      ): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: R): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setType(value: `rpc-response`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
