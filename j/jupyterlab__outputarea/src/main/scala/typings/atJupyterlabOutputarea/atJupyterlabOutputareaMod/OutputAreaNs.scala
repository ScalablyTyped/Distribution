package typings.atJupyterlabOutputarea.atJupyterlabOutputareaMod

import typings.atJupyterlabApputils.libClientsessionMod.IClientSession
import typings.atJupyterlabServices.libKernelMessagesMod.KernelMessageNs.IExecuteReplyMsg
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/outputarea", "OutputArea")
@js.native
object OutputAreaNs extends js.Object {
  /**
    * The default implementation of `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends typings.atJupyterlabOutputarea.libWidgetMod.OutputAreaNs.ContentFactory
  
  /**
    * The default `ContentFactory` instance.
    */
  val defaultContentFactory: typings.atJupyterlabOutputarea.libWidgetMod.OutputAreaNs.ContentFactory = js.native
  /**
    * Execute code on an output area.
    */
  def execute(
    code: String,
    output: typings.atJupyterlabOutputarea.libWidgetMod.OutputArea,
    session: IClientSession
  ): js.Promise[IExecuteReplyMsg] = js.native
  def execute(
    code: String,
    output: typings.atJupyterlabOutputarea.libWidgetMod.OutputArea,
    session: IClientSession,
    metadata: JSONObject
  ): js.Promise[IExecuteReplyMsg] = js.native
  def isIsolated(mimeType: String, metadata: ReadonlyJSONObject): Boolean = js.native
}

