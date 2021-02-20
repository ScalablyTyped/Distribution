package typings.jupyterlabLauncherExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabLauncher.mod.ILauncher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * A service providing an interface to the the launcher.
    */
  @JSImport("@jupyterlab/launcher-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[ILauncher] = js.native
  
  type _To = JupyterFrontEndPlugin[ILauncher]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[ILauncher] = default
}
