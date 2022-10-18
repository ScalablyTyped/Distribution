package typings.jupyterlabApputilsExtension

import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApputils.libTokensMod.IThemeManager
import typings.jupyterlabApputilsExtension.jupyterlabApputilsExtensionStrings.desktop
import typings.jupyterlabApputilsExtension.jupyterlabApputilsExtensionStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libThemespluginsMod {
  
  @JSImport("@jupyterlab/apputils-extension/lib/themesplugins", "themesPaletteMenuPlugin")
  @js.native
  val themesPaletteMenuPlugin: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
  
  @JSImport("@jupyterlab/apputils-extension/lib/themesplugins", "themesPlugin")
  @js.native
  val themesPlugin: JupyterFrontEndPlugin[IThemeManager, IShell, desktop | mobile] = js.native
}
