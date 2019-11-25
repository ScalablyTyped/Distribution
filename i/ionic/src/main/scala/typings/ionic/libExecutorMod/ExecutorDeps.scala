package typings.ionic.libExecutorMod

import typings.ionic.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutorDeps extends js.Object {
  val namespace: INamespace
}

object ExecutorDeps {
  @scala.inline
  def apply(namespace: INamespace): ExecutorDeps = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExecutorDeps]
  }
}

