package typings
package atIonicCliDashFrameworkLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommand[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  var namespace: N = js.native
  def getMetadata(): js.Promise[M] = js.native
  def getMetadata(runinfo: stdLib.Partial[CommandInstanceInfo[C, N, M, I, O]]): js.Promise[M] = js.native
  def run(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[scala.Unit] = js.native
  def run(
    inputs: CommandLineInputs,
    options: CommandLineOptions,
    runinfo: stdLib.Partial[CommandInstanceInfo[C, N, M, I, O]]
  ): js.Promise[scala.Unit] = js.native
  def validate(argv: CommandLineInputs): js.Promise[scala.Unit] = js.native
}

