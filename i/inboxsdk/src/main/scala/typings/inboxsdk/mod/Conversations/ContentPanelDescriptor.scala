package typings.inboxsdk.mod.Conversations

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
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (appIconUrl != null) __obj.updateDynamic("appIconUrl")(appIconUrl.asInstanceOf[js.Any])
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTitleBar)) __obj.updateDynamic("hideTitleBar")(hideTitleBar.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentPanelDescriptor]
  }
}

