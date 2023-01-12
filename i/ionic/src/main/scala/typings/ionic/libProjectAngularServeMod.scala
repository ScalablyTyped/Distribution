package typings.ionic

import typings.ionic.definitionsMod.AngularServeOptions
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.IonicEnvironmentFlags
import typings.ionic.libProjectAngularMod.AngularProject
import typings.ionic.libServeMod.ServeCLI
import typings.ionic.libServeMod.ServeRunner
import typings.ionic.libServeMod.ServeRunnerDeps
import typings.ionicCliFrameworkPrompts.mod.PromptModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectAngularServeMod {
  
  @JSImport("ionic/lib/project/angular/serve", "AngularServeCLI")
  @js.native
  open class AngularServeCLI protected () extends ServeCLI[AngularServeOptions] {
    def this(e: ServeRunnerDeps) = this()
    
    /* protected */ def buildArchitectCommand(options: AngularServeOptions): js.Array[String] = js.native
    
    /* protected */ var chunks: Double = js.native
    
    @JSName("script")
    val script_AngularServeCLI: /* "ionic:serve" */ String = js.native
    
    /* protected */ def serveOptionsToNgArgs(options: AngularServeOptions): js.Promise[js.Array[String]] = js.native
  }
  
  @JSImport("ionic/lib/project/angular/serve", "AngularServeRunner")
  @js.native
  open class AngularServeRunner protected () extends ServeRunner[AngularServeOptions] {
    def this(e: AngularServeRunnerDeps) = this()
    
    /* protected */ @JSName("e")
    val e_AngularServeRunner: AngularServeRunnerDeps = js.native
    
    def platformToMode(platform: String): String = js.native
  }
  
  trait AngularServeRunnerDeps
    extends StObject
       with ServeRunnerDeps {
    
    @JSName("project")
    val project_AngularServeRunnerDeps: AngularProject
  }
  object AngularServeRunnerDeps {
    
    inline def apply(
      config: IConfig,
      flags: IonicEnvironmentFlags,
      log: ILogger,
      project: AngularProject,
      prompt: PromptModule,
      shell: IShell
    ): AngularServeRunnerDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[AngularServeRunnerDeps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AngularServeRunnerDeps] (val x: Self) extends AnyVal {
      
      inline def setProject(value: AngularProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
}
