package typings.ionic

import typings.ionic.definitionsMod.CustomBuildOptions
import typings.ionic.libBuildMod.BuildRunner
import typings.ionic.libBuildMod.BuildRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/custom/build", JSImport.Namespace)
@js.native
object customBuildMod extends js.Object {
  @js.native
  class CustomBuildRunner protected () extends BuildRunner[CustomBuildOptions] {
    def this(e: BuildRunnerDeps) = this()
  }
  
}

