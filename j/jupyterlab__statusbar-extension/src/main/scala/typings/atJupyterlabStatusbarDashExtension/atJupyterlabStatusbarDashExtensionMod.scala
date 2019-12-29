package typings.atJupyterlabStatusbarDashExtension

import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.atJupyterlabStatusbarDashExtension.atJupyterlabStatusbarDashExtensionStrings.`@jupyterlabSlashstatusbar-extensionColonplugin`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar-extension", JSImport.Namespace)
@js.native
object atJupyterlabStatusbarDashExtensionMod extends js.Object {
  val STATUSBAR_PLUGIN_ID: `@jupyterlabSlashstatusbar-extensionColonplugin` = js.native
  val default: js.Array[JupyterFrontEndPlugin[js.Any]] = js.native
  val kernelStatus: JupyterFrontEndPlugin[Unit] = js.native
  val lineColItem: JupyterFrontEndPlugin[Unit] = js.native
  val memoryUsageItem: JupyterFrontEndPlugin[Unit] = js.native
  val runningSessionsItem: JupyterFrontEndPlugin[Unit] = js.native
}

