package typings.inboxsdk.inboxsdkMod.ButterBar

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageDescriptorHtmlElement
  extends MessageDescriptorBase
     with MessageDescriptor {
  var el: HTMLElement
}

object MessageDescriptorHtmlElement {
  @scala.inline
  def apply(
    el: HTMLElement,
    buttons: js.Array[MessageButtonDescriptor] = null,
    className: String = null,
    hideOnViewChanged: js.UndefOr[Boolean] = js.undefined,
    messageKey: js.Object | String = null,
    persistent: js.UndefOr[Boolean] = js.undefined,
    priority: Int | Double = null,
    time: Int | Double = null
  ): MessageDescriptorHtmlElement = {
    val __obj = js.Dynamic.literal(el = el)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(hideOnViewChanged)) __obj.updateDynamic("hideOnViewChanged")(hideOnViewChanged)
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDescriptorHtmlElement]
  }
}

