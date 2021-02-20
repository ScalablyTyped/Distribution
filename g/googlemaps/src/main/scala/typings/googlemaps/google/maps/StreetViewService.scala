package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreetViewService extends StObject {
  
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
