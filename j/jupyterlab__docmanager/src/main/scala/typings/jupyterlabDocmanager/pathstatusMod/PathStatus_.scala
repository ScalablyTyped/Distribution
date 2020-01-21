package typings.jupyterlabDocmanager.pathstatusMod

import typings.jupyterlabApputils.vdomMod.VDomRenderer
import typings.jupyterlabDocmanager.pathstatusMod.PathStatus.IOptions
import typings.jupyterlabDocmanager.pathstatusMod.PathStatus.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docmanager/lib/pathstatus", "PathStatus")
@js.native
class PathStatus_ protected () extends VDomRenderer[Model] {
  /**
    * Construct a new PathStatus status item.
    */
  def this(opts: IOptions) = this()
  var _docManager: js.Any = js.native
}

