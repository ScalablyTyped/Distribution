package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
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
  implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregated(value: AggregatedResource): Self = StObject.set(x, "aggregated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZones(value: ZonesResource): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
  }
}
