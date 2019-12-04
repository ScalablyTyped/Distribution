package typings.ionic

import typings.ionic.definitionsMod.ReactServeOptions
import typings.ionic.ionicStrings.`React Scripts`
import typings.ionic.ionicStrings.`ionic:serve`
import typings.ionic.ionicStrings.`react-scripts`
import typings.ionic.libServeMod.ServeCLI
import typings.ionic.libServeMod.ServeRunner
import typings.ionic.libServeMod.ServeRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/react/serve", JSImport.Namespace)
@js.native
object libProjectReactServeMod extends js.Object {
  @js.native
  class ReactServeCLI () extends ServeCLI[ReactServeOptions] {
    var chunks: Double = js.native
    @JSName("name")
    val name_ReactServeCLI: `React Scripts` = js.native
    @JSName("pkg")
    val pkg_ReactServeCLI: `react-scripts` = js.native
    @JSName("prefix")
    val prefix_ReactServeCLI: `react-scripts` = js.native
    @JSName("program")
    val program_ReactServeCLI: `react-scripts` = js.native
    @JSName("script")
    val script_ReactServeCLI: `ionic:serve` = js.native
  }
  
  @js.native
  class ReactServeRunner protected () extends ServeRunner[ReactServeOptions] {
    def this(e: ServeRunnerDeps) = this()
  }
  
}

