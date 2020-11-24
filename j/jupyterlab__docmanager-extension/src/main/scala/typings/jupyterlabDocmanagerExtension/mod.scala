package typings.jupyterlabDocmanagerExtension

import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/docmanager-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Export the plugins as default.
    */
  val default: js.Array[JupyterFrontEndPlugin[js.Any]] = js.native
  
  val pathStatusPlugin: JupyterFrontEndPlugin[Unit] = js.native
  
  val savingStatusPlugin: JupyterFrontEndPlugin[Unit] = js.native
}
