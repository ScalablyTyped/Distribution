package typings
package atIonicCliDashFrameworkLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExecutor[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  val namespace: N = js.native
  def execute(argv: js.Array[java.lang.String], env: nodeLib.NodeJSNs.ProcessEnv): stdLib.Promise[scala.Unit] = js.native
  def run(command: C, cmdargs: js.Array[java.lang.String]): stdLib.Promise[scala.Unit] = js.native
  def run(
    command: C,
    cmdargs: js.Array[java.lang.String],
    runinfo: stdLib.Partial[CommandInstanceInfo[C, N, M, I, O]]
  ): stdLib.Promise[scala.Unit] = js.native
}

