package typings.atIonicCliDashFramework.libCommandMod

import typings.atIonicCliDashFramework.definitionsMod.CommandInstanceInfo
import typings.atIonicCliDashFramework.definitionsMod.CommandLineInputs
import typings.atIonicCliDashFramework.definitionsMod.CommandLineOptions
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typings.atIonicCliDashFramework.definitionsMod.ICommand
import typings.atIonicCliDashFramework.definitionsMod.INamespace
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/command", "BaseCommand")
@js.native
abstract class BaseCommand[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends js.Object {
  def this(namespace: N) = this()
  var namespace: N = js.native
  def getMetadata(): js.Promise[M] = js.native
  def run(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
  def run(
    inputs: CommandLineInputs,
    options: CommandLineOptions,
    runtime: Partial[CommandInstanceInfo[C, N, M, I, O]]
  ): js.Promise[Unit] = js.native
  def validate(argv: CommandLineInputs): js.Promise[Unit] = js.native
}

