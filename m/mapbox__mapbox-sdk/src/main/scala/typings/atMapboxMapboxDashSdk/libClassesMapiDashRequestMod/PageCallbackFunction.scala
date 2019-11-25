package typings.atMapboxMapboxDashSdk.libClassesMapiDashRequestMod

import typings.atMapboxMapboxDashSdk.libClassesMapiDashErrorMod.MapiError
import typings.atMapboxMapboxDashSdk.libClassesMapiDashResponseMod.MapiResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageCallbackFunction extends js.Object {
  var error: MapiError
  var response: MapiResponse
  def next(): Unit
}

object PageCallbackFunction {
  @scala.inline
  def apply(error: MapiError, next: () => Unit, response: MapiResponse): PageCallbackFunction = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PageCallbackFunction]
  }
}

