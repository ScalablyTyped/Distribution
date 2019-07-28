package typings.hexo.hexoMod.extendNs

import typings.hexo.hexoMod.extendNs.DeployerNs.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deployer extends js.Object {
  def register(name: String, fn: js.Function1[/* args */ Config, Unit]): Unit
}

object Deployer {
  @scala.inline
  def apply(register: (String, js.Function1[/* args */ Config, Unit]) => Unit): Deployer = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
  
    __obj.asInstanceOf[Deployer]
  }
}

