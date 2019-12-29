package typings.ionic

import typings.ionic.definitionsMod.Ionic1BuildOptions
import typings.ionic.libBuildMod.BuildRunner
import typings.ionic.libBuildMod.BuildRunnerDeps
import typings.ionic.libProjectIonic1Mod.Ionic1Project
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/ionic1/build", JSImport.Namespace)
@js.native
object libProjectIonic1BuildMod extends js.Object {
  @js.native
  class Ionic1BuildRunner protected () extends BuildRunner[Ionic1BuildOptions] {
    def this(e: Ionic1BuildRunnerDeps) = this()
    @JSName("e")
    val e_Ionic1BuildRunner: Ionic1BuildRunnerDeps = js.native
  }
  
  @js.native
  trait Ionic1BuildRunnerDeps extends BuildRunnerDeps {
    @JSName("project")
    val project_Ionic1BuildRunnerDeps: Ionic1Project = js.native
  }
  
}

