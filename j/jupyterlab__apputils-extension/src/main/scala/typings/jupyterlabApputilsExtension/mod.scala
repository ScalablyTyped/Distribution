package typings.jupyterlabApputilsExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApputilsExtension.jupyterlabApputilsExtensionStrings.desktop
import typings.jupyterlabApputilsExtension.jupyterlabApputilsExtensionStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Export the plugins as default.
    */
  @JSImport("@jupyterlab/apputils-extension", JSImport.Default)
  @js.native
  val default: js.Array[JupyterFrontEndPlugin[Any, IShell, desktop | mobile]] = js.native
  
  @JSImport("@jupyterlab/apputils-extension", "toggleHeader")
  @js.native
  val toggleHeader: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
  
  type _To = js.Array[JupyterFrontEndPlugin[Any, IShell, desktop | mobile]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: js.Array[JupyterFrontEndPlugin[Any, IShell, desktop | mobile]] = default
}
