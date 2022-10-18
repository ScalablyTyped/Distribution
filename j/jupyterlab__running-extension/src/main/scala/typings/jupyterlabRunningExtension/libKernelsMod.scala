package typings.jupyterlabRunningExtension

import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.mod.JupyterFrontEnd
import typings.jupyterlabRunning.mod.IRunningSessionManagers
import typings.jupyterlabRunningExtension.jupyterlabRunningExtensionStrings.desktop
import typings.jupyterlabRunningExtension.jupyterlabRunningExtensionStrings.mobile
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKernelsMod {
  
  @JSImport("@jupyterlab/running-extension/lib/kernels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addKernelRunningSessionManager(
    managers: IRunningSessionManagers,
    translator: ITranslator,
    app: JupyterFrontEnd[IShell, desktop | mobile]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addKernelRunningSessionManager")(managers.asInstanceOf[js.Any], translator.asInstanceOf[js.Any], app.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
