package typings
package ionicLib.libServeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/serve", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BIND_ALL_ADDRESS: ionicLib.ionicLibStrings.`0DOT0DOT0DOT0` = js.native
  val BROWSERS: js.Array[java.lang.String] = js.native
  val COMMON_SERVE_COMMAND_OPTIONS: js.Array[ionicLib.definitionsMod.CommandMetadataOption] = js.native
  val DEFAULT_ADDRESS: ionicLib.ionicLibStrings.localhost = js.native
  val DEFAULT_DEVAPP_COMM_PORT: ionicLib.ionicLibNumbers.`53233` = js.native
  val DEFAULT_DEV_LOGGER_PORT: ionicLib.ionicLibNumbers.`53703` = js.native
  val DEFAULT_LAB_PORT: ionicLib.ionicLibNumbers.`8200` = js.native
  val DEFAULT_LIVERELOAD_PORT: ionicLib.ionicLibNumbers.`35729` = js.native
  val DEFAULT_SERVER_PORT: ionicLib.ionicLibNumbers.`8100` = js.native
  val LOCAL_ADDRESSES: js.Array[java.lang.String] = js.native
  val SERVE_SCRIPT: ionicLib.ionicLibStrings.`ionic:serve` = js.native
  def serve(
    deps: ServeRunnerDeps,
    inputs: atIonicCliDashFrameworkLib.definitionsMod.CommandLineInputs,
    options: atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions
  ): js.Promise[ionicLib.definitionsMod.ServeDetails] = js.native
}

