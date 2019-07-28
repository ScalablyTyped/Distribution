package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorImageBrowserTransportDestroy extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any | String | js.Function] = js.undefined
  var dataType: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String | js.Function] = js.undefined
}

object EditorImageBrowserTransportDestroy {
  @scala.inline
  def apply(
    contentType: String = null,
    data: js.Any | String | js.Function = null,
    dataType: String = null,
    `type`: String = null,
    url: String | js.Function = null
  ): EditorImageBrowserTransportDestroy = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorImageBrowserTransportDestroy]
  }
}

