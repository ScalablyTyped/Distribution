package typings.ionic

import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.Ionic1ServeOptions
import typings.ionic.definitionsMod.IonicEnvironmentFlags
import typings.ionic.ionic1Mod.Ionic1Project
import typings.ionic.libServeMod.ServeRunner
import typings.ionic.libServeMod.ServeRunnerDeps
import typings.ionicCliFrameworkPrompts.mod.PromptModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionic1ServeMod {
  
  @JSImport("ionic/lib/project/ionic1/serve", "Ionic1ServeRunner")
  @js.native
  class Ionic1ServeRunner protected () extends ServeRunner[Ionic1ServeOptions] {
    def this(e: Ionic1ServeRunnerDeps) = this()
    
    @JSName("e")
    val e_Ionic1ServeRunner: Ionic1ServeRunnerDeps = js.native
  }
  
  trait Ionic1ServeRunnerDeps
    extends StObject
       with ServeRunnerDeps {
    
    @JSName("project")
    val project_Ionic1ServeRunnerDeps: Ionic1Project
  }
  object Ionic1ServeRunnerDeps {
    
    @scala.inline
    def apply(
      config: IConfig,
      flags: IonicEnvironmentFlags,
      log: ILogger,
      project: Ionic1Project,
      prompt: PromptModule,
      shell: IShell
    ): Ionic1ServeRunnerDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ionic1ServeRunnerDeps]
    }
    
    @scala.inline
    implicit class Ionic1ServeRunnerDepsMutableBuilder[Self <: Ionic1ServeRunnerDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProject(value: Ionic1Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
}
