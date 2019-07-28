package typings.atJupyterlabCells.atJupyterlabCellsMod

import typings.atJupyterlabApputils.libClientsessionMod.IClientSession
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IExecuteReplyMsg
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "CodeCell")
@js.native
object CodeCellNs extends js.Object {
  /**
    * Execute a cell given a client session.
    */
  def execute(cell: typings.atJupyterlabCells.libWidgetMod.CodeCell, session: IClientSession): js.Promise[IExecuteReplyMsg | Unit] = js.native
  def execute(
    cell: typings.atJupyterlabCells.libWidgetMod.CodeCell,
    session: IClientSession,
    metadata: JSONObject
  ): js.Promise[IExecuteReplyMsg | Unit] = js.native
}

