package typings.leafletRoutingMachine.mod.Routing_

import typings.leafletRoutingMachine.leafletRoutingMachineStrings.`bear-left`
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.`bear-right`
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.`enter-roundabout`
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.`sharp-left`
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.`sharp-right`
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.`turn-left`
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.`turn-right`
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.`u-turn`
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.arrive
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.continue
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.depart
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.via
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Routing.Formatter")
@js.native
class Formatter_ () extends js.Object {
  def this(options: FormatterOptions) = this()
  
  def capitalize(s: String): String = js.native
  
  def formatDistance(d: Double): String = js.native
  def formatDistance(d: Double, precision: Double): String = js.native
  
  def formatInstruction(instruction: IInstruction): String = js.native
  
  def formatTime(t: Double): String = js.native
  
  def getIconName(instruction: IInstruction, index: Double): depart | via | `enter-roundabout` | arrive | continue | `bear-right` | `turn-right` | `sharp-right` | `u-turn` | `sharp-left` | `turn-left` | `bear-left` = js.native
}
