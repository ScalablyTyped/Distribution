package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MaxZoomStatus extends js.Object

/**
  * The status returned by the {@link MaxZoomService} on the completion of a call to
  * {@link MaxZoomService#getMaxZoomAtLatLng getMaxZoomAtLatLng()}. Specify these by value, or by using the
  * constant's name. For example, `'OK'` or {@link MaxZoomStatus.OK}.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/max-zoom#MaxZoomStatus Maps JavaScript API}
  */
@JSGlobal("google.maps.MaxZoomStatus")
@js.native
object MaxZoomStatus extends js.Object {
  /**
    * There was a problem contacting the Google servers.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/max-zoom#MaxZoomStatus.ERROR Maps JavaScript API}
    */
  @js.native
  sealed trait ERROR extends MaxZoomStatus
  
  /**
    * The response contains a valid {@link MaxZoomResult}.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/max-zoom#MaxZoomStatus.OK Maps JavaScript API}
    */
  @js.native
  sealed trait OK extends MaxZoomStatus
  
}

