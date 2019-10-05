package typings.inboxsdk.inboxsdkMod.ButterBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingMessageDescriptorText
  extends LoadingMessageDescriptorBase
     with LoadingMessageDescriptor {
  var text: String
}

object LoadingMessageDescriptorText {
  @scala.inline
  def apply(
    text: String,
    className: String = null,
    hideOnViewChanged: js.UndefOr[Boolean] = js.undefined,
    messageKey: js.Object | String = null,
    persistent: js.UndefOr[Boolean] = js.undefined,
    priority: Int | Double = null
  ): LoadingMessageDescriptorText = {
    val __obj = js.Dynamic.literal(text = text)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(hideOnViewChanged)) __obj.updateDynamic("hideOnViewChanged")(hideOnViewChanged)
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingMessageDescriptorText]
  }
}

