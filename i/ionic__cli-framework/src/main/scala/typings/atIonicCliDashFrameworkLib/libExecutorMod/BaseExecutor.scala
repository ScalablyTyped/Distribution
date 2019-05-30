package typings
package atIonicCliDashFrameworkLib.libExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/executor", "BaseExecutor")
@js.native
class BaseExecutor[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */] protected () extends AbstractExecutor[C, N, M, I, O] {
  def this(hasNamespaceStdoutStderrColors: BaseExecutorDeps[C, N, M, I, O]) = this()
  val colors: atIonicCliDashFrameworkLib.libColorsMod.Colors = js.native
  val stderr: nodeLib.NodeJSNs.WriteStream = js.native
  val stdout: nodeLib.NodeJSNs.WriteStream = js.native
  @JSName("emit")
  def `emit_operation-rpc`(
    event: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.`operation-rpc`,
    rpc: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@ionic/cli-framework/utils/ipc.RPCProcess */ js.Any
  ): scala.Boolean = js.native
  def formatHelp(location: atIonicCliDashFrameworkLib.definitionsMod.NamespaceLocateResult[C, N, M, I, O]): js.Promise[java.lang.String] = js.native
  def formatHelp(
    location: atIonicCliDashFrameworkLib.definitionsMod.NamespaceLocateResult[C, N, M, I, O],
    hasFormat: BaseExecutorFormatHelpOptions
  ): js.Promise[java.lang.String] = js.native
  @JSName("on")
  def `on_operation-rpc`(
    event: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.`operation-rpc`,
    callback: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@ionic/cli-framework/utils/ipc.RPCProcess */ /* rpc */ js.Any, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Initiate RPC operation.
    *
    * This means the CLI has been executed by a parent Node process with an IPC
    * channel, allowing request/response communication via RPC.
    */
  def rpc(): js.Promise[scala.Unit] = js.native
}

