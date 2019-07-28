package typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.Routing.Formatter")
@js.native
class Formatter () extends js.Object {
  def this(options: FormatterOptions) = this()
  def formatDistance(d: Double): String = js.native
  def formatDistance(d: Double, precision: Double): String = js.native
  def formatInstruction(instruction: IInstruction): String = js.native
  def formatTime(t: Double): String = js.native
}

