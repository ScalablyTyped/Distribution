package typings
package jqueryDotAjaxfileLib.AjaxFileJQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJQueryOption extends js.Object {
  var complete: js.UndefOr[js.Function2[/* jqXHR */ IJQueryXHR, /* textStatus */ java.lang.String, _]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[
    js.Function3[
      /* jqXHR */ IJQueryXHR, 
      /* textStatus */ java.lang.String, 
      /* errorThrown */ java.lang.String, 
      _
    ]
  ] = js.undefined
  var files: js.UndefOr[js.Array[jqueryDotAjaxfileLib.IFileData]] = js.undefined
  var global: js.UndefOr[scala.Boolean] = js.undefined
  var success: js.UndefOr[
    js.Function3[/* data */ js.Any, /* textStatus */ java.lang.String, /* jqXHR */ IJQueryXHR, _]
  ] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object IJQueryOption {
  @scala.inline
  def apply(
    complete: js.Function2[/* jqXHR */ IJQueryXHR, /* textStatus */ java.lang.String, _] = null,
    data: js.Any = null,
    dataType: java.lang.String = null,
    error: js.Function3[
      /* jqXHR */ IJQueryXHR, 
      /* textStatus */ java.lang.String, 
      /* errorThrown */ java.lang.String, 
      _
    ] = null,
    files: js.Array[jqueryDotAjaxfileLib.IFileData] = null,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Function3[/* data */ js.Any, /* textStatus */ java.lang.String, /* jqXHR */ IJQueryXHR, _] = null,
    timeout: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    url: java.lang.String = null
  ): IJQueryOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (error != null) __obj.updateDynamic("error")(error)
    if (files != null) __obj.updateDynamic("files")(files)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (success != null) __obj.updateDynamic("success")(success)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IJQueryOption]
  }
}

