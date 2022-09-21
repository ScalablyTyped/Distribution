package typings.jupyterlabServices

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelRestapiMod {
  
  @JSImport("@jupyterlab/services/lib/kernel/restapi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyterlab/services/lib/kernel/restapi", "KERNEL_SERVICE_URL")
  @js.native
  val KERNEL_SERVICE_URL: /* "api/kernels" */ String = js.native
  
  inline def getKernelModel(id: String): js.Promise[js.UndefOr[IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getKernelModel")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[IModel]]]
  inline def getKernelModel(id: String, settings: ISettings): js.Promise[js.UndefOr[IModel]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKernelModel")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[IModel]]]
  
  inline def interruptKernel(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("interruptKernel")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def interruptKernel(id: String, settings: ISettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("interruptKernel")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def listRunning(): js.Promise[js.Array[IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")().asInstanceOf[js.Promise[js.Array[IModel]]]
  inline def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[IModel]]]
  
  inline def restartKernel(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("restartKernel")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def restartKernel(id: String, settings: ISettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("restartKernel")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def shutdownKernel(id: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdownKernel")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def shutdownKernel(id: String, settings: ISettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("shutdownKernel")(id.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def startNew(): js.Promise[IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("startNew")().asInstanceOf[js.Promise[IModel]]
  inline def startNew(options: Unit, settings: ISettings): js.Promise[IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(options.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel]]
  inline def startNew(options: IKernelOptions): js.Promise[IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IModel]]
  inline def startNew(options: IKernelOptions, settings: ISettings): js.Promise[IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(options.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel]]
  
  /* Inlined std.Partial<std.Pick<@jupyterlab/services.@jupyterlab/services/lib/kernel/restapi.IModel, 'name'>> */
  trait IKernelOptions extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
  }
  object IKernelOptions {
    
    inline def apply(): IKernelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IKernelOptions]
    }
    
    extension [Self <: IKernelOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait IModel extends StObject {
    
    /**
      * The number of active connections to the kernel.
      */
    val connections: js.UndefOr[Double] = js.undefined
    
    /**
      * The kernel execution state.
      */
    val execution_state: js.UndefOr[String] = js.undefined
    
    /**
      * Unique identifier of the kernel on the server.
      */
    val id: String
    
    /**
      * The timestamp of the last activity on the kernel.
      */
    val last_activity: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the kernel.
      */
    val name: String
    
    /**
      * The reason the kernel died, if applicable.
      */
    val reason: js.UndefOr[String] = js.undefined
    
    /**
      * The traceback for a dead kernel, if applicable.
      */
    val traceback: js.UndefOr[String] = js.undefined
  }
  object IModel {
    
    inline def apply(id: String, name: String): IModel = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IModel]
    }
    
    extension [Self <: IModel](x: Self) {
      
      inline def setConnections(value: Double): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
      
      inline def setExecution_state(value: String): Self = StObject.set(x, "execution_state", value.asInstanceOf[js.Any])
      
      inline def setExecution_stateUndefined: Self = StObject.set(x, "execution_state", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLast_activity(value: String): Self = StObject.set(x, "last_activity", value.asInstanceOf[js.Any])
      
      inline def setLast_activityUndefined: Self = StObject.set(x, "last_activity", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setTraceback(value: String): Self = StObject.set(x, "traceback", value.asInstanceOf[js.Any])
      
      inline def setTracebackUndefined: Self = StObject.set(x, "traceback", js.undefined)
    }
  }
}
