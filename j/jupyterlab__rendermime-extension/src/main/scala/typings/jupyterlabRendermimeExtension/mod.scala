package typings.jupyterlabRendermimeExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.jupyterlabRendermimeExtension.jupyterlabRendermimeExtensionStrings.desktop
import typings.jupyterlabRendermimeExtension.jupyterlabRendermimeExtensionStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * A plugin providing a rendermime registry.
    */
  @JSImport("@jupyterlab/rendermime-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[IRenderMimeRegistry, IShell, desktop | mobile] = js.native
  
  type _To = JupyterFrontEndPlugin[IRenderMimeRegistry, IShell, desktop | mobile]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[IRenderMimeRegistry, IShell, desktop | mobile] = default
}
