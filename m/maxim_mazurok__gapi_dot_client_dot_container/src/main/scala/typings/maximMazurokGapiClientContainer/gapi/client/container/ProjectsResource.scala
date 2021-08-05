package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var aggregated: AggregatedResource
  
  var locations: LocationsResource
  
  var zones: ZonesResource
}
object ProjectsResource {
  
  inline def apply(aggregated: AggregatedResource, locations: LocationsResource, zones: ZonesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(aggregated = aggregated.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  extension [Self <: ProjectsResource](x: Self) {
    
    inline def setAggregated(value: AggregatedResource): Self = StObject.set(x, "aggregated", value.asInstanceOf[js.Any])
    
    inline def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setZones(value: ZonesResource): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
  }
}
