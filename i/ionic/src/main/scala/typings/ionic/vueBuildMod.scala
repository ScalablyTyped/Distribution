package typings.ionic

import typings.ionic.definitionsMod.VueBuildOptions
import typings.ionic.libBuildMod.BuildRunner
import typings.ionic.libBuildMod.BuildRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/project/vue/build", JSImport.Namespace)
@js.native
object vueBuildMod extends js.Object {
  
  @js.native
  class VueBuildRunner protected () extends BuildRunner[VueBuildOptions] {
    def this(e: BuildRunnerDeps) = this()
  }
}
