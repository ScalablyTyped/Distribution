package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
trait IInstruction extends js.Object {
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var distance: scala.Double
  var exit: js.UndefOr[scala.Double] = js.undefined
  var road: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[scala.Double] = js.undefined
  var time: scala.Double
  var `type`: js.UndefOr[
    leafletDashRoutingDashMachineLib.leafletDashRoutingDashMachineLibStrings.Straight | leafletDashRoutingDashMachineLib.leafletDashRoutingDashMachineLibStrings.SlightRight | leafletDashRoutingDashMachineLib.leafletDashRoutingDashMachineLibStrings.Right | leafletDashRoutingDashMachineLib.leafletDashRoutingDashMachineLibStrings.SharpRight | leafletDashRoutingDashMachineLib.leafletDashRoutingDashMachineLibStrings.TurnAround | leafletDashRoutingDashMachineLib.leafletDashRoutingDashMachineLibStrings.SharpLeft | leafletDashRoutingDashMachineLib.leafletDashRoutingDashMachineLibStrings.Left | leafletDashRoutingDashMachineLib.leafletDashRoutingDashMachineLibStrings.SlightLeft | leafletDashRoutingDashMachineLib.leafletDashRoutingDashMachineLibStrings.WaypointReached | leafletDashRoutingDashMachineLib.leafletDashRoutingDashMachineLibStrings.Roundabout | leafletDashRoutingDashMachineLib.leafletDashRoutingDashMachineLibStrings.StartAt | leafletDashRoutingDashMachineLib.leafletDashRoutingDashMachineLibStrings.DestinationReached | leafletDashRoutingDashMachineLib.leafletDashRoutingDashMachineLibStrings.EnterAgainstAllowedDirection | leafletDashRoutingDashMachineLib.leafletDashRoutingDashMachineLibStrings.LeaveAgainstAllowedDirection
  ] = js.undefined
}

