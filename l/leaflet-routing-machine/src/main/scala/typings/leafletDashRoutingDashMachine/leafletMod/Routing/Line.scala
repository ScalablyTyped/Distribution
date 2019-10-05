package typings.leafletDashRoutingDashMachine.leafletMod.Routing

import typings.leaflet.leafletMod.LatLngBounds
import typings.leaflet.leafletMod.LayerGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Routing.Line")
@js.native
class Line protected ()
  extends LayerGroup[js.Any] {
  def this(route: IRoute) = this()
  def this(route: IRoute, options: LineOptions) = this()
  def getBounds(): LatLngBounds = js.native
}

@JSImport("leaflet", "Routing.line")
@js.native
object line extends js.Object {
  def apply(route: IRoute): Line = js.native
  def apply(route: IRoute, options: LineOptions): Line = js.native
}

