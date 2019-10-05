package typings.atJupyterlabCells.libWidgetMod.CodeCell

import typings.atJupyterlabApputils.libClientsessionMod.IClientSession
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IExecuteReplyMsg
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/widget", "CodeCell.execute")
@js.native
object execute extends js.Object {
  /**
    * Execute a cell given a client session.
    */
  def apply(cell: typings.atJupyterlabCells.libWidgetMod.CodeCell, session: IClientSession): js.Promise[IExecuteReplyMsg | Unit] = js.native
  def apply(
    cell: typings.atJupyterlabCells.libWidgetMod.CodeCell,
    session: IClientSession,
    metadata: JSONObject
  ): js.Promise[IExecuteReplyMsg | Unit] = js.native
}

