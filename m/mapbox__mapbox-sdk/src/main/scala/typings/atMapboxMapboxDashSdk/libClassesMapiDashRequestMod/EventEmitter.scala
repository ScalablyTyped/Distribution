package typings.atMapboxMapboxDashSdk.libClassesMapiDashRequestMod

import typings.atMapboxMapboxDashSdk.libClassesMapiDashErrorMod.MapiError
import typings.atMapboxMapboxDashSdk.libClassesMapiDashResponseMod.MapiResponse
import typings.std.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventEmitter extends js.Object {
  var downloadProgress: ProgressEvent
  var error: MapiError
  var response: MapiResponse
  var uploadProgress: ProgressEvent
}

object EventEmitter {
  @scala.inline
  def apply(
    downloadProgress: ProgressEvent,
    error: MapiError,
    response: MapiResponse,
    uploadProgress: ProgressEvent
  ): EventEmitter = {
    val __obj = js.Dynamic.literal(downloadProgress = downloadProgress, error = error, response = response, uploadProgress = uploadProgress)
  
    __obj.asInstanceOf[EventEmitter]
  }
}

