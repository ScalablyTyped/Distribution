package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationsResource extends StObject {
  
  var locations: LocationsResource
}
object OrganizationsResource {
  
  @scala.inline
  def apply(locations: LocationsResource): OrganizationsResource = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationsResource]
  }
  
  @scala.inline
  implicit class OrganizationsResourceMutableBuilder[Self <: OrganizationsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
  }
}
