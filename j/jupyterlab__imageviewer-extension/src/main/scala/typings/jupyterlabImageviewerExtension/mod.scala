package typings.jupyterlabImageviewerExtension

import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApplication.mod.JupyterFrontEnd
import typings.jupyterlabImageviewer.tokensMod.IImageTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/imageviewer-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addCommands(app: JupyterFrontEnd[IShell], tracker: IImageTracker): Unit = js.native
  
  /**
    * The image file handler extension.
    */
  val default: JupyterFrontEndPlugin[IImageTracker] = js.native
}
