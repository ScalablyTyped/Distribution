package typings.jupyterlabUiComponentsExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabUiComponents.libTokensMod.ILabIconManager
import typings.jupyterlabUiComponentsExtension.jupyterlabUiComponentsExtensionStrings.desktop
import typings.jupyterlabUiComponentsExtension.jupyterlabUiComponentsExtensionStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@jupyterlab/ui-components-extension", JSImport.Default)
  @js.native
  val default: js.Array[JupyterFrontEndPlugin[ILabIconManager, IShell, desktop | mobile]] = js.native
  
  type _To = js.Array[JupyterFrontEndPlugin[ILabIconManager, IShell, desktop | mobile]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: js.Array[JupyterFrontEndPlugin[ILabIconManager, IShell, desktop | mobile]] = default
}
