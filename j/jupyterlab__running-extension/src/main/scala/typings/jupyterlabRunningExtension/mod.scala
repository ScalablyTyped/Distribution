package typings.jupyterlabRunningExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabRunning.mod.IRunningSessionManagers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * The default running sessions extension.
    */
  @JSImport("@jupyterlab/running-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[IRunningSessionManagers] = js.native
  
  type _To = JupyterFrontEndPlugin[IRunningSessionManagers]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[IRunningSessionManagers] = default
}
