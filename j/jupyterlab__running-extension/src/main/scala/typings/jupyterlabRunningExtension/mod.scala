package typings.jupyterlabRunningExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabRunning.mod.IRunningSessionManagers
import typings.jupyterlabRunningExtension.jupyterlabRunningExtensionStrings.desktop
import typings.jupyterlabRunningExtension.jupyterlabRunningExtensionStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * The default running sessions extension.
    */
  @JSImport("@jupyterlab/running-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[IRunningSessionManagers, IShell, desktop | mobile] = js.native
  
  type _To = JupyterFrontEndPlugin[IRunningSessionManagers, IShell, desktop | mobile]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[IRunningSessionManagers, IShell, desktop | mobile] = default
}
