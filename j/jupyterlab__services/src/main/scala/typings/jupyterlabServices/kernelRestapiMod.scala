package typings.jupyterlabServices

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelRestapiMod {
  
  @JSImport("@jupyterlab/services/lib/kernel/restapi", "KERNEL_SERVICE_URL")
  @js.native
  val KERNEL_SERVICE_URL: /* "api/kernels" */ String = js.native
  
  @JSImport("@jupyterlab/services/lib/kernel/restapi", "getKernelModel")
  @js.native
  def getKernelModel(id: String): js.Promise[js.UndefOr[IModel]] = js.native
  @JSImport("@jupyterlab/services/lib/kernel/restapi", "getKernelModel")
  @js.native
  def getKernelModel(id: String, settings: ISettings): js.Promise[js.UndefOr[IModel]] = js.native
  
  @JSImport("@jupyterlab/services/lib/kernel/restapi", "interruptKernel")
  @js.native
  def interruptKernel(id: String): js.Promise[Unit] = js.native
  @JSImport("@jupyterlab/services/lib/kernel/restapi", "interruptKernel")
  @js.native
  def interruptKernel(id: String, settings: ISettings): js.Promise[Unit] = js.native
  
  @JSImport("@jupyterlab/services/lib/kernel/restapi", "listRunning")
  @js.native
  def listRunning(): js.Promise[js.Array[IModel]] = js.native
  @JSImport("@jupyterlab/services/lib/kernel/restapi", "listRunning")
  @js.native
  def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
  
  @JSImport("@jupyterlab/services/lib/kernel/restapi", "restartKernel")
  @js.native
  def restartKernel(id: String): js.Promise[Unit] = js.native
  @JSImport("@jupyterlab/services/lib/kernel/restapi", "restartKernel")
  @js.native
  def restartKernel(id: String, settings: ISettings): js.Promise[Unit] = js.native
  
  @JSImport("@jupyterlab/services/lib/kernel/restapi", "shutdownKernel")
  @js.native
  def shutdownKernel(id: String): js.Promise[Unit] = js.native
  @JSImport("@jupyterlab/services/lib/kernel/restapi", "shutdownKernel")
  @js.native
  def shutdownKernel(id: String, settings: ISettings): js.Promise[Unit] = js.native
  
  @JSImport("@jupyterlab/services/lib/kernel/restapi", "startNew")
  @js.native
  def startNew(): js.Promise[IModel] = js.native
  @JSImport("@jupyterlab/services/lib/kernel/restapi", "startNew")
  @js.native
  def startNew(options: js.UndefOr[scala.Nothing], settings: ISettings): js.Promise[IModel] = js.native
  @JSImport("@jupyterlab/services/lib/kernel/restapi", "startNew")
  @js.native
  def startNew(options: IKernelOptions): js.Promise[IModel] = js.native
  @JSImport("@jupyterlab/services/lib/kernel/restapi", "startNew")
  @js.native
  def startNew(options: IKernelOptions, settings: ISettings): js.Promise[IModel] = js.native
  
  /* Inlined std.Partial<std.Pick<@jupyterlab/services.@jupyterlab/services/lib/kernel/restapi.IModel, 'name'>> */
  @js.native
  trait IKernelOptions extends StObject {
    
    var name: js.UndefOr[String] = js.native
  }
  object IKernelOptions {
    
    @scala.inline
    def apply(): IKernelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IKernelOptions]
    }
    
    @scala.inline
    implicit class IKernelOptionsMutableBuilder[Self <: IKernelOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait IModel extends StObject {
    
    /**
      * Unique identifier of the kernel on the server.
      */
    val id: String = js.native
    
    /**
      * The name of the kernel.
      */
    val name: String = js.native
  }
  object IModel {
    
    @scala.inline
    def apply(id: String, name: String): IModel = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IModel]
    }
    
    @scala.inline
    implicit class IModelMutableBuilder[Self <: IModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
