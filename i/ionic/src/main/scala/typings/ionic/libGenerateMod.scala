package typings.ionic

import typings.atIonicCliDashFramework.definitionsMod.CommandLineInputs
import typings.atIonicCliDashFramework.definitionsMod.CommandLineOptions
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptModule
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptQuestionCheckbox
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptQuestionConfirm
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptQuestionOther
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptValueCheckbox
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptValueConfirm
import typings.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptValueOther
import typings.ionic.definitionsMod.CommandMetadata
import typings.ionic.definitionsMod.GenerateOptions
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.IonicContext
import typings.ionic.definitionsMod.Runner
import typings.ionic.libGenerateMod.GenerateRunnerDeps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/generate", JSImport.Namespace)
@js.native
object libGenerateMod extends js.Object {
  @js.native
  abstract class GenerateRunner[T /* <: GenerateOptions */] () extends Runner[T, Unit] {
    val e: GenerateRunnerDeps = js.native
    def createOptionsFromCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): GenerateOptions = js.native
    def ensureCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    def getCommandMetadata(): js.Promise[Partial[CommandMetadata]] = js.native
    /* CompleteClass */
    override def run(options: T): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait GenerateRunnerDeps extends js.Object {
    val config: IConfig = js.native
    val ctx: IonicContext = js.native
    val log: ILogger = js.native
    val project: IProject = js.native
    @JSName("prompt")
    val prompt_Original: PromptModule = js.native
    val shell: IShell = js.native
    def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox] = js.native
    def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm] = js.native
    def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther] = js.native
  }
  
}

