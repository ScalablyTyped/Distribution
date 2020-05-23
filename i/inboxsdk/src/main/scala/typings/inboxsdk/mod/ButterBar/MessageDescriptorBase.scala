package typings.inboxsdk.mod.ButterBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageDescriptorBase extends js.Object {
  var buttons: js.UndefOr[js.Array[MessageButtonDescriptor]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var hideOnViewChanged: js.UndefOr[Boolean] = js.undefined
  var messageKey: js.UndefOr[js.Object | String] = js.undefined
  var persistent: js.UndefOr[Boolean] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var time: js.UndefOr[Double] = js.undefined
}

object MessageDescriptorBase {
  @scala.inline
  def apply(
    buttons: js.Array[MessageButtonDescriptor] = null,
    className: String = null,
    hideOnViewChanged: js.UndefOr[Boolean] = js.undefined,
    messageKey: js.Object | String = null,
    persistent: js.UndefOr[Boolean] = js.undefined,
    priority: js.UndefOr[Double] = js.undefined,
    time: js.UndefOr[Double] = js.undefined
  ): MessageDescriptorBase = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnViewChanged)) __obj.updateDynamic("hideOnViewChanged")(hideOnViewChanged.get.asInstanceOf[js.Any])
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDescriptorBase]
  }
}

