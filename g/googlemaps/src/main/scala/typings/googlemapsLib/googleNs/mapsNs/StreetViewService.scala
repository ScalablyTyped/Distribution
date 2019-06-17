package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.StreetViewService")
@js.native
class StreetViewService () extends js.Object {
  def getPanorama(
    request: StreetViewLocationRequest,
    cb: js.Function2[
      /* data */ StreetViewPanoramaData | scala.Null, 
      /* status */ StreetViewStatus, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getPanorama(
    request: StreetViewPanoRequest,
    cb: js.Function2[
      /* data */ StreetViewPanoramaData | scala.Null, 
      /* status */ StreetViewStatus, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getPanoramaById(
    pano: java.lang.String,
    callback: js.Function2[
      /* streetViewPanoramaData */ StreetViewPanoramaData, 
      /* streetViewStatus */ StreetViewStatus, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getPanoramaByLocation(
    latlng: LatLngLiteral,
    radius: scala.Double,
    callback: js.Function2[
      /* streetViewPanoramaData */ StreetViewPanoramaData, 
      /* streetViewStatus */ StreetViewStatus, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getPanoramaByLocation(
    latlng: LatLng,
    radius: scala.Double,
    callback: js.Function2[
      /* streetViewPanoramaData */ StreetViewPanoramaData, 
      /* streetViewStatus */ StreetViewStatus, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

