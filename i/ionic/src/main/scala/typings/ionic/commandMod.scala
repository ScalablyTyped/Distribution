package typings.ionic

import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionic.definitionsMod.CommandMetadata
import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.definitionsMod.ICommand
import typings.ionic.definitionsMod.INamespace
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IonicEnvironment
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.mod.BaseCommand
import typings.ionicCliFramework.mod.TaskChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/command", JSImport.Namespace)
@js.native
object commandMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.ionicCliFramework.definitionsMod.ICommand because var conflicts: namespace. Inlined 
  - typings.ionic.definitionsMod.ICommand because var conflicts: namespace. Inlined env, project, execute */ @js.native
  abstract class Command protected () extends BaseCommand[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
    def this(namespace: INamespace) = this()
    @JSName("env")
    val env_FCommand: IonicEnvironment = js.native
    @JSName("project")
    val project_FCommand: js.UndefOr[IProject] = js.native
    val taskChains: js.Array[TaskChain] = js.native
    def createTaskChain(): TaskChain = js.native
    def env(): IonicEnvironment = js.native
    def execute(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    def getCleanInputsForTelemetry(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[js.Array[String]] = js.native
    def project(): js.UndefOr[IProject] = js.native
  }
  
}

