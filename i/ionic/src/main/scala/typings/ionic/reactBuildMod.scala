package typings.ionic

import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.ReactBuildOptions
import typings.ionic.libBuildMod.BuildCLI
import typings.ionic.libBuildMod.BuildRunner
import typings.ionic.libBuildMod.BuildRunnerDeps
import typings.ionic.reactMod.ReactProject
import typings.ionicCliFrameworkPrompts.mod.PromptModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactBuildMod {
  
  @JSImport("ionic/lib/project/react/build", "ReactBuildCLI")
  @js.native
  open class ReactBuildCLI protected () extends BuildCLI[ReactBuildOptions] {
    def this(e: BuildRunnerDeps) = this()
    
    val prefix: /* "react-scripts" */ String = js.native
    
    @JSName("script")
    val script_ReactBuildCLI: /* "ionic:build" */ String = js.native
  }
  
  @JSImport("ionic/lib/project/react/build", "ReactBuildRunner")
  @js.native
  open class ReactBuildRunner protected () extends BuildRunner[ReactBuildOptions] {
    def this(e: ReactBuildRunnerDeps) = this()
    
    /* protected */ @JSName("e")
    val e_ReactBuildRunner: ReactBuildRunnerDeps = js.native
  }
  
  trait ReactBuildRunnerDeps
    extends StObject
       with BuildRunnerDeps {
    
    @JSName("project")
    val project_ReactBuildRunnerDeps: ReactProject
  }
  object ReactBuildRunnerDeps {
    
    inline def apply(config: IConfig, log: ILogger, project: ReactProject, prompt: PromptModule, shell: IShell): ReactBuildRunnerDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactBuildRunnerDeps]
    }
    
    extension [Self <: ReactBuildRunnerDeps](x: Self) {
      
      inline def setProject(value: ReactProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
}
