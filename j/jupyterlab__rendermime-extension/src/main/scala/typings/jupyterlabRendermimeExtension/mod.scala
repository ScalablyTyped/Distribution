package typings.jupyterlabRendermimeExtension

import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/rendermime-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * A plugin providing a rendermime registry.
    */
  val default: JupyterFrontEndPlugin[IRenderMimeRegistry] = js.native
}
