package typings.jupyterlabNotebookExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabNotebookExtension.jupyterlabNotebookExtensionStrings.desktop
import typings.jupyterlabNotebookExtension.jupyterlabNotebookExtensionStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Export the plugins as default.
    */
  @JSImport("@jupyterlab/notebook-extension", JSImport.Default)
  @js.native
  val default: js.Array[JupyterFrontEndPlugin[Any, IShell, desktop | mobile]] = js.native
  
  @JSImport("@jupyterlab/notebook-extension", "commandEditItem")
  @js.native
  val commandEditItem: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
  
  @JSImport("@jupyterlab/notebook-extension", "executionIndicator")
  @js.native
  val executionIndicator: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
  
  @JSImport("@jupyterlab/notebook-extension", "exportPlugin")
  @js.native
  val exportPlugin: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
  
  @JSImport("@jupyterlab/notebook-extension", "notebookTrustItem")
  @js.native
  val notebookTrustItem: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
  
  type _To = js.Array[JupyterFrontEndPlugin[Any, IShell, desktop | mobile]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: js.Array[JupyterFrontEndPlugin[Any, IShell, desktop | mobile]] = default
}
