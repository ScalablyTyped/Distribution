package typings
package atIonicCliDashFrameworkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Argv[N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */] extends js.Object {
  var argv: js.Array[java.lang.String]
  var env: nodeLib.NodeJSNs.ProcessEnv
  var namespace: N
}

object Anon_Argv {
  @scala.inline
  def apply[N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */](argv: js.Array[java.lang.String], env: nodeLib.NodeJSNs.ProcessEnv, namespace: N): Anon_Argv[N] = {
    val __obj = js.Dynamic.literal(argv = argv, env = env, namespace = namespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Argv[N]]
  }
}

