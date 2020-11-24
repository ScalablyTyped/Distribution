package typings.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("L.mapbox.geocoderControl")
@js.native
object geocoderControl extends js.Object {
  
  // GeocoderControl
  //////////////////////////////////////////////////////////////////////
  /**
    * Adds geocoder functionality as well as a UI element to a map. This uses the Mapbox Geocoding API.
    */
  def apply(id: String): GeocoderControl_ = js.native
  def apply(id: String, options: GeocoderControlOptions): GeocoderControl_ = js.native
}
