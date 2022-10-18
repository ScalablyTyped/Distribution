package typings.jupyterlabCelltagsExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabCelltagsExtension.jupyterlabCelltagsExtensionStrings.desktop
import typings.jupyterlabCelltagsExtension.jupyterlabCelltagsExtensionStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Initialization data for the celltags extension.
    */
  @JSImport("@jupyterlab/celltags-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
  
  type _To = JupyterFrontEndPlugin[Unit, IShell, desktop | mobile]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = default
}
