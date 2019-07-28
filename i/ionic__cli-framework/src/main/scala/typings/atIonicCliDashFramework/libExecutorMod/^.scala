package typings.atIonicCliDashFramework.libExecutorMod

import typings.atIonicCliDashFramework.Anon_Argv
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typings.atIonicCliDashFramework.definitionsMod.ICommand
import typings.atIonicCliDashFramework.definitionsMod.INamespace
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/executor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val EXECUTOR_OPS: ExecutorOperations = js.native
  def execute[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](hasNamespaceArgvEnvRest: Anon_Argv[N] with (Partial[BaseExecutorDeps[C, N, M, I, O]])): js.Promise[Unit] = js.native
}

