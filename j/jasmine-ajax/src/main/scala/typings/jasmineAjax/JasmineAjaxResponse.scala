package typings.jasmineAjax

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JasmineAjaxResponse extends js.Object {
  var contentType: js.UndefOr[String] = js.native
  var response: js.UndefOr[String] = js.native
  var responseHeaders: js.UndefOr[StringDictionary[String]] = js.native
  var responseText: js.UndefOr[String] = js.native
  var status: js.UndefOr[Double] = js.native
  var statusText: js.UndefOr[String] = js.native
}

object JasmineAjaxResponse {
  @scala.inline
  def apply(): JasmineAjaxResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JasmineAjaxResponse]
  }
  @scala.inline
  implicit class JasmineAjaxResponseOps[Self <: JasmineAjaxResponse] (val x: Self) extends AnyVal {
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setResponse(value: String): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setResponseHeaders(value: StringDictionary[String]): Self = this.set("responseHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseHeaders: Self = this.set("responseHeaders", js.undefined)
    @scala.inline
    def setResponseText(value: String): Self = this.set("responseText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseText: Self = this.set("responseText", js.undefined)
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusText: Self = this.set("statusText", js.undefined)
  }
  
}

