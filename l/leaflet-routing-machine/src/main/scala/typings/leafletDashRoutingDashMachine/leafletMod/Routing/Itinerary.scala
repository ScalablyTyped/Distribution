package typings.leafletDashRoutingDashMachine.leafletMod.Routing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Routing.Itinerary")
@js.native
class Itinerary protected ()
  extends typings.leaflet.leafletMod.Control {
  def this(options: ItineraryOptions) = this()
  def hide(): Unit = js.native
  def setAlternatives(routes: js.Array[IRoute]): js.Any = js.native
  def show(): Unit = js.native
}

@JSImport("leaflet", "Routing.itinerary")
@js.native
object itinerary extends js.Object {
  def apply(): Itinerary = js.native
  def apply(options: ItineraryOptions): Itinerary = js.native
}

