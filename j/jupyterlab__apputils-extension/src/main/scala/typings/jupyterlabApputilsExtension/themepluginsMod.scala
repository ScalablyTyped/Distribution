package typings.jupyterlabApputilsExtension

import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApputils.tokensMod.IThemeManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themepluginsMod {
  
  @JSImport("@jupyterlab/apputils-extension/lib/themeplugins", "themesPaletteMenuPlugin")
  @js.native
  val themesPaletteMenuPlugin: JupyterFrontEndPlugin[Unit] = js.native
  
  @JSImport("@jupyterlab/apputils-extension/lib/themeplugins", "themesPlugin")
  @js.native
  val themesPlugin: JupyterFrontEndPlugin[IThemeManager] = js.native
}
