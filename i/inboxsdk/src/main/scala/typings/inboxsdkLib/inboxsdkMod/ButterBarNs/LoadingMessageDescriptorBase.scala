package typings
package inboxsdkLib.inboxsdkMod.ButterBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingMessageDescriptorBase extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var hideOnViewChanged: js.UndefOr[scala.Boolean] = js.undefined
  var messageKey: js.UndefOr[js.Object | java.lang.String] = js.undefined
  var persistent: js.UndefOr[scala.Boolean] = js.undefined
  var priority: js.UndefOr[scala.Double] = js.undefined
}

object LoadingMessageDescriptorBase {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    hideOnViewChanged: js.UndefOr[scala.Boolean] = js.undefined,
    messageKey: js.Object | java.lang.String = null,
    persistent: js.UndefOr[scala.Boolean] = js.undefined,
    priority: scala.Int | scala.Double = null
  ): LoadingMessageDescriptorBase = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(hideOnViewChanged)) __obj.updateDynamic("hideOnViewChanged")(hideOnViewChanged)
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingMessageDescriptorBase]
  }
}

