package typings.atJupyterlabNotebookDashExtension

import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook-extension", JSImport.Namespace)
@js.native
object atJupyterlabNotebookDashExtensionMod extends js.Object {
  val commandEditItem: JupyterFrontEndPlugin[Unit] = js.native
  /**
    * Export the plugins as default.
    */
  val default: js.Array[JupyterFrontEndPlugin[js.Any]] = js.native
  val notebookTrustItem: JupyterFrontEndPlugin[Unit] = js.native
}

