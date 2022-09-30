package typings.leafletRoutingMachine.mod.Routing_

import typings.leaflet.mod.LatLng_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-name
trait IRoute extends StObject {
  
  var coordinates: js.UndefOr[js.Array[LatLng_]] = js.undefined
  
  var instructions: js.UndefOr[js.Array[IInstruction]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var summary: js.UndefOr[IRouteSummary] = js.undefined
  
  var waypoints: js.UndefOr[js.Array[LatLng_]] = js.undefined
}
object IRoute {
  
  inline def apply(): IRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRoute]
  }
  
  extension [Self <: IRoute](x: Self) {
    
    inline def setCoordinates(value: js.Array[LatLng_]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setCoordinatesVarargs(value: LatLng_ *): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setInstructions(value: js.Array[IInstruction]): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    inline def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
    
    inline def setInstructionsVarargs(value: IInstruction*): Self = StObject.set(x, "instructions", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSummary(value: IRouteSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setWaypoints(value: js.Array[LatLng_]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    inline def setWaypointsUndefined: Self = StObject.set(x, "waypoints", js.undefined)
    
    inline def setWaypointsVarargs(value: LatLng_ *): Self = StObject.set(x, "waypoints", js.Array(value*))
  }
}
