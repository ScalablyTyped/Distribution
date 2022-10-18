package typings.jupyterlabThemeDarkExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabThemeDarkExtension.jupyterlabThemeDarkExtensionStrings.desktop
import typings.jupyterlabThemeDarkExtension.jupyterlabThemeDarkExtensionStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * A plugin for the Jupyter Dark Theme.
    */
  @JSImport("@jupyterlab/theme-dark-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
  
  type _To = JupyterFrontEndPlugin[Unit, IShell, desktop | mobile]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = default
}
