package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var builds: BuildsResource
  
  var locations: LocationsResource
  
  var triggers: TriggersResource
}
object ProjectsResource {
  
  @scala.inline
  def apply(builds: BuildsResource, locations: LocationsResource, triggers: TriggersResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(builds = builds.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuilds(value: BuildsResource): Self = StObject.set(x, "builds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggers(value: TriggersResource): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
  }
}
