package typings.iobroker.mod.global.ioBroker

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
  def apply(name: String, desc: String = null, icon: String = null, role: String = null): ChannelCommon = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelCommon]
  }
}

