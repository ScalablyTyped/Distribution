package typings.jupyterlabCells.mod

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabCells.widgetMod.CodeCell.IOptions
import typings.jupyterlabServices.messagesMod.IExecuteReplyMsg
import typings.luminoCoreutils.jsonMod.JSONObject
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
  def execute(cell: typings.jupyterlabCells.widgetMod.CodeCell, sessionContext: ISessionContext): js.Promise[IExecuteReplyMsg | Unit] = js.native
  def execute(
    cell: typings.jupyterlabCells.widgetMod.CodeCell,
    sessionContext: ISessionContext,
    metadata: JSONObject
  ): js.Promise[IExecuteReplyMsg | Unit] = js.native
}

