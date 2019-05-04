package typings
package atJupyterlabImageviewerDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/imageviewer-extension", JSImport.Namespace)
@js.native
object atJupyterlabImageviewerDashExtensionMod extends js.Object {
  /**
    * The image file handler extension.
    */
  val default: atJupyterlabApplicationLib.atJupyterlabApplicationMod.JupyterLabPlugin[atJupyterlabImageviewerLib.atJupyterlabImageviewerMod.IImageTracker] = js.native
  def addCommands(
    app: atJupyterlabApplicationLib.atJupyterlabApplicationMod.JupyterLab,
    tracker: atJupyterlabImageviewerLib.atJupyterlabImageviewerMod.IImageTracker
  ): scala.Unit = js.native
}

