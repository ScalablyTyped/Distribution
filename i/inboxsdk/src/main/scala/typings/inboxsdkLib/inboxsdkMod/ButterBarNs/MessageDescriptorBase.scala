package typings
package inboxsdkLib.inboxsdkMod.ButterBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageDescriptorBase extends js.Object {
  var buttons: js.UndefOr[js.Array[MessageButtonDescriptor]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var hideOnViewChanged: js.UndefOr[scala.Boolean] = js.undefined
  var messageKey: js.UndefOr[js.Object | java.lang.String] = js.undefined
  var persistent: js.UndefOr[scala.Boolean] = js.undefined
  var priority: js.UndefOr[scala.Double] = js.undefined
  var time: js.UndefOr[scala.Double] = js.undefined
}

object MessageDescriptorBase {
  @scala.inline
  def apply(
    buttons: js.Array[MessageButtonDescriptor] = null,
    className: java.lang.String = null,
    hideOnViewChanged: js.UndefOr[scala.Boolean] = js.undefined,
    messageKey: js.Object | java.lang.String = null,
    persistent: js.UndefOr[scala.Boolean] = js.undefined,
    priority: scala.Int | scala.Double = null,
    time: scala.Int | scala.Double = null
  ): MessageDescriptorBase = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(hideOnViewChanged)) __obj.updateDynamic("hideOnViewChanged")(hideOnViewChanged)
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDescriptorBase]
  }
}

