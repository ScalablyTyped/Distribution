package typings.leafletRoutingMachine.mod.Routing_

import typings.leafletRoutingMachine.leafletRoutingMachineStrings.DestinationReached
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.EnterAgainstAllowedDirection
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.LeaveAgainstAllowedDirection
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.Left
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.Right
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.Roundabout
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.SharpLeft
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.SharpRight
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.SlightLeft
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.SlightRight
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.StartAt
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.Straight
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.TurnAround
import typings.leafletRoutingMachine.leafletRoutingMachineStrings.WaypointReached
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-name
trait IInstruction extends StObject {
  
  var direction: js.UndefOr[String] = js.undefined
  
  var distance: Double
  
  var exit: js.UndefOr[Double] = js.undefined
  
  var road: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var time: Double
  
  var `type`: js.UndefOr[
    Straight | SlightRight | Right | SharpRight | TurnAround | SharpLeft | Left | SlightLeft | WaypointReached | Roundabout | StartAt | DestinationReached | EnterAgainstAllowedDirection | LeaveAgainstAllowedDirection
  ] = js.undefined
}
object IInstruction {
  
  @scala.inline
  def apply(distance: Double, time: Double): IInstruction = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInstruction]
  }
  
  @scala.inline
  implicit class IInstructionMutableBuilder[Self <: IInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExit(value: Double): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    @scala.inline
    def setRoad(value: String): Self = StObject.set(x, "road", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoadUndefined: Self = StObject.set(x, "road", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: Straight | SlightRight | Right | SharpRight | TurnAround | SharpLeft | Left | SlightLeft | WaypointReached | Roundabout | StartAt | DestinationReached | EnterAgainstAllowedDirection | LeaveAgainstAllowedDirection
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
