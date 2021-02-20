package typings.leafletRoutingMachine.mod.Routing_

import typings.leaflet.mod.LatLng_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-name
@js.native
trait IRoute extends StObject {
  
  var coordinates: js.UndefOr[js.Array[LatLng_]] = js.native
  
  var instructions: js.UndefOr[js.Array[IInstruction]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var summary: js.UndefOr[IRouteSummary] = js.native
  
  var waypoints: js.UndefOr[js.Array[LatLng_]] = js.native
}
object IRoute {
  
  @scala.inline
  def apply(): IRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRoute]
  }
  
  @scala.inline
  implicit class IRouteMutableBuilder[Self <: IRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: js.Array[LatLng_]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    @scala.inline
    def setCoordinatesVarargs(value: LatLng_ *): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setInstructions(value: js.Array[IInstruction]): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
    
    @scala.inline
    def setInstructionsVarargs(value: IInstruction*): Self = StObject.set(x, "instructions", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSummary(value: IRouteSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setWaypoints(value: js.Array[LatLng_]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypointsUndefined: Self = StObject.set(x, "waypoints", js.undefined)
    
    @scala.inline
    def setWaypointsVarargs(value: LatLng_ *): Self = StObject.set(x, "waypoints", js.Array(value :_*))
  }
}
