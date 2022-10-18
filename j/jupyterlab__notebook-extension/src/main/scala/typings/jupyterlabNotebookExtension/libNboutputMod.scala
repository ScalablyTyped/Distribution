package typings.jupyterlabNotebookExtension

import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabNotebookExtension.jupyterlabNotebookExtensionStrings.desktop
import typings.jupyterlabNotebookExtension.jupyterlabNotebookExtensionStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNboutputMod {
  
  @JSImport("@jupyterlab/notebook-extension/lib/nboutput", "logNotebookOutput")
  @js.native
  val logNotebookOutput: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
}
