package typings.jupyterlabHubExtension

import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/hub-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val default: js.Array[JupyterFrontEndPlugin[js.Any]] = js.native
  
  @js.native
  object CommandIDs extends js.Object {
    
    val controlPanel: String = js.native
    
    val logout: String = js.native
    
    val restart: String = js.native
  }
}
