package typings.inboxsdk.mod.ButterBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavingMessageDescriptorBase extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var confirmationText: js.UndefOr[String] = js.undefined
  var confirmationTime: js.UndefOr[Double] = js.undefined
  var hideOnViewChanged: js.UndefOr[Boolean] = js.undefined
  var messageKey: js.UndefOr[js.Object | String] = js.undefined
  var persistent: js.UndefOr[Boolean] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var showConfirmation: js.UndefOr[Boolean] = js.undefined
  var time: js.UndefOr[Double] = js.undefined
}

object SavingMessageDescriptorBase {
  @scala.inline
  def apply(
    className: String = null,
    confirmationText: String = null,
    confirmationTime: js.UndefOr[Double] = js.undefined,
    hideOnViewChanged: js.UndefOr[Boolean] = js.undefined,
    messageKey: js.Object | String = null,
    persistent: js.UndefOr[Boolean] = js.undefined,
    priority: js.UndefOr[Double] = js.undefined,
    showConfirmation: js.UndefOr[Boolean] = js.undefined,
    time: js.UndefOr[Double] = js.undefined
  ): SavingMessageDescriptorBase = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (confirmationText != null) __obj.updateDynamic("confirmationText")(confirmationText.asInstanceOf[js.Any])
    if (!js.isUndefined(confirmationTime)) __obj.updateDynamic("confirmationTime")(confirmationTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnViewChanged)) __obj.updateDynamic("hideOnViewChanged")(hideOnViewChanged.get.asInstanceOf[js.Any])
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showConfirmation)) __obj.updateDynamic("showConfirmation")(showConfirmation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingMessageDescriptorBase]
  }
}

