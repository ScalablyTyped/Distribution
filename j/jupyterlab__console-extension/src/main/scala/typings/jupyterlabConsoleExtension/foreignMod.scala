package typings.jupyterlabConsoleExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foreignMod extends Shortcut {
  
  @JSImport("@jupyterlab/console-extension/lib/foreign", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[Unit] = js.native
  
  @JSImport("@jupyterlab/console-extension/lib/foreign", "foreign")
  @js.native
  val foreign: JupyterFrontEndPlugin[Unit] = js.native
  
  type _To = JupyterFrontEndPlugin[Unit]
  
  /* This means you don't have to write `default`, but can instead just say `foreignMod.foo` */
  override def _to: JupyterFrontEndPlugin[Unit] = default
}
