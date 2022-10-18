package typings.jupyterlabServices

import typings.jupyterlabServices.libKernelspecManagerMod.KernelSpecManager.IOptions
import typings.jupyterlabServices.libKernelspecRestapiMod.ISpecModels
import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKernelspecMod {
  
  object KernelSpecAPI {
    
    @JSImport("@jupyterlab/services/lib/kernelspec", "KernelSpecAPI")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getSpecs(): js.Promise[ISpecModels] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpecs")().asInstanceOf[js.Promise[ISpecModels]]
    inline def getSpecs(settings: ISettings): js.Promise[ISpecModels] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpecs")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ISpecModels]]
  }
  
  @JSImport("@jupyterlab/services/lib/kernelspec", "KernelSpecManager")
  @js.native
  /**
    * Construct a new kernel spec manager.
    *
    * @param options - The default options for kernel.
    */
  open class KernelSpecManager ()
    extends typings.jupyterlabServices.libKernelspecManagerMod.KernelSpecManager {
    def this(options: IOptions) = this()
  }
}
