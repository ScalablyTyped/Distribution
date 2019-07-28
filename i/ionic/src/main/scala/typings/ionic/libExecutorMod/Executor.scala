package typings.ionic.libExecutorMod

import typings.atIonicCliDashFramework.atIonicCliDashFrameworkMod.AbstractExecutor
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionic.definitionsMod.CommandMetadata
import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.definitionsMod.ICommand
import typings.ionic.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/executor", "Executor")
@js.native
class Executor protected () extends AbstractExecutor[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
  def this(hasNamespace: ExecutorDeps) = this()
  def run(command: ICommand, cmdargs: js.Array[String], hasLocationEnvExecutor: CommandInstanceInfo): js.Promise[Unit] = js.native
}

