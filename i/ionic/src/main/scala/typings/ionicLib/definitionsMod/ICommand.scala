package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommand
  extends atIonicCliDashFrameworkLib.definitionsMod.ICommand[
      ICommand, 
      INamespace, 
      CommandMetadata, 
      atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput, 
      CommandMetadataOption
    ] {
  val env: IonicEnvironment = js.native
  val project: js.UndefOr[IProject] = js.native
  def execute(
    inputs: atIonicCliDashFrameworkLib.definitionsMod.CommandLineInputs,
    options: atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions,
    metadata: CommandInstanceInfo
  ): js.Promise[scala.Unit] = js.native
}

