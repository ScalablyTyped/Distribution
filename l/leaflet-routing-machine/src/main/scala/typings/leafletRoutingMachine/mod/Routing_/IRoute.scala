package typings.leafletRoutingMachine.mod.Routing_

import typings.leaflet.mod.LatLng_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-name
@js.native
trait IRoute extends js.Object {
  
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
  implicit class IRouteOps[Self <: IRoute] (val x: Self) extends AnyVal {
    
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
    def setCoordinatesVarargs(value: LatLng_ *): Self = this.set("coordinates", js.Array(value :_*))
    
    @scala.inline
    def setCoordinates(value: js.Array[LatLng_]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordinates: Self = this.set("coordinates", js.undefined)
    
    @scala.inline
    def setInstructionsVarargs(value: IInstruction*): Self = this.set("instructions", js.Array(value :_*))
    
    @scala.inline
    def setInstructions(value: js.Array[IInstruction]): Self = this.set("instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstructions: Self = this.set("instructions", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSummary(value: IRouteSummary): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setWaypointsVarargs(value: LatLng_ *): Self = this.set("waypoints", js.Array(value :_*))
    
    @scala.inline
    def setWaypoints(value: js.Array[LatLng_]): Self = this.set("waypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaypoints: Self = this.set("waypoints", js.undefined)
  }
}
