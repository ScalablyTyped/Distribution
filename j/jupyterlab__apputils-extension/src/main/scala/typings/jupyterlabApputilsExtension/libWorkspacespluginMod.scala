package typings.jupyterlabApputilsExtension

import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApputilsExtension.jupyterlabApputilsExtensionStrings.desktop
import typings.jupyterlabApputilsExtension.jupyterlabApputilsExtensionStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWorkspacespluginMod {
  
  @JSImport("@jupyterlab/apputils-extension/lib/workspacesplugin", "workspacesPlugin")
  @js.native
  val workspacesPlugin: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
}
