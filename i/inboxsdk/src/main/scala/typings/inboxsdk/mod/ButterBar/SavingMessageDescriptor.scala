package typings.inboxsdk.mod.ButterBar

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.inboxsdk.mod.ButterBar.SavingMessageDescriptorText
  - typings.inboxsdk.mod.ButterBar.SavingMessageDescriptorHtml
  - typings.inboxsdk.mod.ButterBar.SavingMessageDescriptorHtmlElement
*/
trait SavingMessageDescriptor extends js.Object

object SavingMessageDescriptor {
  @scala.inline
  def SavingMessageDescriptorText(
    text: String,
    className: String = null,
    confirmationText: String = null,
    confirmationTime: js.UndefOr[Double] = js.undefined,
    hideOnViewChanged: js.UndefOr[Boolean] = js.undefined,
    messageKey: js.Object | String = null,
    persistent: js.UndefOr[Boolean] = js.undefined,
    priority: js.UndefOr[Double] = js.undefined,
    showConfirmation: js.UndefOr[Boolean] = js.undefined,
    time: js.UndefOr[Double] = js.undefined
  ): SavingMessageDescriptor = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (confirmationText != null) __obj.updateDynamic("confirmationText")(confirmationText.asInstanceOf[js.Any])
    if (!js.isUndefined(confirmationTime)) __obj.updateDynamic("confirmationTime")(confirmationTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnViewChanged)) __obj.updateDynamic("hideOnViewChanged")(hideOnViewChanged.get.asInstanceOf[js.Any])
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showConfirmation)) __obj.updateDynamic("showConfirmation")(showConfirmation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingMessageDescriptor]
  }
  @scala.inline
  def SavingMessageDescriptorHtml(
    html: String,
    className: String = null,
    confirmationText: String = null,
    confirmationTime: js.UndefOr[Double] = js.undefined,
    hideOnViewChanged: js.UndefOr[Boolean] = js.undefined,
    messageKey: js.Object | String = null,
    persistent: js.UndefOr[Boolean] = js.undefined,
    priority: js.UndefOr[Double] = js.undefined,
    showConfirmation: js.UndefOr[Boolean] = js.undefined,
    time: js.UndefOr[Double] = js.undefined
  ): SavingMessageDescriptor = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (confirmationText != null) __obj.updateDynamic("confirmationText")(confirmationText.asInstanceOf[js.Any])
    if (!js.isUndefined(confirmationTime)) __obj.updateDynamic("confirmationTime")(confirmationTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnViewChanged)) __obj.updateDynamic("hideOnViewChanged")(hideOnViewChanged.get.asInstanceOf[js.Any])
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showConfirmation)) __obj.updateDynamic("showConfirmation")(showConfirmation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingMessageDescriptor]
  }
  @scala.inline
  def SavingMessageDescriptorHtmlElement(
    el: HTMLElement,
    className: String = null,
    confirmationText: String = null,
    confirmationTime: js.UndefOr[Double] = js.undefined,
    hideOnViewChanged: js.UndefOr[Boolean] = js.undefined,
    messageKey: js.Object | String = null,
    persistent: js.UndefOr[Boolean] = js.undefined,
    priority: js.UndefOr[Double] = js.undefined,
    showConfirmation: js.UndefOr[Boolean] = js.undefined,
    time: js.UndefOr[Double] = js.undefined
  ): SavingMessageDescriptor = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (confirmationText != null) __obj.updateDynamic("confirmationText")(confirmationText.asInstanceOf[js.Any])
    if (!js.isUndefined(confirmationTime)) __obj.updateDynamic("confirmationTime")(confirmationTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnViewChanged)) __obj.updateDynamic("hideOnViewChanged")(hideOnViewChanged.get.asInstanceOf[js.Any])
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showConfirmation)) __obj.updateDynamic("showConfirmation")(showConfirmation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingMessageDescriptor]
  }
}

