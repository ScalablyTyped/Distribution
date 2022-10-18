package typings.jupyterlabRunningExtension

import typings.jupyterlabApplication.libShellMod.ILabShell
import typings.jupyterlabRunning.mod.IRunningSessionManagers
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOpentabsMod {
  
  @JSImport("@jupyterlab/running-extension/lib/opentabs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addOpenTabsSessionManager(managers: IRunningSessionManagers, translator: ITranslator, labShell: ILabShell): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addOpenTabsSessionManager")(managers.asInstanceOf[js.Any], translator.asInstanceOf[js.Any], labShell.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
