package typings
package ionicLib.libServeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/serve", JSImport.Namespace)
@js.native
object libServeModMembers extends js.Object {
  val BIND_ALL_ADDRESS: /* 0.0.0.0 */ java.lang.String = js.native
  val BROWSERS: js.Array[java.lang.String] = js.native
  val COMMON_SERVE_COMMAND_OPTIONS: js.Array[ionicLib.definitionsMod.CommandMetadataOption] = js.native
  val DEFAULT_DEVAPP_COMM_PORT: /* 53233 */ scala.Double = js.native
  val DEFAULT_DEV_LOGGER_PORT: /* 53703 */ scala.Double = js.native
  val DEFAULT_LAB_PORT: /* 8200 */ scala.Double = js.native
  val DEFAULT_LIVERELOAD_PORT: /* 35729 */ scala.Double = js.native
  val DEFAULT_SERVER_PORT: /* 8100 */ scala.Double = js.native
  val LOCAL_ADDRESSES: js.Array[java.lang.String] = js.native
  val SERVE_SCRIPT: /* ionic:serve */ java.lang.String = js.native
  def serve(
    deps: ServeRunnerDeps,
    inputs: atIonicCliDashFrameworkLib.definitionsMod.CommandLineInputs,
    options: atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions
  ): js.Promise[ionicLib.definitionsMod.ServeDetails] = js.native
}

