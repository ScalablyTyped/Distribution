package typings.jupyterlabHubExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@jupyterlab/hub-extension", JSImport.Default)
  @js.native
  val default: js.Array[JupyterFrontEndPlugin[js.Any]] = js.native
  
  object CommandIDs {
    
    @JSImport("@jupyterlab/hub-extension", "CommandIDs.controlPanel")
    @js.native
    val controlPanel: String = js.native
    
    @JSImport("@jupyterlab/hub-extension", "CommandIDs.logout")
    @js.native
    val logout: String = js.native
    
    @JSImport("@jupyterlab/hub-extension", "CommandIDs.restart")
    @js.native
    val restart: String = js.native
  }
  
  type _To = js.Array[JupyterFrontEndPlugin[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: js.Array[JupyterFrontEndPlugin[js.Any]] = default
}
