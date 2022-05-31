package typings.jupyterlabNotebookExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Export the plugins as default.
    */
  @JSImport("@jupyterlab/notebook-extension", JSImport.Default)
  @js.native
  val default: js.Array[JupyterFrontEndPlugin[js.Any]] = js.native
  
  @JSImport("@jupyterlab/notebook-extension", "commandEditItem")
  @js.native
  val commandEditItem: JupyterFrontEndPlugin[Unit] = js.native
  
  @JSImport("@jupyterlab/notebook-extension", "notebookTrustItem")
  @js.native
  val notebookTrustItem: JupyterFrontEndPlugin[Unit] = js.native
  
  type _To = js.Array[JupyterFrontEndPlugin[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: js.Array[JupyterFrontEndPlugin[js.Any]] = default
}
