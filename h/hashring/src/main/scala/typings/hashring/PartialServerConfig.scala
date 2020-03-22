package typings.hashring

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
  def apply(vnodes: Int | Double = null, weight: Int | Double = null): PartialServerConfig = {
    val __obj = js.Dynamic.literal()
    if (vnodes != null) __obj.updateDynamic("vnodes")(vnodes.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialServerConfig]
  }
}

