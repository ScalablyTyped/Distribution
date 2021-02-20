package typings.ionic

import typings.ionic.definitionsMod.IonicAngularBuildOptions
import typings.ionic.ionicAngularMod.IonicAngularProject
import typings.ionic.libBuildMod.BuildCLI
import typings.ionic.libBuildMod.BuildRunner
import typings.ionic.libBuildMod.BuildRunnerDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  class IonicAngularBuildCLI protected () extends BuildCLI[IonicAngularBuildOptions] {
    def this(e: BuildRunnerDeps) = this()
    
    /* protected */ def buildOptionsToAppScriptsArgs(options: IonicAngularBuildOptions): js.Array[String] = js.native
    
    val prefix: /* "app-scripts" */ String = js.native
  }
  
  @JSImport("ionic/lib/project/ionic-angular/build", "IonicAngularBuildRunner")
  @js.native
  class IonicAngularBuildRunner protected () extends BuildRunner[IonicAngularBuildOptions] {
    def this(e: IonicAngularBuildRunnerDeps) = this()
    
    @JSName("e")
    val e_IonicAngularBuildRunner: IonicAngularBuildRunnerDeps = js.native
  }
  
  @js.native
  trait IonicAngularBuildRunnerDeps extends BuildRunnerDeps {
    
    @JSName("project")
    val project_IonicAngularBuildRunnerDeps: IonicAngularProject = js.native
  }
}
