package typings.mapboxMapboxSdk.mapiRequestMod

import typings.mapboxMapboxSdk.mapiErrorMod.MapiError
import typings.mapboxMapboxSdk.mapiResponseMod.MapiResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageCallbackFunction extends js.Object {
  var error: MapiError = js.native
  var response: MapiResponse = js.native
  def next(): Unit = js.native
}

object PageCallbackFunction {
  @scala.inline
  def apply(error: MapiError, next: () => Unit, response: MapiResponse): PageCallbackFunction = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageCallbackFunction]
  }
  @scala.inline
  implicit class PageCallbackFunctionOps[Self <: PageCallbackFunction] (val x: Self) extends AnyVal {
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
    def setError(value: MapiError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: () => Unit): Self = this.set("next", js.Any.fromFunction0(value))
    @scala.inline
    def setResponse(value: MapiResponse): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

