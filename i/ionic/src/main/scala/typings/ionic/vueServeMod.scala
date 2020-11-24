package typings.ionic

import typings.ionic.definitionsMod.VueServeOptions
import typings.ionic.libServeMod.ServeRunner
import typings.ionic.libServeMod.ServeRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/project/vue/serve", JSImport.Namespace)
@js.native
object vueServeMod extends js.Object {
  
  @js.native
  class VueServeRunner protected () extends ServeRunner[VueServeOptions] {
    def this(e: ServeRunnerDeps) = this()
  }
}
