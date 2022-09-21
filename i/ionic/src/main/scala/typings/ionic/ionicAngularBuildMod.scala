package typings.ionic

import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.IonicAngularBuildOptions
import typings.ionic.ionicAngularMod.IonicAngularProject
import typings.ionic.libBuildMod.BuildCLI
import typings.ionic.libBuildMod.BuildRunner
import typings.ionic.libBuildMod.BuildRunnerDeps
import typings.ionicCliFrameworkPrompts.mod.PromptModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionicAngularBuildMod {
  
  @JSImport("ionic/lib/project/ionic-angular/build", "DEFAULT_BUILD_SCRIPT_VALUE")
  @js.native
  val DEFAULT_BUILD_SCRIPT_VALUE: String = js.native
  
  @JSImport("ionic/lib/project/ionic-angular/build", "DEFAULT_PROGRAM")
  @js.native
  val DEFAULT_PROGRAM: /* "ionic-app-scripts" */ String = js.native
  
  @JSImport("ionic/lib/project/ionic-angular/build", "IonicAngularBuildCLI")
  @js.native
  open class IonicAngularBuildCLI protected () extends BuildCLI[IonicAngularBuildOptions] {
    def this(e: BuildRunnerDeps) = this()
    
    /* protected */ def buildOptionsToAppScriptsArgs(options: IonicAngularBuildOptions): js.Array[String] = js.native
    
    val prefix: /* "app-scripts" */ String = js.native
  }
  
  @JSImport("ionic/lib/project/ionic-angular/build", "IonicAngularBuildRunner")
  @js.native
  open class IonicAngularBuildRunner protected () extends BuildRunner[IonicAngularBuildOptions] {
    def this(e: IonicAngularBuildRunnerDeps) = this()
    
    /* protected */ @JSName("e")
    val e_IonicAngularBuildRunner: IonicAngularBuildRunnerDeps = js.native
  }
  
  trait IonicAngularBuildRunnerDeps
    extends StObject
       with BuildRunnerDeps {
    
    @JSName("project")
    val project_IonicAngularBuildRunnerDeps: IonicAngularProject
  }
  object IonicAngularBuildRunnerDeps {
    
    inline def apply(config: IConfig, log: ILogger, project: IonicAngularProject, prompt: PromptModule, shell: IShell): IonicAngularBuildRunnerDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[IonicAngularBuildRunnerDeps]
    }
    
    extension [Self <: IonicAngularBuildRunnerDeps](x: Self) {
      
      inline def setProject(value: IonicAngularProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
}
