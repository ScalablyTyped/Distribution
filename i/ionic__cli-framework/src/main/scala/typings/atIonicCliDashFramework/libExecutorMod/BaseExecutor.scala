package typings.atIonicCliDashFramework.libExecutorMod

import typings.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.`operation-rpc`
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typings.atIonicCliDashFramework.definitionsMod.ICommand
import typings.atIonicCliDashFramework.definitionsMod.INamespace
import typings.atIonicCliDashFramework.definitionsMod.NamespaceLocateResult
import typings.atIonicCliDashFramework.libColorsMod.Colors
import typings.atIonicCliDashFramework.utilsIpcMod.RPCProcess
import typings.node.processMod.Global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/executor", "BaseExecutor")
@js.native
class BaseExecutor[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends AbstractExecutor[C, N, M, I, O] {
  def this(hasNamespaceStdoutStderrColors: BaseExecutorDeps[C, N, M, I, O]) = this()
  val colors: Colors = js.native
  val stderr: WriteStream = js.native
  val stdout: WriteStream = js.native
  @JSName("emit")
  def emit_operationrpc(event: `operation-rpc`, rpc: RPCProcess): Boolean = js.native
  def formatHelp(location: NamespaceLocateResult[C, N, M, I, O]): js.Promise[String] = js.native
  def formatHelp(location: NamespaceLocateResult[C, N, M, I, O], hasFormat: BaseExecutorFormatHelpOptions): js.Promise[String] = js.native
  @JSName("on")
  def on_operationrpc(event: `operation-rpc`, callback: js.Function1[/* rpc */ RPCProcess, Unit]): this.type = js.native
  /**
    * Initiate RPC operation.
    *
    * This means the CLI has been executed by a parent Node process with an IPC
    * channel, allowing request/response communication via RPC.
    */
  def rpc(): js.Promise[Unit] = js.native
}

