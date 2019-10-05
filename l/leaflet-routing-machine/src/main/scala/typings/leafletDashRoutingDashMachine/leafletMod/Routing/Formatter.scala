package typings.leafletDashRoutingDashMachine.leafletMod.Routing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Routing.Formatter")
@js.native
class Formatter () extends js.Object {
  def this(options: FormatterOptions) = this()
  def formatDistance(d: Double): String = js.native
  def formatDistance(d: Double, precision: Double): String = js.native
  def formatInstruction(instruction: IInstruction): String = js.native
  def formatTime(t: Double): String = js.native
}

@JSImport("leaflet", "Routing.formatter")
@js.native
object formatter extends js.Object {
  def apply(): Formatter = js.native
  def apply(options: FormatterOptions): Formatter = js.native
}

