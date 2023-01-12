package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var builds: BuildsResource
  
  var githubEnterpriseConfigs: GithubEnterpriseConfigsResource
  
  var locations: LocationsResource
  
  var triggers: TriggersResource
}
object ProjectsResource {
  
  inline def apply(
    builds: BuildsResource,
    githubEnterpriseConfigs: GithubEnterpriseConfigsResource,
    locations: LocationsResource,
    triggers: TriggersResource
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(builds = builds.asInstanceOf[js.Any], githubEnterpriseConfigs = githubEnterpriseConfigs.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    inline def setBuilds(value: BuildsResource): Self = StObject.set(x, "builds", value.asInstanceOf[js.Any])
    
    inline def setGithubEnterpriseConfigs(value: GithubEnterpriseConfigsResource): Self = StObject.set(x, "githubEnterpriseConfigs", value.asInstanceOf[js.Any])
    
    inline def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setTriggers(value: TriggersResource): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
  }
}
