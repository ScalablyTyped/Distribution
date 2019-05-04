package typings
package atJupyterlabCellsLib.atJupyterlabCellsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "CodeCell")
@js.native
object CodeCellNs extends js.Object {
  /**
    * Execute a cell given a client session.
    */
  def execute(
    cell: atJupyterlabCellsLib.libWidgetMod.CodeCell,
    session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession
  ): js.Promise[atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IExecuteReplyMsg] = js.native
  def execute(
    cell: atJupyterlabCellsLib.libWidgetMod.CodeCell,
    session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession,
    metadata: atPhosphorCoreutilsLib.libJsonMod.JSONObject
  ): js.Promise[atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IExecuteReplyMsg] = js.native
}

