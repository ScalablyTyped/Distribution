package typings.jupyterlabApputilsExtension

import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApputils.libTokensMod.IToolbarWidgetRegistry
import typings.jupyterlabApputilsExtension.jupyterlabApputilsExtensionStrings.desktop
import typings.jupyterlabApputilsExtension.jupyterlabApputilsExtensionStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToolbarregistrypluginMod {
  
  @JSImport("@jupyterlab/apputils-extension/lib/toolbarregistryplugin", "toolbarRegistry")
  @js.native
  val toolbarRegistry: JupyterFrontEndPlugin[IToolbarWidgetRegistry, IShell, desktop | mobile] = js.native
}
