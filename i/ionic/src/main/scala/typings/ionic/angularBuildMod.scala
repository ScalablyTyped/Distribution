package typings.ionic

import typings.ionic.angularMod.AngularProject
import typings.ionic.definitionsMod.AngularBuildOptions
import typings.ionic.libBuildMod.BuildCLI
import typings.ionic.libBuildMod.BuildRunner
import typings.ionic.libBuildMod.BuildRunnerDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularBuildMod {
  
  @JSImport("ionic/lib/project/angular/build", "AngularBuildCLI")
  @js.native
  class AngularBuildCLI protected () extends BuildCLI[AngularBuildOptions] {
    def this(e: BuildRunnerDeps) = this()
    
    /* protected */ def buildArchitectCommand(options: AngularBuildOptions): js.Array[String] = js.native
    
    /* protected */ def buildOptionsToNgArgs(options: AngularBuildOptions): js.Promise[js.Array[String]] = js.native
    
    val prefix: /* "ng" */ String = js.native
    
    @JSName("script")
    val script_AngularBuildCLI: /* "ionic:build" */ String = js.native
  }
  
  @JSImport("ionic/lib/project/angular/build", "AngularBuildRunner")
  @js.native
  class AngularBuildRunner protected () extends BuildRunner[AngularBuildOptions] {
    def this(e: AngularBuildRunnerDeps) = this()
    
    @JSName("e")
    val e_AngularBuildRunner: AngularBuildRunnerDeps = js.native
  }
  
  @js.native
  trait AngularBuildRunnerDeps extends BuildRunnerDeps {
    
    @JSName("project")
    val project_AngularBuildRunnerDeps: AngularProject = js.native
  }
}
