package typings.ionicCliFramework

import typings.ionicCliFramework.definitionsMod.INamespace
import typings.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgv[N /* <: INamespace[C, N, M, I, O] */] extends js.Object {
  var argv: js.Array[String]
  var env: ProcessEnv
  var namespace: N
}

object AnonArgv {
  @scala.inline
  def apply[N /* <: INamespace[C, N, M, I, O] */](argv: js.Array[String], env: ProcessEnv, namespace: N): AnonArgv[N] = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArgv[N]]
  }
}

