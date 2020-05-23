package typings.ionic.definitionsMod

import typings.ionic.anon.Dir
import typings.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseHookContext extends js.Object {
  var argv: js.Array[String]
  var env: ProcessEnv
  var project: Dir
}

object BaseHookContext {
  @scala.inline
  def apply(argv: js.Array[String], env: ProcessEnv, project: Dir): BaseHookContext = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseHookContext]
  }
}

