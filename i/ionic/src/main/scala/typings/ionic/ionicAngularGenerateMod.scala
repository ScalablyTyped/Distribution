package typings.ionic

import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.IonicAngularGenerateOptions
import typings.ionic.definitionsMod.IonicContext
import typings.ionic.ionicAngularMod.IonicAngularProject
import typings.ionic.libGenerateMod.GenerateRunner
import typings.ionic.libGenerateMod.GenerateRunnerDeps
import typings.ionicCliFrameworkPrompts.mod.PromptModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionicAngularGenerateMod {
  
  @JSImport("ionic/lib/project/ionic-angular/generate", "IonicAngularGenerateRunner")
  @js.native
  class IonicAngularGenerateRunner protected () extends GenerateRunner[IonicAngularGenerateOptions] {
    def this(e: IonicAngularGenerateRunnerDeps) = this()
    
    /* protected */ @JSName("e")
    val e_IonicAngularGenerateRunner: IonicAngularGenerateRunnerDeps = js.native
    
    def getModules(context: js.Any, kind: String): js.Promise[js.Any] = js.native
    
    def tabsPrompt(): js.Promise[js.Array[String]] = js.native
  }
  
  trait IonicAngularGenerateRunnerDeps
    extends StObject
       with GenerateRunnerDeps {
    
    @JSName("project")
    val project_IonicAngularGenerateRunnerDeps: IonicAngularProject
  }
  object IonicAngularGenerateRunnerDeps {
    
    inline def apply(
      config: IConfig,
      ctx: IonicContext,
      log: ILogger,
      project: IonicAngularProject,
      prompt: PromptModule,
      shell: IShell
    ): IonicAngularGenerateRunnerDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[IonicAngularGenerateRunnerDeps]
    }
    
    extension [Self <: IonicAngularGenerateRunnerDeps](x: Self) {
      
      inline def setProject(value: IonicAngularProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
}
