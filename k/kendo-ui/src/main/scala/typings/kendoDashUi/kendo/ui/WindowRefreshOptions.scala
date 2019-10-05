package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowRefreshOptions extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var iframe: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object WindowRefreshOptions {
  @scala.inline
  def apply(
    cache: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    iframe: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    `type`: String = null,
    url: String = null
  ): WindowRefreshOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(iframe)) __obj.updateDynamic("iframe")(iframe)
    if (template != null) __obj.updateDynamic("template")(template)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WindowRefreshOptions]
  }
}

