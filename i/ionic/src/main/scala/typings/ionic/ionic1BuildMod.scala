package typings.ionic

import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.Ionic1BuildOptions
import typings.ionic.ionic1Mod.Ionic1Project
import typings.ionic.libBuildMod.BuildRunner
import typings.ionic.libBuildMod.BuildRunnerDeps
import typings.ionicCliFrameworkPrompts.mod.PromptModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionic1BuildMod {
  
  @JSImport("ionic/lib/project/ionic1/build", "Ionic1BuildRunner")
  @js.native
  open class Ionic1BuildRunner protected () extends BuildRunner[Ionic1BuildOptions] {
    def this(e: Ionic1BuildRunnerDeps) = this()
    
    /* protected */ @JSName("e")
    val e_Ionic1BuildRunner: Ionic1BuildRunnerDeps = js.native
  }
  
  trait Ionic1BuildRunnerDeps
    extends StObject
       with BuildRunnerDeps {
    
    @JSName("project")
    val project_Ionic1BuildRunnerDeps: Ionic1Project
  }
  object Ionic1BuildRunnerDeps {
    
    inline def apply(config: IConfig, log: ILogger, project: Ionic1Project, prompt: PromptModule, shell: IShell): Ionic1BuildRunnerDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ionic1BuildRunnerDeps]
    }
    
    extension [Self <: Ionic1BuildRunnerDeps](x: Self) {
      
      inline def setProject(value: Ionic1Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
}
