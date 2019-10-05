package typings.iobroker.iobrokerMod.Global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelCommon extends ObjectCommon {
  // Only states can have common.custom
  var custom: js.UndefOr[scala.Nothing] = js.undefined
  /** description of this channel */
  var desc: js.UndefOr[String] = js.undefined
}

object ChannelCommon {
  @scala.inline
  def apply(
    name: String,
    custom: js.UndefOr[scala.Nothing] = js.undefined,
    desc: String = null,
    icon: String = null,
    role: String = null
  ): ChannelCommon = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom)
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[ChannelCommon]
  }
}

