package typings.leafletDashRoutingDashMachine.leafletMod.Routing

import typings.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.DestinationReached
import typings.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.EnterAgainstAllowedDirection
import typings.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.LeaveAgainstAllowedDirection
import typings.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.Left
import typings.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.Right
import typings.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.Roundabout
import typings.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.SharpLeft
import typings.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.SharpRight
import typings.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.SlightLeft
import typings.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.SlightRight
import typings.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.StartAt
import typings.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.Straight
import typings.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.TurnAround
import typings.leafletDashRoutingDashMachine.leafletDashRoutingDashMachineStrings.WaypointReached
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
trait IInstruction extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
  var distance: Double
  var exit: js.UndefOr[Double] = js.undefined
  var road: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[Double] = js.undefined
  var time: Double
  var `type`: js.UndefOr[
    Straight | SlightRight | Right | SharpRight | TurnAround | SharpLeft | Left | SlightLeft | WaypointReached | Roundabout | StartAt | DestinationReached | EnterAgainstAllowedDirection | LeaveAgainstAllowedDirection
  ] = js.undefined
}

object IInstruction {
  @scala.inline
  def apply(
    distance: Double,
    time: Double,
    direction: String = null,
    exit: Int | Double = null,
    road: String = null,
    text: Int | Double = null,
    `type`: Straight | SlightRight | Right | SharpRight | TurnAround | SharpLeft | Left | SlightLeft | WaypointReached | Roundabout | StartAt | DestinationReached | EnterAgainstAllowedDirection | LeaveAgainstAllowedDirection = null
  ): IInstruction = {
    val __obj = js.Dynamic.literal(distance = distance, time = time)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (exit != null) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    if (road != null) __obj.updateDynamic("road")(road)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInstruction]
  }
}

