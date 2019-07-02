package typings
package inboxsdkLib.inboxsdkMod.ButterBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingMessageDescriptorHtmlElement
  extends LoadingMessageDescriptorBase
     with LoadingMessageDescriptor {
  var el: stdLib.HTMLElement
}

object LoadingMessageDescriptorHtmlElement {
  @scala.inline
  def apply(
    el: stdLib.HTMLElement,
    className: java.lang.String = null,
    hideOnViewChanged: js.UndefOr[scala.Boolean] = js.undefined,
    messageKey: js.Object | java.lang.String = null,
    persistent: js.UndefOr[scala.Boolean] = js.undefined,
    priority: scala.Int | scala.Double = null
  ): LoadingMessageDescriptorHtmlElement = {
    val __obj = js.Dynamic.literal(el = el)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(hideOnViewChanged)) __obj.updateDynamic("hideOnViewChanged")(hideOnViewChanged)
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingMessageDescriptorHtmlElement]
  }
}

