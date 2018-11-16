package typings
package ionicLib.libBuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/build", JSImport.Namespace)
@js.native
object libBuildModMembers extends js.Object {
  val BUILD_SCRIPT: /* ionic:build */ java.lang.String = js.native
  val COMMON_BUILD_COMMAND_OPTIONS: js.Array[ionicLib.definitionsMod.CommandMetadataOption] = js.native
  def build(
    deps: BuildRunnerDeps,
    inputs: atIonicCliDashFrameworkLib.definitionsMod.CommandLineInputs,
    options: atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions
  ): stdLib.Promise[scala.Unit] = js.native
}

