package typings.ionic

import typings.ionic.angularMod.AngularProject
import typings.ionic.definitionsMod.AngularBuildOptions
import typings.ionic.ionicStrings.`@angularSlashcli`
import typings.ionic.ionicStrings.`Angular CLI`
import typings.ionic.ionicStrings.ionicColonbuild
import typings.ionic.ionicStrings.ng
import typings.ionic.libBuildMod.BuildCLI
import typings.ionic.libBuildMod.BuildRunner
import typings.ionic.libBuildMod.BuildRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/angular/build", JSImport.Namespace)
@js.native
object angularBuildMod extends js.Object {
  @js.native
  class AngularBuildCLI () extends BuildCLI[AngularBuildOptions] {
    @JSName("name")
    val name_AngularBuildCLI: `Angular CLI` = js.native
    @JSName("pkg")
    val pkg_AngularBuildCLI: `@angularSlashcli` = js.native
    val prefix: ng = js.native
    @JSName("program")
    val program_AngularBuildCLI: ng = js.native
    @JSName("script")
    val script_AngularBuildCLI: ionicColonbuild = js.native
    /* protected */ def buildArchitectCommand(options: AngularBuildOptions): js.Array[String] = js.native
    /* protected */ def buildOptionsToNgArgs(options: AngularBuildOptions): js.Promise[js.Array[String]] = js.native
  }
  
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

