package typings.ionic.definitionsMod

import typings.atIonicCliDashFramework.definitionsMod.CommandLineInputs
import typings.atIonicCliDashFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandPreRun extends ICommand {
  def preRun(inputs: CommandLineInputs, options: CommandLineOptions, metadata: CommandInstanceInfo): js.Promise[Unit] = js.native
}

