package typings.leafletRoutingMachine.mod.Routing_

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaypointsSplicedEvent extends StObject {
  
  var added: js.Array[Waypoint_]
  
  var index: Double
  
  var nRemoved: Double
}
object WaypointsSplicedEvent {
  
  @scala.inline
  def apply(added: js.Array[Waypoint_], index: Double, nRemoved: Double): WaypointsSplicedEvent = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nRemoved = nRemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaypointsSplicedEvent]
  }
  
  @scala.inline
  implicit class WaypointsSplicedEventMutableBuilder[Self <: WaypointsSplicedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdded(value: js.Array[Waypoint_]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedVarargs(value: Waypoint_ *): Self = StObject.set(x, "added", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNRemoved(value: Double): Self = StObject.set(x, "nRemoved", value.asInstanceOf[js.Any])
  }
}
