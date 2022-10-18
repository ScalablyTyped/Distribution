package typings.jupyterlabApputilsExtension

import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApputilsExtension.jupyterlabApputilsExtensionStrings.desktop
import typings.jupyterlabApputilsExtension.jupyterlabApputilsExtensionStrings.mobile
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSettingspluginMod {
  
  @JSImport("@jupyterlab/apputils-extension/lib/settingsplugin", "settingsPlugin")
  @js.native
  val settingsPlugin: JupyterFrontEndPlugin[ISettingRegistry, IShell, desktop | mobile] = js.native
}
