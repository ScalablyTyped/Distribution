package typings.jupyterlabConsoleExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabConsoleExtension.jupyterlabConsoleExtensionStrings.desktop
import typings.jupyterlabConsoleExtension.jupyterlabConsoleExtensionStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libForeignMod extends Shortcut {
  
  @JSImport("@jupyterlab/console-extension/lib/foreign", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
  
  @JSImport("@jupyterlab/console-extension/lib/foreign", "foreign")
  @js.native
  val foreign: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
  
  type _To = JupyterFrontEndPlugin[Unit, IShell, desktop | mobile]
  
  /* This means you don't have to write `default`, but can instead just say `libForeignMod.foo` */
  override def _to: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = default
}
