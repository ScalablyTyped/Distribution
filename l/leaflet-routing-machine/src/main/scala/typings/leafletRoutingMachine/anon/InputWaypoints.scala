package typings.leafletRoutingMachine.anon

import typings.leafletRoutingMachine.mod.Routing_.Waypoint_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputWaypoints extends js.Object {
  
  var inputWaypoints: Waypoint_ = js.native
  
  var properties: js.UndefOr[js.Any] = js.native
  
  var waypoints: Waypoint_ = js.native
}
object InputWaypoints {
  
  @scala.inline
  def apply(inputWaypoints: Waypoint_, waypoints: Waypoint_): InputWaypoints = {
    val __obj = js.Dynamic.literal(inputWaypoints = inputWaypoints.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputWaypoints]
  }
  
  @scala.inline
  implicit class InputWaypointsOps[Self <: InputWaypoints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInputWaypoints(value: Waypoint_): Self = this.set("inputWaypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypoints(value: Waypoint_): Self = this.set("waypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
