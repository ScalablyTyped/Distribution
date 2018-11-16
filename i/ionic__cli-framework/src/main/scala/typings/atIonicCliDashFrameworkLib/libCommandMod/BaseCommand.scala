package typings
package atIonicCliDashFrameworkLib.libCommandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/command", "BaseCommand")
@js.native
abstract class BaseCommand[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */] protected () extends js.Object {
  def this(namespace: N) = this()
  var namespace: N = js.native
  def getMetadata(): stdLib.Promise[M] = js.native
  def run(
    inputs: atIonicCliDashFrameworkLib.definitionsMod.CommandLineInputs,
    options: atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions
  ): stdLib.Promise[scala.Unit] = js.native
  def run(
    inputs: atIonicCliDashFrameworkLib.definitionsMod.CommandLineInputs,
    options: atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions,
    runtime: stdLib.Partial[atIonicCliDashFrameworkLib.definitionsMod.CommandInstanceInfo[C, N, M, I, O]]
  ): stdLib.Promise[scala.Unit] = js.native
  def validate(argv: atIonicCliDashFrameworkLib.definitionsMod.CommandLineInputs): stdLib.Promise[scala.Unit] = js.native
}

