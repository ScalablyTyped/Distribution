package typings
package atJupyterlabCellsLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/widget", "CodeCell")
@js.native
object CodeCellNs extends js.Object {
  /**
    * An options object for initializing a base cell widget.
    */
  trait IOptions
    extends atJupyterlabCellsLib.libWidgetMod.CellNs.IOptions {
    /**
      * The model used by the cell.
      */
    @JSName("model")
    var model_IOptions: atJupyterlabCellsLib.libModelMod.ICodeCellModel
    /**
      * The mime renderer for the cell widget.
      */
    var rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry
  }
  
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

