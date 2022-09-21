package typings.ionic

import typings.ionic.angularMod.AngularProject
import typings.ionic.definitionsMod.AngularBuildOptions
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IShell
import typings.ionic.libBuildMod.BuildCLI
import typings.ionic.libBuildMod.BuildRunner
import typings.ionic.libBuildMod.BuildRunnerDeps
import typings.ionicCliFrameworkPrompts.mod.PromptModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularBuildMod {
  
  @JSImport("ionic/lib/project/angular/build", "AngularBuildCLI")
  @js.native
  open class AngularBuildCLI protected () extends BuildCLI[AngularBuildOptions] {
    def this(e: BuildRunnerDeps) = this()
    
    /* protected */ def buildArchitectCommand(options: AngularBuildOptions): js.Array[String] = js.native
    
    /* protected */ def buildOptionsToNgArgs(options: AngularBuildOptions): js.Promise[js.Array[String]] = js.native
    
    val prefix: /* "ng" */ String = js.native
    
    @JSName("script")
    val script_AngularBuildCLI: /* "ionic:build" */ String = js.native
  }
  
  @JSImport("ionic/lib/project/angular/build", "AngularBuildRunner")
  @js.native
  open class AngularBuildRunner protected () extends BuildRunner[AngularBuildOptions] {
    def this(e: AngularBuildRunnerDeps) = this()
    
    /* protected */ @JSName("e")
    val e_AngularBuildRunner: AngularBuildRunnerDeps = js.native
  }
  
  trait AngularBuildRunnerDeps
    extends StObject
       with BuildRunnerDeps {
    
    @JSName("project")
    val project_AngularBuildRunnerDeps: AngularProject
  }
  object AngularBuildRunnerDeps {
    
    inline def apply(config: IConfig, log: ILogger, project: AngularProject, prompt: PromptModule, shell: IShell): AngularBuildRunnerDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[AngularBuildRunnerDeps]
    }
    
    extension [Self <: AngularBuildRunnerDeps](x: Self) {
      
      inline def setProject(value: AngularProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
}
