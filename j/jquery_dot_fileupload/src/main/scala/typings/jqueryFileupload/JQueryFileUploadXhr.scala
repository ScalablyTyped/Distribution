package typings.jqueryFileupload

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryFileUploadXhr extends js.Object {
  var errorThrown: js.Any
  var headers: StringDictionary[js.Any]
  var jqXHR: JQueryXHR
  var result: js.Any
  var textStatus: String
}

object JQueryFileUploadXhr {
  @scala.inline
  def apply(
    errorThrown: js.Any,
    headers: StringDictionary[js.Any],
    jqXHR: JQueryXHR,
    result: js.Any,
    textStatus: String
  ): JQueryFileUploadXhr = {
    val __obj = js.Dynamic.literal(errorThrown = errorThrown.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], jqXHR = jqXHR.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], textStatus = textStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryFileUploadXhr]
  }
}

