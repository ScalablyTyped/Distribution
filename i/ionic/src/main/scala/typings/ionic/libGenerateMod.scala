package typings.ionic

import typings.ionic.definitionsMod.GenerateOptions
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.IonicContext
import typings.ionic.definitionsMod.Runner
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import typings.ionicCliFrameworkPrompts.mod.PromptModule
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionCheckbox
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionConfirm
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionOther
import typings.ionicCliFrameworkPrompts.mod.PromptValueCheckbox
import typings.ionicCliFrameworkPrompts.mod.PromptValueConfirm
import typings.ionicCliFrameworkPrompts.mod.PromptValueOther
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
    def getCommandMetadata(): js.Promise[PartialCommandMetadata] = js.native
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

