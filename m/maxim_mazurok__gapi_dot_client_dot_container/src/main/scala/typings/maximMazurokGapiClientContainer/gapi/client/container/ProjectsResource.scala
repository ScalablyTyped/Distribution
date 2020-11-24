package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends js.Object {
  
  var aggregated: AggregatedResource = js.native
  
  var locations: LocationsResource = js.native
  
  var zones: ZonesResource = js.native
}
object ProjectsResource {
  
  @scala.inline
  def apply(aggregated: AggregatedResource, locations: LocationsResource, zones: ZonesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(aggregated = aggregated.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
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
    def setAggregated(value: AggregatedResource): Self = this.set("aggregated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocations(value: LocationsResource): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZones(value: ZonesResource): Self = this.set("zones", value.asInstanceOf[js.Any])
  }
}
