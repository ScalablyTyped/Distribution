package typings.leafletRoutingMachine.mod.Routing_

import typings.leaflet.mod.LatLng_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Routing.Waypoint")
@js.native
open class Waypoint_ protected () extends StObject {
  def this(latLng: LatLng_, name: String, options: WaypointOptions) = this()
  
  var latLng: LatLng_ = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[WaypointOptions] = js.native
}
