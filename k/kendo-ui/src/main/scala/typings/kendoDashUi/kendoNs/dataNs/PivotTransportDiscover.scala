package typings.kendoDashUi.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotTransportDiscover extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataType: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[js.Any] = js.undefined
}

object PivotTransportDiscover {
  @scala.inline
  def apply(
    cache: js.UndefOr[Boolean] = js.undefined,
    contentType: String = null,
    data: js.Any = null,
    dataType: String = null,
    `type`: String = null,
    url: js.Any = null
  ): PivotTransportDiscover = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PivotTransportDiscover]
  }
}

