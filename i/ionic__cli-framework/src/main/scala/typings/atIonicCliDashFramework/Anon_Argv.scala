package typings.atIonicCliDashFramework

import typings.atIonicCliDashFramework.definitionsMod.INamespace
import typings.node.NodeJSNs.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Argv[N /* <: INamespace[C, N, M, I, O] */] extends js.Object {
  var argv: js.Array[String]
  var env: ProcessEnv
  var namespace: N
}

object Anon_Argv {
  @scala.inline
  def apply[N /* <: INamespace[C, N, M, I, O] */](argv: js.Array[String], env: ProcessEnv, namespace: N): Anon_Argv[N] = {
    val __obj = js.Dynamic.literal(argv = argv, env = env, namespace = namespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Argv[N]]
  }
}

