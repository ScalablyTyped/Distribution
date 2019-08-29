package typings.atMapboxMapboxDashSdk.libClassesMapiDashRequestMod

import typings.atMapboxMapboxDashSdk.libClassesMapiDashErrorMod.MapiError
import typings.atMapboxMapboxDashSdk.libClassesMapiDashResponseMod.MapiResponse
import typings.std.EventTarget
import typings.std.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventEmitter extends js.Object {
  var downloadProgress: ProgressEvent[EventTarget]
  var error: MapiError
  var response: MapiResponse
  var uploadProgress: ProgressEvent[EventTarget]
}

object EventEmitter {
  @scala.inline
  def apply(
    downloadProgress: ProgressEvent[EventTarget],
    error: MapiError,
    response: MapiResponse,
    uploadProgress: ProgressEvent[EventTarget]
  ): EventEmitter = {
    val __obj = js.Dynamic.literal(downloadProgress = downloadProgress, error = error, response = response, uploadProgress = uploadProgress)
  
    __obj.asInstanceOf[EventEmitter]
  }
}

