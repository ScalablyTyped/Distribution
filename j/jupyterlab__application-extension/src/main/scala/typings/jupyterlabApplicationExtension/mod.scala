package typings.jupyterlabApplicationExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApplicationExtension.jupyterlabApplicationExtensionStrings.desktop
import typings.jupyterlabApplicationExtension.jupyterlabApplicationExtensionStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Export the plugins as default.
    */
  @JSImport("@jupyterlab/application-extension", JSImport.Default)
  @js.native
  val default: js.Array[JupyterFrontEndPlugin[Any, IShell, desktop | mobile]] = js.native
  
  @JSImport("@jupyterlab/application-extension", "DEFAULT_CONTEXT_ITEM_RANK")
  @js.native
  val DEFAULT_CONTEXT_ITEM_RANK: /* 100 */ Double = js.native
  
  type _To = js.Array[JupyterFrontEndPlugin[Any, IShell, desktop | mobile]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: js.Array[JupyterFrontEndPlugin[Any, IShell, desktop | mobile]] = default
}
