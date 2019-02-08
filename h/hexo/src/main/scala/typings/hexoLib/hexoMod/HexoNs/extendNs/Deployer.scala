package typings
package hexoLib.hexoMod.HexoNs.extendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deployer extends js.Object {
  def register(
    name: java.lang.String,
    fn: js.Function1[/* args */ hexoLib.hexoMod.HexoNs.extendNs.DeployerNs.Config, scala.Unit]
  ): scala.Unit
}

