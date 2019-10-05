package typings.atJupyterlabCells.atJupyterlabCellsMod

import typings.atJupyterlabApputils.libClientsessionMod.IClientSession
import typings.atJupyterlabCells.libWidgetMod.CodeCell.IOptions
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IExecuteReplyMsg
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "CodeCell")
@js.native
class CodeCell protected ()
  extends typings.atJupyterlabCells.libWidgetMod.CodeCell {
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
  def execute(cell: typings.atJupyterlabCells.libWidgetMod.CodeCell, session: IClientSession): js.Promise[IExecuteReplyMsg | Unit] = js.native
  def execute(
    cell: typings.atJupyterlabCells.libWidgetMod.CodeCell,
    session: IClientSession,
    metadata: JSONObject
  ): js.Promise[IExecuteReplyMsg | Unit] = js.native
}

