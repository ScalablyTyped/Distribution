package typings.ionic

import typings.ionic.definitionsMod.ReactServeOptions
import typings.ionic.libServeMod.ServeCLI
import typings.ionic.libServeMod.ServeRunner
import typings.ionic.libServeMod.ServeRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/react/serve", JSImport.Namespace)
@js.native
object reactServeMod extends js.Object {
  @js.native
  class ReactServeCLI () extends ServeCLI[ReactServeOptions] {
    var chunks: Double = js.native
    @JSName("script")
    val script_ReactServeCLI: /* "ionic:serve" */ String = js.native
  }
  
  @js.native
  class ReactServeRunner protected () extends ServeRunner[ReactServeOptions] {
    def this(e: ServeRunnerDeps) = this()
  }
  
}

