package typings.jqueryDotAjaxfile.AjaxFileJQuery

import typings.jqueryDotAjaxfile.IFileData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJQueryOption extends js.Object {
  var complete: js.UndefOr[js.Function2[/* jqXHR */ IJQueryXHR, /* textStatus */ String, _]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataType: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[
    js.Function3[/* jqXHR */ IJQueryXHR, /* textStatus */ String, /* errorThrown */ String, _]
  ] = js.undefined
  var files: js.UndefOr[js.Array[IFileData]] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var success: js.UndefOr[
    js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ IJQueryXHR, _]
  ] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object IJQueryOption {
  @scala.inline
  def apply(
    complete: (/* jqXHR */ IJQueryXHR, /* textStatus */ String) => _ = null,
    data: js.Any = null,
    dataType: String = null,
    error: (/* jqXHR */ IJQueryXHR, /* textStatus */ String, /* errorThrown */ String) => _ = null,
    files: js.Array[IFileData] = null,
    global: js.UndefOr[Boolean] = js.undefined,
    success: (/* data */ js.Any, /* textStatus */ String, /* jqXHR */ IJQueryXHR) => _ = null,
    timeout: Int | Double = null,
    `type`: String = null,
    url: String = null
  ): IJQueryOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction2(complete))
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (files != null) __obj.updateDynamic("files")(files)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IJQueryOption]
  }
}

