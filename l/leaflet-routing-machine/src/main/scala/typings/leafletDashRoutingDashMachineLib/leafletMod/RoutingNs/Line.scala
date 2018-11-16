package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.Routing.Line")
@js.native
class Line protected ()
  extends leafletLib.leafletMod.LayerGroup[js.Any] {
  def this(route: IRoute) = this()
  def this(route: IRoute, options: LineOptions) = this()
  def getBounds(): leafletLib.leafletMod.LatLngBounds = js.native
}

