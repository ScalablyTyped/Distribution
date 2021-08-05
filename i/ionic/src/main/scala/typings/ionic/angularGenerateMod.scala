package typings.ionic

import typings.ionic.angularMod.AngularProject
import typings.ionic.definitionsMod.AngularGenerateOptions
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.IonicContext
import typings.ionic.libGenerateMod.GenerateRunner
import typings.ionic.libGenerateMod.GenerateRunnerDeps
import typings.ionicCliFrameworkPrompts.mod.PromptModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularGenerateMod {
  
  @JSImport("ionic/lib/project/angular/generate", "AngularGenerateRunner")
  @js.native
  class AngularGenerateRunner protected () extends GenerateRunner[AngularGenerateOptions] {
    def this(e: AngularGenerateRunnerDeps) = this()
    
    /* protected */ @JSName("e")
    val e_AngularGenerateRunner: AngularGenerateRunnerDeps = js.native
    
    /* private */ var generateComponent: js.Any = js.native
    
    /* private */ var validateFeatureType: js.Any = js.native
  }
  
  trait AngularGenerateRunnerDeps
    extends StObject
       with GenerateRunnerDeps {
    
    @JSName("project")
    val project_AngularGenerateRunnerDeps: AngularProject
  }
  object AngularGenerateRunnerDeps {
    
    inline def apply(
      config: IConfig,
      ctx: IonicContext,
      log: ILogger,
      project: AngularProject,
      prompt: PromptModule,
      shell: IShell
    ): AngularGenerateRunnerDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[AngularGenerateRunnerDeps]
    }
    
    extension [Self <: AngularGenerateRunnerDeps](x: Self) {
      
      inline def setProject(value: AngularProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
}
