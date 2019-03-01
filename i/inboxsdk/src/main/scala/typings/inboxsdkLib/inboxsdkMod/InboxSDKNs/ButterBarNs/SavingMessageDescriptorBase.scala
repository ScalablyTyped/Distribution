package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ButterBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavingMessageDescriptorBase extends MessageDescriptorBase {
  var confirmationText: js.UndefOr[java.lang.String] = js.undefined
  var confirmationTime: js.UndefOr[scala.Double] = js.undefined
  var showConfirmation: js.UndefOr[scala.Boolean] = js.undefined
}

object SavingMessageDescriptorBase {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    confirmationText: java.lang.String = null,
    confirmationTime: scala.Int | scala.Double = null,
    hideOnViewChanged: js.UndefOr[scala.Boolean] = js.undefined,
    messageKey: js.Object | java.lang.String = null,
    persistent: js.UndefOr[scala.Boolean] = js.undefined,
    priority: scala.Int | scala.Double = null,
    showConfirmation: js.UndefOr[scala.Boolean] = js.undefined,
    time: scala.Int | scala.Double = null
  ): SavingMessageDescriptorBase = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (confirmationText != null) __obj.updateDynamic("confirmationText")(confirmationText)
    if (confirmationTime != null) __obj.updateDynamic("confirmationTime")(confirmationTime.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnViewChanged)) __obj.updateDynamic("hideOnViewChanged")(hideOnViewChanged)
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(showConfirmation)) __obj.updateDynamic("showConfirmation")(showConfirmation)
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingMessageDescriptorBase]
  }
}

