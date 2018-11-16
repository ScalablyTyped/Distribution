package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandPreRun extends ICommand {
  def preRun(
    inputs: atIonicCliDashFrameworkLib.definitionsMod.CommandLineInputs,
    options: atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions,
    metadata: CommandInstanceInfo
  ): stdLib.Promise[scala.Unit] = js.native
}

