package typings.atJupyterlabHubDashExtension

import typings.atJupyterlabApplication.atJupyterlabApplicationMod.JupyterFrontEnd
import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.atPhosphorApplication.atPhosphorApplicationMod.IPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/hub-extension", JSImport.Namespace)
@js.native
object atJupyterlabHubDashExtensionMod extends js.Object {
  val default: js.Array[IPlugin[JupyterFrontEnd[IShell], js.Any]] = js.native
  @js.native
  object CommandIDs extends js.Object {
    val controlPanel: String = js.native
    val logout: String = js.native
    val restart: String = js.native
  }
  
}

