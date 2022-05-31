package typings.jupyterlabServices

import typings.jupyterlabServices.managerMod.KernelSpecManager.IOptions
import typings.jupyterlabServices.restapiMod.ISpecModels
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelspecMod {
  
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
  class KernelSpecManager ()
    extends typings.jupyterlabServices.managerMod.KernelSpecManager {
    def this(options: IOptions) = this()
  }
}
