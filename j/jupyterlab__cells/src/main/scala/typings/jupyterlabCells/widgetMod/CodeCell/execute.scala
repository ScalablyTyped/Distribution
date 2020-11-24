package typings.jupyterlabCells.widgetMod.CodeCell

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabServices.messagesMod.IExecuteReplyMsg
import typings.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/cells/lib/widget", "CodeCell.execute")
@js.native
object execute extends js.Object {
  
  /**
    * Execute a cell given a client session.
    */
  def apply(cell: typings.jupyterlabCells.widgetMod.CodeCell, sessionContext: ISessionContext): js.Promise[IExecuteReplyMsg | Unit] = js.native
  def apply(
    cell: typings.jupyterlabCells.widgetMod.CodeCell,
    sessionContext: ISessionContext,
    metadata: JSONObject
  ): js.Promise[IExecuteReplyMsg | Unit] = js.native
}
