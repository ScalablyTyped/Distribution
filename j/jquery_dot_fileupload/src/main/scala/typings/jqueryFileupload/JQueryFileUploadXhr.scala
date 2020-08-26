package typings.jqueryFileupload

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryFileUploadXhr extends js.Object {
  var errorThrown: js.Any = js.native
  var headers: StringDictionary[js.Any] = js.native
  var jqXHR: JQueryXHR = js.native
  var result: js.Any = js.native
  var textStatus: String = js.native
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
  @scala.inline
  implicit class JQueryFileUploadXhrOps[Self <: JQueryFileUploadXhr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorThrown(value: js.Any): Self = this.set("errorThrown", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: StringDictionary[js.Any]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setJqXHR(value: JQueryXHR): Self = this.set("jqXHR", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextStatus(value: String): Self = this.set("textStatus", value.asInstanceOf[js.Any])
  }
  
}

