package typings.kendoUi.kendo.data

import typings.kendoUi.JQueryAjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceTransportRead extends JQueryAjaxSettings {
  var cache: js.UndefOr[Boolean] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataType: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[js.Any] = js.undefined
}

object DataSourceTransportRead {
  @scala.inline
  def apply(
    cache: js.UndefOr[Boolean] = js.undefined,
    contentType: String = null,
    data: js.Any = null,
    dataType: String = null,
    `type`: String = null,
    url: js.Any = null
  ): DataSourceTransportRead = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceTransportRead]
  }
}

