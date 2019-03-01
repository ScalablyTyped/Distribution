package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowRefreshOptions extends js.Object {
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var iframe: js.UndefOr[scala.Boolean] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object WindowRefreshOptions {
  @scala.inline
  def apply(
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    iframe: js.UndefOr[scala.Boolean] = js.undefined,
    template: java.lang.String = null,
    `type`: java.lang.String = null,
    url: java.lang.String = null
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

