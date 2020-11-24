package typings.mapboxMapboxSdk.mapiRequestMod

import typings.mapboxMapboxSdk.mapiErrorMod.MapiError
import typings.mapboxMapboxSdk.mapiResponseMod.MapiResponse
import typings.std.EventTarget
import typings.std.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitter extends js.Object {
  
  var downloadProgress: ProgressEvent[EventTarget] = js.native
  
  var error: MapiError = js.native
  
  var response: MapiResponse = js.native
  
  var uploadProgress: ProgressEvent[EventTarget] = js.native
}
object EventEmitter {
  
  @scala.inline
  def apply(
    downloadProgress: ProgressEvent[EventTarget],
    error: MapiError,
    response: MapiResponse,
    uploadProgress: ProgressEvent[EventTarget]
  ): EventEmitter = {
    val __obj = js.Dynamic.literal(downloadProgress = downloadProgress.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], uploadProgress = uploadProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventEmitter]
  }
  
  @scala.inline
  implicit class EventEmitterOps[Self <: EventEmitter] (val x: Self) extends AnyVal {
    
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
    def setDownloadProgress(value: ProgressEvent[EventTarget]): Self = this.set("downloadProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: MapiError): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: MapiResponse): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadProgress(value: ProgressEvent[EventTarget]): Self = this.set("uploadProgress", value.asInstanceOf[js.Any])
  }
}
