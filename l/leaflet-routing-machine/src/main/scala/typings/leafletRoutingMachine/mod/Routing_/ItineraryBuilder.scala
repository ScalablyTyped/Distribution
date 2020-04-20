package typings.leafletRoutingMachine.mod.Routing_

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Routing.ItineraryBuilder")
@js.native
class ItineraryBuilder () extends js.Object {
  def createContainer(className: String): HTMLElement = js.native
  def createStep(text: String, distance: String, steps: HTMLElement): Unit = js.native
  def createStepsContainer(container: HTMLElement): Unit = js.native
}

