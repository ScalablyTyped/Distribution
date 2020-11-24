package typings.jupyterlabSettingeditorExtension

import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabSettingeditor.tokensMod.ISettingEditorTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/settingeditor-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * The default setting editor extension.
    */
  val default: JupyterFrontEndPlugin[ISettingEditorTracker] = js.native
}
