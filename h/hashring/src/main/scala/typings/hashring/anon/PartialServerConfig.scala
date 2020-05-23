package typings.hashring.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<hashring.hashring.ServerConfig> */
trait PartialServerConfig extends js.Object {
  var vnodes: js.UndefOr[Double] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object PartialServerConfig {
  @scala.inline
  def apply(vnodes: js.UndefOr[Double] = js.undefined, weight: js.UndefOr[Double] = js.undefined): PartialServerConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(vnodes)) __obj.updateDynamic("vnodes")(vnodes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialServerConfig]
  }
}

