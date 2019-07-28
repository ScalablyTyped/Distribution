package typings.atJupyterlabImageviewerDashExtension

import typings.atJupyterlabApplication.atJupyterlabApplicationMod.JupyterFrontEnd
import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndNs.IShell
import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.atJupyterlabImageviewer.libTokensMod.IImageTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/imageviewer-extension", JSImport.Namespace)
@js.native
object atJupyterlabImageviewerDashExtensionMod extends js.Object {
  /**
    * The image file handler extension.
    */
  val default: JupyterFrontEndPlugin[IImageTracker] = js.native
  def addCommands(app: JupyterFrontEnd[IShell], tracker: IImageTracker): Unit = js.native
}

