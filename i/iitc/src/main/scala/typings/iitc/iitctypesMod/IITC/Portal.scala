package typings.iitc.iitctypesMod.IITC

import typings.leaflet.mod.CircleMarkerOptions
import typings.leaflet.mod.CircleMarker_
import typings.leaflet.mod.LatLngExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Portal-Marker */
@JSImport("iitc/core/iitctypes", "IITC.Portal")
@js.native
class Portal protected ()
  extends CircleMarker_[js.Any] {
  def this(latlng: LatLngExpression) = this()
  def this(latlng: LatLngExpression, options: CircleMarkerOptions) = this()
  
  @JSName("options")
  var options_Portal: PortalOptions = js.native
}
