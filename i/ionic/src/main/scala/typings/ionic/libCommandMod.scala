package typings.ionic

import typings.atIonicCliDashFramework.atIonicCliDashFrameworkMod.BaseCommand
import typings.atIonicCliDashFramework.atIonicCliDashFrameworkMod.TaskChain
import typings.atIonicCliDashFramework.definitionsMod.CommandLineInputs
import typings.atIonicCliDashFramework.definitionsMod.CommandLineOptions
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionic.definitionsMod.CommandMetadata
import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.definitionsMod.ICommand
import typings.ionic.definitionsMod.INamespace
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IonicEnvironment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/command", JSImport.Namespace)
@js.native
object libCommandMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atIonicCliDashFramework.definitionsMod.ICommand because var conflicts: namespace. Inlined 
  - typings.ionic.definitionsMod.ICommand because var conflicts: namespace. Inlined env, project, execute */ @js.native
  abstract class Command protected () extends BaseCommand[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
    def this(namespace: INamespace) = this()
    val env: IonicEnvironment = js.native
    val project: js.UndefOr[IProject] = js.native
    val taskChains: js.Array[TaskChain] = js.native
    def createTaskChain(): TaskChain = js.native
    def execute(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    def getCleanInputsForTelemetry(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[js.Array[String]] = js.native
  }
  
}

