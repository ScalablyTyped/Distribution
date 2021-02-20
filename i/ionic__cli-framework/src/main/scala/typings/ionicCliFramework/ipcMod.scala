package typings.ionicCliFramework

import typings.ionicCliFramework.ionicCliFrameworkStrings.`rpc-request`
import typings.ionicCliFramework.ionicCliFrameworkStrings.`rpc-response`
import typings.node.childProcessMod.ChildProcess
import typings.node.processMod.global.NodeJS.Process
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipcMod {
  
  @JSImport("@ionic/cli-framework/utils/ipc", "RPCHost")
  @js.native
  class RPCHost protected () extends StObject {
    def this(modulePath: String, args: js.Array[String]) = this()
    
    val args: js.Array[String] = js.native
    
    def call[R /* <: RPCResponse[_, js.Object] */](
      procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any,
      args: /* import warning: importer.ImportType#apply Failed type conversion: R['request']['args'] */ js.Any
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: R['data'] */ js.Any
      ] = js.native
    
    def end(): Unit = js.native
    
    val modulePath: String = js.native
    
    def register[R /* <: RPCResponse[_, js.Object] */](
      procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any,
      fn: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: R['request']['args'] */ /* args */ js.Any, 
          js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: R['data'] */ js.Any
          ]
        ]
    ): Unit = js.native
    
    var rpc: RPCProcess = js.native
    
    def start(): Unit = js.native
  }
  
  @JSImport("@ionic/cli-framework/utils/ipc", "RPCProcess")
  @js.native
  class RPCProcess () extends StObject {
    def this(hasNameTimeout: RPCProcessOptions) = this()
    
    def call[R /* <: RPCResponse[_, js.Object] */](
      procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any,
      args: /* import warning: importer.ImportType#apply Failed type conversion: R['request']['args'] */ js.Any
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: R['data'] */ js.Any
      ] = js.native
    
    def end(): Unit = js.native
    
    val name: String = js.native
    
    var proc: js.UndefOr[ChildProcess] = js.native
    
    def register[R /* <: RPCResponse[_, js.Object] */](
      procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any,
      fn: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: R['request']['args'] */ /* args */ js.Any, 
          js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: R['data'] */ js.Any
          ]
        ]
    ): Unit = js.native
    
    var responseProcedures: Map[String, js.Function1[/* args */ js.Array[_], js.Promise[_]]] = js.native
    
    def start(proc: ChildProcess): Unit = js.native
    def start(proc: Process): Unit = js.native
    
    val timeout: Double = js.native
  }
  
  type RPC[P /* <: String */, A /* <: js.Array[_] */, D /* <: js.Object */] = RPCResponse[RPCRequest[P, A], D]
  
  @js.native
  trait RPCProcessOptions extends StObject {
    
    val name: js.UndefOr[String] = js.native
    
    val timeout: js.UndefOr[Double] = js.native
  }
  object RPCProcessOptions {
    
    @scala.inline
    def apply(): RPCProcessOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RPCProcessOptions]
    }
    
    @scala.inline
    implicit class RPCProcessOptionsMutableBuilder[Self <: RPCProcessOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait RPCRequest[P /* <: String */, A /* <: js.Array[_] */] extends StObject {
    
    var args: A = js.native
    
    var id: String = js.native
    
    var procedure: P = js.native
    
    var `type`: `rpc-request` = js.native
  }
  object RPCRequest {
    
    @scala.inline
    def apply[P /* <: String */, A /* <: js.Array[_] */](args: A, id: String, procedure: P, `type`: `rpc-request`): RPCRequest[P, A] = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RPCRequest[P, A]]
    }
    
    @scala.inline
    implicit class RPCRequestMutableBuilder[Self <: RPCRequest[_, _], P /* <: String */, A /* <: js.Array[_] */] (val x: Self with (RPCRequest[P, A])) extends AnyVal {
      
      @scala.inline
      def setArgs(value: A): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcedure(value: P): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: `rpc-request`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RPCResponse[R /* <: RPCRequest[_, _] */, D /* <: js.Object */] extends StObject {
    
    var data: D = js.native
    
    var err: js.UndefOr[js.Any] = js.native
    
    var id: String = js.native
    
    var procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any = js.native
    
    var request: R = js.native
    
    var `type`: `rpc-response` = js.native
  }
  object RPCResponse {
    
    @scala.inline
    def apply[R /* <: RPCRequest[_, _] */, D /* <: js.Object */](
      data: D,
      id: String,
      procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any,
      request: R,
      `type`: `rpc-response`
    ): RPCResponse[R, D] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RPCResponse[R, D]]
    }
    
    @scala.inline
    implicit class RPCResponseMutableBuilder[Self <: RPCResponse[_, _], R /* <: RPCRequest[_, _] */, D /* <: js.Object */] (val x: Self with (RPCResponse[R, D])) extends AnyVal {
      
      @scala.inline
      def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErr(value: js.Any): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcedure(
        value: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any
      ): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: R): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: `rpc-response`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
