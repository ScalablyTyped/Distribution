package typings.atIonicCliDashFramework.libExecutorMod

import typings.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typings.atIonicCliDashFramework.definitionsMod.ICommand
import typings.atIonicCliDashFramework.definitionsMod.IExecutor
import typings.atIonicCliDashFramework.definitionsMod.INamespace
import typings.atIonicCliDashFramework.definitionsMod.NamespaceLocateResult
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/executor", "AbstractExecutor")
@js.native
abstract class AbstractExecutor[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
  extends EventEmitter
     with IExecutor[C, N, M, I, O] {
  def resolveExecuteInput(argvOrLocation: js.Array[String]): js.Promise[js.Tuple2[NamespaceLocateResult[C, N, M, I, O], js.Array[String]]] = js.native
  def resolveExecuteInput(argvOrLocation: NamespaceLocateResult[C, N, M, I, O]): js.Promise[js.Tuple2[NamespaceLocateResult[C, N, M, I, O], js.Array[String]]] = js.native
}

