package typings.googlemaps.google.maps

import typings.googlemaps.google.maps.MaxZoomStatus.ERROR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link MaxZoomResult}
  * @see {@link MaxZoomResultOk}
  */
@js.native
trait MaxZoomResultError extends MaxZoomResult {
  
  /**
    * Status of the request.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/max-zoom#MaxZoomResult.status Maps JavaScript API}
    * @see {@link MaxZoomResultOk#status}
    */
  var status: ERROR = js.native
}
object MaxZoomResultError {
  
  @scala.inline
  def apply(status: ERROR): MaxZoomResultError = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxZoomResultError]
  }
  
  @scala.inline
  implicit class MaxZoomResultErrorOps[Self <: MaxZoomResultError] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: ERROR): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
