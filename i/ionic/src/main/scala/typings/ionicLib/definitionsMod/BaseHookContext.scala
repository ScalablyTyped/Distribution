package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseHookContext extends js.Object {
  var argv: js.Array[java.lang.String]
  var env: nodeLib.NodeJSNs.ProcessEnv
  var project: ionicLib.Anon_Dir
}

object BaseHookContext {
  @scala.inline
  def apply(argv: js.Array[java.lang.String], env: nodeLib.NodeJSNs.ProcessEnv, project: ionicLib.Anon_Dir): BaseHookContext = {
    val __obj = js.Dynamic.literal(argv = argv, env = env, project = project)
  
    __obj.asInstanceOf[BaseHookContext]
  }
}

