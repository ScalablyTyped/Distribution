package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.StreetViewService")
@js.native
class StreetViewService () extends js.Object {
  def getPanorama(
    request: StreetViewLocationRequest,
    cb: js.Function2[/* data */ StreetViewPanoramaData | Null, /* status */ StreetViewStatus, Unit]
  ): Unit = js.native
  def getPanorama(
    request: StreetViewPanoRequest,
    cb: js.Function2[/* data */ StreetViewPanoramaData | Null, /* status */ StreetViewStatus, Unit]
  ): Unit = js.native
  def getPanoramaById(
    pano: String,
    callback: js.Function2[
      /* streetViewPanoramaData */ StreetViewPanoramaData, 
      /* streetViewStatus */ StreetViewStatus, 
      Unit
    ]
  ): Unit = js.native
  def getPanoramaByLocation(
    latlng: LatLngLiteral,
    radius: Double,
    callback: js.Function2[
      /* streetViewPanoramaData */ StreetViewPanoramaData, 
      /* streetViewStatus */ StreetViewStatus, 
      Unit
    ]
  ): Unit = js.native
  def getPanoramaByLocation(
    latlng: LatLng,
    radius: Double,
    callback: js.Function2[
      /* streetViewPanoramaData */ StreetViewPanoramaData, 
      /* streetViewStatus */ StreetViewStatus, 
      Unit
    ]
  ): Unit = js.native
}

