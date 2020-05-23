package typings.jupyterlabStatusbarExtension

import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val STATUSBAR_PLUGIN_ID: /* "@jupyterlab/statusbar-extension:plugin" */ String = js.native
  val default: js.Array[JupyterFrontEndPlugin[js.Any]] = js.native
  val kernelStatus: JupyterFrontEndPlugin[Unit] = js.native
  val lineColItem: JupyterFrontEndPlugin[Unit] = js.native
  val memoryUsageItem: JupyterFrontEndPlugin[Unit] = js.native
  val runningSessionsItem: JupyterFrontEndPlugin[Unit] = js.native
}

