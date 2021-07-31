package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var locations: LocationsResource
  
  var regions: RegionsResource
}
object ProjectsResource {
  
  @scala.inline
  def apply(locations: LocationsResource, regions: RegionsResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegions(value: RegionsResource): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
  }
}
