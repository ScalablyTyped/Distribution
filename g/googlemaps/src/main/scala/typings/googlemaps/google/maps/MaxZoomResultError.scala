package typings.googlemaps.google.maps

import typings.googlemaps.google.maps.MaxZoomStatus.ERROR
import org.scalablytyped.runtime.StObject
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
  implicit class MaxZoomResultErrorMutableBuilder[Self <: MaxZoomResultError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: ERROR): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
