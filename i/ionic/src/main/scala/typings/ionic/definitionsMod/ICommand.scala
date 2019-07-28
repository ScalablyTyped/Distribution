package typings.ionic.definitionsMod

import typings.atIonicCliDashFramework.definitionsMod.CommandLineInputs
import typings.atIonicCliDashFramework.definitionsMod.CommandLineOptions
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommand
  extends typings.atIonicCliDashFramework.definitionsMod.ICommand[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
  val env: IonicEnvironment = js.native
  val project: js.UndefOr[IProject] = js.native
  def execute(inputs: CommandLineInputs, options: CommandLineOptions, metadata: CommandInstanceInfo): js.Promise[Unit] = js.native
}

