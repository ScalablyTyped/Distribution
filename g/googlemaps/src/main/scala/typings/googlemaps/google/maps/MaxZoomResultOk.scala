package typings.googlemaps.google.maps

import typings.googlemaps.google.maps.MaxZoomStatus.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link MaxZoomResult}
  * @see {@link MaxZoomResultError}
  */
@js.native
trait MaxZoomResultOk extends MaxZoomResult {
  
  /**
    * Status of the request.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/max-zoom#MaxZoomResult.status Maps JavaScript API}
    * @see {@link MaxZoomResultError#status}
    */
  var status: OK = js.native
  
  /**
    * The maximum zoom level found at the given {@link LatLng}.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/max-zoom#MaxZoomResult.zoom Maps JavaScript API}
    */
  var zoom: Double = js.native
}
object MaxZoomResultOk {
  
  @scala.inline
  def apply(status: OK, zoom: Double): MaxZoomResultOk = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxZoomResultOk]
  }
  
  @scala.inline
  implicit class MaxZoomResultOkMutableBuilder[Self <: MaxZoomResultOk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: OK): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
