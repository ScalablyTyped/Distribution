package typings.googlemaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status returned by the {@link MaxZoomService} on the completion of a call to
  * {@link MaxZoomService#getMaxZoomAtLatLng getMaxZoomAtLatLng()}. Specify these by value, or by using the
  * constant's name. For example, `'OK'` or {@link MaxZoomStatus.OK}.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/max-zoom#MaxZoomStatus Maps JavaScript API}
  */
@JSGlobal("google.maps.MaxZoomStatus")
@js.native
object MaxZoomStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.googlemaps.google.maps.MaxZoomStatus & String] = js.native
  
  /* "ERROR" */ val ERROR: typings.googlemaps.google.maps.MaxZoomStatus.ERROR & String = js.native
  
  /* "OK" */ val OK: typings.googlemaps.google.maps.MaxZoomStatus.OK & String = js.native
}
