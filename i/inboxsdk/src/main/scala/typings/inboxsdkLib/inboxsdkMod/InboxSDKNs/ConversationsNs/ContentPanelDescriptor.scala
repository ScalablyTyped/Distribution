package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentPanelDescriptor extends js.Object {
  var appIconUrl: js.UndefOr[java.lang.String] = js.undefined
  var appName: js.UndefOr[java.lang.String] = js.undefined
  var el: stdLib.HTMLElement
  var hideTitleBar: js.UndefOr[scala.Boolean] = js.undefined
  var iconUrl: java.lang.String
  var id: js.UndefOr[java.lang.String] = js.undefined
  var orderHint: js.UndefOr[scala.Double] = js.undefined
  var title: java.lang.String
}

object ContentPanelDescriptor {
  @scala.inline
  def apply(
    el: stdLib.HTMLElement,
    iconUrl: java.lang.String,
    title: java.lang.String,
    appIconUrl: java.lang.String = null,
    appName: java.lang.String = null,
    hideTitleBar: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    orderHint: scala.Int | scala.Double = null
  ): ContentPanelDescriptor = {
    val __obj = js.Dynamic.literal(el = el, iconUrl = iconUrl, title = title)
    if (appIconUrl != null) __obj.updateDynamic("appIconUrl")(appIconUrl)
    if (appName != null) __obj.updateDynamic("appName")(appName)
    if (!js.isUndefined(hideTitleBar)) __obj.updateDynamic("hideTitleBar")(hideTitleBar)
    if (id != null) __obj.updateDynamic("id")(id)
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentPanelDescriptor]
  }
}

