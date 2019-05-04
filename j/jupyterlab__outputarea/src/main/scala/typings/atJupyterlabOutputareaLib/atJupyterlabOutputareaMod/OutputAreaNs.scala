package typings
package atJupyterlabOutputareaLib.atJupyterlabOutputareaMod

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
    extends atJupyterlabOutputareaLib.libWidgetMod.OutputAreaNs.ContentFactory
  
  /**
    * The default `ContentFactory` instance.
    */
  val defaultContentFactory: atJupyterlabOutputareaLib.libWidgetMod.OutputAreaNs.ContentFactory = js.native
  /**
    * Execute code on an output area.
    */
  def execute(
    code: java.lang.String,
    output: atJupyterlabOutputareaLib.libWidgetMod.OutputArea,
    session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession
  ): js.Promise[atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IExecuteReplyMsg] = js.native
  def execute(
    code: java.lang.String,
    output: atJupyterlabOutputareaLib.libWidgetMod.OutputArea,
    session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession,
    metadata: atPhosphorCoreutilsLib.libJsonMod.JSONObject
  ): js.Promise[atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IExecuteReplyMsg] = js.native
}

