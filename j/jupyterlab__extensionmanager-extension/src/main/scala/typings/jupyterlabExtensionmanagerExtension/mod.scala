package typings.jupyterlabExtensionmanagerExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * The extension manager plugin.
    */
  @JSImport("@jupyterlab/extensionmanager-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[Unit] = js.native
  
  type _To = JupyterFrontEndPlugin[Unit]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[Unit] = default
}
