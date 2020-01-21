package typings.jupyterlabDocmanager.savingstatusMod

import typings.jupyterlabApputils.vdomMod.VDomRenderer
import typings.jupyterlabDocmanager.savingstatusMod.SavingStatus.IOptions
import typings.jupyterlabDocmanager.savingstatusMod.SavingStatus.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docmanager/lib/savingstatus", "SavingStatus")
@js.native
class SavingStatus_ protected () extends VDomRenderer[Model] {
  /**
    * Create a new SavingStatus item.
    */
  def this(opts: IOptions) = this()
  var _docManager: js.Any = js.native
}

