package typings.leafletRoutingMachine.mod.Routing_

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineTouchedEvent extends StObject {
  
  var afterIndex: Double
  
  var latlng: Double
}
object LineTouchedEvent {
  
  @scala.inline
  def apply(afterIndex: Double, latlng: Double): LineTouchedEvent = {
    val __obj = js.Dynamic.literal(afterIndex = afterIndex.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineTouchedEvent]
  }
  
  @scala.inline
  implicit class LineTouchedEventMutableBuilder[Self <: LineTouchedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterIndex(value: Double): Self = StObject.set(x, "afterIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatlng(value: Double): Self = StObject.set(x, "latlng", value.asInstanceOf[js.Any])
  }
}
