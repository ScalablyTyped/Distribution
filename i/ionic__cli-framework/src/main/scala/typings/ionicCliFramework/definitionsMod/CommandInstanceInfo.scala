package typings.ionicCliFramework.definitionsMod

import typings.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandInstanceInfo[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  var env: ProcessEnv
  var executor: IExecutor[C, N, M, I, O]
  var location: NamespaceLocateResult[C, N, M, I, O]
}

object CommandInstanceInfo {
  @scala.inline
  def apply[C, N, M, I, O](
    env: ProcessEnv,
    executor: IExecutor[C, N, M, I, O],
    location: NamespaceLocateResult[C, N, M, I, O]
  ): CommandInstanceInfo[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandInstanceInfo[C, N, M, I, O]]
  }
}

