package typings
package jqueryDotFileuploadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryFileUploadXhr extends js.Object {
  var errorThrown: js.Any
  var headers: org.scalablytyped.runtime.StringDictionary[js.Any]
  var jqXHR: jqueryLib.JQueryXHR
  var result: js.Any
  var textStatus: java.lang.String
}

object JQueryFileUploadXhr {
  @scala.inline
  def apply(
    errorThrown: js.Any,
    headers: org.scalablytyped.runtime.StringDictionary[js.Any],
    jqXHR: jqueryLib.JQueryXHR,
    result: js.Any,
    textStatus: java.lang.String
  ): JQueryFileUploadXhr = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorThrown")(errorThrown)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("jqXHR")(jqXHR)
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("textStatus")(textStatus)
    __obj.asInstanceOf[JQueryFileUploadXhr]
  }
}

