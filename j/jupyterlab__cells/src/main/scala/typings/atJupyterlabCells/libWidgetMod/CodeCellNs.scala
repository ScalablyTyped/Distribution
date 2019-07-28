package typings.atJupyterlabCells.libWidgetMod

import typings.atJupyterlabApputils.libClientsessionMod.IClientSession
import typings.atJupyterlabCells.libModelMod.ICodeCellModel
import typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IExecuteReplyMsg
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
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
    extends typings.atJupyterlabCells.libWidgetMod.CellNs.IOptions {
    /**
      * The model used by the cell.
      */
    @JSName("model")
    var model_IOptions: ICodeCellModel
    /**
      * The mime renderer for the cell widget.
      */
    var rendermime: IRenderMimeRegistry
  }
  
  /**
    * Execute a cell given a client session.
    */
  def execute(cell: CodeCell, session: IClientSession): js.Promise[IExecuteReplyMsg | Unit] = js.native
  def execute(cell: CodeCell, session: IClientSession, metadata: JSONObject): js.Promise[IExecuteReplyMsg | Unit] = js.native
}

