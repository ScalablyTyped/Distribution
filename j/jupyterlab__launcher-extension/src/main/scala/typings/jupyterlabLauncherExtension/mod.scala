package typings.jupyterlabLauncherExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabLauncher.mod.ILauncher
import typings.jupyterlabLauncherExtension.jupyterlabLauncherExtensionStrings.desktop
import typings.jupyterlabLauncherExtension.jupyterlabLauncherExtensionStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * A service providing an interface to the the launcher.
    */
  @JSImport("@jupyterlab/launcher-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[ILauncher, IShell, desktop | mobile] = js.native
  
  type _To = JupyterFrontEndPlugin[ILauncher, IShell, desktop | mobile]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[ILauncher, IShell, desktop | mobile] = default
}
