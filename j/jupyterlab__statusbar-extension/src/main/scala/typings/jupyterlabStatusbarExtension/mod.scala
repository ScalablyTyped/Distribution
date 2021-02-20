package typings.jupyterlabStatusbarExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@jupyterlab/statusbar-extension", JSImport.Default)
  @js.native
  val default: js.Array[JupyterFrontEndPlugin[js.Any]] = js.native
  
  @JSImport("@jupyterlab/statusbar-extension", "STATUSBAR_PLUGIN_ID")
  @js.native
  val STATUSBAR_PLUGIN_ID: /* "@jupyterlab/statusbar-extension:plugin" */ String = js.native
  
  @JSImport("@jupyterlab/statusbar-extension", "kernelStatus")
  @js.native
  val kernelStatus: JupyterFrontEndPlugin[Unit] = js.native
  
  @JSImport("@jupyterlab/statusbar-extension", "lineColItem")
  @js.native
  val lineColItem: JupyterFrontEndPlugin[Unit] = js.native
  
  @JSImport("@jupyterlab/statusbar-extension", "memoryUsageItem")
  @js.native
  val memoryUsageItem: JupyterFrontEndPlugin[Unit] = js.native
  
  @JSImport("@jupyterlab/statusbar-extension", "runningSessionsItem")
  @js.native
  val runningSessionsItem: JupyterFrontEndPlugin[Unit] = js.native
  
  type _To = js.Array[JupyterFrontEndPlugin[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: js.Array[JupyterFrontEndPlugin[js.Any]] = default
}
