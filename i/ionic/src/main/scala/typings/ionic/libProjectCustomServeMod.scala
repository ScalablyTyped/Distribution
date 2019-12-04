package typings.ionic

import typings.ionic.definitionsMod.CustomServeOptions
import typings.ionic.libServeMod.ServeRunner
import typings.ionic.libServeMod.ServeRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/custom/serve", JSImport.Namespace)
@js.native
object libProjectCustomServeMod extends js.Object {
  @js.native
  class CustomServeRunner protected () extends ServeRunner[CustomServeOptions] {
    def this(e: ServeRunnerDeps) = this()
  }
  
}

