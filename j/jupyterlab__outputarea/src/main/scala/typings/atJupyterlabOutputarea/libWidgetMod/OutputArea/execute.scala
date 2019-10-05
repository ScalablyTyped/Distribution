package typings.atJupyterlabOutputarea.libWidgetMod.OutputArea

import typings.atJupyterlabApputils.libClientsessionMod.IClientSession
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IExecuteReplyMsg
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea.execute")
@js.native
object execute extends js.Object {
  /**
    * Execute code on an output area.
    */
  def apply(
    code: String,
    output: typings.atJupyterlabOutputarea.libWidgetMod.OutputArea,
    session: IClientSession
  ): js.Promise[IExecuteReplyMsg] = js.native
  def apply(
    code: String,
    output: typings.atJupyterlabOutputarea.libWidgetMod.OutputArea,
    session: IClientSession,
    metadata: JSONObject
  ): js.Promise[IExecuteReplyMsg] = js.native
}

