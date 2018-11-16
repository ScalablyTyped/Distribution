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

