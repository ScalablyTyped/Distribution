package typings.leafletRoutingMachine.leafletMod.Routing_

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-name
trait IRouteSummary extends StObject {
  
  var totalDistance: Double
  
  var totalTime: Double
}
object IRouteSummary {
  
  inline def apply(totalDistance: Double, totalTime: Double): IRouteSummary = {
    val __obj = js.Dynamic.literal(totalDistance = totalDistance.asInstanceOf[js.Any], totalTime = totalTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouteSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRouteSummary] (val x: Self) extends AnyVal {
    
    inline def setTotalDistance(value: Double): Self = StObject.set(x, "totalDistance", value.asInstanceOf[js.Any])
    
    inline def setTotalTime(value: Double): Self = StObject.set(x, "totalTime", value.asInstanceOf[js.Any])
  }
}
