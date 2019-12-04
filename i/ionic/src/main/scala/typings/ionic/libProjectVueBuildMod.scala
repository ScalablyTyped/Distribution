package typings.ionic

import typings.ionic.definitionsMod.VueBuildOptions
import typings.ionic.libBuildMod.BuildRunner
import typings.ionic.libBuildMod.BuildRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/vue/build", JSImport.Namespace)
@js.native
object libProjectVueBuildMod extends js.Object {
  @js.native
  class VueBuildRunner protected () extends BuildRunner[VueBuildOptions] {
    def this(e: BuildRunnerDeps) = this()
  }
  
}

