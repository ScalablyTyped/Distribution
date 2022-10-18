package typings.jupyterlabStatusbarExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabStatusbarExtension.jupyterlabStatusbarExtensionStrings.desktop
import typings.jupyterlabStatusbarExtension.jupyterlabStatusbarExtensionStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@jupyterlab/statusbar-extension", JSImport.Default)
  @js.native
  val default: js.Array[JupyterFrontEndPlugin[Any, IShell, desktop | mobile]] = js.native
  
  @JSImport("@jupyterlab/statusbar-extension", "STATUSBAR_PLUGIN_ID")
  @js.native
  val STATUSBAR_PLUGIN_ID: /* "@jupyterlab/statusbar-extension:plugin" */ String = js.native
  
  @JSImport("@jupyterlab/statusbar-extension", "kernelStatus")
  @js.native
  val kernelStatus: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
  
  @JSImport("@jupyterlab/statusbar-extension", "lineColItem")
  @js.native
  val lineColItem: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
  
  @JSImport("@jupyterlab/statusbar-extension", "runningSessionsItem")
  @js.native
  val runningSessionsItem: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
  
  type _To = js.Array[JupyterFrontEndPlugin[Any, IShell, desktop | mobile]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: js.Array[JupyterFrontEndPlugin[Any, IShell, desktop | mobile]] = default
}
