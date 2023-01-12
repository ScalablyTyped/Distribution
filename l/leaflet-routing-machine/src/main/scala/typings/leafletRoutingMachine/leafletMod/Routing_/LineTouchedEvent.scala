package typings.leafletRoutingMachine.leafletMod.Routing_

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineTouchedEvent extends StObject {
  
  var afterIndex: Double
  
  var latlng: Double
}
object LineTouchedEvent {
  
  inline def apply(afterIndex: Double, latlng: Double): LineTouchedEvent = {
    val __obj = js.Dynamic.literal(afterIndex = afterIndex.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineTouchedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineTouchedEvent] (val x: Self) extends AnyVal {
    
    inline def setAfterIndex(value: Double): Self = StObject.set(x, "afterIndex", value.asInstanceOf[js.Any])
    
    inline def setLatlng(value: Double): Self = StObject.set(x, "latlng", value.asInstanceOf[js.Any])
  }
}
