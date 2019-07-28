package typings.inboxsdk.inboxsdkMod.ButterBarNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavingMessageDescriptorHtmlElement
  extends SavingMessageDescriptorBase
     with SavingMessageDescriptor {
  var el: HTMLElement
}

object SavingMessageDescriptorHtmlElement {
  @scala.inline
  def apply(
    el: HTMLElement,
    className: String = null,
    confirmationText: String = null,
    confirmationTime: Int | Double = null,
    hideOnViewChanged: js.UndefOr[Boolean] = js.undefined,
    messageKey: js.Object | String = null,
    persistent: js.UndefOr[Boolean] = js.undefined,
    priority: Int | Double = null,
    showConfirmation: js.UndefOr[Boolean] = js.undefined,
    time: Int | Double = null
  ): SavingMessageDescriptorHtmlElement = {
    val __obj = js.Dynamic.literal(el = el)
    if (className != null) __obj.updateDynamic("className")(className)
    if (confirmationText != null) __obj.updateDynamic("confirmationText")(confirmationText)
    if (confirmationTime != null) __obj.updateDynamic("confirmationTime")(confirmationTime.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnViewChanged)) __obj.updateDynamic("hideOnViewChanged")(hideOnViewChanged)
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(showConfirmation)) __obj.updateDynamic("showConfirmation")(showConfirmation)
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingMessageDescriptorHtmlElement]
  }
}

