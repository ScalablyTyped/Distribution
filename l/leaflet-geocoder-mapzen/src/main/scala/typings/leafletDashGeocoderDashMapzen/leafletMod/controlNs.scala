package typings.leafletDashGeocoderDashMapzen.leafletMod

import typings.leafletDashGeocoderDashMapzen.leafletMod.ControlNs.Geocoder
import typings.leafletDashGeocoderDashMapzen.leafletMod.ControlNs.GeocoderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.control")
@js.native
object controlNs extends js.Object {
  /**
    * Creates a geocoder control.
    */
  def geocoder(api_key: String): Geocoder = js.native
  def geocoder(api_key: String, options: GeocoderOptions): Geocoder = js.native
}

