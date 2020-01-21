package typings.jupyterlabCells.mod

import typings.jupyterlabApputils.clientsessionMod.IClientSession
import typings.jupyterlabCells.widgetMod.CodeCell.IOptions
import typings.jupyterlabServices.messagesMod.KernelMessage.IExecuteReplyMsg
import typings.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "CodeCell")
@js.native
class CodeCell protected ()
  extends typings.jupyterlabCells.widgetMod.CodeCell {
  /**
    * Construct a code cell widget.
    */
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/cells", "CodeCell")
@js.native
object CodeCell extends js.Object {
  /**
    * Execute a cell given a client session.
    */
  def execute(cell: typings.jupyterlabCells.widgetMod.CodeCell, session: IClientSession): js.Promise[IExecuteReplyMsg | Unit] = js.native
  def execute(cell: typings.jupyterlabCells.widgetMod.CodeCell, session: IClientSession, metadata: JSONObject): js.Promise[IExecuteReplyMsg | Unit] = js.native
}

