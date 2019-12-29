package typings.ionic

import typings.ionic.definitionsMod.AngularServeOptions
import typings.ionic.ionicStrings.`@angularSlashcli`
import typings.ionic.ionicStrings.`Angular CLI`
import typings.ionic.ionicStrings.ionicColonserve
import typings.ionic.ionicStrings.ng
import typings.ionic.libProjectAngularMod.AngularProject
import typings.ionic.libServeMod.ServeCLI
import typings.ionic.libServeMod.ServeRunner
import typings.ionic.libServeMod.ServeRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/angular/serve", JSImport.Namespace)
@js.native
object libProjectAngularServeMod extends js.Object {
  @js.native
  class AngularServeCLI () extends ServeCLI[AngularServeOptions] {
    var chunks: Double = js.native
    @JSName("name")
    val name_AngularServeCLI: `Angular CLI` = js.native
    @JSName("pkg")
    val pkg_AngularServeCLI: `@angularSlashcli` = js.native
    @JSName("prefix")
    val prefix_AngularServeCLI: ng = js.native
    @JSName("program")
    val program_AngularServeCLI: ng = js.native
    @JSName("script")
    val script_AngularServeCLI: ionicColonserve = js.native
    /* protected */ def buildArchitectCommand(options: AngularServeOptions): js.Array[String] = js.native
    /* protected */ def serveOptionsToNgArgs(options: AngularServeOptions): js.Promise[js.Array[String]] = js.native
  }
  
  @js.native
  class AngularServeRunner protected () extends ServeRunner[AngularServeOptions] {
    def this(e: AngularServeRunnerDeps) = this()
    @JSName("e")
    val e_AngularServeRunner: AngularServeRunnerDeps = js.native
    def platformToMode(platform: String): String = js.native
  }
  
  @js.native
  trait AngularServeRunnerDeps extends ServeRunnerDeps {
    @JSName("project")
    val project_AngularServeRunnerDeps: AngularProject = js.native
  }
  
}

