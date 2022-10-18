package typings.jupyterlabCellToolbarExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabCellToolbarExtension.jupyterlabCellToolbarExtensionStrings.desktop
import typings.jupyterlabCellToolbarExtension.jupyterlabCellToolbarExtensionStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@jupyterlab/cell-toolbar-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
  
  type _To = JupyterFrontEndPlugin[Unit, IShell, desktop | mobile]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = default
}
