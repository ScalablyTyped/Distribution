package typings
package atIonicCliDashFrameworkLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandInstanceInfo[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  var env: nodeLib.NodeJSNs.ProcessEnv
  var executor: IExecutor[C, N, M, I, O]
  var location: NamespaceLocateResult[C, N, M, I, O]
}

object CommandInstanceInfo {
  @scala.inline
  def apply[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](
    env: nodeLib.NodeJSNs.ProcessEnv,
    executor: IExecutor[C, N, M, I, O],
    location: NamespaceLocateResult[C, N, M, I, O]
  ): CommandInstanceInfo[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("env")(env)
    __obj.updateDynamic("executor")(executor)
    __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[CommandInstanceInfo[C, N, M, I, O]]
  }
}

