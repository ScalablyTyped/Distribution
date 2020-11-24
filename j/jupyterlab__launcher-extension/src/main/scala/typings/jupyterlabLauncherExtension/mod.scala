package typings.jupyterlabLauncherExtension

import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabLauncher.mod.ILauncher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/launcher-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * A service providing an interface to the the launcher.
    */
  val default: JupyterFrontEndPlugin[ILauncher] = js.native
}
