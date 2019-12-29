package typings.ionic

import typings.ionic.definitionsMod.ReactBuildOptions
import typings.ionic.ionicStrings.`React Scripts`
import typings.ionic.ionicStrings.`react-scripts`
import typings.ionic.ionicStrings.ionicColonbuild
import typings.ionic.libBuildMod.BuildCLI
import typings.ionic.libBuildMod.BuildRunner
import typings.ionic.libBuildMod.BuildRunnerDeps
import typings.ionic.libProjectReactMod.ReactProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/react/build", JSImport.Namespace)
@js.native
object libProjectReactBuildMod extends js.Object {
  @js.native
  class ReactBuildCLI () extends BuildCLI[ReactBuildOptions] {
    @JSName("name")
    val name_ReactBuildCLI: `React Scripts` = js.native
    @JSName("pkg")
    val pkg_ReactBuildCLI: `react-scripts` = js.native
    val prefix: `react-scripts` = js.native
    @JSName("program")
    val program_ReactBuildCLI: `react-scripts` = js.native
    @JSName("script")
    val script_ReactBuildCLI: ionicColonbuild = js.native
  }
  
  @js.native
  class ReactBuildRunner protected () extends BuildRunner[ReactBuildOptions] {
    def this(e: ReactBuildRunnerDeps) = this()
    @JSName("e")
    val e_ReactBuildRunner: ReactBuildRunnerDeps = js.native
  }
  
  @js.native
  trait ReactBuildRunnerDeps extends BuildRunnerDeps {
    @JSName("project")
    val project_ReactBuildRunnerDeps: ReactProject = js.native
  }
  
}

