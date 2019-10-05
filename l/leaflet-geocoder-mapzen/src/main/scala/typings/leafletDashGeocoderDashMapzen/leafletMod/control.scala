package typings.leafletDashGeocoderDashMapzen.leafletMod

import typings.leafletDashGeocoderDashMapzen.leafletMod.Control.Geocoder
import typings.leafletDashGeocoderDashMapzen.leafletMod.Control.GeocoderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "control")
@js.native
object control extends js.Object {
  /**
    * Creates a geocoder control.
    */
  def geocoder(api_key: String): Geocoder = js.native
  def geocoder(api_key: String, options: GeocoderOptions): Geocoder = js.native
}

