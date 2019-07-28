package typings.inboxsdk.inboxsdkMod.ConversationsNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentPanelDescriptor extends js.Object {
  var appIconUrl: js.UndefOr[String] = js.undefined
  var appName: js.UndefOr[String] = js.undefined
  var el: HTMLElement
  var hideTitleBar: js.UndefOr[Boolean] = js.undefined
  var iconUrl: String
  var id: js.UndefOr[String] = js.undefined
  var orderHint: js.UndefOr[Double] = js.undefined
  var title: String
}

object ContentPanelDescriptor {
  @scala.inline
  def apply(
    el: HTMLElement,
    iconUrl: String,
    title: String,
    appIconUrl: String = null,
    appName: String = null,
    hideTitleBar: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    orderHint: Int | Double = null
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

