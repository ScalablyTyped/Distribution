package typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs

import typings.leaflet.leafletMod.LatLngBounds
import typings.leaflet.leafletMod.LayerGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.Routing.Line")
@js.native
class Line protected ()
  extends LayerGroup[js.Any] {
  def this(route: IRoute) = this()
  def this(route: IRoute, options: LineOptions) = this()
  def getBounds(): LatLngBounds = js.native
}

