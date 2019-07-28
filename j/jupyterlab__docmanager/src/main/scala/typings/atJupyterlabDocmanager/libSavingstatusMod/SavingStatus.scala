package typings.atJupyterlabDocmanager.libSavingstatusMod

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.VDomRenderer
import typings.atJupyterlabDocmanager.libSavingstatusMod.SavingStatusNs.IOptions
import typings.atJupyterlabDocmanager.libSavingstatusMod.SavingStatusNs.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docmanager/lib/savingstatus", "SavingStatus")
@js.native
class SavingStatus protected () extends VDomRenderer[Model] {
  /**
    * Create a new SavingStatus item.
    */
  def this(opts: IOptions) = this()
  var _docManager: js.Any = js.native
}

