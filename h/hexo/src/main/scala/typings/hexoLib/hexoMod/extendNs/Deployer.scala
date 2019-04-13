package typings
package hexoLib.hexoMod.extendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deployer extends js.Object {
  def register(
    name: java.lang.String,
    fn: js.Function1[/* args */ hexoLib.hexoMod.extendNs.DeployerNs.Config, scala.Unit]
  ): scala.Unit
}

object Deployer {
  @scala.inline
  def apply(
    register: (java.lang.String, js.Function1[/* args */ hexoLib.hexoMod.extendNs.DeployerNs.Config, scala.Unit]) => scala.Unit
  ): Deployer = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
  
    __obj.asInstanceOf[Deployer]
  }
}

