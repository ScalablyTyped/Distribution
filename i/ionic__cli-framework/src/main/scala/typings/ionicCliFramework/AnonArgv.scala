package typings.ionicCliFramework

import typings.ionicCliFramework.definitionsMod.CommandMetadata
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.definitionsMod.ICommand
import typings.ionicCliFramework.definitionsMod.INamespace
import typings.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgv[N /* <: INamespace[C, N, M, I, O] */, C /* <: ICommand[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends js.Object {
  var argv: js.Array[String]
  var env: ProcessEnv
  var namespace: N
}

object AnonArgv {
  @scala.inline
  def apply[N /* <: INamespace[C, N, M, I, O] */, C /* <: ICommand[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](argv: js.Array[String], env: ProcessEnv, namespace: N): AnonArgv[N, C, M, I, O] = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgv[N, C, M, I, O]]
  }
}

