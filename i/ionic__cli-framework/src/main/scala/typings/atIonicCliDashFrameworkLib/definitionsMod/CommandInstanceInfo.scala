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

