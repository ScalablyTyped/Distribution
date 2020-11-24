package typings.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaypointsSplicedEvent extends js.Object {
  
  var added: js.Array[Waypoint_] = js.native
  
  var index: Double = js.native
  
  var nRemoved: Double = js.native
}
object WaypointsSplicedEvent {
  
  @scala.inline
  def apply(added: js.Array[Waypoint_], index: Double, nRemoved: Double): WaypointsSplicedEvent = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nRemoved = nRemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaypointsSplicedEvent]
  }
  
  @scala.inline
  implicit class WaypointsSplicedEventOps[Self <: WaypointsSplicedEvent] (val x: Self) extends AnyVal {
    
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
    def setAddedVarargs(value: Waypoint_ *): Self = this.set("added", js.Array(value :_*))
    
    @scala.inline
    def setAdded(value: js.Array[Waypoint_]): Self = this.set("added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNRemoved(value: Double): Self = this.set("nRemoved", value.asInstanceOf[js.Any])
  }
}
