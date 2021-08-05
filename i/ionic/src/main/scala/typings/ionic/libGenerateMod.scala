package typings.ionic

import typings.ionic.anon.PartialCommandMetadata
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGenerateMod {
  
  @JSImport("ionic/lib/generate", "GenerateRunner")
  @js.native
  abstract class GenerateRunner[T /* <: GenerateOptions */] ()
    extends StObject
       with Runner[T, Unit] {
    
    def createOptionsFromCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): GenerateOptions = js.native
    
    /* protected */ val e: GenerateRunnerDeps = js.native
    
    def ensureCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    
    def getCommandMetadata(): js.Promise[PartialCommandMetadata] = js.native
    
    /* CompleteClass */
    override def run(options: T): js.Promise[Unit] = js.native
  }
  
  trait GenerateRunnerDeps extends StObject {
    
    val config: IConfig
    
    val ctx: IonicContext
    
    val log: ILogger
    
    val project: IProject
    
    def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox]
    def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm]
    def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther]
    @JSName("prompt")
    val prompt_Original: PromptModule
    
    val shell: IShell
  }
  object GenerateRunnerDeps {
    
    inline def apply(
      config: IConfig,
      ctx: IonicContext,
      log: ILogger,
      project: IProject,
      prompt: PromptModule,
      shell: IShell
    ): GenerateRunnerDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateRunnerDeps]
    }
    
    extension [Self <: GenerateRunnerDeps](x: Self) {
      
      inline def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: IonicContext): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setLog(value: ILogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setProject(value: IProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setPrompt(value: PromptModule): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setShell(value: IShell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    }
  }
}
