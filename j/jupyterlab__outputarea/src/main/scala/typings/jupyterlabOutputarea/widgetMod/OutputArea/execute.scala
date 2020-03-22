package typings.jupyterlabOutputarea.widgetMod.OutputArea

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabServices.messagesMod.IExecuteReplyMsg
import typings.luminoCoreutils.jsonMod.JSONObject
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
    output: typings.jupyterlabOutputarea.widgetMod.OutputArea,
    sessionContext: ISessionContext
  ): js.Promise[js.UndefOr[IExecuteReplyMsg]] = js.native
  def apply(
    code: String,
    output: typings.jupyterlabOutputarea.widgetMod.OutputArea,
    sessionContext: ISessionContext,
    metadata: JSONObject
  ): js.Promise[js.UndefOr[IExecuteReplyMsg]] = js.native
}

