package typings.jupyterlabThemeLightExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabThemeLightExtension.jupyterlabThemeLightExtensionStrings.desktop
import typings.jupyterlabThemeLightExtension.jupyterlabThemeLightExtensionStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * A plugin for the Jupyter Light Theme.
    */
  @JSImport("@jupyterlab/theme-light-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
  
  type _To = JupyterFrontEndPlugin[Unit, IShell, desktop | mobile]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = default
}
