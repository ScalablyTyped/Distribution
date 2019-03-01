package typings
package ionicLib.libExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutorDeps extends js.Object {
  val namespace: ionicLib.definitionsMod.INamespace
}

object ExecutorDeps {
  @scala.inline
  def apply(namespace: ionicLib.definitionsMod.INamespace): ExecutorDeps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("namespace")(namespace)
    __obj.asInstanceOf[ExecutorDeps]
  }
}

