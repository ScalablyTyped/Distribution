package typings.ionic

import typings.ionic.definitionsMod.VueServeOptions
import typings.ionic.libServeMod.ServeRunner
import typings.ionic.libServeMod.ServeRunnerDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueServeMod {
  
  @JSImport("ionic/lib/project/vue/serve", "VueServeRunner")
  @js.native
  class VueServeRunner protected () extends ServeRunner[VueServeOptions] {
    def this(e: ServeRunnerDeps) = this()
  }
}
